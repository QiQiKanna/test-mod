package com.qiqikanna.test.datagen;

import com.qiqikanna.test.item.ModItems;
import com.qiqikanna.test.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider
{
    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture)
    {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup)
    {
        getOrCreateTagBuilder(ModItemTags.SHITS)
                .add(ModItems.SHIT)
                .add(ModItems.BLUEBARRY)
                .add(ModItems.CORN)
                .forceAddTag(ItemTags.FOX_FOOD);//用forceAddTag把原版Tag中的项添加过来
    }
}
