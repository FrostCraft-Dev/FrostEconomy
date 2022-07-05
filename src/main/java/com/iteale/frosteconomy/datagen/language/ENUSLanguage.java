package com.iteale.frosteconomy.datagen.language;



import com.iteale.frosteconomy.registries.ItemRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ENUSLanguage extends LanguageProvider {
    public ENUSLanguage(DataGenerator gen, String modid, String locale) {
        super(gen, modid, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.frosteconomy", "Frost Economy");

        // blocks
        // add(BlockRegistry.GENERATOR.get(), "Generator");
        

        // items
        add(ItemRegistry.GOLD_COIN.get(), "Gold Coin");
        add(ItemRegistry.SILVER_COIN.get(), "Silver Coin");
        add(ItemRegistry.BRONZE_COIN.get(), "Bronze Coin");

        // ui
        // add("gui.generator.electric.generator", "Generator");
        // add("gui.wiring.storage.batbox", "BatBox");
    }
}