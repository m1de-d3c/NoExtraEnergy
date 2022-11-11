package net.moras.noextraenergy;

import net.fabricmc.api.ModInitializer;
import net.moras.noextraenergy.item.ModItems;

public class ModInit implements ModInitializer {
	@Override
	public void onInitialize() {
		ModConfig.LOGGER.info("Initialize modification " + ModConfig.IDENTIFIER.toString());

		ModItems.registerModItems();
	}
}
