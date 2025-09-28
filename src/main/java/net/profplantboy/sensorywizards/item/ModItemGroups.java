package net.profplantboy.sensorywizards.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.profplantboy.sensorywizards.Block.ModBlocks;
import net.profplantboy.sensorywizards.SensoryWizards;

public class ModItemGroups {

    public static final ItemGroup SENSORY_WIZARDS_MAIN_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SensoryWizards.MOD_ID, "sensory_wizards_main"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TEST_ITEM))
// ABOVE IF YOU CHANGE THE ModItems.TEST_ITEM YOU CAN CHANGE THE IMAGE FOR THE CREATIVE TAB!
                    .displayName(Text.translatable("itemgroup.sensorywizards.sensory_wizards_main"))
                    .entries((displayContext, entries) -> {
                        //THIS IS WHERE YOU ADD ENTRIES FOR THE CREATIVE TAB
                        entries.add(ModBlocks.MAPLE_LOG_BLOCK);
                        entries.add(ModBlocks.ASH_LOG_BLOCK);
                        entries.add(ModBlocks.WALNUT_LOG_BLOCK);
                        entries.add(ModBlocks.BEECH_LOG_BLOCK);
                        entries.add(ModBlocks.MAHOGANY_LOG_BLOCK);
                        entries.add(ModBlocks.YEW_LOG_BLOCK);
                        entries.add(ModBlocks.WILLOW_LOG_BLOCK);
                        entries.add(ModBlocks.HAWTHORNE_LOG_BLOCK);
                        entries.add(ModBlocks.STRIPPED_MAPLE_LOG_BLOCK);
                        entries.add(ModBlocks.STRIPPED_ASH_LOG_BLOCK);
                        entries.add(ModBlocks.STRIPPED_BEECH_LOG_BLOCK);
                        entries.add(ModBlocks.STRIPPED_HAWTHORNE_LOG_BLOCK);
                        entries.add(ModBlocks.STRIPPED_MAHOGANY_LOG_BLOCK);
                        entries.add(ModBlocks.STRIPPED_WILLOW_LOG_BLOCK);
                        entries.add(ModBlocks.STRIPPED_YEW_LOG_BLOCK);
                        entries.add(ModBlocks.STRIPPED_WALNUT_LOG_BLOCK);
                        entries.add(ModBlocks.MAPLE_PLANKS);
                        entries.add(ModBlocks.ASH_PLANKS);
                        entries.add(ModBlocks.WALNUT_PLANKS);
                        entries.add(ModBlocks.BEECH_PLANKS);
                        entries.add(ModBlocks.MAHOGANY_PLANKS);
                        entries.add(ModBlocks.YEW_PLANKS);
                        entries.add(ModBlocks.WILLOW_PLANKS);
                        entries.add(ModBlocks.HAWTHORNE_PLANKS);

                    }).build());








    public static void registerItemGroups() {
        SensoryWizards.LOGGER.info("Registering Item Groups for " + SensoryWizards.MOD_ID);
    }
}
