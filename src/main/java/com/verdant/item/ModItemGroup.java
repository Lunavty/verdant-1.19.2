package com.verdant.item;

import com.verdant.Verdant;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup VERDANT = FabricItemGroupBuilder.build(new Identifier(Verdant.MOD_ID, "verdant"), () -> new ItemStack(ModItems.WATERING_CAN));
}
