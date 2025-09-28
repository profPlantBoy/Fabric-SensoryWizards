package net.profplantboy.sensorywizards.item;




// End of Package Imports


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.profplantboy.sensorywizards.SensoryWizards;

import javax.xml.namespace.QName;
// IF YOU ARE LOOKING AT MY CODE I AM NEW SO I MAKE COMMENTS EVERYWHERE AND PROBABLY DO THINGS WIERD SORRY <3

public class ModItems {

// BELOW IS THE REGISTER TEST_ITEM or test_item FOR THE GAME
    public static final Item TEST_ITEM = registerItem("test_item", new Item(new Item.Settings()));
// ABOVE IS THE REGISTER TEST_ITEM or test_item FOR THE GAME



    // BELOW IS THE REGISTER ITEM HELPER METHOD
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SensoryWizards.MOD_ID, name), item);
    }
    // ABOVE IS THE REGISTER ITEM HELPER METHOD


// BELOW IS A LOGGER THAT LOGS WHAT IS HAPPENING IN THE LOG
    public static void registerModItems() {
        SensoryWizards.LOGGER.info("Registering Mod Items for " + SensoryWizards.MOD_ID);
        // ABOVE IS A LOGGER THAT LOGS WHAT IS HAPPENING


        // BELOW IS ADDING THE TEST ITEM TO THE INGREDIENTS CREATIVE MODE TAB NOTE THIS IS WITHIN THE REGISTER MOD ITEMS CLASS
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(TEST_ITEM);
            // ABOVE IS ADDING THE TEST ITEM TO INGREDIENTS CREATIVE MODE TAB NOTE THIS IS WITHIN THE REGISTER MOD ITEMS CLASS

        });
    }





}
// NOTE THAT ADDING THINGS HERE DO NOT HAVE A NAME OR TEXTURE YOU NEED TO ADD THEM IN RESOURCES AND IN LANG FILE!