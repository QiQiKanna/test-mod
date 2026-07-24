package com.qiqikanna.test.entity;

import com.qiqikanna.test.TestMod;
import com.qiqikanna.test.entity.projectile.thrown.TestEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntityType
{
    public static final EntityType<TestEntity> TEST_ENTITY = register("test_entity",
            EntityType.Builder.<TestEntity>create(TestEntity::new, SpawnGroup.MISC).setDimensions(0.25F, 0.25F).maxTrackingRange(4).trackingTickInterval(10)
    );

    private static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> type) {
        return Registry.register(Registries.ENTITY_TYPE, new Identifier(TestMod.MOD_ID,id), type.build(id));
    }

    public static void registerModEntityType(){

    }
}
