package com.qiqikanna.test.fluid;

import com.qiqikanna.test.TestMod;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModFluids
{
    public static final FlowableFluid FLOWING_OIL = register("flowing_oil", new OilFluid.Flowing());
    public static final FlowableFluid OIL = register("oil",new OilFluid.Still());

    private static <T extends Fluid> T register(String id, T value) {
        return Registry.register(Registries.FLUID, new Identifier(TestMod.MOD_ID,id), value);
    }

    static {
        for (Fluid fluid : Registries.FLUID) {
            for (FluidState fluidState : fluid.getStateManager().getStates()) {
                Fluid.STATE_IDS.add(fluidState);
            }
        }
    }

    public static void register(){}

    @Environment(EnvType.CLIENT)
    public static void registerRenderLayers()
    {
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),OIL,FLOWING_OIL);
        FluidRenderHandlerRegistry.INSTANCE.register(OIL,FLOWING_OIL,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_still"),
                        0x42413B
                ));
    }
}
