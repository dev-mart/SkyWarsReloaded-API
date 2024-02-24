package net.devmart.skywarsreloaded.api.gui;

import net.devmart.skywarsreloaded.api.gui.handlers.SWGuiClickHandler;
import net.devmart.skywarsreloaded.api.unlockable.Unlockable;
import net.devmart.skywarsreloaded.api.wrapper.Item;

import java.util.function.Function;

public interface SWConfirmationGui extends SWGui {

    void addConfirmButton(Unlockable unlockable, SWGuiClickHandler handler);

    void addConfirmButton(Function<Item, Item> itemModifier, SWGuiClickHandler handler);

    void addCancelButton(Unlockable unlockable, SWGuiClickHandler handler);

    void addCancelButton(Function<Item, Item> itemModifier, SWGuiClickHandler handler);

}
