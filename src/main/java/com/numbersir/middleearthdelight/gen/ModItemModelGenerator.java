package com.numbersir.middleearthdelight.gen;

import com.numbersir.middleearthdelight.MiddleEarthDelight;
import com.numbersir.middleearthdelight.block.ModBlocks;
import com.numbersir.middleearthdelight.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModItemModelGenerator extends FabricModelProvider {
    public ModItemModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ELVEN_STOVE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MALLORN_PANTRY);
    }

    // 生成物品的 json 文件
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.LEMBAS_HUOGUO, Models.GENERATED);
        itemModelGenerator.register(ModItems.ATHELAS_TEA, Models.GENERATED);

        itemModelGenerator.register(ModBlocks.ELVEN_STOVE.asItem(), registerItemBlock(ModBlocks.ELVEN_STOVE));
        itemModelGenerator.register(ModBlocks.MALLORN_PANTRY.asItem(), registerItemBlock(ModBlocks.MALLORN_PANTRY));
    }

    public static Model registerItemBlock(Block block, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(new Identifier(MiddleEarthDelight.MOD_ID, ModelIds.getBlockModelId(block).getPath())), Optional.empty(), requiredTextureKeys);
    }
}
