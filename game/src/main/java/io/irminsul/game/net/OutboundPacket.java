package io.irminsul.game.net;

import io.irminsul.common.game.Session;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.net.PacketEncryptionMode;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.PacketHeadOuterClass;
import io.irminsul.common.util.CryptoUtil;
import lombok.Data;

import java.io.ByteArrayOutputStream;
import java.util.List;

// +---------+---------+-------------------+-------------+------------------+------------------+---------+
// |  Magic  |  CmdId  | PacketHead Length | Data Length | PacketHead bytes |    Data bytes    |  Magic  |
// +---------+---------+-------------------+-------------+------------------+------------------+---------+
// | 2 bytes | 2 bytes | 2 bytes           | 4 bytes     | size = 3rd field | size = 4th field | 2 bytes |
// +---------+---------+-------------------+-------------+------------------+------------------+---------+
@Data
public abstract class OutboundPacket {
    public static final short TOP_MAGIC = 17767;
    public static final short BOTTOM_MAGIC = -30293;

    /**
     * The ID of the packet
     * @see PacketIds
     */
    protected final int id;

    /**
     * The Session this packet is to be sent to
     * @see Session
     */
    protected final Session session;

    /**
     * The packet's header
     */
    protected byte[] header = new byte[0];

    /**
     * The packet's payload
     */
    protected byte[] data = new byte[0];

    protected PacketEncryptionMode encryptionMode = PacketEncryptionMode.FULL;

    private void buildHeader() {
        this.header = PacketHeadOuterClass.PacketHead.newBuilder()
            .setClientSequenceId(this.session.getNextClientSequence())
            .setSentMs(System.currentTimeMillis())
            .build()
            .toByteArray();
    }

    private int getLength() {
        return 2 // Top magic
            + 2 // Packet ID
            + 2 // Header length
            + 4 // Data length
            + this.header.length
            + this.data.length
            + 2; // Bottom magic
    }

    /**
     * Sends the packet to the associated session
     */
    public final void send() {

        // The session is allowed to be null for broadcasting, but not directly sending
        if (this.session == null) {
            throw new IllegalStateException("Can't directly send a packet to a null session!");
        }

        try {
            // Build the packet header
            if (this.header.length == 0) {
                this.buildHeader();
            }

            // Build the packet
            ByteArrayOutputStream baos = new ByteArrayOutputStream(this.getLength());
            this.writeUnsignedShort(baos, TOP_MAGIC);
            this.writeUnsignedShort(baos, this.id);
            this.writeUnsignedShort(baos, this.header.length);
            this.writeUnsignedInt(baos, this.data.length);
            baos.write(this.header);
            baos.write(this.data);
            this.writeUnsignedShort(baos, BOTTOM_MAGIC);

            // Encrypt the packet
            byte[] bytes = baos.toByteArray();
            if (!this.encryptionMode.equals(PacketEncryptionMode.NONE)) {
                CryptoUtil.xor(bytes, this.encryptionMode.equals(PacketEncryptionMode.DISPATCH) ?
                        CryptoUtil.DISPATCH_KEY : CryptoUtil.ENCRYPT_KEY);
            }

            // Send the packet
            this.session.getTunnel().writeData(bytes);

            // Log the packet, if enabled
            if (PacketManager.PACKET_LOGGING && !PacketManager.NO_LOG_PACKETS.contains(this.getId())) {
                System.out.printf("\033[91m(S -> %d) OUTGOING: %s\033[39m\n",
                    this.session.getUid(), PacketIds.getNameById(this.getId()));
            }
        } catch (Exception e) {
            this.session.getServer().getLogger().error("Failed to encode packet: {}", this, e);
        }
    }

    /**
     * Broadcasts a copy of this packet to a list of players
     * @param players A list of players to send a copy of this packet to
     */
    public final void broadcast(List<Player> players) {
        players.forEach(player -> {
            OutboundPacket packet = new OutboundPacket(this.id, player.getSession()) {};
            packet.setData(this.data);
            packet.send();
        });
    }

    public void writeUnsignedShort(ByteArrayOutputStream baos, int i) {
        baos.write((byte) ((i >>> 8) & 0xff));
        baos.write((byte) (i & 0xff));
    }

    public void writeUnsignedInt(ByteArrayOutputStream baos, int i) {
        baos.write((byte) ((i >>> 24) & 0xff));
        baos.write((byte) ((i >>> 16) & 0xff));
        baos.write((byte) ((i >>> 8) & 0xff));
        baos.write((byte) (i & 0xff));
    }
}
