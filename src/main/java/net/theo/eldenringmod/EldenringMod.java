package net.theo.eldenringmod;

import net.fabricmc.api.ModInitializer;

import net.theo.eldenringmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EldenringMod implements ModInitializer {
	public static final String MOD_ID = "eldenring-mod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.RegisterModItems();

		LOGGER.info("Welcome To Hell!");
	}
}