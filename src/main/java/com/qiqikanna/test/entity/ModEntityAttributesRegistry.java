package com.qiqikanna.test.entity;

import com.qiqikanna.test.entity.custom.CubeEntity;
import com.qiqikanna.test.entity.custom.DistortedScoutEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class ModEntityAttributesRegistry
{
    public static void register()
    {
        FabricDefaultAttributeRegistry.register(ModEntityTypes.CUBE_ENTITY, CubeEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(ModEntityTypes.DISTORTED_SCOUT, DistortedScoutEntity.createMobAttributes());
    }
}
