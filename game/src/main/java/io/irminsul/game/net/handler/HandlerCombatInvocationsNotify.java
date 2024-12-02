package io.irminsul.game.net.handler;

import io.irminsul.common.game.net.Session;
import io.irminsul.common.game.player.Player;
import io.irminsul.common.game.world.Entity;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.CombatInvocationsNotifyOuterClass;
import io.irminsul.common.proto.CombatInvokeEntryOuterClass;
import io.irminsul.common.proto.EntityMoveInfoOuterClass;
import io.irminsul.common.proto.VectorOuterClass;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;

import java.util.Objects;

public class HandlerCombatInvocationsNotify implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.CombatInvocationsNotify;
    }

    /**
     * Handle an incoming packet
     *
     * @param packet  The packet being sent
     * @param session The session that sent the packet
     */
    @Override
    public void handle(InboundPacket packet, Session session) throws Exception {
        if (session.getPlayer() == null) {
            session.getServer().getLogger().warn("Tried to handle packet {} in a bad state: player cannot be null!", this);
            return;
        }

        if (session.getPlayer().getScene() == null) {
            session.getServer().getLogger().warn("Tried to handle packet {} in a bad state: scene cannot be null!", this);
            return;
        }

        CombatInvocationsNotifyOuterClass.CombatInvocationsNotify notify =
            CombatInvocationsNotifyOuterClass.CombatInvocationsNotify.parseFrom(packet.getData());

        // Handle every invocation entry
        for (CombatInvokeEntryOuterClass.CombatInvokeEntry i : notify.getInvokeListList()) {
            this.processInvocation(i, session.getPlayer());
        }
    }

    /**
     * Handle a single {@link CombatInvokeEntryOuterClass.CombatInvokeEntry}
     * @param entry The entry to process
     * @param player The {@link Player} that sent it
     */
    private void processInvocation(CombatInvokeEntryOuterClass.CombatInvokeEntry entry, Player player) throws Exception {
        switch (entry.getArgumentType()) {
            case COMBAT_TYPE_ARGUMENT_ENTITY_MOVE -> this.processEntityMove(
                EntityMoveInfoOuterClass.EntityMoveInfo.parseFrom(entry.getCombatData()), player);
        }
    }

    private void processEntityMove(EntityMoveInfoOuterClass.EntityMoveInfo move, Player player) {

        // Resolve the entity
        Entity movingEntity = null;
        for (Entity entity : Objects.requireNonNull(player.getScene()).getEntities()) {
            if (entity.getEntityId() == move.getEntityId()) {
                movingEntity = entity;
                break;
            }
        }

        if (movingEntity == null) {
            player.getServer().getLogger().warn("Received a CombatInvocationsNotify (Entity move) from {}, " +
                "but no entity exists by the provided ID of {}!", player, move.getEntityId());
            return;
        }

        VectorOuterClass.Vector position = move.getMotionInfo().getPos();
        VectorOuterClass.Vector rotation = move.getMotionInfo().getRot();
        movingEntity.getPosition().setX(position.getX());
        movingEntity.getPosition().setY(position.getY());
        movingEntity.getPosition().setZ(position.getZ());
        movingEntity.getPosition().setXRot(rotation.getX());
        movingEntity.getPosition().setYRot(rotation.getY());
        movingEntity.getPosition().setZRot(rotation.getZ());
    }
}
