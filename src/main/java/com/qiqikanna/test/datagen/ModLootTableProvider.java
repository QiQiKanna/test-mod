package com.qiqikanna.test.datagen;

import com.qiqikanna.test.block.ModBlocks;
import com.qiqikanna.test.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider
{
    public ModLootTableProvider(FabricDataOutput dataOutput)
    {
        super(dataOutput);
    }

    @Override
    public void generate()
    {
        addDrop(ModBlocks.ICE_ETHER_BLOCK);
        addDrop(ModBlocks.TEST_BLOCK);
        addDrop(ModBlocks.BASKETBALL_BLOCK);
        addDrop(ModBlocks.RAINBOW_BLOCK,oreBlockDrops(ModBlocks.RAINBOW_BLOCK, ModItems.SHIT,1.0f,5.0f));
        addDrop(ModBlocks.CHANDELIER);
        addDrop(ModBlocks.ICE_ETHER_STAIRS);
        addDrop(ModBlocks.ICE_ETHER_SLAB,slabDrops(ModBlocks.ICE_ETHER_SLAB));
        addDrop(ModBlocks.ICE_ETHER_BUTTON);
        addDrop(ModBlocks.ICE_ETHER_PRESSURE_PLATE);
        addDrop(ModBlocks.ICE_ETHER_FENCE);
        addDrop(ModBlocks.ICE_ETHER_FENCE_GATE);
        addDrop(ModBlocks.ICE_ETHER_WALLL);
        addDrop(ModBlocks.ICE_ETHER_DOOR,doorDrops(ModBlocks.ICE_ETHER_DOOR));
        addDrop(ModBlocks.ICE_ETHER_TRAPDOOR);
    }

    public LootTable.Builder oreBlockDrops(Block drop, Item item, float min, float max) {
        return dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(min, max)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                )
        );
    }
}
