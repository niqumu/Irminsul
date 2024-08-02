package io.irminsul.game.net;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketEncryptionMode;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.PacketHeadOuterClass;
import io.irminsul.common.util.CryptoUtil;
import lombok.Data;

import java.io.ByteArrayOutputStream;

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
        return 2 + 2 + 2 + 4 + 4 + this.header.length + this.data.length + 2;
    }

    public final void send() {
        try {
            if (this.header.length == 0) {
                this.buildHeader();
            }

            ByteArrayOutputStream baos = new ByteArrayOutputStream(this.getLength());

            this.writeUnsignedShort(baos, TOP_MAGIC);
            this.writeUnsignedShort(baos, this.id);
            this.writeUnsignedShort(baos, this.header.length);
            this.writeUnsignedInt(baos, this.data.length);
            baos.write(this.header);
            baos.write(this.data);
            this.writeUnsignedShort(baos, BOTTOM_MAGIC);

            byte[] bytes = baos.toByteArray();
            if (!this.encryptionMode.equals(PacketEncryptionMode.NONE)) {
                CryptoUtil.xor(bytes, this.encryptionMode.equals(PacketEncryptionMode.DISPATCH) ?
                        CryptoUtil.DISPATCH_KEY : CryptoUtil.ENCRYPT_KEY);
            }

            this.session.getTunnel().writeData(bytes);

            if (PacketManager.PACKET_LOGGING && this.getId() != PacketIds.PingRsp) {
                System.out.println("\033[91m( -> ) OUTGOING: " + PacketIds.getNameById(this.getId()) + "\033[39m");
            }
        } catch (Exception e) {
            this.session.getServer().getLogger().error("Failed to encode packet: {}", this, e);
        }
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
