package net.devmart.skywarsreloaded.api.manager.game;

import com.sk89q.worldedit.EditSession;
import net.devmart.skywarsreloaded.api.unlockable.cage.Cage;
import net.devmart.skywarsreloaded.api.utils.SWCoord;

import java.util.List;

public interface CageManager {

    void loadAllCages();

    Cage getCageById(String id);

    List<Cage> getCagesByType(String type);

    List<Cage> getAllCages();

    EditSession placeCage(Cage cage, SWCoord location);

}
