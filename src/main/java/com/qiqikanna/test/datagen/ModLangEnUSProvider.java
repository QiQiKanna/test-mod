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
        translationBuilder.add(ModItems.SWORD,"The Sword");

        translationBuilder.add(ModBlocks.BASKETBALL_BLOCK,"Basketball");
        translationBuilder.add(ModBlocks.RAINBOW_BLOCK,"Rainbow Block");
        translationBuilder.add(ModBlocks.ICE_ETHER_BLOCK,"Ice Ether Block");
        translationBuilder.add(ModBlocks.TEST_BLOCK,"Test Block");
        translationBuilder.add(ModBlocks.CHANDELIER,"Chandelier");

        translationBuilder.add(ModItemGroups.TESTMOD_GROUP,"test mod");
        translationBuilder.add(ModItemGroups.TESTMOD_BLOCK,"test mod block");
    }
}
