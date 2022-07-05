package com.iteale.frosteconomy.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class ATM extends Block {
    public ATM() {
        super(Properties.of(Material.METAL)
                .strength(3.0F, 30.0F)
                .sound(SoundType.METAL));
    }
}
