package net.moder0.mineplus.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.moder0.mineplus.MinePlus;
import net.moder0.mineplus.item.ModItemGroup;

public class ModBlocks {
        private static Block registerBlock(String name, Block block, ItemGroup tab){
            registerBlockItem(name, block, tab);
            return Registry.register(Registry.BLOCK, new Identifier(MinePlus.MOD_ID, name), block);
        }

        private static Item registerBlockItem(String name, Block block, ItemGroup tab){
            return Registry.register(Registry.ITEM, new Identifier(MinePlus.MOD_ID, name), new BlockItem
                    (block, new FabricItemSettings().group(tab)));
        }
//---------------------------------------------------------------------------------------

    public static final Block SILVER_BLOCK = registerBlock
            ("silver_block", new Block(FabricBlockSettings.of(Material.METAL).strength(8f).requiresTool()), ModItemGroup.MINEPLUS);

    public static final Block SILVER_ORE = registerBlock
            ("silver_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(5f).requiresTool()), ModItemGroup.MINEPLUS);

    public static final Block RAW_SILVER_BLOCK = registerBlock
            ("raw_silver_block", new Block(FabricBlockSettings.of(Material.METAL).strength(8f).requiresTool()), ModItemGroup.MINEPLUS);

    public static final Block DEEPSLATE_SILVER_ORE = registerBlock
            ("deepslate_silver_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroup.MINEPLUS);
//---------------------------------------------------------------------------------------

    public static void registerModBlocks() {
        MinePlus.LOGGER.debug("registring ModBlocks for " + MinePlus.MOD_ID);
    }
}
