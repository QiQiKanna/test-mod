package com.qiqikanna.test.event;

import com.qiqikanna.test.client.option.ModKeyBindings;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.text.Text;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;

public class ModClientEvents
{
    public static void register()
    {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (ModKeyBindings.TEST_MESSAGE.wasPressed())
            {
                if (client.world == null || client.player == null)
                {
                    return;
                }

                HitResult crosshairTarget = client.crosshairTarget;
                if (crosshairTarget != null && crosshairTarget.getType().equals(HitResult.Type.BLOCK))
                {
                    BlockPos blockPos = ((BlockHitResult) crosshairTarget).getBlockPos();
                    client.player.sendMessage(
                            Text.of("X: %d ,Y: %d ,Z: %d".formatted(blockPos.getX(),blockPos.getY(),blockPos.getZ())));
                    client.world.getBlockState(blockPos).onUse(
                            client.world,
                            client.player,
                            client.player.getActiveHand(),
                            ((BlockHitResult) crosshairTarget));
                }

            }
        });
    }
}
