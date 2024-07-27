package io.irminsul.game.net.handler;

import io.irminsul.common.game.Session;
import io.irminsul.common.game.SessionState;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.GetPlayerTokenReqOuterClass;
import io.irminsul.common.util.CryptoUtil;
import io.irminsul.game.IrminsulPlayer;
import io.irminsul.game.net.InboundPacket;
import io.irminsul.game.net.PacketHandler;
import io.irminsul.game.net.packet.PacketGetPlayerTokenRsp;

import javax.crypto.Cipher;
import java.nio.ByteBuffer;
import java.security.Signature;
import java.util.Base64;

public class HandlerGetPlayerTokenReq implements PacketHandler {

    /**
     * @return The ID of the packet this handler is targeting
     */
    @Override
    public int getTargetID() {
        return PacketIds.GetPlayerTokenReq;
    }

    /**
     * Handle an incoming packet
     *
     * @param packet  The packet being sent
     * @param session The session that sent the packet
     */
    @Override
    public void handle(InboundPacket packet, Session session) throws Exception {
        GetPlayerTokenReqOuterClass.GetPlayerTokenReq request =
            GetPlayerTokenReqOuterClass.GetPlayerTokenReq.parseFrom(packet.getData());

        // TODO authentication, this just always works!

        // TODO load from database
        session.setPlayer(new IrminsulPlayer(session));

        session.enableEncryption();
        session.setState(SessionState.WAITING_FOR_LOGIN);

        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.DECRYPT_MODE, CryptoUtil.SIGNING_KEY);

        byte[] clientSeedEncrypted = Base64.getDecoder().decode(request.getClientRandKey());
        long clientSeed = ByteBuffer.wrap(cipher.doFinal(clientSeedEncrypted)).getLong();

        byte[] seedBytes = ByteBuffer.wrap(new byte[8]).putLong(CryptoUtil.ENCRYPT_SEED ^ clientSeed).array();

        cipher.init(Cipher.ENCRYPT_MODE, CryptoUtil.ENCRYPTION_KEYS.get(request.getKeyId()));
        byte[] seedEncrypted = cipher.doFinal(seedBytes);

        Signature privateSignature = Signature.getInstance("SHA256withRSA");
        privateSignature.initSign(CryptoUtil.SIGNING_KEY);
        privateSignature.update(seedBytes);

        new PacketGetPlayerTokenRsp(session, Base64.getEncoder().encodeToString(seedEncrypted),
            Base64.getEncoder().encodeToString(privateSignature.sign())).send();
    }
}
