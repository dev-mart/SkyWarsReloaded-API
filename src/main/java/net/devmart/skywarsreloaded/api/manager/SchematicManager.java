package net.devmart.skywarsreloaded.api.manager;

import com.sk89q.worldedit.EditSession;
import com.sk89q.worldedit.extent.clipboard.Clipboard;
import com.sk89q.worldedit.math.BlockVector3;
import com.sk89q.worldedit.world.World;
import net.devmart.skywarsreloaded.api.game.gameinstance.GameInstance;
import net.devmart.skywarsreloaded.api.game.gameinstance.LocalGameInstance;
import net.devmart.skywarsreloaded.api.utils.SWCoord;
import org.jetbrains.annotations.Nullable;

import java.io.File;

public interface SchematicManager {

    @Nullable
    Clipboard getSchematic(File subFolderName, String schemName);

    Clipboard getSchematic(File file);

    EditSession pasteSchematic(Clipboard schem, SWCoord location, boolean ignoreAir);

    @Nullable
    EditSession pasteSchematic(Clipboard schem, World world, BlockVector3 location, boolean ignoreAir);

    void undoSchematicPaste(EditSession session);

    boolean saveGameWorldToSchematic(GameInstance gameWorld, World world);

    boolean clearGameWorld(LocalGameInstance instance);

}
