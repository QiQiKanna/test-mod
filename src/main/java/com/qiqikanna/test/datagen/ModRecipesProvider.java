package com.qiqikanna.test.datagen;

import com.qiqikanna.test.TestMod;
import com.qiqikanna.test.block.ModBlocks;
import com.qiqikanna.test.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipesProvider extends FabricRecipeProvider
{
    public ModRecipesProvider(FabricDataOutput output)
    {
        super(output);
    }

    public static final List<ItemConvertible> SHIT = List.of(ModItems.SHIT);

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter)
    {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ICE_ETHER
                , RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_BLOCK);

        offerSmelting(exporter,SHIT,RecipeCategory.MISC,ModBlocks.RAINBOW_BLOCK,0.7f,200,"rainbow");
        offerBlasting(exporter,SHIT,RecipeCategory.MISC,ModBlocks.RAINBOW_BLOCK,0.7f,100,"rainbow");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.SHIT,8)
                .input(ModItems.BASKETBALL_BLOCK)
                .criterion(hasItem(ModItems.BASKETBALL_BLOCK),conditionsFromItem(ModItems.BASKETBALL_BLOCK))
                .offerTo(exporter,new Identifier(TestMod.MOD_ID,"shit"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.BASKETBALL_BLOCK,1)
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .input('#',ModItems.SHIT)
                .criterion(hasItem(ModItems.SHIT),conditionsFromItem(ModItems.SHIT))
                .offerTo(exporter,new Identifier(TestMod.MOD_ID,"basketball"));
    }
}
