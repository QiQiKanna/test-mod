package com.qiqikanna.test.datagen;

import com.qiqikanna.test.block.ModBlocks;
import com.qiqikanna.test.item.ModItemGroups;
import com.qiqikanna.test.item.ModItems;
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
        translationBuilder.add(ModItems.MY_SWORD,"My Sword");
        translationBuilder.add(ModItems.CORN,"Corn");
        translationBuilder.add(ModItems.BLUEBARRY,"Bluebarry");
        translationBuilder.add(ModItems.URANIUM,"Uranium");
        translationBuilder.add(ModItems.FIRE_ETHER,"Fire Ether");
        translationBuilder.add(ModItems.FIRE_ETHER_SWORD,"Fire Ether Sword");
        translationBuilder.add(ModItems.FIRE_ETHER_SHOVEL,"Fire Ether Shovel");
        translationBuilder.add(ModItems.FIRE_ETHER_PICKAXE,"Fire Ether Pickaxe");
        translationBuilder.add(ModItems.FIRE_ETHER_AXE,"Fire Ether Axe");
        translationBuilder.add(ModItems.FIRE_ETHER_HOE,"Fire Ether Hoe");

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

        translationBuilder.add(ModItemGroups.TESTMOD_GROUP,"test mod");
        translationBuilder.add(ModItemGroups.TESTMOD_BLOCK,"test mod block");
    }
}
