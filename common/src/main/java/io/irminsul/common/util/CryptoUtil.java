package io.irminsul.common.util;

import com.google.gson.JsonObject;
import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.file.Files;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;

@UtilityClass
public class CryptoUtil {

    private final Logger LOGGER = LoggerFactory.getLogger("CryptoUtil");

    /**
     * The key and seed used for the dispatch exchange
     */
    public byte[] DISPATCH_SEED;
    public byte[] DISPATCH_KEY;
    static {
        try {
            DISPATCH_SEED = Files.readAllBytes(new File("dispatchSeed.bin").toPath());
            DISPATCH_KEY = Files.readAllBytes(new File("dispatchKey.bin").toPath());
        } catch (Exception e) {
            LOGGER.error("Failed reading dispatch keys!", e);
        }
    }

    /**
     * The key used to sign region data
     */
    public PrivateKey REGION_SIGNING_KEY;
    static {
        try {
            REGION_SIGNING_KEY = KeyFactory.getInstance("RSA").generatePrivate(
                new PKCS8EncodedKeySpec(Files.readAllBytes(new File("regionKey.der").toPath())));
        } catch (Exception e) {
            LOGGER.error("Failed reading region signing key!", e);
        }
    }

    /**
     * Keys used to encrypt traffic.
     *
     * <pre>
     *     2 -> ? TODO
     *     3 -> ? TODO
     *     4 -> CN PC
     *     5 -> OS PC</pre>
     */
    public HashMap<Integer, PublicKey> ENCRYPTION_KEYS = new HashMap<>();
    static {
        try {
            for (int i = 2; i <= 5; i++) {
                ENCRYPTION_KEYS.put(i, KeyFactory.getInstance("RSA")
                    .generatePublic(new X509EncodedKeySpec(Files.readAllBytes(new File(i + "_Pub.der").toPath()))));
            }
        } catch (Exception e) {
            LOGGER.error("Failed reading encryption keys!", e);
        }
    }

    public void xor(byte[] packet, byte[] key) {
        for (int i = 0; i < packet.length; i++) {
            packet[i] ^= key[i % key.length];
        }
    }

    public @NotNull String encodeCurrentRegion(byte[] regionInfo, @NotNull String keyID) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, ENCRYPTION_KEYS.get(Integer.valueOf(keyID)));

        ByteArrayOutputStream encryptedRegionInfoStream = new ByteArrayOutputStream();

        int chunkSize = 256 - 11;
        int regionInfoLength = regionInfo.length;
        int chunks = (int) Math.ceil(regionInfoLength / (double) chunkSize);

        for (int i = 0; i < chunks; i++) {
            byte[] chunk =
                Arrays.copyOfRange(
                    regionInfo, i * chunkSize, Math.min((i + 1) * chunkSize, regionInfoLength));
            byte[] encryptedChunk = cipher.doFinal(chunk);
            encryptedRegionInfoStream.write(encryptedChunk);
        }

        Signature privateSignature = Signature.getInstance("SHA256withRSA");
        privateSignature.initSign(REGION_SIGNING_KEY);
        privateSignature.update(regionInfo);

        JsonObject object = new JsonObject();
        object.addProperty("content", Base64.getEncoder().encodeToString(encryptedRegionInfoStream.toByteArray()));
        object.addProperty("sign", Base64.getEncoder().encodeToString(privateSignature.sign()));
        return object.toString();
    }
}
