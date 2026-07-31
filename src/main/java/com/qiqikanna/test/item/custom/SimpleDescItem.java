package com.qiqikanna.test.item.custom;

import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SimpleDescItem extends Item
{
    public SimpleDescItem(Settings settings)
    {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context)
    {
        tooltip.add(Text.translatable(this.getTranslationKey() + ".desc"));
    }

    public static void addTranslations(SimpleDescItem simpleDescItem, String name, String desc, FabricLanguageProvider.TranslationBuilder translationBuilder)
    {
        translationBuilder.add(simpleDescItem,name);
        translationBuilder.add(simpleDescItem.getTranslationKey() + ".desc", desc);
    }
}
