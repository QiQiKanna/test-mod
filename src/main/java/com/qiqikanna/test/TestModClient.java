package com.qiqikanna.test;

import com.qiqikanna.test.block.ModBlocks;
import com.qiqikanna.test.entity.ModBoatTypes;
import com.qiqikanna.test.entity.ModEntityModelLayers;
import com.qiqikanna.test.entity.ModEntityTypes;
import com.qiqikanna.test.fluid.ModFluids;
import net.fabricmc.api.ClientModInitializer;

public class TestModClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        ModEntityModelLayers.register();
        ModEntityTypes.registerRenderers();

        ModBlocks.registerRenderLayers();
        ModFluids.registerRenderLayers();
        ModBoatTypes.registerModelLayers();
    }
}
