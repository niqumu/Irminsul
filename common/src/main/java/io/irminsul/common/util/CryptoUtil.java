package io.irminsul.common.util;

import com.google.gson.JsonObject;
import lombok.experimental.UtilityClass;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Objects;

@UtilityClass
public class CryptoUtil {

    private final Logger LOGGER = LoggerFactory.getLogger("CryptoUtil");

    /**
     * The key and seed used for the dispatch exchange
     */
    public byte[] DISPATCH_SEED;
    public byte[] DISPATCH_KEY;
    static {
        try (
            InputStream seed = CryptoUtil.class.getResourceAsStream("/keys/dispatchSeed.bin");
            InputStream key = CryptoUtil.class.getResourceAsStream("/keys/dispatchKey.bin");
        ) {
            DISPATCH_SEED = Objects.requireNonNull(seed).readAllBytes();
            DISPATCH_KEY = Objects.requireNonNull(key).readAllBytes();
        } catch (Exception e) {
            LOGGER.error("Failed reading dispatch keys!", e);
        }
    }

    /**
     * The key used to sign region data
     */
    public PrivateKey REGION_SIGNING_KEY;
    static {
        try (InputStream key = CryptoUtil.class.getResourceAsStream("/keys/regionKey.der")) {
            REGION_SIGNING_KEY = KeyFactory.getInstance("RSA").generatePrivate(
                new PKCS8EncodedKeySpec(Objects.requireNonNull(key).readAllBytes()));
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
        for (int i = 2; i <= 5; i++) {
            try (InputStream key = CryptoUtil.class.getResourceAsStream("/keys/" + i + "_Pub.der")) {
                ENCRYPTION_KEYS.put(i, KeyFactory.getInstance("RSA")
                    .generatePublic(new X509EncodedKeySpec(Objects.requireNonNull(key).readAllBytes())));
            } catch (Exception e) {
                LOGGER.error("Failed reading encryption key {}!", i, e);
            }
        }
    }

    public long ENCRYPT_SEED = Long.parseUnsignedLong("11468049314633205968");
    public byte[] ENCRYPT_SEED_BUFFER;
    public byte[] ENCRYPT_KEY;
    static {
        try (
            InputStream buffer = CryptoUtil.class.getResourceAsStream("/keys/secretKeyBuffer.bin");
            InputStream key = CryptoUtil.class.getResourceAsStream("/keys/secretKey.bin");
        ) {
            ENCRYPT_SEED_BUFFER = Objects.requireNonNull(buffer).readAllBytes();
            ENCRYPT_KEY = Objects.requireNonNull(key).readAllBytes();
        } catch (Exception e) {
            LOGGER.error("Failed reading secret key!", e);
        }
    }

    public PrivateKey SIGNING_KEY;
    static {
        try (InputStream key = CryptoUtil.class.getResourceAsStream("/keys/SigningKey.der")) {
            SIGNING_KEY = KeyFactory.getInstance("RSA")
                .generatePrivate(new PKCS8EncodedKeySpec(Objects.requireNonNull(key).readAllBytes()));
        } catch (Exception e) {
            LOGGER.error("Failed reading signing key!", e);
        }
    }

    public void xor(byte[] bytes, byte[] key) {
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] ^= key[i % key.length];
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
