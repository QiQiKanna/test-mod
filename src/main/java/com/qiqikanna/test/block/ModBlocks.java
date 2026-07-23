package com.qiqikanna.test.block;

import com.qiqikanna.test.TestMod;
import net.minecraft.block.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks
{
    public static final Block BASKETBALL_BLOCK = register("basketball_block",new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block ICE_ETHER_BLOCK = register("ice_ether_block",new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block RAINBOW_BLOCK = register(
            "rainbow_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.1f,1.0f)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .requiresTool()
            )
    );
    public static final Block TEST_BLOCK = register(
            "test_block",
            new TestBlock(AbstractBlock.Settings.create()
                    .nonOpaque()
                    .luminance(state -> 15)
                    .solidBlock(Blocks::never)  //原来这个才是控制是否传递红石信号的
            )
    );
    public static final Block CHANDELIER = register("chandelier",
            new GlassBlock(AbstractBlock.Settings.create()  //不知道为啥只有用特殊的子类才能让他透光
                    .nonOpaque()
                    .luminance(state ->15)
            )
    );

    public static final Block ICE_ETHER_STAIRS = register("ice_ether_stairs",
            new StairsBlock(ICE_ETHER_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(ICE_ETHER_BLOCK)));
    public static final Block ICE_ETHER_SLAB = register("ice_ether_slab",new SlabBlock(AbstractBlock.Settings.copy(ICE_ETHER_BLOCK)));
    public static final Block ICE_ETHER_BUTTON = register("ice_ether_button",
            new ButtonBlock(AbstractBlock.Settings.copy(ICE_ETHER_BLOCK),BlockSetType.STONE,60,false));
    public static final Block ICE_ETHER_PRESSURE_PLATE = register("ice_ether_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,AbstractBlock.Settings.copy(ICE_ETHER_BLOCK),BlockSetType.STONE));
    public static final Block ICE_ETHER_FENCE = register("ice_ether_fence",new FenceBlock(AbstractBlock.Settings.copy(ICE_ETHER_BLOCK)));
    public static final Block ICE_ETHER_FENCE_GATE = register("ice_ether_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(ICE_ETHER_BLOCK),WoodType.OAK));
    public static final Block ICE_ETHER_WALLL = register("ice_ether_wall",new WallBlock(AbstractBlock.Settings.copy(ICE_ETHER_BLOCK)));
    public static final Block ICE_ETHER_DOOR = register("ice_ether_door",
            new DoorBlock(AbstractBlock.Settings.copy(ICE_ETHER_BLOCK),BlockSetType.IRON));//门的类型当且仅当是铁的时候只能用红石打开
    public static final Block ICE_ETHER_TRAPDOOR = register("ice_ether_trapdoor",
            new TrapdoorBlock(AbstractBlock.Settings.copy(ICE_ETHER_BLOCK).nonOpaque(),BlockSetType.STONE));

    //block 的注册方法
    public static Block register(String id, Block block)
    {
        //这里用的北山推荐的 已整合的方块注册//这方法似乎不太适合搞花活，换回原版方法了
        //注册方块物品
        //Registry.register(Registries.ITEM,new Identifier(TestMod.MOD_ID,id),new BlockItem(block,new Item.Settings()));
        //注册方块
        return Registry.register(Registries.BLOCK, new Identifier(TestMod.MOD_ID,id), block);
    }

    //俺寻思一个方法，说不定可以让这个方块有特殊item//似乎不太行，打开背包直接崩溃了
//    public static Block register(String id, Block block,Item item)
//    {
//        Registry.register(Registries.ITEM,new Identifier(TestMod.MOD_ID,id),item);
//        return Registry.register(Registries.BLOCK,new Identifier(TestMod.MOD_ID,id),block);
//    }

    public static void registerModBlocks()
    {

    }
}
