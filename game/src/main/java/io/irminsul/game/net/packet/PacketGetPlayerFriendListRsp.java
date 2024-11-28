package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.GetPlayerFriendListRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketGetPlayerFriendListRsp extends OutboundPacket {
    public PacketGetPlayerFriendListRsp(Session session) {
        super(PacketIds.GetPlayerFriendListRsp, session);

        GetPlayerFriendListRspOuterClass.GetPlayerFriendListRsp.Builder getPlayerFriendListReq =
            GetPlayerFriendListRspOuterClass.GetPlayerFriendListRsp.newBuilder()
//                .addAllFriendList() // todo add session owner's friends
        ;

        // If in-game commands are enabled on the server, add the server bot to the friends list
        if (session.getServer().getConfig().isCommands()) {
            getPlayerFriendListReq.addFriendList(session.getServer().getCommandManager().getServerFriendBrief());
        }

        this.setData(getPlayerFriendListReq.build().toByteArray());
    }
}
