package net.moras.noextraenergy.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.moras.noextraenergy.ModConfig;
import net.moras.noextraenergy.block.ModBlocks;

public class ModItems {
    public static final Item COAL_POWDER = _registerItem("coal_powder", new Item(
            new FabricItemSettings()
                    .group(ModItemGroups.ENERGETIC)
                    .rarity(Rarity.COMMON)
                    .maxCount(64)
                    .maxDamage(1)
    ));

    public static final Item ELECTRIC_FURNACE = _registerItem("electric_furnace", new BlockItem(
            ModBlocks.ELECTRIC_FURNACE,
            new FabricItemSettings()
                    .group(ModItemGroups.ENERGETIC)
                    .rarity(Rarity.COMMON)
                    .maxCount(1)
                    .maxDamage(1)
    ));

    private static Item _registerItem(String _n, Item _i) {
        Identifier identifier = ModConfig.getIdentifier(_n);
        ModConfig.LOGGER.debug("Register item " + identifier.toString() + " for mod " + ModConfig.IDENTIFIER.toString());
        return Registry.register(Registry.ITEM, identifier, _i);
    }

    public static void registerModItems() {
        ModConfig.LOGGER.debug("Register items for mod " + ModConfig.IDENTIFIER.toString());
    }
}
