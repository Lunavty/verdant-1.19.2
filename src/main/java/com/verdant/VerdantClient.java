package com.verdant;

import com.verdant.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;


public class VerdantClient implements ClientModInitializer {


        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LOBELIA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_LOBELIA, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LOBELIA, RenderLayer.getCutout)
    @Override
    public void onInitializeClient() {

    }
}
