package com.qiqikanna.test.tag;

import com.qiqikanna.test.TestMod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags
{
    public static final TagKey<Block> ICE_ETHERS = of("ice_ethers");

    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(TestMod.MOD_ID,id));
    }
}
