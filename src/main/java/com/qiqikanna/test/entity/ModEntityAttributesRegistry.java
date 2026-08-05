package com.qiqikanna.test.entity;

import com.qiqikanna.test.entity.custom.CubeEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class ModEntityAttributesRegistry
{
    public static void register()
    {
        FabricDefaultAttributeRegistry.register(ModEntityTypes.CUBE_ENTITY, CubeEntity.createMobAttributes());
    }
}
