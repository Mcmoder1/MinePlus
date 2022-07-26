package net.moder0.mineplus.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.moder0.mineplus.MinePlus;

public class ModItemGroup {
    public static final ItemGroup MINEPLUS = FabricItemGroupBuilder.build
            (new Identifier(MinePlus.MOD_ID, "mineplus"), () -> new ItemStack(ModItems.SILVER_INGOT));
}
