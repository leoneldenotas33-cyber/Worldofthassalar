package com.thassalar;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.registry.BuiltInRegistries;

public class WorldOfThassalar implements ModInitializer {
    public static final String MOD_ID = "worldofthassalar";

    @Override
    public void onInitialize() {
        // Register items and blocks
        registerItems();
        registerBlocks();
        registerBiomes();
    }

    private void registerItems() {
        // Example: Register a new item
        // Item item = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "example_item"), new Item(new Item.Settings().group(ItemGroup.MISC)));
    }

    private void registerBlocks() {
        // Example: Register a new block
        // Block block = Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "example_block"), new Block(FabricBlockSettings.of(Material.STONE).strength(1.5F, 6.0F)));
    }

    private void registerBiomes() {
        // Example: Register a new biome
        // BiomeModifications.addBiome("example_biome", (context) -> {
        //     // Your biome logic here
        // });
    }
}