package com.qiqikanna.test.datagen;

import com.qiqikanna.test.block.ModBlockFamilies;
import com.qiqikanna.test.block.ModBlocks;
import com.qiqikanna.test.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.family.BlockFamily;

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

        ModBlockFamilies.getFamilies()
                .filter(BlockFamily::shouldGenerateModels)
                .forEach(family -> blockStateModelGenerator.registerCubeAllModelTexturePool(family.getBaseBlock()).family(family));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        itemModelGenerator.register(ModItems.ICE_ETHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUEBARRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.URANIUM,Models.GENERATED);
    }
}
