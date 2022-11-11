package net.moras.noextraenergy.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FurnaceBlock;
import net.minecraft.block.Material;
import net.minecraft.util.registry.Registry;
import net.moras.noextraenergy.ModConfig;

public class ModBlocks {
    public static final Block ELECTRIC_FURNACE = _registerBlock("electric_furnace", new ElectricFurnaceBlock(
            FabricBlockSettings.of(Material.METAL)
                    .requiresTool()
                    .strength(4f)
    ));

    private static Block _registerBlock(String _n, Block _b) {
        return Registry.register(Registry.BLOCK, ModConfig.getIdentifier(_n), _b);
    }
}
