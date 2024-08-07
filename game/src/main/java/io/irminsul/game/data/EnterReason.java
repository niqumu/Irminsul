package io.irminsul.game.data;

import lombok.experimental.UtilityClass;

import java.lang.reflect.Field;

// todo make these all caps with underscores - these are ripped straight from json and violate convention
@UtilityClass
public class EnterReason {
    public int None = 0;
    public int Login = 1;
    public int DungeonReplay = 11;
    public int DungeonReviveOnWaypoint  = 12;
    public int DungeonEnter = 13;
    public int DungeonQuit = 14;
    public int Gm = 21;
    public int QuestRollback = 31;
    public int Revival = 32;
    public int PersonalScene = 41;
    public int TransPoint  = 42;
    public int ClientTransmit = 43;
    public int ForceDragBack = 44;
    public int TeamKick = 51;
    public int TeamJoin = 52;
    public int TeamBack = 53;
    public int Muip = 54;
    public int DungeonInviteAccept = 55;
    public int Lua = 56;
    public int ActivityLoadTerrain = 57;
    public int HostFromSingleToMp = 58;
    public int MpPlay = 59;
    public int AnchorPoint  = 60;
    public int LuaSkipUi = 61;
    public int ReloadTerrain = 62;
    public int DraftTransfer = 63;
    public int EnterHome = 64;
    public int ExitHome = 65;
    public int ChangeHomeModule = 66;
    public int Gallery = 67;
    public int HomeSceneJump = 68;
    public int HideAndSeek = 69;

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
