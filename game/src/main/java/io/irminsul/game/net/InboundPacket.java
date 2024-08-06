package io.irminsul.game.net;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.netty.buffer.ByteBuf;
import lombok.Data;

// +---------+---------+-------------------+-------------+------------------+------------------+---------+
// |  Magic  |  CmdId  | PacketHead Length | Data Length | PacketHead bytes |    Data bytes    |  Magic  |
// +---------+---------+-------------------+-------------+------------------+------------------+---------+
// | 2 bytes | 2 bytes | 2 bytes           | 4 bytes     | size = 3rd field | size = 4th field | 2 bytes |
// +---------+---------+-------------------+-------------+------------------+------------------+---------+
@Data
public class InboundPacket {
    public static final short TOP_MAGIC = 17767;
    public static final short BOTTOM_MAGIC = -30293;

    /**
     * The ID of the packet
     * @see PacketIds
     */
    private final int id;

    /**
     * The Session this packet was received from
     * @see Session
     */
    private final Session session;

    /**
     * The packet header, of the specified size
     */
    private final byte[] header;

    /**
     * The packet data, of the specified size
     */
    private final byte[] data;

    /**
     * Creates a new Packet from a {@link ByteBuf}
     * @param buffer The buffer to read bytes from
     * @throws MalformedPacketException If the packet is malformed in some way
     */
    public InboundPacket(ByteBuf buffer, Session session) throws MalformedPacketException {
        this.session = session;

        // Read and verify top magic
        int topMagic = buffer.readShort();
        if (topMagic != TOP_MAGIC) {
            throw new MalformedPacketException("Expected a top magic value of " + TOP_MAGIC + ", got " + topMagic);
        }

        // Read the packet id, header length, and body length
        this.id = buffer.readShort();
        int headerLength = buffer.readShort();
        int dataLength = buffer.readInt();

        // Read the header and data
        this.header = new byte[headerLength];
        buffer.readBytes(header);
        this.data = new byte[dataLength];
        buffer.readBytes(data);

        // Read and verify bottom magic
        int bottomMagic = buffer.readShort();
        if (bottomMagic != BOTTOM_MAGIC) {
            throw new MalformedPacketException("Expected a bottom magic value of " + BOTTOM_MAGIC + ", got " + bottomMagic);
        }
    }
}
