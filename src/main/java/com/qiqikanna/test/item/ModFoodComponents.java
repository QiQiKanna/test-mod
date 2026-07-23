package com.qiqikanna.test.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents
{
    public static final FoodComponent CORN = new FoodComponent.Builder().hunger(3).saturationModifier(0.8f).build();
    public static final FoodComponent BLUEBERRY = new FoodComponent.Builder()
            .hunger(1).saturationModifier(0.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,30*20),0.5f)
            .alwaysEdible()
            .build();
    public static final FoodComponent SHIT = new FoodComponent.Builder()
            .hunger(1).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,30*20),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,20*20,5),0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,15*20,2),0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON,5*20),0.75f)
            .meat()
            .build();
}
