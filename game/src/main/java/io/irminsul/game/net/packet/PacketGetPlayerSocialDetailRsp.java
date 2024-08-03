package io.irminsul.game.net.packet;

import io.irminsul.common.game.Session;
import io.irminsul.common.game.player.PlayerProfile;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.*;
import io.irminsul.game.net.OutboundPacket;

public class PacketGetPlayerSocialDetailRsp extends OutboundPacket {
    public PacketGetPlayerSocialDetailRsp(Session session, PlayerProfile profile) {
        super(PacketIds.GetPlayerSocialDetailRsp, session);

        GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp response =
            GetPlayerSocialDetailRspOuterClass.GetPlayerSocialDetailRsp.newBuilder()
                .setDetailData(
                    SocialDetailOuterClass.SocialDetail.newBuilder()
                        .setUid(profile.getUid())
                        .setNickname(profile.getNickname())
                        .setSignature(profile.getSignature())
                        .setAvatarId(profile.getProfilePicture())
                        .setNameCardId(profile.getNameCard())
                        .setBirthday(BirthdayOuterClass.Birthday.newBuilder()
                            .setMonth(profile.getBirthdayMonth())
                            .setDay(profile.getBirthdayDay())
                            .build())
                        .setOnlineState(FriendOnlineStateOuterClass.FriendOnlineState.FRIEND_ONLINE_STATE_ONLINE) // todo
                        .setIsShowAvatar(false) // todo
                        .setFriendEnterHomeOption(FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.FRIEND_ENTER_HOME_OPTION_REFUSE) // todo
                        .setProfilePicture(ProfilePictureOuterClass.ProfilePicture.newBuilder().build()) // todo this seems to be unused, but make sure
                        .build())
                .build();

        this.setData(response.toByteArray());
    }
}
