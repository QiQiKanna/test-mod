package com.qiqikanna.test.item;

import com.qiqikanna.test.TestMod;
import com.qiqikanna.test.block.ModBlocks;
import com.qiqikanna.test.entity.ModEntityTypes;
import com.qiqikanna.test.fluid.ModFluids;
import com.qiqikanna.test.item.custom.*;
import com.qiqikanna.test.sound.ModSoundEvents;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems
{
    //注册完物品别忘了加到itemGroups里
    //别忘了语言文件，模型文件，用数据生成
    public static final Item ICE_ETHER = register("ice_ether",new Item(new Item.Settings()));
    public static final Item SHIT = register("shit",new Item(new Item.Settings().food(ModFoodComponents.SHIT)));
    public static final Item MY_SWORD = register("my_sword",
            new MySwordItem(ToolMaterials.DIAMOND,10,4.0f,new Item.Settings()));
    public static final Item CORN = register("corn",
            new AliasedBlockItem(ModBlocks.CORN_CROP,new Item.Settings().food(ModFoodComponents.CORN)));
    public static final Item LUMEN_BERRIES = register("lumen_berries",
            new AliasedBlockItem(ModBlocks.LUMEN_BERRY_BUSH,new Item.Settings().food(ModFoodComponents.LUMEN_BERRIES)));
    public static final Item BLUEBARRY = register("bluebarry",new Item(new Item.Settings().food(ModFoodComponents.BLUEBERRY)));
    public static final Item URANIUM = register("uranium",new SimpleDescItem(new Item.Settings()));
    public static final Item FIRE_ETHER = register("fire_ether",new Item(new Item.Settings()));
    public static final Item STRAWBERRY = register("strawberry",new Item(new Item.Settings().food(ModFoodComponents.STRAWBERRY)));
    public static final Item STRAWBERRY_SEEDS = register("strawberry_seeds",
            new AliasedBlockItem(ModBlocks.STRAWBERRY_CROP,new Item.Settings()));

    public static final Item BASEBALL_BAT = register("baseball_bat",new Item(new Item.Settings()));
    public static final Item BIG_HAMMER = register("big_hammer",
            new SwordItem(ToolMaterials.NETHERITE,10,-3.0F,new Item.Settings()));
    public static final Item FIRE_ETHER_SWORD = register("fire_ether_sword",
            new SwordItem(ModToolMaterials.FIRE_ETHER, 3,-2.0F,new Item.Settings()));
    public static final Item FIRE_ETHER_SHOVEL = register("fire_ether_shovel",
            new ShovelItem(ModToolMaterials.FIRE_ETHER, 1.5F,-3.0F,new Item.Settings()));
    public static final Item FIRE_ETHER_PICKAXE = register("fire_ether_pickaxe",
            new PickaxeItem(ModToolMaterials.FIRE_ETHER, 2,-3.0F,new Item.Settings()));
    public static final Item FIRE_ETHER_AXE = register("fire_ether_axe",
            new AxeItem(ModToolMaterials.FIRE_ETHER, 6,-3.0F,new Item.Settings()));
    public static final Item FIRE_ETHER_HOE = register("fire_ether_hoe",
            new HoeItem(ModToolMaterials.FIRE_ETHER, 0,-1.0F,new Item.Settings()));
    public static final Item PICKAXE_AXE = register("pickaxe_axe",
            new PickaxeAxeItem(ModToolMaterials.FIRE_ETHER,6.0F,-2.8F,new Item.Settings()));
    public static final Item ICE_ETHER_HELMET = register("ice_ether_helmet",
            new ArmorItem(ModArmorMaterials.ICE_ETHER,ArmorItem.Type.HELMET,new Item.Settings()));
    public static final Item ICE_ETHER_BOOTS = register("ice_ether_boots",
            new ModArmorItem(ModArmorMaterials.ICE_ETHER,ArmorItem.Type.BOOTS,new Item.Settings()));
    public static final Item ICE_ETHER_CHESTPLATE = register("ice_ether_chestplate",
            new ArmorItem(ModArmorMaterials.ICE_ETHER,ArmorItem.Type.CHESTPLATE,new Item.Settings()));
    public static final Item ICE_ETHER_LEGGINGS = register("ice_ether_leggings",
            new ArmorItem(ModArmorMaterials.ICE_ETHER,ArmorItem.Type.LEGGINGS,new Item.Settings()));
    public static final Item ICE_ETHER_HORSE_ARMOR = register("ice_ether_horse_armor",
            new MyHorseArmorItem(11,"ice_ether",new Item.Settings().maxCount(1)));

    public static final Item OIL_BUCKET = register("oil_bucket",
            new BucketItem(ModFluids.OIL,new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1)));

    public static final Item MUSIC_DISC_BLIZZARD = register("music_disc_blizzard",
            new MusicDiscItem(1, ModSoundEvents.MUSIC_DISC_BLIZZARD,
                    new Item.Settings().maxCount(1).rarity(Rarity.RARE),354));
    public static final Item MUSIC_DISC_HEMOPHILIA = register("music_disc_hemophilia",
            new MusicDiscItem(1,ModSoundEvents.MUSIC_DISC_HEMOPHILIA,
                    new Item.Settings().maxCount(1).rarity(Rarity.RARE),588));
    public static final Item MUSIC_DISC_SEEPING_VOID = register("music_disc_seeping_void",
            new MusicDiscItem(1,ModSoundEvents.MUSIC_DISC_SEEPING_VOID,
                    new Item.Settings().maxCount(1).rarity(Rarity.RARE),537));

    public static final Item CUBE_ENTITY_SPAWN_EGG = register("cube_entity_spawn_egg",
            new SpawnEggItem(ModEntityTypes.CUBE_ENTITY,1,20,new Item.Settings()));

    public static final Item ICE_ETHER_SIGN = register("ice_ether_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    ModBlocks.ICE_ETHER_SIGN,
                    ModBlocks.ICE_ETHER_WALL_SIGN));
    public static final Item ICE_ETHER_HANGING_SIGN = register("ice_ether_hanging_sign",
            new HangingSignItem(ModBlocks.ICE_ETHERE_HANGING_SIGN,
                    ModBlocks.ICE_ETHER_WALL_HANGING_SIGN,
                    new Item.Settings().maxCount(16)));

    public static final Item BASKETBALL_BLOCK = register(ModBlocks.BASKETBALL_BLOCK);
    public static final Item RAINBOW_BLOCK = register(ModBlocks.RAINBOW_BLOCK);
    public static final Item ICE_ETHER_BLOCK = register(ModBlocks.ICE_ETHER_BLOCK);
    public static final Item CHANDELIER = register(ModBlocks.CHANDELIER);
    public static final Item TEST_BLOCK = register(new TestBlockItem(ModBlocks.TEST_BLOCK,new Item.Settings()));
    public static final Item ORANGE_NIGHTSTAND = register(ModBlocks.ORANGE_NIGHTSTAND);
    public static final Item ORANGE_CLOCK = register(ModBlocks.ORANGE_CLOCK);
    public static final Item SOFA = register(ModBlocks.SOFA);
    public static final Item LAMP_BLOCK = register(ModBlocks.LAMP_BLOCK);
    public static final Item MY_BED = register(ModBlocks.MY_BAD);
    public static final Item MY_PILLAR = register(ModBlocks.MY_PILLAR);
    public static final Item MY_FENCE = register(ModBlocks.MY_FENCE);
    public static final Item SIMPLE_CABINET = register(ModBlocks.SIMPLE_CABINET);

    public static final Item ICE_ETHER_STAIRS = register(ModBlocks.ICE_ETHER_STAIRS);
    public static final Item ICE_ETHER_SLAB = register(ModBlocks.ICE_ETHER_SLAB);
    public static final Item ICE_ETHER_BUTTON = register(ModBlocks.ICE_ETHER_BUTTON);
    public static final Item ICE_ETHER_PRESSURE_PLATE = register(ModBlocks.ICE_ETHER_PRESSURE_PLATE);
    public static final Item ICE_ETHER_FENCE = register(ModBlocks.ICE_ETHER_FENCE);
    public static final Item ICE_ETHER_FENCE_GATE = register(ModBlocks.ICE_ETHER_FENCE_GATE);
    public static final Item ICE_ETHER_WALLL = register(ModBlocks.ICE_ETHER_WALLL);
    public static final Item ICE_ETHER_DOOR = register(ModBlocks.ICE_ETHER_DOOR);
    public static final Item ICE_ETHER_TRAPDOOR = register(ModBlocks.ICE_ETHER_TRAPDOOR);
    public static final Item HEMOSTONE = register(ModBlocks.HEMOSTONE);
    public static final Item HEMOSTONE_STAIRS = register(ModBlocks.HEMOSTONE_STAIRS);
    public static final Item ICE_ETHER_LOG = register(ModBlocks.ICE_ETHER_LOG);
    public static final Item ICE_ETHER_WOOD = register(ModBlocks.ICE_ETHER_WOOD);
    public static final Item STRIPPED_ICE_ETHER_LOG = register(ModBlocks.STRIPPED_ICE_ETHER_LOG);
    public static final Item STRIPPED_ICE_ETHER_WOOD = register(ModBlocks.STRIPPED_ICE_ETHER_WOOD);
    public static final Item ICE_ETHER_LEAVES = register(ModBlocks.ICE_ETHER_LEAVES);
    public static final Item ICE_ETHER_PLANKS = register(ModBlocks.ICE_ETHER_PLANKS);



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
