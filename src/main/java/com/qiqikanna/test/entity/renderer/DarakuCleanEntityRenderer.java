package com.qiqikanna.test.entity.renderer;

import com.qiqikanna.test.entity.custom.DarakuCleanEntity;
import com.qiqikanna.test.entity.model.DarakuCleanEntityModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class DarakuCleanEntityRenderer extends GeoEntityRenderer<DarakuCleanEntity>
{
    public DarakuCleanEntityRenderer(EntityRendererFactory.Context ctx)
    {
//        super(ctx,
//                new DefaultedEntityGeoModel<>(
//                        new Identifier(TestMod.MOD_ID, "daraku_clean")));
        super(ctx,new DarakuCleanEntityModel());
    }


}
