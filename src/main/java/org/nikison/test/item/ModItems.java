package org.nikison.test.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.nikison.test.Test;

public class ModItems {

    public static final Item NIGGA = registerItem("nigga", new Item(new FabricItemSettings()));
    public static final Item ZET = registerItem("zet", new Item(new FabricItemSettings()));
    public static final Item SPERM = registerItem("sperm", new Item(new FabricItemSettings()));

    private static void addItemToFoodItemGroup(FabricItemGroupEntries entries){
        entries.add(NIGGA);
        entries.add(ZET);
        entries.add(SPERM);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Test.MOD_ID, name), item);
    }

    public static void registerModItem(){
//        Test.LOGGER.info("Registering Mod Items for " + Test.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemToFoodItemGroup);
    }
}
