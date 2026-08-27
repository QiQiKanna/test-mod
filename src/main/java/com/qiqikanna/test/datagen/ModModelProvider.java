package com.qiqikanna.test.datagen;

import com.qiqikanna.test.TestMod;
import com.qiqikanna.test.block.ModBlockFamilies;
import com.qiqikanna.test.block.ModBlocks;
import com.qiqikanna.test.block.custom.CornCropBlock;
import com.qiqikanna.test.block.custom.SofaBlock;
import com.qiqikanna.test.block.custom.StrawberryCropBlock;
import com.qiqikanna.test.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

import java.util.Map;
import java.util.Optional;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_ETHER_BLOCK); //这个在方块家族内了，不需要重复写
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAINBOW_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BASKETBALL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_ETHER_LEAVES);

        blockStateModelGenerator.registerAxisRotated(ModBlocks.HEMOSTONE, TexturedModel.CUBE_COLUMN);

        blockStateModelGenerator.registerCrop(ModBlocks.STRAWBERRY_CROP, StrawberryCropBlock.AGE,0,1,2,3,4,5);
        blockStateModelGenerator.blockStateCollector
                .accept(
                        VariantsBlockStateSupplier.create(ModBlocks.CORN_CROP)
                                .coordinate(
                                        BlockStateVariantMap.create(CornCropBlock.AGE)
                                                .register(
                                                        stage -> BlockStateVariant.create()
                                                                .put(VariantSettings.MODEL, blockStateModelGenerator.createSubModel(ModBlocks.CORN_CROP, "_stage" + stage, Models.CROSS, TextureMap::cross))
                                                )
                                )
                );
        blockStateModelGenerator.blockStateCollector
                .accept(
                        VariantsBlockStateSupplier.create(ModBlocks.LUMEN_BERRY_BUSH)
                                .coordinate(
                                        BlockStateVariantMap.create(Properties.AGE_1)
                                                .register(
                                                        stage -> BlockStateVariant.create()
                                                                .put(VariantSettings.MODEL, blockStateModelGenerator.createSubModel(ModBlocks.LUMEN_BERRY_BUSH, "_stage" + stage, Models.CROSS, TextureMap::cross))
                                                )
                                )
                );

        final TextureMap hemostone_side_texture = TextureMap.all(Identifier.of(TestMod.MOD_ID,"block/hemostone_side"));
        final Identifier hemostone_stairsModelId = Models.STAIRS.upload(ModBlocks.HEMOSTONE_STAIRS,hemostone_side_texture,blockStateModelGenerator.modelCollector);
        final Identifier hemostone_innerStairsModelId = Models.INNER_STAIRS.upload(ModBlocks.HEMOSTONE_STAIRS,hemostone_side_texture,blockStateModelGenerator.modelCollector);
        final Identifier hemostone_outerStairsModelId = Models.OUTER_STAIRS.upload(ModBlocks.HEMOSTONE_STAIRS,hemostone_side_texture,blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(
            BlockStateModelGenerator.createStairsBlockState(
                    ModBlocks.HEMOSTONE_STAIRS,
                    hemostone_innerStairsModelId,
                    hemostone_stairsModelId,
                    hemostone_outerStairsModelId
            ));
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.HEMOSTONE_STAIRS,hemostone_stairsModelId);

        blockStateModelGenerator.registerParentedItemModel(ModBlocks.MY_PILLAR,ModelIds.getBlockModelId(ModBlocks.MY_PILLAR));

        blockStateModelGenerator.registerSimpleState(ModBlocks.CHANDELIER);
        blockStateModelGenerator.registerSimpleState(ModBlocks.TEST_BLOCK);
        blockStateModelGenerator.registerSimpleState(ModBlocks.ORANGE_NIGHTSTAND);
        blockStateModelGenerator.registerSimpleState(ModBlocks.SIMPLE_CABINET);

        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_ICE_ETHER_LOG,ModBlocks.ICE_ETHER_HANGING_SIGN,ModBlocks.ICE_ETHER_WALL_HANGING_SIGN);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ORANGE_CLOCK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.MY_BAD);
        registerSofaBlockState(blockStateModelGenerator);
        registerNorthDefaultRotationState(ModBlocks.LAMP_BLOCK, blockStateModelGenerator);



        blockStateModelGenerator.blockStateCollector.accept(
                createFenceBlockState(ModBlocks.MY_FENCE,
                        new Identifier(TestMod.MOD_ID,"block/my_fence_post"),
                        new Identifier(TestMod.MOD_ID,"block/my_fence_side"))
        );

        blockStateModelGenerator.registerLog(ModBlocks.ICE_ETHER_LOG)
                .log(ModBlocks.ICE_ETHER_LOG)
                .wood(ModBlocks.ICE_ETHER_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_ICE_ETHER_LOG)
                .log(ModBlocks.STRIPPED_ICE_ETHER_LOG)
                .wood(ModBlocks.STRIPPED_ICE_ETHER_WOOD);

        blockStateModelGenerator.registerTintableCross(ModBlocks.ICE_ETHER_TREE_SAPLING,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(
                ModBlocks.SIMPLE_FLOWER,
                ModBlocks.POTTED_SIMPLE_FLOWER,
                BlockStateModelGenerator.TintType.NOT_TINTED);

        ModBlockFamilies.getFamilies()
                .filter(BlockFamily::shouldGenerateModels)
                .forEach(family -> blockStateModelGenerator.registerCubeAllModelTexturePool(family.getBaseBlock()).family(family));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        itemModelGenerator.register(ModItems.ICE_ETHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MY_SWORD,Models.HANDHELD);
        itemModelGenerator.register(ModItems.CORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUEBARRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERRY,Models.GENERATED);
        itemModelGenerator.register(ModItems.LUMEN_BERRIES,Models.GENERATED);
        itemModelGenerator.register(ModItems.URANIUM,Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_ETHER,Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_ETHER_SWORD,Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_ETHER_PICKAXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_ETHER_AXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_ETHER_SHOVEL,Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_ETHER_HOE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.PICKAXE_AXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.ICE_ETHER_HORSE_ARMOR,Models.GENERATED);

        itemModelGenerator.register(ModItems.OIL_BUCKET,Models.GENERATED);

        //盔甲的方法不太一样
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ICE_ETHER_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ICE_ETHER_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ICE_ETHER_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ICE_ETHER_BOOTS);

        itemModelGenerator.register(ModItems.MUSIC_DISC_BLIZZARD,Models.TEMPLATE_MUSIC_DISC);
        itemModelGenerator.register(ModItems.MUSIC_DISC_HEMOPHILIA,Models.TEMPLATE_MUSIC_DISC);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SEEPING_VOID,Models.TEMPLATE_MUSIC_DISC);

        itemModelGenerator.register(ModItems.ICE_ETHER_BOAT,Models.GENERATED);
        itemModelGenerator.register(ModItems.ICE_ETHER_CHEST_BOAT,Models.GENERATED);

        registerSpawnEgg(ModItems.CUBE_ENTITY_SPAWN_EGG,itemModelGenerator);
    }

    public void registerSpawnEgg(Item item,ItemModelGenerator itemModelGenerator)
    {
        new Model(Optional.of(new Identifier("minecraft:item/template_spawn_egg")), Optional.empty())
                .upload(ModelIds.getItemModelId(item),
                        TextureMap.layer0(new Identifier("item/spawn_egg")),
                        itemModelGenerator.writer
                );
    }

    public void registerSofaBlockState(BlockStateModelGenerator blockStateModelGenerator)
    {
        Map<SofaBlock.Type,Identifier> types = Map.of(
                SofaBlock.Type.SINGLE,new Identifier(TestMod.MOD_ID,"block/sofa"),
                SofaBlock.Type.LEFT,new Identifier(TestMod.MOD_ID,"block/sofa_left"),
                SofaBlock.Type.RIGHT,new Identifier(TestMod.MOD_ID,"block/sofa_right"),
                SofaBlock.Type.MIDDLE,new Identifier(TestMod.MOD_ID,"block/sofa_middle")
        );
        Map<Direction,VariantSettings.Rotation> rotations = Map.of(
                Direction.NORTH, VariantSettings.Rotation.R0,
                Direction.EAST, VariantSettings.Rotation.R90,
                Direction.SOUTH, VariantSettings.Rotation.R180,
                Direction.WEST, VariantSettings.Rotation.R270
        );

        blockStateModelGenerator.blockStateCollector.accept(
                VariantsBlockStateSupplier.create(ModBlocks.SOFA).coordinate(
                        BlockStateVariantMap.create(SofaBlock.FACING, SofaBlock.TYPE).register(
                                (direction, type) -> BlockStateVariant.create()
                                        .put(VariantSettings.MODEL, types.get(type))
                                        .put(VariantSettings.Y, rotations.get(direction))
                                )
                )
        );
    }

    public void registerNorthDefaultRotationState(Block block, BlockStateModelGenerator blockStateModelGenerator)
    {
        Identifier modelPath = Registries.BLOCK.getId(block).withPrefixedPath("block/");

        Map<Direction, VariantSettings.Rotation> horizontalRotations = Map.of(
                Direction.NORTH, VariantSettings.Rotation.R0,
                Direction.EAST, VariantSettings.Rotation.R90,
                Direction.SOUTH, VariantSettings.Rotation.R180,
                Direction.WEST, VariantSettings.Rotation.R270
        );

        blockStateModelGenerator.blockStateCollector.accept(
                VariantsBlockStateSupplier.create(block).coordinate(
                        BlockStateVariantMap.create(Properties.FACING)
                                .register(dir ->
                                {
                                    BlockStateVariant variant = BlockStateVariant.create()
                                            .put(VariantSettings.MODEL, modelPath);
                                    if (dir.getAxis().isHorizontal())
                                    {
                                        variant.put(VariantSettings.Y, horizontalRotations.get(dir));
                                    }
                                    else if (dir == Direction.UP)
                                    {
                                        variant.put(VariantSettings.X, VariantSettings.Rotation.R270);
                                    }
                                    else
                                    {
                                        variant.put(VariantSettings.X, VariantSettings.Rotation.R90);
                                    }
                                    return variant;
                                })
                )
        );
    }

    public BlockStateSupplier createFenceBlockState(Block fenceBlock, Identifier postModelId, Identifier sideModelId) {
        return MultipartBlockStateSupplier.create(fenceBlock)
                .with(BlockStateVariant.create().put(VariantSettings.MODEL, postModelId))
                .with(When.create().set(Properties.NORTH, true), BlockStateVariant.create().put(VariantSettings.MODEL, sideModelId))
                .with(
                        When.create().set(Properties.EAST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, sideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(
                        When.create().set(Properties.SOUTH, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, sideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R180)
                )
                .with(
                        When.create().set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, sideModelId).put(VariantSettings.Y, VariantSettings.Rotation.R270)
                );
    }
}
