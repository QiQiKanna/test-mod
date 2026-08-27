package com.qiqikanna.test.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class ArmorSetUtil
{
    //判断是否装备四个盔甲
    public static boolean hasFullSetArmor(PlayerEntity player)
    {
        ItemStack helmet = player.getInventory().getArmorStack( 3);
        ItemStack chestplate = player.getInventory().getArmorStack(2);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack boots = player.getInventory().getArmorStack(0);
        //四个装备栏是否为空
        boolean fullSet = !helmet.isEmpty() &&
                !chestplate.isEmpty() &&
                !leggings.isEmpty() &&
                !boots.isEmpty();
        if (!fullSet) return false;
        //四个装备栏的装备是否为盔甲
        return helmet.getItem() instanceof ArmorItem &&
                chestplate.getItem() instanceof ArmorItem &&
                leggings.getItem() instanceof ArmorItem &&
                boots.getItem() instanceof ArmorItem;

    }

    public static boolean isSameMaterial(ArmorMaterial material, PlayerEntity player)
    {
        ArmorItem helmet = (ArmorItem) player.getInventory().getArmorStack(3).getItem();
        ArmorItem chestplate = (ArmorItem) player.getInventory().getArmorStack(2).getItem();
        ArmorItem leggings = (ArmorItem) player.getInventory().getArmorStack(1).getItem();
        ArmorItem boots = (ArmorItem) player.getInventory().getArmorStack(0).getItem();
        return helmet.getMaterial() == material
                && chestplate.getMaterial() == material
                && leggings.getMaterial() == material
                && boots.getMaterial() == material;
    }
}
