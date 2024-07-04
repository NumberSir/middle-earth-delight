package com.numbersir.middleearthdelight.item;

import com.numbersir.middleearthdelight.MiddleEarthDelight;
import com.numbersir.middleearthdelight.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    // 创造模式物品栏名称
    public static final String GROUP_NAME_FOODS = "itemgroup.middleearthdelight.foods";
    public static final String GROUP_NAME_BLOCKS = "itemgroup.middleearthdelight.blocks";

    // 注册创造模式物品栏，需要名称、图标
    public static final ItemGroup ITEMGROUP_FOOD = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(MiddleEarthDelight.MOD_ID, "foods"),
            FabricItemGroup.builder().displayName(Text.translatable(GROUP_NAME_FOODS))
                    .icon(() -> new ItemStack(ModItems.LEMBAS_HUOGUO))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.LEMBAS_HUOGUO);
                        entries.add(ModItems.ATHELAS_SALAD);
                    }).build());

    public static final ItemGroup ITEMGROUP_BLOCKS = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(MiddleEarthDelight.MOD_ID, "blocks"),
            FabricItemGroup.builder().displayName(Text.translatable(GROUP_NAME_BLOCKS))
                    .icon(() -> new ItemStack(ModBlocks.ELVEN_STOVE.asItem()))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ELVEN_STOVE);
                        entries.add(ModBlocks.MALLORN_PANTRY);
                    }).build());

    public static void registerItemGroups() {
        MiddleEarthDelight.LOGGER.info("Registering item groups for " + MiddleEarthDelight.MOD_ID);
    }
}
