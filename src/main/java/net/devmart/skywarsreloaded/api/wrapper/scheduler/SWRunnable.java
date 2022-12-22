package net.devmart.skywarsreloaded.api.wrapper.scheduler;

public interface SWRunnable extends Runnable {

    void cancel();

    boolean isCancelled();

    int getTaskId();

    void setTaskId(int taskId);

}