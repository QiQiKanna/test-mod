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
import net.minecraft.item.ArmorItem;

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
        itemModelGenerator.register(ModItems.MY_SWORD,Models.HANDHELD);
        itemModelGenerator.register(ModItems.CORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUEBARRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.URANIUM,Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_ETHER,Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_ETHER_SWORD,Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_ETHER_PICKAXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_ETHER_AXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_ETHER_SHOVEL,Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_ETHER_HOE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.PICKAXE_AXE,Models.HANDHELD);
        //盔甲的方法不太一样
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ICE_ETHER_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ICE_ETHER_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ICE_ETHER_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ICE_ETHER_BOOTS);

    }
}
