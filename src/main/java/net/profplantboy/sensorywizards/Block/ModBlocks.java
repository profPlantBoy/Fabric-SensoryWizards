package net.profplantboy.sensorywizards.Block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.profplantboy.sensorywizards.SensoryWizards;

public class ModBlocks {

// TO REGISTER BLOCKS YOU HAVE TO REGISTER BOTH THE BLOCK AND THE ITEM THAT IS ASSOCIATED WITH IT!


    //BELOW IS THE REGISTERING A BLOCK FOR THIS REGISTERING MAPLE LOG BLOCK!




    public static final Block MAPLE_LOG_BLOCK = registerBlock("maple_log_block",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block STRIPPED_MAPLE_LOG_BLOCK = registerBlock("stripped_maple_log_block",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAPLE_PLANKS = registerBlock("maple_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAPLE_STAIRS = registerBlock("maple_stairs",
            new StairsBlock(MAPLE_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAPLE_SLAB = registerBlock("maple_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));




    public static final Block ASH_LOG_BLOCK = registerBlock("ash_log_block",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block STRIPPED_ASH_LOG_BLOCK = registerBlock("stripped_ash_log_block",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block ASH_PLANKS = registerBlock("ash_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));
    public static final Block ASH_STAIRS = registerBlock("ash_stairs",
            new StairsBlock(ASH_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));
    public static final Block ASH_SLAB = registerBlock("ash_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));





    public static final Block WALNUT_LOG_BLOCK = registerBlock("walnut_log_block",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block STRIPPED_WALNUT_LOG_BLOCK = registerBlock("stripped_walnut_log_block",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WALNUT_PLANKS = registerBlock("walnut_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WALNUT_STAIRS = registerBlock("walnut_stairs",
            new StairsBlock(WALNUT_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WALNUT_SLAB = registerBlock("walnut_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));





    public static final Block BEECH_LOG_BLOCK = registerBlock("beech_log_block",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block STRIPPED_BEECH_LOG_BLOCK = registerBlock("stripped_beech_log_block",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BEECH_PLANKS = registerBlock("beech_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BEECH_STAIRS = registerBlock("beech_stairs",
            new StairsBlock(BEECH_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BEECH_SLAB = registerBlock("beech_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));





    public static final Block MAHOGANY_LOG_BLOCK = registerBlock("mahogany_log_block",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block STRIPPED_MAHOGANY_LOG_BLOCK = registerBlock("stripped_mahogany_log_block",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAHOGANY_PLANKS = registerBlock("mahogany_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAHOGANY_STAIRS = registerBlock("mahogany_stairs",
            new StairsBlock(MAHOGANY_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));
    public static final Block MAHOGANY_SLAB = registerBlock("mahogany_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));





    public static final Block YEW_LOG_BLOCK = registerBlock("yew_log_block",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block STRIPPED_YEW_LOG_BLOCK = registerBlock("stripped_yew_log_block",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block YEW_PLANKS = registerBlock("yew_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));
    public static final Block YEW_STAIRS = registerBlock("yew_stairs",
            new StairsBlock(YEW_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));
    public static final Block YEW_SLAB = registerBlock("yew_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));






    public static final Block WILLOW_LOG_BLOCK = registerBlock("willow_log_block",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block STRIPPED_WILLOW_LOG_BLOCK = registerBlock("stripped_willow_log_block",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WILLOW_PLANKS = registerBlock("willow_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WILLOW_STAIRS = registerBlock("willow_stairs",
            new StairsBlock(WILLOW_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));
    public static final Block WILLOW_SLAB = registerBlock("willow_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));





    public static final Block HAWTHORNE_LOG_BLOCK = registerBlock("hawthorne_log_block",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block STRIPPED_HAWTHORNE_LOG_BLOCK = registerBlock("stripped_hawthorne_log_block",
            new PillarBlock(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block HAWTHORNE_PLANKS = registerBlock("hawthorne_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));
    public static final Block HAWTHORNE_STAIRS = registerBlock("hawthorne_stairs",
            new StairsBlock(HAWTHORNE_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));
    public static final Block HAWTHORNE_SLAB = registerBlock("hawthorne_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD)));







// BELOW IS THE HELPER METHOD TO REGISTER A BLOCK
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SensoryWizards.MOD_ID, name), block);
    }
// ABOVE IS THE HELPER METHOD TO REGISTER A BLOCK



// BELOW IS THE HELPER METHOD TO REGISTER A BLOCK ITEM
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(SensoryWizards.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
// ABOVE IS THE HELPER METHOD TO REGISTER A BLOCK ITEM

    //BELOW IS LOGGING THE STARTUP OF THE MODBLOCKS REGISTRY
    public static void registerModBlocks() {
        SensoryWizards.LOGGER.info("Registering Mod Blocks! " + SensoryWizards.MOD_ID);

// BELOW IS HOW TO ADD THE BLOCKS TO A CREATIVE TAB!
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
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
            entries.add(ModBlocks.MAPLE_STAIRS);
            entries.add(ModBlocks.ASH_STAIRS);
            entries.add(ModBlocks.WALNUT_STAIRS);
            entries.add(ModBlocks.BEECH_STAIRS);
            entries.add(ModBlocks.MAHOGANY_STAIRS);
            entries.add(ModBlocks.YEW_STAIRS);
            entries.add(ModBlocks.WILLOW_STAIRS);
            entries.add(ModBlocks.HAWTHORNE_STAIRS);
            entries.add(ModBlocks.MAPLE_SLAB);
            entries.add(ModBlocks.ASH_SLAB);
            entries.add(ModBlocks.WALNUT_SLAB);
            entries.add(ModBlocks.BEECH_SLAB);
            entries.add(ModBlocks.MAHOGANY_SLAB);
            entries.add(ModBlocks.YEW_SLAB);
            entries.add(ModBlocks.WILLOW_SLAB);
            entries.add(ModBlocks.HAWTHORNE_SLAB);
        });

        StrippableBlockRegistry.register(ASH_LOG_BLOCK, STRIPPED_ASH_LOG_BLOCK);
        StrippableBlockRegistry.register(MAPLE_LOG_BLOCK, STRIPPED_MAPLE_LOG_BLOCK);
        StrippableBlockRegistry.register(WALNUT_LOG_BLOCK, STRIPPED_WALNUT_LOG_BLOCK);
        StrippableBlockRegistry.register(BEECH_LOG_BLOCK, STRIPPED_BEECH_LOG_BLOCK);
        StrippableBlockRegistry.register(MAHOGANY_LOG_BLOCK, STRIPPED_MAHOGANY_LOG_BLOCK);
        StrippableBlockRegistry.register(YEW_LOG_BLOCK, STRIPPED_YEW_LOG_BLOCK);
        StrippableBlockRegistry.register(WILLOW_LOG_BLOCK, STRIPPED_WILLOW_LOG_BLOCK);
        StrippableBlockRegistry.register(HAWTHORNE_LOG_BLOCK, STRIPPED_HAWTHORNE_LOG_BLOCK);





    }
}
