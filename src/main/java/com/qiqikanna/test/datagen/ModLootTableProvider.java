package com.qiqikanna.test.datagen;

import com.qiqikanna.test.block.ModBlocks;
import com.qiqikanna.test.block.custom.CornCropBlock;
import com.qiqikanna.test.block.custom.LumenBerryBushBlock;
import com.qiqikanna.test.block.custom.StrawberryCropBlock;
import com.qiqikanna.test.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider
{
    public ModLootTableProvider(FabricDataOutput dataOutput)
    {
        super(dataOutput);
    }

    @Override
    public void generate()
    {
        addDrop(ModBlocks.ICE_ETHER_BLOCK ,block -> drops(block,ModBlocks.HEMOSTONE));
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

        addStrawberryCropDrops();
        addCornCropDrops();
        addLumenBerryBushDrops();
    }


    private void addStrawberryCropDrops()
    {
        LootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.STRAWBERRY_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(StrawberryCropBlock.AGE, 5));
        addDrop(ModBlocks.STRAWBERRY_CROP,
                cropDrops(ModBlocks.STRAWBERRY_CROP, ModItems.STRAWBERRY, ModItems.STRAWBERRY_SEEDS, builder));
    }

    private void addCornCropDrops()
    {
        LootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.CORN_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(CornCropBlock.AGE, 8));
        addDrop(
                ModBlocks.CORN_CROP,
                applyExplosionDecay(
                        ModBlocks.CORN_CROP,
                        LootTable.builder()
                                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.CORN)))
                                .pool(
                                        LootPool.builder()
                                                .conditionally(builder)
                                                .with(ItemEntry.builder(ModItems.CORN).apply(ApplyBonusLootFunction.binomialWithBonusCount(Enchantments.FORTUNE, 0.5714286F, 3)))
                                )
                )
        );
    }

    private void addLumenBerryBushDrops()
    {
        LootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.LUMEN_BERRY_BUSH)
                .properties(StatePredicate.Builder.create().exactMatch(LumenBerryBushBlock.AGE, 1));
        addDrop(ModBlocks.LUMEN_BERRY_BUSH,
                applyExplosionDecay(
                        ModBlocks.LUMEN_BERRY_BUSH,
                        LootTable.builder()
                                .pool(LootPool.builder().with(ItemEntry.builder(ModItems.LUMEN_BERRIES)))
                                .pool(
                                        LootPool.builder()
                                                .conditionally(builder)
                                                .with(ItemEntry.builder(ModItems.LUMEN_BERRIES))
                                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 4.0F)))
                                                .apply(ApplyBonusLootFunction.uniformBonusCount(Enchantments.FORTUNE))
                                )
                )
        );
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
