package com.qiqikanna.test.item;

import com.qiqikanna.test.TestMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    public static final RegistryKey<ItemGroup> TESTMOD_GROUP = register("testmod_group");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(TestMod.MOD_ID,id));
    }


    public static void registerGroups()
    {
        Registry.register(
                Registries.ITEM_GROUP,
                TESTMOD_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP,7)
                        .displayName(Text.translatable("itemGroup.testmod_group"))
                        .icon(() -> new ItemStack(ModItems.SHIT))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.ICE_ETHER);
                            entries.add(ModItems.DICK);
                            entries.add(ModItems.SHIT);
                        })
                        .build()
        );
    }
}
