package com.verdant;

import com.verdant.block.ModBlocks;
import com.verdant.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Verdant implements ModInitializer {
	public static final String MOD_ID = "verdant";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}