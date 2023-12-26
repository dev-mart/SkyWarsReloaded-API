package net.devmart.skywarsreloaded.api.utils;

import net.devmart.skywarsreloaded.api.wrapper.entity.SWPlayer;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.util.List;

public interface Item extends Cloneable {

    String getMaterial();

    Item setMaterial(String material);

    int getAmount();

    Item setAmount(int amount);

    List<String> getEnchantments();

    Item setEnchantments(List<String> enchantments);

    List<String> getLore();

    Item setLore(List<String> lore);

    String getDisplayName();

    Item setDisplayName(String display);

    List<String> getItemFlags();

    Item setItemFlags(List<String> itemFlags);

    Item addItemFlag(String flag);

    Item addAllItemFlags();

    short getDurability();

    Item setDurability(short durability);

    byte getDamage();

    Item setDamage(byte damage);

    Color getColor();

    Item setColor(Color color);

    @Nullable
    String getSkullOwner();

    Item setSkullOwner(String owner);

    Item withMessages(Item item);

    Item replace(String search, String replace);

    Item withExternalPlaceholders(SWPlayer player);

    Item clone();

    boolean isSimilar(Item item);

}
