package net.uhhdani.secretsmpmod;

import net.fabricmc.api.ModInitializer;

import net.uhhdani.secretsmpmod.block.ModBlocks;
import net.uhhdani.secretsmpmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecretSMPMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public  static final String MOD_ID = "secretsmpmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}