package com.qiqikanna.test.entity.model;

import com.qiqikanna.test.TestMod;
import com.qiqikanna.test.entity.custom.DarakuCleanEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

//这种的可以完全用DefaultedGeoModel替代
public class DarakuCleanEntityModel extends GeoModel<DarakuCleanEntity>
{
    private final Identifier MODEL = new Identifier(TestMod.MOD_ID, "geo/entity/daraku_clean.geo.json");
    private final Identifier TEXTURE = new Identifier(TestMod.MOD_ID, "textures/entity/daraku_clean.png");
    private final Identifier ANIMATION = new Identifier(TestMod.MOD_ID, "animations/daraku_clean.animation.json");

    @Override
    public Identifier getModelResource(DarakuCleanEntity darakuCleanEntity)
    {
        return this.MODEL;
    }

    @Override
    public Identifier getTextureResource(DarakuCleanEntity darakuCleanEntity)
    {
        return this.TEXTURE;
    }

    @Override
    public Identifier getAnimationResource(DarakuCleanEntity darakuCleanEntity)
    {
        return this.ANIMATION;
    }


}
