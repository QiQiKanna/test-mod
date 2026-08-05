package com.qiqikanna.test.entity;

import com.qiqikanna.test.entity.renderer.CubeEntityRenderer;
import com.qiqikanna.test.entity.renderer.DistortedScoutEntityRenderer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class ModEntityRendererRegistry
{
    public static void register()
    {
        EntityRendererRegistry.register(ModEntityTypes.CUBE_ENTITY, CubeEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypes.DISTORTED_SCOUT, DistortedScoutEntityRenderer::new);
    }
}
