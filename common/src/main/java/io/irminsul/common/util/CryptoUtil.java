package io.irminsul.common.util;

import lombok.experimental.UtilityClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.file.Files;
import java.security.Signature;
import java.util.Arrays;

@UtilityClass
public class CryptoUtil {

    private final Logger LOGGER = LoggerFactory.getLogger("CryptoUtil");

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

    public void xor(byte[] packet, byte[] key) {
        for (int i = 0; i < packet.length; i++) {
            packet[i] ^= key[i % key.length];
        }
    }
}
