package com.qiqikanna.test.item;

import com.qiqikanna.test.TestMod;
import com.qiqikanna.test.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems
{
    //注册完物品别忘了加到itemGroups里
    //别忘了语言文件，模型文件，用数据生成
    public static final Item ICE_ETHER = register("ice_ether",new Item(new Item.Settings()));
    public static final Item SHIT = register("shit",new Item(new Item.Settings().food(ModFoodComponents.SHIT)));
    public static final Item SWORD = register("sword",new SwordItem(ToolMaterials.DIAMOND,10,4.0f,new Item.Settings().maxCount(1)));
    public static final Item CORN = register("corn",new Item(new Item.Settings().food(ModFoodComponents.CORN)));
    public static final Item BLUEBARRY = register("bluebarry",new Item(new Item.Settings().food(ModFoodComponents.BLUEBERRY)));
    public static final Item URANIUM = register("uranium",new Item(new Item.Settings()));

    public static final Item BASKETBALL_BLOCK = register(ModBlocks.BASKETBALL_BLOCK);
    public static final Item RAINBOW_BLOCK = register(ModBlocks.RAINBOW_BLOCK);
    public static final Item ICE_ETHER_BLOCK = register(ModBlocks.ICE_ETHER_BLOCK);
    public static final Item CHANDELIER = register(ModBlocks.CHANDELIER);
    public static final Item TEST_BLOCK = register(new TestBlockItem(ModBlocks.TEST_BLOCK,new Item.Settings()));

    public static final Item ICE_ETHER_STAIRS = register(ModBlocks.ICE_ETHER_STAIRS);
    public static final Item ICE_ETHER_SLAB = register(ModBlocks.ICE_ETHER_SLAB);
    public static final Item ICE_ETHER_BUTTON = register(ModBlocks.ICE_ETHER_BUTTON);
    public static final Item ICE_ETHER_PRESSURE_PLATE = register(ModBlocks.ICE_ETHER_PRESSURE_PLATE);
    public static final Item ICE_ETHER_FENCE = register(ModBlocks.ICE_ETHER_FENCE);
    public static final Item ICE_ETHER_FENCE_GATE = register(ModBlocks.ICE_ETHER_FENCE_GATE);
    public static final Item ICE_ETHER_WALLL = register(ModBlocks.ICE_ETHER_WALLL);
    public static final Item ICE_ETHER_DOOR = register(ModBlocks.ICE_ETHER_DOOR);
    public static final Item ICE_ETHER_TRAPDOOR = register(ModBlocks.ICE_ETHER_TRAPDOOR);



    //原版的方块物品注册方法
    public static Item register(Block block) {
        return register(new BlockItem(block, new Item.Settings()));
    }

    public static Item register(Block block, Block... blocks) {
        BlockItem blockItem = new BlockItem(block, new Item.Settings());

        for (Block block2 : blocks) {
            Item.BLOCK_ITEMS.put(block2, blockItem);
        }

        return register(blockItem);
    }

    public static Item register(BlockItem item) {
        return register(item.getBlock(), item);
    }

    public static Item register(Block block, Item item) {
        return register(Registries.BLOCK.getId(block), item);
    }



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

    //fabric api 添加到原版物品栏的方法
    /*
    private static void addItemToItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(ICE_ETHER);
        entries.add(DICK);
        entries.add(SHIT);
    }
    */

    //辅助模组进行初始化的函数
    public static void registerItems()
    {
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemToItemGroup);
    }
}
