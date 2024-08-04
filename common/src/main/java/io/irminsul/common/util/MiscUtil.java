package io.irminsul.common.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class MiscUtil {
    public int abilityHash(String str) {
        int a = 0, b = 0;
        while (b < str.length()) {
            a = str.charAt(b++) + 131 * a;
        }
        return a;
    }
}
