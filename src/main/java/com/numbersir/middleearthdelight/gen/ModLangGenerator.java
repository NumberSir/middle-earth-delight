package com.numbersir.middleearthdelight.gen;

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
        translationBuilder.add(ModItems.ATHELAS_SALAD, "Athelas Salad");
        translationBuilder.add(ModItems.LEMBAS_HUOGUO, "Lembas Huoguo");

        translationBuilder.add(ModItemGroups.GROUP_NAME, "Middle-earth Foods");
    }
}
