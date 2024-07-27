package io.irminsul.game.net;

import io.netty.buffer.ByteBuf;
import lombok.Data;

// +---------+---------+-------------------+-------------+------------------+------------------+---------+
// |  Magic  |  CmdId  | PacketHead Length | Data Length | PacketHead bytes |    Data bytes    |  Magic  |
// +---------+---------+-------------------+-------------+------------------+------------------+---------+
// | 2 bytes | 2 bytes | 2 bytes           | 4 bytes     | size = 3rd field | size = 4th field | 2 bytes |
// +---------+---------+-------------------+-------------+------------------+------------------+---------+
@Data
public class GenericPacket {
    public static final short TOP_MAGIC = 17767;
    public static final short BOTTOM_MAGIC = -30293;

    /**
     * The id of the packet
     */
    private final int id;

    /**
     * The length, in bytes, of the packet header
     */
    private final int headerLength;

    /**
     * The length, in bytes, of the packet data
     */
    private final int dataLength;

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
    public GenericPacket(ByteBuf buffer) throws MalformedPacketException {
        int topMagic = buffer.readShort();
        if (topMagic != TOP_MAGIC) {
            throw new MalformedPacketException("Expected a top magic value of " + TOP_MAGIC + ", got " + topMagic);
        }

        this.id = buffer.readShort();
        this.headerLength = buffer.readShort();
        this.dataLength = buffer.readInt();

        this.header = new byte[this.headerLength];
        buffer.readBytes(header);
        this.data = new byte[this.dataLength];
        buffer.readBytes(data);

        int bottomMagic = buffer.readShort();
        if (bottomMagic != BOTTOM_MAGIC) {
            throw new MalformedPacketException("Expected a bottom magic value of " + BOTTOM_MAGIC + ", got " + bottomMagic);
        }
    }
}
