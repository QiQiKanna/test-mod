package com.qiqikanna.test;

import com.qiqikanna.test.block.ModBlockRenderLayers;
import com.qiqikanna.test.entity.ModEntityModelLayers;
import com.qiqikanna.test.entity.ModEntityRenderers;
import net.fabricmc.api.ClientModInitializer;

public class TestModClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        ModEntityModelLayers.register();
        ModEntityRenderers.register();

        ModBlockRenderLayers.register();
    }
}
