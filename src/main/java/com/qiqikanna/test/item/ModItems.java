package com.qiqikanna.test.item;

import com.qiqikanna.test.TestMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems
{

    public static final Item ICE_ETHER = register("ice_ether",new Item(new Item.Settings()));
    public static final Item SHIT = register("shit",new Item(new Item.Settings()));
    public static final Item DICK = register("dick",new Item(new Item.Settings()));


    //原版的物品注册方法
    public static Item register(String id, Item item) {
        return register(new Identifier(TestMod.MOD_ID, id), item);
    }

    public static Item register(Identifier id, Item item) {
        return register(RegistryKey.of(Registries.ITEM.getKey(), id), item);
    }

    public static Item register(RegistryKey<Item> key, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }

        return Registry.register(Registries.ITEM, key, item);
    }

    //辅助模组进行初始化的函数
    public static void registerItems()
    {

    }
}
