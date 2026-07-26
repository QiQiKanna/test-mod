package com.qiqikanna.test.datagen;

import com.qiqikanna.test.block.ModBlocks;
import com.qiqikanna.test.tag.ModBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider
{
    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup)
    {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ICE_ETHER_BLOCK)
                .add(ModBlocks.BASKETBALL_BLOCK)
                .add(ModBlocks.TEST_BLOCK)
                .add(ModBlocks.CHANDELIER)
                .add(ModBlocks.RAINBOW_BLOCK);//byd这个玩意一定得写，下面的needs iron tool不能代替这个

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RAINBOW_BLOCK);

        getOrCreateTagBuilder(ModBlockTags.ICE_ETHERS).add(ModBlocks.ICE_ETHER_BLOCK);

        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.ICE_ETHER_FENCE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.ICE_ETHER_WALLL);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.ICE_ETHER_FENCE_GATE);

        getOrCreateTagBuilder(ModBlockTags.PICKAXE_AXE)
                .forceAddTag(BlockTags.PICKAXE_MINEABLE)
                .forceAddTag(BlockTags.AXE_MINEABLE);
    }
}
