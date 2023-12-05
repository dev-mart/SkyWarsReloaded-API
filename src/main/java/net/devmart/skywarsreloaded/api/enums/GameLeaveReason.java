package net.devmart.skywarsreloaded.api.enums;

public enum GameLeaveReason {

    DEATH(true),
    QUIT_GAME(true),
    QUIT_SERVER(true),
    KICKED(false),
    OTHER(false);

    private final boolean selfInflicted;

    GameLeaveReason(boolean selfInflicted) {
        this.selfInflicted = selfInflicted;
    }

    public boolean isSelfInflicted() {
        return selfInflicted;
    }

}
