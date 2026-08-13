package com.qiqikanna.test.entity.renderer;

import com.qiqikanna.test.entity.custom.AvnFoxEntity;
import com.qiqikanna.test.entity.model.AvnFoxEntityModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class AvnFoxEntityRenderer extends GeoEntityRenderer<AvnFoxEntity>
{
    public AvnFoxEntityRenderer(EntityRendererFactory.Context context)
    {
        super(context, new AvnFoxEntityModel());
    }

}
