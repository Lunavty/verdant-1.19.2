package com.verdant.block;

import com.verdant.Verdant;
import com.verdant.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block LOBELIA = registerBlock("lobelia",
            new FlowerBlock(StatusEffects.DARKNESS, 8,
                    FabricBlockSettings.copy(Blocks.DANDELION)), ModItemGroup.VERDANT);

    public static final Block POTTED_LOBELIA = registerBlockWithoutItem("potted_lobelia",
            new FlowerPotBlock(ModBlocks.LOBELIA, FabricBlockSettings.copy(Blocks.POTTED_DANDELION)));

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Verdant.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block, ItemGroup tab){

        return Registry.register(Registry.BLOCK, new Identifier(Verdant.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
       return Registry.register(Registry.ITEM, new Identifier(Verdant.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(tab)));
    }


    public static void registerModBlocks() {
        Verdant.LOGGER.debug("Registering ModBlocks for" + Verdant.MOD_ID);
    }
}
