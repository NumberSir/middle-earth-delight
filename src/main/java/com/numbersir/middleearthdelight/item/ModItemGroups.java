package com.numbersir.middleearthdelight.item;

import com.numbersir.middleearthdelight.MiddleEarthDelight;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    // 创造模式物品栏名称
    public static final String GROUP_NAME = "itemgroup.middleearthdelight.food";

    // 注册创造模式物品栏，需要名称、图标
    public static final ItemGroup MIDDLE_EARTH_DELIGHT_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(MiddleEarthDelight.MOD_ID, "food"),
            FabricItemGroup.builder().displayName(Text.translatable(GROUP_NAME))
                    .icon(() -> new ItemStack(ModItems.LEMBAS_HUOGUO))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.LEMBAS_HUOGUO);
                        entries.add(ModItems.ATHELAS_SALAD);
                    }).build());

    public static void registerItemGroups() {
        MiddleEarthDelight.LOGGER.info("Registering item groups for " + MiddleEarthDelight.MOD_ID);
    }
}
