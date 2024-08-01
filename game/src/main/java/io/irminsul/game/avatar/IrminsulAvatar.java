package io.irminsul.game.avatar;

import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.proto.AvatarInfoOuterClass;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public class IrminsulAvatar implements Avatar {

    private final int avatarId;

    private final int guid;

    private final Player owner;

    private final int entityId;

    public IrminsulAvatar(int avatarId, @NotNull Player owner) {
        this.avatarId = avatarId;
        this.guid = owner.getNextGuid();
        this.owner = owner;
        this.entityId = owner.getWorld().getNextEntityId();
    }

    @Override
    public AvatarInfoOuterClass.@NotNull AvatarInfo getAvatarInfo() {
        return AvatarInfoOuterClass.AvatarInfo.newBuilder()
            .setAvatarId(this.avatarId)
            .setGuid(this.guid)
            .build();
    }
}
