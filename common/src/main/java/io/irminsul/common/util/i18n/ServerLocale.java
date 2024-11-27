package io.irminsul.common.util.i18n;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Enum of supported server locales and their translation files supplying strings
 */
@Getter
@RequiredArgsConstructor
public enum ServerLocale {
    EN_US("en_US", "en_US.properties"),
    ZH_CN("zh_CN", "zh_CN.properties");

    private final String name;

    private final String translationFile;
}
