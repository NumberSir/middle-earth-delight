package com.numbersir.middleearthdelight.gen;

import com.numbersir.middleearthdelight.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
//import net.jukoz.me.block.WoodBlockSets;
//import net.jukoz.me.item.ModResourceItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        // criterion: 拿到什么物品会触发合成表解锁
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ELVEN_STOVE)
                .pattern("iii")
                .pattern("b b")
                .pattern("bcb")
//                .input('i', ModResourceItems.ELVEN_STEEL_INGOT)
                .input('i', Items.IRON_INGOT)
                .input('b', Blocks.BRICKS)
                .input('c', Blocks.CAMPFIRE)
//                .criterion(FabricRecipeProvider.hasItem(ModResourceItems.ELVEN_STEEL_INGOT), FabricRecipeProvider.conditionsFromItem(ModResourceItems.ELVEN_STEEL_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT), FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Blocks.BRICKS), FabricRecipeProvider.conditionsFromItem(Blocks.BRICKS))
                .criterion(FabricRecipeProvider.hasItem(Blocks.CAMPFIRE), FabricRecipeProvider.conditionsFromItem(Blocks.CAMPFIRE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.MALLORN_PANTRY)
                .pattern("sss")
                .pattern("t t")
                .pattern("sss")
//                .input('s', WoodBlockSets.MALLORN.planksSlab())
                .input('s', Blocks.OAK_SLAB)
//                .input('t', WoodBlockSets.MALLORN.trapdoor())
                .input('t', Blocks.OAK_TRAPDOOR)
//                .criterion(FabricRecipeProvider.hasItem(WoodBlockSets.MALLORN.planksSlab()), FabricRecipeProvider.conditionsFromItem(WoodBlockSets.MALLORN.planksSlab()))
                .criterion(FabricRecipeProvider.hasItem(Blocks.OAK_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.OAK_SLAB))
//                .criterion(FabricRecipeProvider.hasItem(WoodBlockSets.MALLORN.trapdoor()), FabricRecipeProvider.conditionsFromItem(WoodBlockSets.MALLORN.trapdoor()))
                .criterion(FabricRecipeProvider.hasItem(Blocks.OAK_TRAPDOOR), FabricRecipeProvider.conditionsFromItem(Blocks.OAK_TRAPDOOR))
                .offerTo(exporter);
    }
}
