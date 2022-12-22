package net.devmart.skywarsreloaded.api.utils.properties;

public enum FolderProperties {

    TEMPLATE_FOLDER("map_templates"),
    WORLD_SCHEMATICS_FOLDER("map_schematics"),
    PLAYERDATA_FOLDER("player_data"),
    KITS_FOLDER("kits"),
    CHEST_TYPES_FOLDER("chests");

    private final String folderName;

    FolderProperties(String folderNameIn) {
        this.folderName = folderNameIn;
    }

    public String toString() {
        return folderName;
    }
}
