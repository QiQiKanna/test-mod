package com.qiqikanna.test;

import com.qiqikanna.test.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class TestModClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        //让方块材质正常透明，不写就变黑色了//草了，为毛不生效啊//雾草找到原因了，忘了在fabric.mod.json里写client了
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ICE_ETHER_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ICE_ETHER_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ICE_ETHER_BLOCK,RenderLayer.getTranslucent());//半透明

    }
}
