package net.devmart.skywarsreloaded.api.manager;

import net.devmart.skywarsreloaded.api.game.GamePlayer;
import net.devmart.skywarsreloaded.api.game.gameinstance.LocalGameInstance;
import net.devmart.skywarsreloaded.api.game.vote.VoteType;
import net.devmart.skywarsreloaded.api.gui.SWConfirmationGui;
import net.devmart.skywarsreloaded.api.gui.SWGui;
import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;
import net.devmart.skywarsreloaded.api.wrapper.server.SWInventory;

import java.util.HashMap;

public interface SWGuiManager {

    SWGui createJoinTypeSelectorGui(SWPlayer player);

    SWGui createJoinGameGui(SWPlayer player);

    SWGui createVotingOptionsGui(GamePlayer gamePlayer, LocalGameInstance gameInstance, VoteType voteType);

    SWGui createVotingGui(GamePlayer gamePlayer, LocalGameInstance gameInstance);

    SWGui createTeamSelectorGui(GamePlayer gamePlayer, LocalGameInstance gameInstance);

    SWGui createKitGui(SWPlayer player);

    SWConfirmationGui createConfirmationGui(SWPlayer player, String title);

    void registerInventoryCreation(SWGui gui);

    void unregisterInventory(SWInventory inventory);

    void unregisterGui(SWGui gui);

    SWGui getActiveGui(SWInventory inventory);

    <T extends SWGui> HashMap<SWInventory, T> getInventoryMap(Class<T> gui);

}
