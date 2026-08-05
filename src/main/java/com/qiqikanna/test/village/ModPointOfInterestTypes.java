package com.qiqikanna.test.village;

import com.qiqikanna.test.TestMod;
import com.qiqikanna.test.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.poi.PointOfInterestType;

public class ModPointOfInterestTypes
{
    public static final RegistryKey<PointOfInterestType> ICE_ETHER_KEY = of("ice_ether_poi");
    public static final PointOfInterestType ICE_ETHER_POI = register("ice_ether_poi", ModBlocks.ICE_ETHER_BLOCK);

    public static RegistryKey<PointOfInterestType> of(String id) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(TestMod.MOD_ID,id));
    }

    public static PointOfInterestType register(String name, Block block)
    {
        return PointOfInterestHelper.register(new Identifier(TestMod.MOD_ID,name),1,1,block);
    }
}
