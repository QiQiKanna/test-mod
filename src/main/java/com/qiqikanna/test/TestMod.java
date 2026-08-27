package com.qiqikanna.test;

import com.qiqikanna.test.block.ModBlocks;
import com.qiqikanna.test.block.entity.ModBlockEntityTypes;
import com.qiqikanna.test.entity.ModBoatTypes;
import com.qiqikanna.test.entity.ModEntityTypes;
import com.qiqikanna.test.event.ModEvents;
import com.qiqikanna.test.fluid.ModFluids;
import com.qiqikanna.test.item.ModItemGroups;
import com.qiqikanna.test.item.ModItems;
import com.qiqikanna.test.sound.ModSoundEvents;
import com.qiqikanna.test.village.ModTrades;
import com.qiqikanna.test.village.ModVillagers;
import com.qiqikanna.test.word.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "test-mod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerItems();
		ModItemGroups.registerGroups();
		ModBlocks.register();
		ModEntityTypes.register();
		ModBlockEntityTypes.register();
		ModSoundEvents.registerSoundEvents();
		ModTrades.registerTrades();
		ModVillagers.registerVillagers();
		ModFluids.register();
		ModBoatTypes.register();
		ModEvents.register();
		ModWorldGeneration.register();



		//fabric api 注册燃料的方法
		//FuelRegistry.INSTANCE.add(ModItems.URANIUM,32767);

		LOGGER.info("Hello Fabric world!");
	}
}