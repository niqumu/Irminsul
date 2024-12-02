package io.irminsul.game.net.packet;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.ProfilePictureOuterClass;
import io.irminsul.common.proto.SetPlayerHeadImageRspOuterClass;
import io.irminsul.game.net.OutboundPacket;

public class PacketSetPlayerHeadImageRsp extends OutboundPacket {
    public PacketSetPlayerHeadImageRsp(Session session) {
        super(PacketIds.SetPlayerHeadImageRsp, session);

        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to build packet {} in a bad state: player cannot be null!", this);
            return;
        }

        SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp response =
            SetPlayerHeadImageRspOuterClass.SetPlayerHeadImageRsp.newBuilder()
                .setAvatarId(session.getPlayer().getProfile().getProfilePicture())
                .setProfilePicture(
                    ProfilePictureOuterClass.ProfilePicture.newBuilder()
                        .setAvatarId(session.getPlayer().getProfile().getProfilePicture())
                        .build()
                )
                .build();

        this.setData(response.toByteArray());
    }
}
