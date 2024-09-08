package com.verdant.item;

import com.verdant.Verdant;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {



    public static final Item WATERING_CAN = registerItem("watering_can", new Item(new FabricItemSettings().group(ModItemGroup.VERDANT)));
    public static final Item TWIG = registerItem("twig", new Item(new FabricItemSettings().group(ModItemGroup.VERDANT)));
    public static final Item CACTUS_THORN = registerItem("cactus_thorn", new Item(new FabricItemSettings().group(ModItemGroup.VERDANT)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Verdant.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Verdant.LOGGER.debug("Registering Mod Items for " + Verdant.MOD_ID);
    }
}
