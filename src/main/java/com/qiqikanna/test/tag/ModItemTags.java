package com.qiqikanna.test.tag;

import com.qiqikanna.test.TestMod;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags
{
    public static final TagKey<Item> SHITS = of("shits");

    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(TestMod.MOD_ID,id));
    }
}
