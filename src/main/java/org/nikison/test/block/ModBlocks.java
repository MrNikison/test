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
