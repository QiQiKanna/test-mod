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

        //关于盔甲锻造的tag，似乎是让盔甲可以被锻造纹样
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ICE_ETHER_HELMET)
                .add(ModItems.ICE_ETHER_CHESTPLATE)
                .add(ModItems.ICE_ETHER_LEGGINGS)
                .add(ModItems.ICE_ETHER_BOOTS);

        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.MUSIC_DISC_BLIZZARD)
                .add(ModItems.MUSIC_DISC_HEMOPHILIA)
                .add(ModItems.MUSIC_DISC_SEEPING_VOID);

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModItems.ICE_ETHER_PLANKS);
        getOrCreateTagBuilder(ItemTags.LOGS)
                .add(ModItems.ICE_ETHER_LOG)
                .add(ModItems.STRIPPED_ICE_ETHER_LOG)
                .add(ModItems.ICE_ETHER_WOOD)
                .add(ModItems.STRIPPED_ICE_ETHER_WOOD);
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModItems.ICE_ETHER_LOG)
                .add(ModItems.ICE_ETHER_WOOD)
                .add(ModItems.STRIPPED_ICE_ETHER_LOG)
                .add(ModItems.STRIPPED_ICE_ETHER_WOOD);

    }
}
