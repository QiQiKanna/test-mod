package com.qiqikanna.test.datagen;

import com.qiqikanna.test.block.ModBlocks;
import com.qiqikanna.test.entity.ModEntityTypes;
import com.qiqikanna.test.item.ModItemGroups;
import com.qiqikanna.test.item.ModItems;
import com.qiqikanna.test.item.custom.SimpleDescItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModLangEnUSProvider extends FabricLanguageProvider
{
    public ModLangEnUSProvider(FabricDataOutput dataOutput)
    {
        super(dataOutput,"en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder)
    {
        translationBuilder.add(ModItems.ICE_ETHER,"Ice Ether");
        translationBuilder.add(ModItems.SHIT,"Shit");
        translationBuilder.add(ModItems.CORN,"Corn");
        translationBuilder.add(ModItems.BLUEBARRY,"Bluebarry");
        translationBuilder.add(ModItems.STRAWBERRY,"Strawberry");
        translationBuilder.add(ModItems.STRAWBERRY_SEEDS,"Strawberry Seeds");
        translationBuilder.add(ModItems.LUMEN_BERRIES,"Lumen Berries");
        translationBuilder.add(ModItems.FIRE_ETHER,"Fire Ether");
        translationBuilder.add(ModItems.ICE_ETHER_HORSE_ARMOR,"Ice Ether Hourse Armor");

        translationBuilder.add(ModItems.BIG_HAMMER,"Big Hammer");
        translationBuilder.add(ModItems.MY_SWORD,"My Sword");
        translationBuilder.add(ModItems.FIRE_ETHER_SWORD,"Fire Ether Sword");
        translationBuilder.add(ModItems.FIRE_ETHER_SHOVEL,"Fire Ether Shovel");
        translationBuilder.add(ModItems.FIRE_ETHER_PICKAXE,"Fire Ether Pickaxe");
        translationBuilder.add(ModItems.FIRE_ETHER_AXE,"Fire Ether Axe");
        translationBuilder.add(ModItems.FIRE_ETHER_HOE,"Fire Ether Hoe");
        translationBuilder.add(ModItems.PICKAXE_AXE,"Pickaxe Axe");

        translationBuilder.add(ModItems.ICE_ETHER_HELMET,"Ice Ether Helmet");
        translationBuilder.add(ModItems.ICE_ETHER_BOOTS,"Ice Ether Boots");
        translationBuilder.add(ModItems.ICE_ETHER_CHESTPLATE,"Ice Ether Chestplate");
        translationBuilder.add(ModItems.ICE_ETHER_LEGGINGS,"Ice Ether Leggings");

        SimpleDescItem.addTranslations((SimpleDescItem) ModItems.URANIUM,
                "Uranium",
                "It can be used as fuel and seems to burn for quite a long time",
                translationBuilder);

        translationBuilder.add(ModItems.MUSIC_DISC_BLIZZARD,"Music Disc");
        translationBuilder.add(ModItems.MUSIC_DISC_BLIZZARD.getTranslationKey() + ".desc","Blizzard - Rupter");
        translationBuilder.add(ModItems.MUSIC_DISC_HEMOPHILIA,"Music Disc");
        translationBuilder.add(ModItems.MUSIC_DISC_HEMOPHILIA.getTranslationKey() + ".desc","Hemophilia - Rupter");
        translationBuilder.add(ModItems.MUSIC_DISC_SEEPING_VOID,"Music Disc");
        translationBuilder.add(ModItems.MUSIC_DISC_SEEPING_VOID.getTranslationKey() + ".desc","Seeping Void - Rupter");

        translationBuilder.add(ModBlocks.BASKETBALL_BLOCK,"Basketball");
        translationBuilder.add(ModBlocks.RAINBOW_BLOCK,"Rainbow Block");
        translationBuilder.add(ModBlocks.ICE_ETHER_BLOCK,"Ice Ether Block");
        translationBuilder.add(ModBlocks.TEST_BLOCK,"Test Block");
        translationBuilder.add(ModBlocks.CHANDELIER,"Chandelier");
        translationBuilder.add(ModBlocks.ICE_ETHER_STAIRS,"Ice Ether Stairs");
        translationBuilder.add(ModBlocks.ICE_ETHER_SLAB,"Ice Ether Slab");
        translationBuilder.add(ModBlocks.ICE_ETHER_BUTTON,"Ice Ether Button");
        translationBuilder.add(ModBlocks.ICE_ETHER_PRESSURE_PLATE,"Ice Ether Pressure Plate");
        translationBuilder.add(ModBlocks.ICE_ETHER_FENCE,"Ice Ether Fence");
        translationBuilder.add(ModBlocks.ICE_ETHER_FENCE_GATE,"Ice Ether Fence Gate");
        translationBuilder.add(ModBlocks.ICE_ETHER_WALLL,"Ice Ether Wall");
        translationBuilder.add(ModBlocks.ICE_ETHER_DOOR,"Ice Ether Door");
        translationBuilder.add(ModBlocks.ICE_ETHER_TRAPDOOR,"Ice Ether Trapdoor");
        translationBuilder.add(ModBlocks.HEMOSTONE,"Hemostone");
        translationBuilder.add(ModBlocks.HEMOSTONE_STAIRS,"Hemostone Stairs");

        translationBuilder.add(ModBlocks.LUMEN_BERRY_BUSH,"Lumen Berry Bush");

        translationBuilder.add(ModItems.CUBE_ENTITY_SPAWN_EGG,"Cube Entity Spawn Egg");

        translationBuilder.add(ModItemGroups.TESTMOD_GROUP,"test mod");
        translationBuilder.add(ModItemGroups.TESTMOD_BLOCK,"test mod block");

        translationBuilder.add(ModEntityTypes.CUBE_ENTITY,"Cube Entity");

        translationBuilder.add("entity.minecraft.villager.ice_ether_master","Ice Ether Master");

        translationBuilder.add("tooltip.test-mod.pickaxe_axe.shift","It can serve both as an axe and as a pickaxe");
        translationBuilder.add("tooltip.test-mod.press_shift","Hold §6Shift§r for more info");
    }
}
