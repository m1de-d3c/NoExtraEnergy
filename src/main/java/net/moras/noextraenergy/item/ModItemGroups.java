package net.moras.noextraenergy.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.moras.noextraenergy.ModConfig;

public class ModItemGroups {
    public static final ItemGroup ENERGETIC = FabricItemGroupBuilder.build(
            ModConfig.getIdentifier("energetic"),
            () -> new ItemStack(ModItems.COAL_POWDER)
    );
}
