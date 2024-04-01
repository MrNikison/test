package org.nikison.test;

import net.fabricmc.api.ModInitializer;
import org.nikison.test.block.ModBlocks;
import org.nikison.test.item.ModItemGroups;
import org.nikison.test.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test implements ModInitializer {
    public static final String MOD_ID = "test";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItem();
        ModBlocks.registerModBlocks();
    }
}
