package com.qiqikanna.test.word;

import com.qiqikanna.test.TestMod;
import com.qiqikanna.test.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures
{
    public static final RegistryKey<PlacedFeature> ICE_ETHER_TREE = of("ice_ether_tree");

    public static final RegistryKey<PlacedFeature> SIMPLE_FLOWER = of("simple_flower");

    public static final RegistryKey<PlacedFeature> ICE_ETHER_ORE = of("ice_ether_ore");
    public static final RegistryKey<PlacedFeature> NETHER_ICE_ETHER_ORE = of("nether_ice_ether_ore");
    public static final RegistryKey<PlacedFeature> END_ICE_ETHER_ORE = of("end_ice_ether_ore");


    public static RegistryKey<PlacedFeature> of(String id)
    {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE,new Identifier(TestMod.MOD_ID,id));
    }

    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable)
    {
        RegistryEntryLookup<ConfiguredFeature<?,?>> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        PlacedFeatures.register(
                featureRegisterable,
                ICE_ETHER_TREE,
                registryEntryLookup.getOrThrow(ModConfiguredFeatures.ICE_ETHER_TREE),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2,0.1F,2),
                        ModBlocks.ICE_ETHER_TREE_SAPLING
                )
        );

        PlacedFeatures.register(
                featureRegisterable,
                SIMPLE_FLOWER,
                registryEntryLookup.getOrThrow(ModConfiguredFeatures.SIMPLE_FLOWER),
                RarityFilterPlacementModifier.of(4),
                SquarePlacementModifier.of(),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of()
        );

        PlacedFeatures.register(
                featureRegisterable,
                ICE_ETHER_ORE,
                registryEntryLookup.getOrThrow(ModConfiguredFeatures.ICE_ETHER_ORE),
                modifiersWithCount(
                        10,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80),YOffset.fixed(80)))
        );
        PlacedFeatures.register(
                featureRegisterable,
                NETHER_ICE_ETHER_ORE,
                registryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHER_ICE_ETHER_ORE),
                modifiersWithCount(12,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80),YOffset.fixed(80)))
        );
        PlacedFeatures.register(
                featureRegisterable,
                END_ICE_ETHER_ORE,
                registryEntryLookup.getOrThrow(ModConfiguredFeatures.END_ICE_ETHER_ORE),
                modifiersWithCount(6,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80),YOffset.fixed(80)))
        );
    }

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
