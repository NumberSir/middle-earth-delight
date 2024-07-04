package com.numbersir.middleearthdelight;

import com.numbersir.middleearthdelight.block.ModBlocks;
import com.numbersir.middleearthdelight.item.ModItemGroups;
import com.numbersir.middleearthdelight.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiddleEarthDelight implements ModInitializer {
	public static final String MOD_ID = "middleearthdelight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
	}
}