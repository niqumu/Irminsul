package io.irminsul.game.net;

import io.irminsul.common.game.Session;
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

    private int getLength() {
        return 2 + 2 + 2 + 4 + 4 + this.header.length + this.data.length + 2;
    }

    public final void send() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream(this.getLength());

            this.writeUnsignedShort(baos, GenericPacket.TOP_MAGIC);
            this.writeUnsignedShort(baos, this.id);
            this.writeUnsignedShort(baos, this.header.length);
            this.writeUnsignedInt(baos, this.data.length);
            baos.write(this.header);
            baos.write(this.data);
            this.writeUnsignedShort(baos, GenericPacket.BOTTOM_MAGIC);

            this.session.getTunnel().writeData(baos.toByteArray());
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
