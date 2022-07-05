package com.iteale.frosteconomy.registries;

import com.iteale.frosteconomy.FrostEconomy;
import com.iteale.frosteconomy.item.CoinType;
import com.iteale.frosteconomy.item.ItemCoin;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public final class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FrostEconomy.MODID);

    public static RegistryObject<Item> GOLD_COIN =  ITEMS.register("gold_coin", () -> new ItemCoin(CoinType.GOLD));
    public static RegistryObject<Item> SILVER_COIN =  ITEMS.register("silver_coin", () -> new ItemCoin(CoinType.SILVER));
    public  static RegistryObject<Item> BRONZE_COIN =  ITEMS.register("bronze_coin", () -> new ItemCoin(CoinType.BRONZE));
}