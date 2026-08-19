package com.qiqikanna.test.block;

import com.qiqikanna.test.fluid.ModFluids;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class ModBlockRenderLayers
{
    public static void register()
    {
        //让方块材质正常透明，不写就变黑色了//草了，为毛不生效啊//雾草找到原因了，忘了在fabric.mod.json里写client了
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ICE_ETHER_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ICE_ETHER_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ICE_ETHER_BLOCK,RenderLayer.getTranslucent());//半透明
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRAWBERRY_CROP,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CORN_CROP,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LUMEN_BERRY_BUSH,RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TEST_BLOCK,RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),ModFluids.OIL,ModFluids.FLOWING_OIL);
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.OIL,ModFluids.FLOWING_OIL,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_still"),
                        0x42413B
                ));
    }
}
