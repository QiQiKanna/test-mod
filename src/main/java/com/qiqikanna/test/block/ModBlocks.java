package com.qiqikanna.test.block;

import com.qiqikanna.test.TestMod;
import com.qiqikanna.test.block.custom.*;
import com.qiqikanna.test.block.entity.ModBlockEntityTypes;
import com.qiqikanna.test.fluid.ModFluids;
import com.qiqikanna.test.sound.ModBlockSoundGroup;
import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class ModBlocks
{
    public static final Block BASKETBALL_BLOCK = register("basketball_block",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block ICE_ETHER_BLOCK = register("ice_ether_block",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE)
                    .nonOpaque()
                    .sounds(ModBlockSoundGroup.ICE_ETHER)
                    ));
    public static final Block RAINBOW_BLOCK = register(
            "rainbow_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.1F,1.0F)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .requiresTool()
            ));
    public static final Block TEST_BLOCK = register(
            "test_block",
            new TestBlock(AbstractBlock.Settings.create()
                    .nonOpaque()
                    .luminance(state -> 15)
                    .solidBlock(Blocks::never)  //原来这个才是控制是否传递红石信号的
            ));
    public static final Block CHANDELIER = register("chandelier",
            new GlassBlock(AbstractBlock.Settings.create()  //不知道为啥只有用特殊的子类才能让他透光//用不完整的outlineshape也行
                    .nonOpaque()
                    .luminance(state ->15)));
    public static final Block ORANGE_CLOCK = register("orange_clock",new OrangeClock(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block SOFA = register("sofa",new SofaBlock(AbstractBlock.Settings.create().nonOpaque()));
    public static final Block LAMP_BLOCK = register("lamp_block",new LampBlock(AbstractBlock.Settings.create().nonOpaque()));
    // ⚠️ 警示：不要对普通Block使用 .copy(Blocks.OAK_LOG) 等带有方向属性的方块（PillarBlock/StairsBlock/SlabBlock等）
    //    它们内部有 axis/facing/half 等属性，Java 21+ 类加载时序不同，可能导致 "Cannot get property ... as it does not exist in Block{minecraft:air}" 崩溃
    //    ✅ 正确做法：用 .create() 手动设置属性，或 .copy() 纯色方块（如 OAK_PLANKS、STONE、DIRT、IRON_BLOCK 等普通方块）
    public static final Block ORANGE_NIGHTSTAND = register("orange_nightstand",
            new Block(AbstractBlock.Settings.create().nonOpaque()));
    public static final Block MY_BAD = register("my_bed",
            new ModBedBlock(DyeColor.BLACK,AbstractBlock.Settings.create().nonOpaque()));
    public static final Block MY_PILLAR = register("my_pillar",new ModPillarBlock(AbstractBlock.Settings.create().nonOpaque()));
    public static final Block MY_FENCE = register("my_fence",new ModFenceBlock(AbstractBlock.Settings.create().nonOpaque()));
    public static final Block SIMPLE_CABINET = register("simple_cabinet",
            new SimpleCabinetBlock(AbstractBlock.Settings.create().nonOpaque(),() -> ModBlockEntityTypes.SIMPLE_CABINET));

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
    public static final Block HEMOSTONE = register("hemostone",new PillarBlock(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block HEMOSTONE_STAIRS = register("hemostone_stairs",
            new StairsBlock(HEMOSTONE.getDefaultState(),AbstractBlock.Settings.copy(HEMOSTONE)));
    public static final Block ICE_ETHER_LOG = register("ice_ether_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block ICE_ETHER_WOOD = register("ice_ether_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_ICE_ETHER_LOG = register("stripped_ice_ether_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_ICE_ETHER_WOOD = register("stripped_ice_ether_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block ICE_ETHER_LEAVES = register("ice_ether_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block ICE_ETHER_PLANKS = register("ice_ether_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    public static final Block STRAWBERRY_CROP = register("strawberry_crop",
            new StrawberryCropBlock(AbstractBlock.Settings.create()
                    .noCollision()//没有碰撞
                    .ticksRandomly()
                    .breakInstantly()//立即破坏
                    .pistonBehavior(PistonBehavior.DESTROY)//活塞推动行为-破坏
            ));
    public static final Block CORN_CROP = register("corn_crop",
            new CornCropBlock(AbstractBlock.Settings.create()
                    .noCollision()
                    .ticksRandomly()
                    .breakInstantly()
                    .pistonBehavior(PistonBehavior.DESTROY)
            ));
    public static final Block LUMEN_BERRY_BUSH = register("lumen_berry_bush",
            new LumenBerryBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)));

    public static final Block OIL = register("oil",new FluidBlock(ModFluids.OIL,AbstractBlock.Settings.copy(Blocks.WATER)));

    private static final Identifier ICE_ETHER_SIGN_TEXTURE = new Identifier(TestMod.MOD_ID,"entity/signs/ice_ether");
    private static final Identifier ICE_ETHER_HANGING_SIGN_TEXTURE = new Identifier(TestMod.MOD_ID,"entity/signs/hanging/ice_ether");
    private static final Identifier ICE_ETHER_HANGING_SIGN_GUI = new Identifier(TestMod.MOD_ID,"textures/gui/hanging_signs/ice_ether");
    public static final Block ICE_ETHER_SIGN = register("ice_ether_sign",
            new TerraformSignBlock(
                    ICE_ETHER_SIGN_TEXTURE,
                    AbstractBlock.Settings.copy(Blocks.OAK_SIGN)));
    public static final Block ICE_ETHER_WALL_SIGN = register("ice_ether_wall_sign",
            new TerraformWallSignBlock(
                    ICE_ETHER_SIGN_TEXTURE,
                    AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN)));
    public static final Block ICE_ETHERE_HANGING_SIGN = register("ice_ether_hanging_sign",
            new TerraformHangingSignBlock(
                    ICE_ETHER_HANGING_SIGN_TEXTURE,
                    ICE_ETHER_HANGING_SIGN_GUI,
                    AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)));
    public static final Block ICE_ETHER_WALL_HANGING_SIGN = register("ice_ether_wall_hanging_sign",
            new TerraformWallHangingSignBlock(
                    ICE_ETHER_HANGING_SIGN_TEXTURE,
                    ICE_ETHER_HANGING_SIGN_GUI,
                    AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)));

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

    public static void registerBlocks()
    {

    }
}
