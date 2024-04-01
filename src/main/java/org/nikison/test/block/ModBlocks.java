package org.nikison.test.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.nikison.test.Test;

public class ModBlocks {

    public static final Block SHIT_BLOCK = registerBlock("shit_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)));

    public static final Block CUM_BLOCK = registerBlock("cum_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK)));

    public static final Block AMBER_ORE = registerBlock("amber_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(2.0F, 2.0F)));

    public static final Block AMBER_BLOCK = registerBlock("amber_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(2.5F, 2.5F)));

    public static final Block DEEPSLATE_AMBER_ORE = registerBlock("deepslate_amber_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).strength(4.0F, 2.0F)));





    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Test.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(Test.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        Test.LOGGER.info("Register ModBlocks for " + Test.MOD_ID);
    }
}
