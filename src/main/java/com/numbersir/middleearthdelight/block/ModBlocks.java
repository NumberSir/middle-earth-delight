package com.numbersir.middleearthdelight.block;

import com.numbersir.middleearthdelight.MiddleEarthDelight;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block ELVEN_STOVE = registerBlock("elven_stove", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block MALLORN_PANTRY = registerBlock("mallorn_pantry", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MiddleEarthDelight.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MiddleEarthDelight.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        MiddleEarthDelight.LOGGER.info("Registering Mod Blocks for " + MiddleEarthDelight.MOD_ID);
    }
}
