package com.qiqikanna.test.entity.model;

import com.qiqikanna.test.TestMod;
import com.qiqikanna.test.entity.custom.AvnFoxEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class AvnFoxEntityModel extends DefaultedEntityGeoModel<AvnFoxEntity>
{
    public AvnFoxEntityModel()
    {
        super(new Identifier(TestMod.MOD_ID,"avn_fox"));
    }

    @Override
    public RenderLayer getRenderType(AvnFoxEntity animatable, Identifier texture)
    {
        return RenderLayer.getEntityTranslucent(texture);
    }


}
