package net.devmart.skywarsreloaded.api.manager;

import net.devmart.skywarsreloaded.api.game.gameinstance.LocalGameInstance;
import net.devmart.skywarsreloaded.api.game.vote.VoteType;
import net.devmart.skywarsreloaded.api.utils.gui.SWConfirmationGui;
import net.devmart.skywarsreloaded.api.utils.gui.SWGui;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;
import net.devmart.skywarsreloaded.api.wrapper.server.SWInventory;

public interface SWGuiManager {

    SWGui createJoinTypeSelectorGui(SWPlayer player);

    SWGui createJoinGameGui(SWPlayer player);

    SWGui createVotingOptionsGui(SWPlayer player, LocalGameInstance gameInstance, VoteType voteType);

    SWGui createVotingGui(SWPlayer player, LocalGameInstance gameInstance);

    SWGui createKitGui(SWPlayer player);

    SWConfirmationGui createConfirmationGui(SWPlayer player, String title);

    void registerInventoryCreation(SWGui gui);

    void unregisterInventory(SWInventory inventory);

    void unregisterGui(SWGui gui);

    SWGui getActiveGui(SWInventory inventory);

}
