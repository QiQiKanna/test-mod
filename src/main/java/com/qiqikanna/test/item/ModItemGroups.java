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
                            entries.add(ModItems.SHIT);
                            entries.add(ModItems.MY_SWORD);
                            entries.add(ModItems.CORN);
                            entries.add(ModItems.BLUEBARRY);
                            entries.add(ModItems.URANIUM);
                            entries.add(ModItems.FIRE_ETHER);
                            entries.add(ModItems.FIRE_ETHER_SWORD);
                            entries.add(ModItems.FIRE_ETHER_SHOVEL);
                            entries.add(ModItems.FIRE_ETHER_PICKAXE);
                            entries.add(ModItems.FIRE_ETHER_AXE);
                            entries.add(ModItems.FIRE_ETHER_HOE);
                            entries.add(ModItems.PICKAXE_AXE);
                            entries.add(ModItems.ICE_ETHER_HELMET);
                            entries.add(ModItems.ICE_ETHER_BOOTS);
                            entries.add(ModItems.ICE_ETHER_LEGGINGS);
                            entries.add(ModItems.ICE_ETHER_CHESTPLATE);

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
                            entries.add(ModItems.BASKETBALL_BLOCK);
                            entries.add(ModItems.ICE_ETHER_BLOCK);
                            entries.add(ModItems.RAINBOW_BLOCK);
                            entries.add(ModItems.TEST_BLOCK);
                            entries.add(ModItems.CHANDELIER);

                            entries.add(ModItems.ICE_ETHER_STAIRS);
                            entries.add(ModItems.ICE_ETHER_SLAB);
                            entries.add(ModItems.ICE_ETHER_BUTTON);
                            entries.add(ModItems.ICE_ETHER_PRESSURE_PLATE);
                            entries.add(ModItems.ICE_ETHER_FENCE);
                            entries.add(ModItems.ICE_ETHER_FENCE_GATE);
                            entries.add(ModItems.ICE_ETHER_WALLL);
                            entries.add(ModItems.ICE_ETHER_DOOR);
                            entries.add(ModItems.ICE_ETHER_TRAPDOOR);
                        })
                        .build()
        );
    }
}
