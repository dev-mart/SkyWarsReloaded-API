package net.devmart.skywarsreloaded.api.utils.gui;

import net.devmart.skywarsreloaded.api.utils.gui.handlers.SWGuiClickHandler;

public interface SWConfirmationGui extends SWGui {

    void addConfirmButton(String configMessageProperty, SWGuiClickHandler handler);

    void addCancelButton(String configMessageProperty, SWGuiClickHandler handler);

}
