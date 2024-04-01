package org.nikison.test.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.nikison.test.Test;
import org.nikison.test.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup MODDING = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Test.MOD_ID, "nikison_page"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.nikison_page"))
                    .icon(() -> new ItemStack(ModItems.ZET)).entries((displayContext, entries) -> {
                        entries.add(ModItems.NIGGA);
                        entries.add(ModItems.ZET);

                    }).build());

    public static final ItemGroup MODDED_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Test.MOD_ID, "nikison_blocks_page"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.nikison_blocks_page"))
                    .icon(() -> new ItemStack(ModBlocks.SHIT_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SHIT_BLOCK);
                        entries.add(ModBlocks.CUM_BLOCK);

                    }).build());

    public static void registerItemGroups() {
        Test.LOGGER.info("Registering Item Groups for " + Test.MOD_ID);
    }
}
