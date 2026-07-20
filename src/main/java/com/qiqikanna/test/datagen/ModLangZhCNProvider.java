package com.qiqikanna.test.datagen;

import com.qiqikanna.test.block.ModBlocks;
import com.qiqikanna.test.item.ModItemGroups;
import com.qiqikanna.test.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModLangZhCNProvider extends FabricLanguageProvider
{
    public ModLangZhCNProvider(FabricDataOutput dataOutput)
    {
        super(dataOutput,"zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder)
    {
        translationBuilder.add(ModItems.ICE_ETHER,"冰以太");
        translationBuilder.add(ModItems.SHIT,"谢特");
        translationBuilder.add(ModItems.SWORD,"随手画的剑");
        translationBuilder.add(ModItems.CORN,"玉米");
        translationBuilder.add(ModItems.BLUEBARRY,"蓝莓");
        translationBuilder.add(ModItems.URANIUM,"铀");

        translationBuilder.add(ModBlocks.BASKETBALL_BLOCK,"篮球");
        translationBuilder.add(ModBlocks.RAINBOW_BLOCK,"彩虹块");
        translationBuilder.add(ModBlocks.ICE_ETHER_BLOCK,"冰以太块");
        translationBuilder.add(ModBlocks.TEST_BLOCK,"测试方块");
        translationBuilder.add(ModBlocks.CHANDELIER,"吊灯");

        translationBuilder.add(ModItemGroups.TESTMOD_GROUP,"测试模组");
        translationBuilder.add(ModItemGroups.TESTMOD_BLOCK,"测试模组方块");
    }
}
