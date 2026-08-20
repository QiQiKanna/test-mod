package com.qiqikanna.test.datagen;

import com.qiqikanna.test.block.ModBlocks;
import com.qiqikanna.test.entity.ModEntityTypes;
import com.qiqikanna.test.item.ModItemGroups;
import com.qiqikanna.test.item.ModItems;
import com.qiqikanna.test.item.custom.SimpleDescItem;
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

        translationBuilder.add(ModItems.CORN,"玉米");
        translationBuilder.add(ModItems.BLUEBARRY,"蓝莓");
        translationBuilder.add(ModItems.STRAWBERRY,"草莓");
        translationBuilder.add(ModItems.STRAWBERRY_SEEDS,"草莓种子");
        translationBuilder.add(ModItems.LUMEN_BERRIES,"流明浆果");
        translationBuilder.add(ModItems.FIRE_ETHER,"火以太");

        translationBuilder.add(ModItems.BIG_HAMMER,"雷霆宇宙大战锤");
        translationBuilder.add(ModItems.MY_SWORD,"随手画的剑");
        translationBuilder.add(ModItems.BASEBALL_BAT,"Baseball Bat");
        translationBuilder.add(ModItems.FIRE_ETHER_SWORD,"火以太剑");
        translationBuilder.add(ModItems.FIRE_ETHER_SHOVEL,"火以太锹");
        translationBuilder.add(ModItems.FIRE_ETHER_PICKAXE,"火以太镐");
        translationBuilder.add(ModItems.FIRE_ETHER_AXE,"火以太斧");
        translationBuilder.add(ModItems.FIRE_ETHER_HOE,"火以太锄");
        translationBuilder.add(ModItems.PICKAXE_AXE,"镐斧");
        translationBuilder.add(ModItems.ICE_ETHER_HORSE_ARMOR,"冰以太马凯");

        translationBuilder.add(ModItems.ICE_ETHER_HELMET,"冰以太头盔");
        translationBuilder.add(ModItems.ICE_ETHER_BOOTS,"冰以太靴");
        translationBuilder.add(ModItems.ICE_ETHER_CHESTPLATE,"冰以太胸甲");
        translationBuilder.add(ModItems.ICE_ETHER_LEGGINGS,"冰以太护腿");

        translationBuilder.add(ModItems.MUSIC_DISC_BLIZZARD,"音乐唱片");
        translationBuilder.add(ModItems.MUSIC_DISC_BLIZZARD.getTranslationKey() + ".desc","Blizzard - Rupter");
        translationBuilder.add(ModItems.MUSIC_DISC_HEMOPHILIA,"音乐唱片");
        translationBuilder.add(ModItems.MUSIC_DISC_HEMOPHILIA.getTranslationKey() + ".desc","Hemophilia - Rupter");
        translationBuilder.add(ModItems.MUSIC_DISC_SEEPING_VOID,"音乐唱片");
        translationBuilder.add(ModItems.MUSIC_DISC_SEEPING_VOID.getTranslationKey() + ".desc","Seeping Void - Rupter");

        translationBuilder.add(ModBlocks.ICE_ETHER_LOG,"冰以太原木");
        translationBuilder.add(ModBlocks.ICE_ETHER_WOOD,"冰以太木");
        translationBuilder.add(ModBlocks.STRIPPED_ICE_ETHER_LOG,"去皮冰以太原木");
        translationBuilder.add(ModBlocks.STRIPPED_ICE_ETHER_WOOD,"去皮冰以太木");
        translationBuilder.add(ModBlocks.ICE_ETHER_LEAVES,"冰以太树叶");
        translationBuilder.add(ModBlocks.ICE_ETHER_PLANKS,"冰以太木板");
        translationBuilder.add(ModBlocks.BASKETBALL_BLOCK,"篮球");
        translationBuilder.add(ModBlocks.RAINBOW_BLOCK,"彩虹块");
        translationBuilder.add(ModBlocks.ICE_ETHER_BLOCK,"冰以太块");
        translationBuilder.add(ModBlocks.TEST_BLOCK,"测试方块");
        translationBuilder.add(ModBlocks.CHANDELIER,"吊灯");
        translationBuilder.add(ModBlocks.ORANGE_NIGHTSTAND,"Orange Nightstand");
        translationBuilder.add(ModBlocks.ORANGE_CLOCK ,"Orange Clock");
        translationBuilder.add(ModBlocks.SOFA,"沙发");
        translationBuilder.add(ModBlocks.LAMP_BLOCK,"粥灯");
        translationBuilder.add(ModBlocks.MY_BAD,"My Bed");
        translationBuilder.add(ModBlocks.MY_PILLAR,"My Pillar");
        translationBuilder.add(ModBlocks.MY_FENCE,"My Fence");
        translationBuilder.add(ModBlocks.SIMPLE_CABINET,"Simple Cabinet");
        translationBuilder.add(ModBlocks.ICE_ETHER_STAIRS,"冰以太楼梯");
        translationBuilder.add(ModBlocks.ICE_ETHER_SLAB,"冰以太台阶");
        translationBuilder.add(ModBlocks.ICE_ETHER_BUTTON,"冰以太按钮");
        translationBuilder.add(ModBlocks.ICE_ETHER_PRESSURE_PLATE,"冰以太压力板");
        translationBuilder.add(ModBlocks.ICE_ETHER_FENCE,"冰以太栅栏");
        translationBuilder.add(ModBlocks.ICE_ETHER_FENCE_GATE,"冰以太栅栏门");
        translationBuilder.add(ModBlocks.ICE_ETHER_WALLL,"冰以太墙");
        translationBuilder.add(ModBlocks.ICE_ETHER_DOOR,"冰以太门");
        translationBuilder.add(ModBlocks.ICE_ETHER_TRAPDOOR,"冰以太活板门");


        SimpleDescItem.addTranslations((SimpleDescItem) ModItems.URANIUM,
                "铀",
                "可以作为燃料，似乎能烧挺久",
                translationBuilder
        );

        translationBuilder.add(ModBlocks.LUMEN_BERRY_BUSH,"流明浆果丛");

        translationBuilder.add(ModBlocks.ICE_ETHER_SIGN,"Ice Ether Sign");
        translationBuilder.add(ModBlocks.ICE_ETHERE_HANGING_SIGN,"Ice Ether Hanging Sign");
        translationBuilder.add(ModItems.ICE_ETHER_BOAT,"Ice Ether Boat");
        translationBuilder.add(ModItems.ICE_ETHER_CHEST_BOAT,"Ice Ether Chest Boat");

        translationBuilder.add(ModItems.OIL_BUCKET,"Oil Bucket");
        translationBuilder.add(ModBlocks.OIL,"Oil");

        translationBuilder.add(ModItemGroups.TESTMOD_GROUP,"测试模组");
        translationBuilder.add(ModItemGroups.TESTMOD_BLOCK,"测试模组方块");

        translationBuilder.add(ModEntityTypes.CUBE_ENTITY,"Cube Entity");

        //声音事件subtitle
        translationBuilder.add("sounds.test-mod.block_ice_ether_fall","Fall on the Ice Ether Block");

        translationBuilder.add("entity.minecraft.villager.ice_ether_master","Ice Ether Master");

        translationBuilder.add("container.test-mod.simple_cabinet","Simple Cabinet");

        translationBuilder.add("tooltip.test-mod.pickaxe_axe.shift","它既可以作为斧头又可以作为镐子");
        translationBuilder.add("tooltip.test-mod.press_shift","按下§6Shift§r显示详细信息");

        translationBuilder.add("modmenu.nameTranslation.test-mod","厕试模组");
        translationBuilder.add("modmenu.descriptionTranslation.test-mod","这是一个测试模组，内容是我学习制作模组产生的一堆屎山");
    }
}
