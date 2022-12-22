package net.devmart.skywarsreloaded.api.wrapper.event;

public interface SWCancellable {

    /**
     * Get if event is cancelled
     *
     * @return true if event is cancelled
     */
    boolean isCancelled();

    /**
     * Set if event is cancelled
     *
     * @param cancelled true if event is cancelled
     */
    void setCancelled(boolean cancelled);

}
