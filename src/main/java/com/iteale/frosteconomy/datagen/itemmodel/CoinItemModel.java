package com.iteale.frosteconomy.datagen.itemmodel;

import com.iteale.frosteconomy.FrostEconomy;
import com.iteale.frosteconomy.registries.ItemRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

public class CoinItemModel extends ItemModelProvider {
    public CoinItemModel(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }

    protected String itemName(Item item) {
        return "item/" + item.getRegistryName().getPath();
    }

    protected void registerItem(Item item) {
        withExistingParent(itemName(item),
                new ResourceLocation("minecraft", "item/generated"))
                .texture("layer0", new ResourceLocation(FrostEconomy.MODID, itemName(item)));
    }

    @Override
    protected void registerModels() {
        registerItem(ItemRegistry.GOLD_COIN.get());
        registerItem(ItemRegistry.SILVER_COIN.get());
        registerItem(ItemRegistry.BRONZE_COIN.get());
    }

    @NotNull
    @Override
    public String getName() {
        return "FrostEconomy: CoinItemModel";
    }
}