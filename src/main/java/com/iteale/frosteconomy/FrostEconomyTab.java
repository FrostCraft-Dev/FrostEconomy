package com.iteale.frosteconomy;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class FrostEconomyTab extends CreativeModeTab {
    public FrostEconomyTab() {
        super("frosteconomy");
    }

    @OnlyIn(Dist.CLIENT)
    public ItemStack makeIcon() {
        return new ItemStack(Items.IRON_BLOCK);
    }
}