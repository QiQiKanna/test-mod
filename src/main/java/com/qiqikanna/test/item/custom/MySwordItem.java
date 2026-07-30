package com.qiqikanna.test.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.world.World;

public class MySwordItem extends SwordItem
{
    public MySwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings)
    {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected)
    {
        super.inventoryTick(stack, world, entity, slot, selected);
        if(!world.isClient && entity instanceof PlayerEntity player)
        {
            if(selected)
            {
                player.addStatusEffect(new StatusEffectInstance(
                        StatusEffects.MINING_FATIGUE,40,5,false,false,true));
            }
        }
    }

    @Override
    public boolean isEnchantable(ItemStack stack)
    {
        return false;
    }
}
