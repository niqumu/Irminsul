package io.irminsul.game.avatar;

import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.proto.AvatarInfoOuterClass;
import io.irminsul.common.proto.ProtEntityTypeOuterClass;
import io.irminsul.common.proto.SceneAvatarInfoOuterClass;
import io.irminsul.common.proto.SceneEntityInfoOuterClass;
import io.irminsul.game.net.packet.PacketSceneEntityAppearNotify;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public class IrminsulAvatar implements Avatar {

    private final int avatarId;

    private final long guid;

    private final Player owner;

    private final int entityId;

    public IrminsulAvatar(int avatarId, @NotNull Player owner) {
        this.avatarId = avatarId;
        this.guid = owner.getNextGuid();
        this.owner = owner;
        this.entityId = owner.getWorld().getNextEntityId();
        this.spawnEntity();
    }

    @Override
    public AvatarInfoOuterClass.@NotNull AvatarInfo getAvatarInfo() {
        return AvatarInfoOuterClass.AvatarInfo.newBuilder()
            .setAvatarId(this.avatarId)
            .setGuid(this.guid)
            .build();
    }

    private void spawnEntity() {
        new PacketSceneEntityAppearNotify(this.owner.getSession(), this).send();
    }

    @Override
    public @NotNull SceneEntityInfoOuterClass.SceneEntityInfo getSceneEntityInfo() {
        return SceneEntityInfoOuterClass.SceneEntityInfo.newBuilder()
            .setEntityId(this.entityId)
            .setEntityType(ProtEntityTypeOuterClass.ProtEntityType.PROT_ENTITY_TYPE_AVATAR)
            .setAvatar(this.getSceneAvatarInfo())
            .build();
    }

    private SceneAvatarInfoOuterClass.SceneAvatarInfo getSceneAvatarInfo() {
        return SceneAvatarInfoOuterClass.SceneAvatarInfo.newBuilder()
            .setUid(this.owner.getUid())
            .setPeerId(this.owner.getPeerId())
            .setAvatarId(this.avatarId)
            .setGuid(this.guid)
            .build();
    }
}
