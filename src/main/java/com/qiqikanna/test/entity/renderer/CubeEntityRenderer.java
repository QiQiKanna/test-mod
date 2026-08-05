package com.qiqikanna.test.entity.renderer;

import com.qiqikanna.test.TestMod;
import com.qiqikanna.test.entity.ModEntityModelLayers;
import com.qiqikanna.test.entity.custom.CubeEntity;
import com.qiqikanna.test.entity.model.CubeEntityModel;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class CubeEntityRenderer extends MobEntityRenderer<CubeEntity, CubeEntityModel>
{
    public CubeEntityRenderer(EntityRendererFactory.Context context)
    {
        super(context, new CubeEntityModel(context.getPart(ModEntityModelLayers.CUBE)) , 0.5F);
    }

    @Override
    public Identifier getTexture(CubeEntity entity)
    {
        return new Identifier(TestMod.MOD_ID,"textures/entity/cube/cube.png");
    }
}
