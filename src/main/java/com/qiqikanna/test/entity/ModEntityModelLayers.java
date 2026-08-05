package com.qiqikanna.test.entity;

import com.google.common.collect.Sets;
import com.qiqikanna.test.TestMod;
import com.qiqikanna.test.entity.model.CubeEntityModel;
import com.qiqikanna.test.entity.model.DistortedScoutEntityModel;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

import java.util.Set;
import java.util.stream.Stream;

@Environment(EnvType.CLIENT)
public class ModEntityModelLayers
{
    private static final String MAIN = "main";
    private static final Set<EntityModelLayer> LAYERS = Sets.<EntityModelLayer>newHashSet();

    public static final EntityModelLayer CUBE = registerMain("cube");
    public static final EntityModelLayer DISTORTED_SCOUT = registerMain("distorted_scout");

    public static void register()
    {
        // 注册模型层 — 必须在注册渲染器之前！
        EntityModelLayerRegistry.registerModelLayer(CUBE, CubeEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(DISTORTED_SCOUT, DistortedScoutEntityModel::getTexturedModelData);
    }

    private static EntityModelLayer registerMain(String id) {
        return register(id, MAIN);
    }
    private static EntityModelLayer register(String id, String layer) {
        EntityModelLayer entityModelLayer = create(id, layer);
        if (!LAYERS.add(entityModelLayer)) {
            throw new IllegalStateException("Duplicate registration for " + entityModelLayer);
        } else {
            return entityModelLayer;
        }
    }
    private static EntityModelLayer create(String id, String layer) {
        return new EntityModelLayer(new Identifier(TestMod.MOD_ID, id), layer);
    }
    public static Stream<EntityModelLayer> getLayers() {
        return LAYERS.stream();
    }
}
