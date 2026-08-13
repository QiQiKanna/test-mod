package com.qiqikanna.test.entity;

import com.qiqikanna.test.TestMod;
import com.qiqikanna.test.entity.custom.*;
import com.qiqikanna.test.entity.custom.projectile.thrown.TestBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntityTypes
{
    public static final EntityType<TestBlockEntity> TEST_BLOCK_ENTITY = register("test_entity",
            FabricEntityTypeBuilder.<TestBlockEntity>create(SpawnGroup.MISC, TestBlockEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25F, 0.25F))
                    .trackRangeChunks(4)
                    .trackedUpdateRate(10)
                    .build()
    );
    public static final EntityType<CubeEntity> CUBE_ENTITY = register("cube_entity",
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE,CubeEntity::new)
                    .dimensions(EntityDimensions.fixed(0.75F,0.75F))
                    .build(),
            CubeEntity.createMobAttributes());
    public static final EntityType<DistortedScoutEntity> DISTORTED_SCOUT = register("distorted_scout",
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE,DistortedScoutEntity::new)
                    .dimensions(EntityDimensions.fixed(1.0F,1.0F))
                    .build(),
            DistortedScoutEntity.createMobAttributes());
    public static final EntityType<DarakuCleanEntity> DARAKU_CLEAN = register("daraku_clean",
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE,DarakuCleanEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6F,1.7F))
                    .build(),
            DarakuCleanEntity.createMobAttributes());
    public static final EntityType<AvnFoxEntity> AVN_FOX = register("avn_fox",
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE,AvnFoxEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6F,1.8F))
                    .build(),
                    AvnFoxEntity.createMobAttributes());
    public static final EntityType<SeatEntity> SEATS = register("seats",
            FabricEntityTypeBuilder.create(SpawnGroup.MISC,SeatEntity::new).build());


    // ① 非 LivingEntity
    private static <T extends Entity> EntityType<T> register(String id, EntityType<T> entityType) {
        return Registry.register(Registries.ENTITY_TYPE, new Identifier(TestMod.MOD_ID, id), entityType);
    }

    // ② LivingEntity + 属性一起注册
    private static <T extends LivingEntity> EntityType<T> register(String id, EntityType<T> entityType, DefaultAttributeContainer.Builder builder) {
        EntityType<T> type = Registry.register(Registries.ENTITY_TYPE, new Identifier(TestMod.MOD_ID, id), entityType);
        FabricDefaultAttributeRegistry.register(type, builder);
        return type;
    }

    /**
     * 触发类加载，使所有实体类型及属性在静态初始化阶段完成注册。
     * 必须在初始化时调用。
     */
    public static void register()
    {
    }
}
