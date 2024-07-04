package com.numbersir.middleearthdelight.gen;

import com.numbersir.middleearthdelight.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModItemModelGenerator extends FabricModelProvider {
    public ModItemModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    // 生成物品的 json 文件
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.LEMBAS_HUOGUO, Models.GENERATED);
        itemModelGenerator.register(ModItems.ATHELAS_SALAD, Models.GENERATED);
    }
}
