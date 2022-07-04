package com.iteale.frosteconomy.registries;

import com.iteale.frosteconomy.FrostEconomy;
import com.iteale.frosteconomy.item.CoinType;
import com.iteale.frosteconomy.item.ItemCoin;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FrostEconomy.MODID);

    public static RegistryObject<Item> FORGE_HAMMER = register("gold_coin", new ItemCoin(CoinType.GOLD));

    public static RegistryObject<Item> register(String name, Item item) {
        RegistryObject<Item> registry = ITEMS.register(name, () -> item);
        return registry;
    }

    public static RegistryObject<Item> register(String name) {
        Item item = new Item(new Item.Properties().tab(FrostEconomy.TAB_ECO));
        return register(name, item);
    }
}