package com.qiqikanna.test.word.tree;

import com.qiqikanna.test.word.ModConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class IceEtherTreeGenerator extends SaplingGenerator
{
    @Override
    protected @Nullable RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees)
    {
        return ModConfiguredFeatures.ICE_ETHER_TREE;
    }
}
