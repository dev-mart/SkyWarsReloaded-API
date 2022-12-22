package net.devmart.skywarsreloaded.api.hook;

import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;

public interface SWVaultHook extends SWHook {

    double getBalance(SWPlayer player);

    boolean hasBalance(SWPlayer player, double amount);

    boolean withdraw(SWPlayer player, double amount);

    boolean deposit(SWPlayer player, double amount);

}
