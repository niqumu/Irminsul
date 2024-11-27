package io.irminsul.game.data;

import lombok.experimental.UtilityClass;

import java.lang.reflect.Field;

@UtilityClass
public class EnterReason {
    public int NONE = 0;
    public int LOGIN = 1;
    public int DUNGEON_REPLAY = 11;
    public int DUNGEON_REVIVE_ON_WAYPOINT = 12;
    public int DUNGEON_ENTER = 13;
    public int DUNGEON_QUIT = 14;
    public int GM = 21;
    public int QUEST_ROLLBACK = 31;
    public int REVIVAL = 32;
    public int PERSONAL_SCENE = 41;
    public int TRANS_POINT = 42;
    public int CLIENT_TRANSMIT = 43;
    public int FORCE_DRAG_BACK = 44;
    public int TEAM_KICK = 51;
    public int TEAM_JOIN = 52;
    public int TEAM_BACK = 53;
    public int MUIP = 54;
    public int DUNGEON_INVITE_ACCEPT = 55;
    public int LUA = 56;
    public int ACTIVITY_LOAD_TERRAIN = 57;
    public int HOST_FROM_SINGLE_TO_MP = 58;
    public int MP_PLAY = 59;
    public int ANCHOR_POINT = 60;
    public int LUA_SKIP_UI = 61;
    public int RELOAD_TERRAIN = 62;
    public int DRAFT_TRANSFER = 63;
    public int ENTER_HOME = 64;
    public int EXIT_HOME = 65;
    public int CHANGE_HOME_MODULE = 66;
    public int GALLERY = 67;
    public int HOME_SCENE_JUMP = 68;
    public int HIDE_AND_SEEK = 69;

    public static String getReasonById(int id) {
        try {
            for (Field field : EnterReason.class.getDeclaredFields()) {
                if (field.getType().equals(Integer.TYPE) && field.getInt(null) == id) {
                    return field.getName();
                }
            }
        } catch (Exception ignored) {
        }

        return "Unknown";
    }
}
