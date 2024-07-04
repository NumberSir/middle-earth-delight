package com.numbersir.middleearthdelight.gen;

import com.numbersir.middleearthdelight.block.ModBlocks;
import com.numbersir.middleearthdelight.item.ModItemGroups;
import com.numbersir.middleearthdelight.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModLangGenerator extends FabricLanguageProvider {
    public ModLangGenerator(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItemGroups.GROUP_NAME_FOODS, "Middle-earth Foods");
        translationBuilder.add(ModItemGroups.GROUP_NAME_BLOCKS, "Middle-earth Blocks");

        translationBuilder.add(ModItems.ATHELAS_SALAD, "Athelas Salad");
        translationBuilder.add(ModItems.LEMBAS_HUOGUO, "Lembas Huoguo");

        translationBuilder.add(ModBlocks.ELVEN_STOVE, "Elven Stove");
        translationBuilder.add(ModBlocks.MALLORN_PANTRY, "Mallorn Pantry");
    }
}
