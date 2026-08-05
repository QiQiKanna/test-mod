package com.qiqikanna.test.sound;

import net.minecraft.sound.BlockSoundGroup;

public class ModBlockSoundGroup
{
    public static final BlockSoundGroup ICE_ETHER = new BlockSoundGroup(
            1.0F,1.0F,
            ModSoundEvents.BLOCK_ICE_ETHER_BREAK,
            ModSoundEvents.BLOCK_ICE_ETHER_STEP,
            ModSoundEvents.BLOCK_ICE_ETHER_PLACE,
            ModSoundEvents.BLOCK_ICE_ETHER_HIT,
            ModSoundEvents.BLOCK_ICE_ETHER_FALL
    );
}
