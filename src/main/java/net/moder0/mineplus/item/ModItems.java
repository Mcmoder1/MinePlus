package net.moder0.mineplus.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.moder0.mineplus.MinePlus;

public class ModItems {

    //-----------------------------------------------------------------------------------------

    public static final Item RAW_SILVER = registerItem
            ("raw_silver", new Item(new FabricItemSettings().group(ModItemGroup.MINEPLUS)));
     public static final Item SILVER_INGOT = registerItem
            ("silver_ingot", new Item(new FabricItemSettings().group(ModItemGroup.MINEPLUS)));
    //-----------------------------------------------------------------------------------------
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(MinePlus.MOD_ID, name), item);
    }
    public static void registerModItems(){
        MinePlus.LOGGER.debug("Registering Mod Items for " + MinePlus.MOD_ID);
    }
}
