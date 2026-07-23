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
        translationBuilder.add(ModBlocks.ICE_ETHER_STAIRS,"冰以太楼梯");
        translationBuilder.add(ModBlocks.ICE_ETHER_SLAB,"冰以太台阶");
        translationBuilder.add(ModBlocks.ICE_ETHER_BUTTON,"冰以太按钮");
        translationBuilder.add(ModBlocks.ICE_ETHER_PRESSURE_PLATE,"冰以太压力板");
        translationBuilder.add(ModBlocks.ICE_ETHER_FENCE,"冰以太栅栏");
        translationBuilder.add(ModBlocks.ICE_ETHER_FENCE_GATE,"冰以太栅栏门");
        translationBuilder.add(ModBlocks.ICE_ETHER_WALLL,"冰以太墙");
        translationBuilder.add(ModBlocks.ICE_ETHER_DOOR,"冰以太门");
        translationBuilder.add(ModBlocks.ICE_ETHER_TRAPDOOR,"冰以太活板门");

        translationBuilder.add(ModItemGroups.TESTMOD_GROUP,"测试模组");
        translationBuilder.add(ModItemGroups.TESTMOD_BLOCK,"测试模组方块");
    }
}
