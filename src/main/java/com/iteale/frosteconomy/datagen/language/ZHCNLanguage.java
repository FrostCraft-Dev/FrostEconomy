package com.iteale.frosteconomy.datagen.language;


import com.iteale.frosteconomy.registries.ItemRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ZHCNLanguage extends LanguageProvider {
    public ZHCNLanguage(DataGenerator gen, String modid, String locale) {
        super(gen, modid, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.frosteconomy", "冰霜经济");

        // blocks
        // add(BlockRegistry.GENERATOR.get(), "火力发电机");


        // items
        add(ItemRegistry.GOLD_COIN.get(), "金币");
        add(ItemRegistry.SILVER_COIN.get(), "银币");
        add(ItemRegistry.BRONZE_COIN.get(), "铜币");

        // ui
        // add("gui.generator.electric.generator", "火力发电机");
        // add("gui.wiring.storage.batbox", "储电箱");
    }
}