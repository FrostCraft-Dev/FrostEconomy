package com.iteale.frosteconomy.item;

import com.iteale.frosteconomy.FrostEconomy;
import net.minecraft.world.item.Item;

public class ItemEco extends Item {
    public ItemEco(Properties properties) {
        super(properties.tab(FrostEconomy.TAB_ECO));
    }
}