package net.moder0.mineplus;

import net.fabricmc.api.ModInitializer;
import net.moder0.mineplus.block.ModBlocks;
import net.moder0.mineplus.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinePlus implements ModInitializer {
	public static final String MOD_ID = "mineplus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
