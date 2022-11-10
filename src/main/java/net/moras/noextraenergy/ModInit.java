package net.moras.noextraenergy;

import net.fabricmc.api.ModInitializer;

public class ModInit implements ModInitializer {
	@Override
	public void onInitialize() {
		ModConfig.LOGGER.info("Initialize modification " + ModConfig.MOD_ID);
	}
}
