package net.devmart.skywarsreloaded.api.utils.scoreboards;

import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;

public interface SWBoard {

    void setup();

    void setTitle(String title);

    void setLine(int line, String text);

    String[] convertIntoPieces(String text);

    int getLineCount();

    String getLine(int line);

    SWPlayer getPlayer();

    void apply();

}
