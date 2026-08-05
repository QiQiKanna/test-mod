package com.qiqikanna.test.entity.renderer;

import com.qiqikanna.test.TestMod;
import com.qiqikanna.test.entity.ModEntityModelLayers;
import com.qiqikanna.test.entity.custom.DistortedScoutEntity;
import com.qiqikanna.test.entity.model.DistortedScoutEntityModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class DistortedScoutEntityRenderer extends MobEntityRenderer<DistortedScoutEntity, DistortedScoutEntityModel>
{

    public DistortedScoutEntityRenderer(EntityRendererFactory.Context context)
    {
        super(context, new DistortedScoutEntityModel(context.getPart(ModEntityModelLayers.DISTORTED_SCOUT)), 0.5F);
    }

    @Override
    public Identifier getTexture(DistortedScoutEntity entity)
    {
        return new Identifier(TestMod.MOD_ID,"textures/entity/distorted_scout/distorted_scout.png");
    }
}
