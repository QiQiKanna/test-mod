package com.qiqikanna.test.entity;

import com.qiqikanna.test.TestMod;
import com.qiqikanna.test.entity.custom.CubeEntity;
import com.qiqikanna.test.entity.custom.projectile.thrown.TestEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntityTypes
{
    public static final EntityType<TestEntity> TEST_ENTITY = register("test_entity",
            EntityType.Builder.<TestEntity>create(TestEntity::new, SpawnGroup.MISC)
                    .setDimensions(0.25F, 0.25F)
                    .maxTrackingRange(4)
                    .trackingTickInterval(10)
    );
    public static final EntityType<CubeEntity> CUBE_ENTITY = register("cube_entity",
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE,CubeEntity::new)
                    .dimensions(EntityDimensions.fixed(0.75F,0.75F))
                    .build());

    private static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> type) {
        return Registry.register(Registries.ENTITY_TYPE, new Identifier(TestMod.MOD_ID,id), type.build(id));
    }

    //fabric提供的这个builder是拓展版本
    private static <T extends Entity> EntityType<T> register(String id,EntityType<T> entityType)
    {
        return Registry.register(Registries.ENTITY_TYPE, new Identifier(TestMod.MOD_ID,id), entityType);
    }

    public static void registerEntityType(){

    }
}
