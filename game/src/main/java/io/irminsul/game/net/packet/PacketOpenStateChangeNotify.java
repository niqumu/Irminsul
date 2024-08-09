package io.irminsul.game.net.packet;

import io.irminsul.common.game.data.misc.OpenStateData;
import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.OpenStateChangeNotifyOuterClass;
import io.irminsul.game.net.OutboundPacket;

import java.util.HashMap;
import java.util.Map;

public class PacketOpenStateChangeNotify extends OutboundPacket {
    public PacketOpenStateChangeNotify(Session session, Map<OpenStateData, Boolean> openStateMap) {
        super(PacketIds.OpenStateChangeNotify, session);

        // Convert [OpenStateData -> boolean] to [int (state id) -> int (1 true/0 false)]
        Map<Integer, Integer> intMap = new HashMap<>();
        for (Map.Entry<OpenStateData, Boolean> entry : openStateMap.entrySet()) {
            intMap.put(entry.getKey().getId(), entry.getValue() ? 1 : 0);
        }

        OpenStateChangeNotifyOuterClass.OpenStateChangeNotify notify =
            OpenStateChangeNotifyOuterClass.OpenStateChangeNotify.newBuilder()
                .putAllOpenStateMap(intMap)
                .build();

        this.setData(notify.toByteArray());
    }
}
