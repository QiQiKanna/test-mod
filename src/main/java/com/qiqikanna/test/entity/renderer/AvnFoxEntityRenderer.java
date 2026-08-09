package com.qiqikanna.test.entity.renderer;

import com.qiqikanna.test.TestMod;
import com.qiqikanna.test.entity.custom.AvnFoxEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class AvnFoxEntityRenderer extends GeoEntityRenderer<AvnFoxEntity>
{
    public AvnFoxEntityRenderer(EntityRendererFactory.Context context)
    {
        super(context, new DefaultedEntityGeoModel<>(new Identifier(TestMod.MOD_ID, "avn_fox")));
    }

}
