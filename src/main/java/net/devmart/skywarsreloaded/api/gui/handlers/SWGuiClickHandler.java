package net.devmart.skywarsreloaded.api.gui.handlers;

import net.devmart.skywarsreloaded.api.gui.SWGui;

@FunctionalInterface
public interface SWGuiClickHandler {

    ClickResult onClick(SWGui gui, int slot, ClickType clickType, boolean isShift);

    enum ClickType {
        PRIMARY,
        SECONDARY,
        MIDDLE,
    }

    enum ClickResult {
        CANCELLED,
        ALLOWED,
        IGNORED
    }

}
