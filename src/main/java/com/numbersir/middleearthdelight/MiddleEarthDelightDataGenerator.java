package com.numbersir.middleearthdelight;

import com.numbersir.middleearthdelight.gen.ModItemModelGenerator;
import com.numbersir.middleearthdelight.gen.ModLangGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MiddleEarthDelightDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		// 生成物品的 json 文件
		pack.addProvider(ModItemModelGenerator::new);
		// 语言
		pack.addProvider(ModLangGenerator::new);
	}
}
