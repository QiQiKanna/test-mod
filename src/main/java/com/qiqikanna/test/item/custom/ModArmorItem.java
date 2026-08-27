package com.qiqikanna.test.item.custom;

import com.google.common.collect.ImmutableMap;
import com.qiqikanna.test.item.ModArmorMaterials;
import com.qiqikanna.test.util.ArmorSetUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ModArmorItem extends ArmorItem
{
    public static final Map<ArmorMaterial, List<StatusEffectInstance>> MAP = new ImmutableMap.Builder<ArmorMaterial, List<StatusEffectInstance>>()
            .put(ModArmorMaterials.ICE_ETHER,
                    Arrays.asList(
                            new StatusEffectInstance(StatusEffects.SPEED, 40, 1, false, false, false),
                            new StatusEffectInstance(StatusEffects.JUMP_BOOST, 40, 1, false, false, false)
                    )
            ).build();

    public ModArmorItem(ArmorMaterial material, Type type, Settings settings)
    {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected)
    {
        super.inventoryTick(stack, world, entity, slot, selected);
        if (!world.isClient)
        {
            if (entity instanceof PlayerEntity player && ArmorSetUtil.hasFullSetArmor(player))
            {
                evaluateArmorEffects(player);
            }
        }
    }

    public void evaluateArmorEffects(PlayerEntity player)
    {
        for (Map.Entry<ArmorMaterial, List<StatusEffectInstance>> entry : MAP.entrySet())
        {
            ArmorMaterial material = entry.getKey();
            List<StatusEffectInstance> effects = entry.getValue();
            if (ArmorSetUtil.isSameMaterial(material,player))
            {
                for (StatusEffectInstance effect : effects)
                {
                    StatusEffect effects1 = effect.getEffectType();
                    if (!player.hasStatusEffect(effects1))
                    {
                        player.addStatusEffect(effect);
                    }
                }
            }
        }

    }

}