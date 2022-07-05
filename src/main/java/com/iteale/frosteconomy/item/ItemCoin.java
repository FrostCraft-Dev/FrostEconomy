package com.iteale.frosteconomy.item;
import com.iteale.frosteconomy.FrostEconomy;
import net.minecraft.world.item.Item;

public class ItemCoin  extends ItemEco {
    private CoinType type;
    public ItemCoin(CoinType type) {
        super(new Item.Properties());
        this.type = type;
    }
}