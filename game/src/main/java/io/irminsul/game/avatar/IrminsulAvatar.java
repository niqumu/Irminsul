package io.irminsul.game.avatar;

import io.irminsul.common.game.avatar.Avatar;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.proto.*;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public class IrminsulAvatar implements Avatar {

    private final int avatarId;

    private final long guid;

    private final int bornTime = (int) (System.currentTimeMillis() / 1000);

    private final Player owner;

    private final int entityId;

    public IrminsulAvatar(int avatarId, @NotNull Player owner) {
        this.avatarId = avatarId;
        this.guid = owner.getNextGuid();
        this.owner = owner;
        this.entityId = owner.getScene().getNextEntityId();
    }

    @Override
    public AvatarInfoOuterClass.@NotNull AvatarInfo getAvatarInfo() {
        return AvatarInfoOuterClass.AvatarInfo.newBuilder()
            .setAvatarId(this.avatarId)
            .setGuid(this.guid)
            .setBornTime(this.bornTime)
            .build();
    }

    @Override
    public @NotNull SceneEntityInfoOuterClass.SceneEntityInfo getSceneEntityInfo() {
        return SceneEntityInfoOuterClass.SceneEntityInfo.newBuilder()
            .setEntityId(this.entityId)
            .setEntityType(ProtEntityTypeOuterClass.ProtEntityType.PROT_ENTITY_TYPE_AVATAR)
            .setAvatar(this.getSceneAvatarInfo())
            .setEntityAuthorityInfo(
                EntityAuthorityInfoOuterClass.EntityAuthorityInfo.newBuilder()
                    .setAbilityInfo(AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder())
                    .setRendererChangedInfo(EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.newBuilder())
                    .setAiInfo(SceneEntityAiInfoOuterClass.SceneEntityAiInfo.newBuilder()
                        .setIsAiOpen(true).setBornPos(VectorOuterClass.Vector.newBuilder()))
                    .setBornPos(VectorOuterClass.Vector.newBuilder())
                    .build())
            .addAnimatorParaList(AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.newBuilder().build())
            .setMotionInfo(
                MotionInfoOuterClass.MotionInfo.newBuilder()
                    .setPos(this.owner.getPosition().asVector())
                    .setRot(VectorOuterClass.Vector.newBuilder().build())
                    .setSpeed(VectorOuterClass.Vector.newBuilder().build())
                    .setState(MotionStateOuterClass.MotionState.MOTION_STATE_NONE)
                    .build())
            .setLifeState(1)
            .build();
    }

    private SceneAvatarInfoOuterClass.SceneAvatarInfo getSceneAvatarInfo() {
        return SceneAvatarInfoOuterClass.SceneAvatarInfo.newBuilder()
            .setUid(this.owner.getUid())
            .setPeerId(this.owner.getPeerId())
            .setAvatarId(this.avatarId)
            .setGuid(this.guid)
            .setBornTime(this.bornTime)
            .build();
    }
}
