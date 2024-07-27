package io.irminsul.game.net;

import io.irminsul.common.game.Session;
import io.irminsul.common.proto.PacketEncryptionMode;
import io.irminsul.common.proto.game.PacketHeadOuterClass;
import io.irminsul.common.util.CryptoUtil;
import lombok.Data;

import java.io.ByteArrayOutputStream;

@Data
public abstract class OutboundPacket {

    /**
     * The ID of the packet
     * @see io.irminsul.common.proto.PacketIds
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

            this.writeUnsignedShort(baos, GenericPacket.TOP_MAGIC);
            this.writeUnsignedShort(baos, this.id);
            this.writeUnsignedShort(baos, this.header.length);
            this.writeUnsignedInt(baos, this.data.length);
            baos.write(this.header);
            baos.write(this.data);
            this.writeUnsignedShort(baos, GenericPacket.BOTTOM_MAGIC);

            byte[] bytes = baos.toByteArray();
            if (!this.encryptionMode.equals(PacketEncryptionMode.NONE)) {
                CryptoUtil.xor(bytes, this.encryptionMode.equals(PacketEncryptionMode.DISPATCH) ?
                        CryptoUtil.DISPATCH_KEY : CryptoUtil.ENCRYPT_KEY);
            }

            this.session.getTunnel().writeData(bytes);
            this.session.getServer().getLogger().info("OUTGOING: {}", this);
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
