package com.qiqikanna.test.item;

import com.qiqikanna.test.TestMod;
import com.qiqikanna.test.block.ModBlocks;
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
    public static final RegistryKey<ItemGroup> TESTMOD_BLOCK = register("testmod_block");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(TestMod.MOD_ID,id));
    }


    public static void registerGroups()
    {
        Registry.register(
                Registries.ITEM_GROUP,
                TESTMOD_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP,7)
                        .displayName(Text.translatable("itemGroup.test-mod_group"))
                        .icon(() -> new ItemStack(ModItems.SHIT))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.ICE_ETHER);
                            entries.add(ModItems.DICK);
                            entries.add(ModItems.SHIT);
                            entries.add(ModItems.SWORD);

                        })
                        .build()
        );

        Registry.register(
                Registries.ITEM_GROUP,
                TESTMOD_BLOCK,
                ItemGroup.create(null,-1)//fabric api允许用null,-1自动追加到后面
                        .displayName(Text.translatable("itemGroup.test-mod_block"))
                        .icon(() -> new ItemStack(ModBlocks.RAINBOW_BLOCK))
                        .entries((displayContext, entries) -> {
                            entries.add(ModBlocks.BASKETBALL_BLOCK);
                            entries.add(ModBlocks.ICE_ETHER_BLOCK);
                            entries.add(ModBlocks.RAINBOW_BLOCK);
                            entries.add(ModBlocks.TEST_BLOCK);
                            entries.add(ModBlocks.CHANDELIER);

                        })
                        .build()
        );
    }
}
