package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.OpenStateChangeNotifyOuterClass;
import io.irminsul.common.proto.OpenStateUpdateNotifyOuterClass;
import io.irminsul.game.net.OutboundPacket;

import java.util.HashMap;
import java.util.Map;

public class PacketOpenStateUpdateNotify extends OutboundPacket {
    public PacketOpenStateUpdateNotify(Session session, Map<Integer, Boolean> openStateMap) {
        super(PacketIds.OpenStateUpdateNotify, session);

        // Client is stupid and uses 1 and 0 instead of a real boolean, so.
        Map<Integer, Integer> intMap = new HashMap<>();
        for (Map.Entry<Integer, Boolean> entry : openStateMap.entrySet()) {
            intMap.put(entry.getKey(), entry.getValue() ? 1 : 0);
        }

        OpenStateChangeNotifyOuterClass.OpenStateChangeNotify openStateUpdateNotify =
            OpenStateChangeNotifyOuterClass.OpenStateChangeNotify.newBuilder()
                .putAllOpenStateMap(intMap)
                .build();

        this.setData(openStateUpdateNotify.toByteArray());
    }
}
