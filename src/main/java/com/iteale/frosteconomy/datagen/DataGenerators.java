package com.iteale.frosteconomy.datagen;

import com.iteale.frosteconomy.FrostEconomy;
import com.iteale.frosteconomy.datagen.itemmodel.CoinItemModel;
import com.iteale.frosteconomy.datagen.language.ENUSLanguage;
import com.iteale.frosteconomy.datagen.language.ZHCNLanguage;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = FrostEconomy.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void onDataGather(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper exfh = event.getExistingFileHelper();

        if (event.includeServer()) {
        }

        if (event.includeClient()) {
            // translations
            generator.addProvider(new ENUSLanguage(generator, FrostEconomy.MODID, "en_us"));
            generator.addProvider(new ZHCNLanguage(generator, FrostEconomy.MODID, "zh_cn"));

            // block models
            // generator.addProvider(new MachineBlockModel(generator, IndustrialCase.MODID, exfh));

            // item models
            generator.addProvider(new CoinItemModel(generator, FrostEconomy.MODID, exfh));

            // blockstates
            // generator.addProvider(new MachineBlockState(generator, IndustrialCase.MODID, exfh));
        }
    }
}