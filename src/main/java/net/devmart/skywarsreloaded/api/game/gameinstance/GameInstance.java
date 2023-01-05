package net.devmart.skywarsreloaded.api.game.gameinstance;

import com.google.gson.JsonObject;
import net.devmart.skywarsreloaded.api.game.GameTemplate;
import net.devmart.skywarsreloaded.api.game.types.GameState;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface GameInstance {

    /**
     * Gets the ID of the instance.
     *
     * @return The ID of the instance
     */
    UUID getId();

    /**
     * Gets the {@link GameTemplate} used to create the instance.
     * This can be null if this instance is idle and not yet assigned.
     *
     * @return The instance template
     */
    GameTemplate getTemplate();

    /**
     * Sets the {@link GameTemplate} used to create this instance..
     *
     * @param template The template to set
     */
    void setTemplate(GameTemplate template);

    /**
     * Gets the {@link GameState} of the instance. The state will be EDIT_MODE if the instance is being used to
     * edit the {@link GameTemplate} of this instance.
     *
     * @return The state of the instance
     */
    GameState getState();

    /**
     * Get if a player is allowed to join the game
     *
     * @return True if a player can join, false otherwise
     */
    boolean canJoinGame();

    /**
     * Get the total number of players in the instance.
     *
     * @return The number of players.
     */
    int getPlayerCount();

    /**
     * Sets the {@link GameState} of the instance.
     *
     * @param state The state to set
     */
    void setState(GameState state);

    /**
     * Gets if the instance is being used to edit the {@link GameTemplate} of this instance.
     *
     * @return True when editing, false otherwise.
     */
    boolean isEditing();

    /**
     * Requests an edit session for this instance. This will return a {@link CompletableFuture} that will be completed
     *
     * @return A {@link CompletableFuture} that will be completed when the edit session is ready.
     */
    CompletableFuture<Void> requestEditSession();

    /**
     * Gets the {@link JsonObject} representation of the instance.
     *
     * @return The instance as a JsonObject
     */
    JsonObject toJSON();

}
