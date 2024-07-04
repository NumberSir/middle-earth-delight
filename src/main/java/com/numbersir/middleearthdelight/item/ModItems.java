package com.numbersir.middleearthdelight.item;

import com.numbersir.middleearthdelight.MiddleEarthDelight;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.StewItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.numbersir.middleearthdelight.MiddleEarthDelight.MOD_ID;

public class ModItems {

    public static final Item LEMBAS_HUOGUO = registerItem("lembas_huoguo", new Item(new FabricItemSettings()));
    public static final Item ATHELAS_SALAD = registerItem("athelas_salad", new Item(new FabricItemSettings()));

    // 辅助函数，注册模组的单个物品
    private static Item registerItem(String name, Item item) {
        // 原版方法，注册指定的对象，指定对象类型（物品）、名称、实例
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), item);
    }

    // 辅助函数，注册模组的所有物品
    public static void registerModItems() {
        MiddleEarthDelight.LOGGER.info("Registering Mod Items for " + MOD_ID);
    }
}
