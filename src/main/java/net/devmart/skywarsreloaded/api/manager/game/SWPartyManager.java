package net.devmart.skywarsreloaded.api.manager.game;

import net.devmart.skywarsreloaded.api.party.SWParty;

import java.util.UUID;

public interface SWPartyManager {

    SWParty initParty(UUID leader);

}
