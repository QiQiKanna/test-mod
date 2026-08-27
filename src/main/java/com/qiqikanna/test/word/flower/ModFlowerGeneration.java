package com.qiqikanna.test.word.flower;

import com.qiqikanna.test.word.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModFlowerGeneration
{
    public static void registerFlowers()
    {
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(BiomeKeys.PLAINS,BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.SIMPLE_FLOWER);
    }
}
