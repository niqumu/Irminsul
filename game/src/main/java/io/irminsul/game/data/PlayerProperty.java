package io.irminsul.game.data;

import io.irminsul.common.proto.PropValueOuterClass;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

@Getter
@RequiredArgsConstructor
public enum PlayerProperty {
    NONE(0, Integer.MIN_VALUE, Integer.MAX_VALUE),
    /**
     * Avatar EXP
     */
    EXP(1001, 0, Integer.MAX_VALUE),
    /**
     * Avatar ascension level
     */
    BREAK_LEVEL(1002, 0, Integer.MAX_VALUE),
    /**
     * Avatar level
     */
    LEVEL(4001, 0, 90),
    /**
     * Whether the player can fly (glide). Flying is disabled for new players until the Amber quest
     */
    IS_FLYABLE(10006, 0, 1),
    /**
     * Whether the player is allowed to teleport
     */
    IS_TRANSFERABLE(10009, 0, 1),
    /**
     * Maximum stamina of the player
     */
    MAX_STAMINA(10010, 0, 24000),
    /**
     * Current stamina of the player?
     */
    CUR_PERSIST_STAMINA(10011, 0, Integer.MAX_VALUE, true),
    /**
     * Adventure Rank
     */
    PLAYER_LEVEL(10013, 1, 60),
    /**
     * Adventure EXP within the current rank
     */
    PLAYER_EXP(10014, 0, Integer.MAX_VALUE),
    /**
     * Primogems; yes, negative values are possible (refunds)
     */
    PLAYER_HCOIN(10015, Integer.MIN_VALUE, Integer.MAX_VALUE),
    /**
     * Mora
     */
    PLAYER_SCOIN(10016, 0, Integer.MAX_VALUE),
    /**
     * Multiplayer join setting type; 0 = deny, 1 = accept, 2 = ask
     */
    PLAYER_MP_SETTING_TYPE(10017, 0, 2),
    /**
     * Is the player allowed to participate in multiplayer? Some quests disable this
     */
    IS_MP_MODE_AVAILABLE(10018, 0, 1),
    /**
     * World level of the player
     */
    PLAYER_WORLD_LEVEL(10019, 0, 9),
    /**
     * Original resin
     */
    PLAYER_RESIN(10020, 0, 2000),
    /**
     * Genesis Crystals; can be negative just like Primogems
     */
    PLAYER_MCOIN(10025, Integer.MIN_VALUE, Integer.MAX_VALUE),
    /**
     * Realm currency
     */
    PLAYER_HOME_COIN(10042, 0, Integer.MAX_VALUE),
    /**
     * Whether the player is allowed to dive underwater
     */
    PLAYER_CAN_DIVE(10048, 0, 1);

    /**
     * The ID of this property
     */
    private final int id;

    /**
     * The minimum value of this property
     */
    private final int min;

    /**
     * The maximum value of this property
     */
    private final int max;

    /**
     * Whether the range of this property is dynamic
     */
    private final boolean dynamic;

    PlayerProperty(int id, int min, int max) {
        this(id, min, max, false);
    }

    public @NotNull PropValueOuterClass.PropValue toPropValue(int value) {
        return PropValueOuterClass.PropValue.newBuilder().setType(this.id).setVal(value).setIval(value).build();
    }

    /**
     * Gets a player property by ID
     * @param id The ID of the property to look up
     * @return The property associated with the provided ID, or null if none exists
     */
    public static @Nullable PlayerProperty byId(int id) {
        for (PlayerProperty property : PlayerProperty.values()) {
            if (property.getId() == id) {
                return property;
            }
        }
        return null;
    }

    public static final Map<Integer, Integer> DEFAULT_PROPERTIES = new HashMap<>() {{
        put(PLAYER_LEVEL.getId(), 1);
        put(MAX_STAMINA.getId(), 10000);
        put(CUR_PERSIST_STAMINA.getId(), 10000);
        put(PLAYER_RESIN.getId(), 160);
    }};

    public static final Map<Integer, Integer> SANDBOX_PROPERTIES = new HashMap<>() {{
        put(IS_FLYABLE.getId(), 1);
        put(PLAYER_CAN_DIVE.getId(), 1);
        put(IS_MP_MODE_AVAILABLE.getId(), 1);
        put(IS_TRANSFERABLE.getId(), 1);
    }};
}
