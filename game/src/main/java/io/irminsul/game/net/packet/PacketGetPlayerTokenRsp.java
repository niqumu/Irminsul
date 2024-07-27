package io.irminsul.game.net.packet;

import com.google.protobuf.ByteString;
import io.irminsul.common.game.Session;
import io.irminsul.common.net.PacketEncryptionMode;
import io.irminsul.common.net.PacketIds;
import io.irminsul.common.proto.GetPlayerTokenRspOuterClass;
import io.irminsul.common.util.CryptoUtil;
import io.irminsul.game.net.OutboundPacket;

public class PacketGetPlayerTokenRsp extends OutboundPacket {
    public PacketGetPlayerTokenRsp(Session session, String encryptedSeed, String encryptedSeedSign) {
        super(PacketIds.GetPlayerTokenRsp, session);

        this.setEncryptionMode(PacketEncryptionMode.DISPATCH);

        GetPlayerTokenRspOuterClass.GetPlayerTokenRsp response = GetPlayerTokenRspOuterClass.GetPlayerTokenRsp.newBuilder()
            .setUid(1)
            .setToken("token")
            .setAccountType(1)
            .setIsProficientPlayer(false)
            .setSecretKeySeed(CryptoUtil.ENCRYPT_SEED)
            .setSecurityCmdBuffer(ByteString.copyFrom(CryptoUtil.ENCRYPT_SEED_BUFFER))
            .setPlatformType(3)
            .setChannelId(1)
            .setCountryCode("US")
            .setClientVersionRandomKey("c25-314dd05b0b5f")
//            .setRegPlatform(3)
            .setClientIpStr(session.getTunnel().getAddress().getAddress().getHostAddress())
            .setServerRandKey(encryptedSeed)
            .setSign(encryptedSeedSign)
            .build();

        this.setData(response.toByteArray());
    }
}
