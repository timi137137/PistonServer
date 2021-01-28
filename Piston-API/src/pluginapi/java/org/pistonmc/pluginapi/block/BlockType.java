package org.pistonmc.pluginapi.block;

import org.pistonmc.pluginapi.Types;

import java.util.function.Supplier;

public enum BlockType implements Types.BlockType {
    AIR,
    STONE,
    GRANITE,
    POLISHED_GRANITE,
    DIORITE,
    POLISHED_DIORITE,
    ANDESITE,
    POLISHED_ANDESITE,
    GRASS_BLOCK,
    DIRT,
    COARSE_DIRT,
    PODZOL,
    COBBLESTONE,
    OAK_PLANKS,
    SPRUCE_PLANKS,
    BIRCH_PLANKS,
    JUNGLE_PLANKS,
    ACACIA_PLANKS,
    DARK_OAK_PLANKS,
    OAK_SAPLING,
    SPRUCE_SAPLING,
    BIRCH_SAPLING,
    JUNGLE_SAPLING,
    ACACIA_SAPLING,
    DARK_OAK_SAPLING,
    BEDROCK,
    WATER,
    LAVA,
    SAND,
    RED_SAND,
    GRAVEL,
    GOLD_ORE,
    IRON_ORE,
    COAL_ORE,
    NETHER_GOLD_ORE,
    OAK_LOG,
    SPRUCE_LOG,
    BIRCH_LOG,
    JUNGLE_LOG,
    ACACIA_LOG,
    DARK_OAK_LOG,
    STRIPPED_SPRUCE_LOG,
    STRIPPED_BIRCH_LOG,
    STRIPPED_JUNGLE_LOG,
    STRIPPED_ACACIA_LOG,
    STRIPPED_DARK_OAK_LOG,
    STRIPPED_OAK_LOG,
    OAK_WOOD,
    SPRUCE_WOOD,
    BIRCH_WOOD,
    JUNGLE_WOOD,
    ACACIA_WOOD,
    DARK_OAK_WOOD,
    STRIPPED_OAK_WOOD,
    STRIPPED_SPRUCE_WOOD,
    STRIPPED_BIRCH_WOOD,
    STRIPPED_JUNGLE_WOOD,
    STRIPPED_ACACIA_WOOD,
    STRIPPED_DARK_OAK_WOOD,
    OAK_LEAVES,
    SPRUCE_LEAVES,
    BIRCH_LEAVES,
    JUNGLE_LEAVES,
    ACACIA_LEAVES,
    DARK_OAK_LEAVES,
    SPONGE,
    WET_SPONGE,
    GLASS,
    LAPIS_ORE,
    LAPIS_BLOCK,
    DISPENSER,
    SANDSTONE,
    CHISELED_SANDSTONE,
    CUT_SANDSTONE,
    NOTE_BLOCK,
    WHITE_BED,
    ORANGE_BED,
    MAGENTA_BED,
    LIGHT_BLUE_BED,
    YELLOW_BED,
    LIME_BED,
    PINK_BED,
    GRAY_BED,
    LIGHT_GRAY_BED,
    CYAN_BED,
    PURPLE_BED,
    BLUE_BED,
    BROWN_BED,
    GREEN_BED,
    RED_BED,
    BLACK_BED,
    POWERED_RAIL,
    DETECTOR_RAIL,
    STICKY_PISTON,
    COBWEB,
    GRASS,
    FERN,
    DEAD_BUSH,
    SEAGRASS,
    TALL_SEAGRASS,
    PISTON,
    PISTON_HEAD,
    WHITE_WOOL,
    ORANGE_WOOL,
    MAGENTA_WOOL,
    LIGHT_BLUE_WOOL,
    YELLOW_WOOL,
    LIME_WOOL,
    PINK_WOOL,
    GRAY_WOOL,
    LIGHT_GRAY_WOOL,
    CYAN_WOOL,
    PURPLE_WOOL,
    BLUE_WOOL,
    BROWN_WOOL,
    GREEN_WOOL,
    RED_WOOL,
    BLACK_WOOL,
    MOVING_PISTON,
    DANDELION,
    POPPY,
    BLUE_ORCHID,
    ALLIUM,
    AZURE_BLUET,
    RED_TULIP,
    ORANGE_TULIP,
    WHITE_TULIP,
    PINK_TULIP,
    OXEYE_DAISY,
    CORNFLOWER,
    WITHER_ROSE,
    LILY_OF_THE_VALLEY,
    BROWN_MUSHROOM,
    RED_MUSHROOM,
    GOLD_BLOCK,
    IRON_BLOCK,
    BRICKS,
    TNT,
    BOOKSHELF,
    MOSSY_COBBLESTONE,
    OBSIDIAN,
    TORCH,
    WALL_TORCH,
    FIRE,
    SOUL_FIRE,
    SPAWNER,
    OAK_STAIRS,
    CHEST,
    REDSTONE_WIRE,
    DIAMOND_ORE,
    DIAMOND_BLOCK,
    CRAFTING_TABLE,
    WHEAT,
    FARMLAND,
    FURNACE,
    OAK_SIGN,
    SPRUCE_SIGN,
    BIRCH_SIGN,
    ACACIA_SIGN,
    JUNGLE_SIGN,
    DARK_OAK_SIGN,
    OAK_DOOR,
    LADDER,
    RAIL,
    COBBLESTONE_STAIRS,
    OAK_WALL_SIGN,
    SPRUCE_WALL_SIGN,
    BIRCH_WALL_SIGN,
    ACACIA_WALL_SIGN,
    JUNGLE_WALL_SIGN,
    DARK_OAK_WALL_SIGN,
    LEVER,
    STONE_PRESSURE_PLATE,
    IRON_DOOR,
    OAK_PRESSURE_PLATE,
    SPRUCE_PRESSURE_PLATE,
    BIRCH_PRESSURE_PLATE,
    JUNGLE_PRESSURE_PLATE,
    ACACIA_PRESSURE_PLATE,
    DARK_OAK_PRESSURE_PLATE,
    REDSTONE_ORE,
    REDSTONE_TORCH,
    REDSTONE_WALL_TORCH,
    STONE_BUTTON,
    SNOW,
    ICE,
    SNOW_BLOCK,
    CACTUS,
    CLAY,
    SUGAR_CANE,
    JUKEBOX,
    OAK_FENCE,
    PUMPKIN,
    NETHERRACK,
    SOUL_SAND,
    SOUL_SOIL,
    BASALT,
    POLISHED_BASALT,
    SOUL_TORCH,
    SOUL_WALL_TORCH,
    GLOWSTONE,
    NETHER_PORTAL,
    CARVED_PUMPKIN,
    JACK_O_LANTERN,
    CAKE,
    REPEATER,
    WHITE_STAINED_GLASS,
    ORANGE_STAINED_GLASS,
    MAGENTA_STAINED_GLASS,
    LIGHT_BLUE_STAINED_GLASS,
    YELLOW_STAINED_GLASS,
    LIME_STAINED_GLASS,
    PINK_STAINED_GLASS,
    GRAY_STAINED_GLASS,
    LIGHT_GRAY_STAINED_GLASS,
    CYAN_STAINED_GLASS,
    PURPLE_STAINED_GLASS,
    BLUE_STAINED_GLASS,
    BROWN_STAINED_GLASS,
    GREEN_STAINED_GLASS,
    RED_STAINED_GLASS,
    BLACK_STAINED_GLASS,
    OAK_TRAPDOOR,
    SPRUCE_TRAPDOOR,
    BIRCH_TRAPDOOR,
    JUNGLE_TRAPDOOR,
    ACACIA_TRAPDOOR,
    DARK_OAK_TRAPDOOR,
    STONE_BRICKS,
    MOSSY_STONE_BRICKS,
    CRACKED_STONE_BRICKS,
    CHISELED_STONE_BRICKS,
    INFESTED_STONE,
    INFESTED_COBBLESTONE,
    INFESTED_STONE_BRICKS,
    INFESTED_MOSSY_STONE_BRICKS,
    INFESTED_CRACKED_STONE_BRICKS,
    INFESTED_CHISELED_STONE_BRICKS,
    BROWN_MUSHROOM_BLOCK,
    RED_MUSHROOM_BLOCK,
    MUSHROOM_STEM,
    IRON_BARS,
    CHAIN,
    GLASS_PANE,
    MELON,
    ATTACHED_PUMPKIN_STEM,
    ATTACHED_MELON_STEM,
    PUMPKIN_STEM,
    MELON_STEM,
    VINE,
    OAK_FENCE_GATE,
    BRICK_STAIRS,
    STONE_BRICK_STAIRS,
    MYCELIUM,
    LILY_PAD,
    NETHER_BRICKS,
    NETHER_BRICK_FENCE,
    NETHER_BRICK_STAIRS,
    NETHER_WART,
    ENCHANTING_TABLE,
    BREWING_STAND,
    CAULDRON,
    WATER_CAULDRON,
    LAVA_CAULDRON,
    POWDER_SNOW_CAULDRON,
    END_PORTAL,
    END_PORTAL_FRAME,
    END_STONE,
    DRAGON_EGG,
    REDSTONE_LAMP,
    COCOA,
    SANDSTONE_STAIRS,
    EMERALD_ORE,
    ENDER_CHEST,
    TRIPWIRE_HOOK,
    TRIPWIRE,
    EMERALD_BLOCK,
    SPRUCE_STAIRS,
    BIRCH_STAIRS,
    JUNGLE_STAIRS,
    COMMAND_BLOCK,
    BEACON,
    COBBLESTONE_WALL,
    MOSSY_COBBLESTONE_WALL,
    FLOWER_POT,
    POTTED_OAK_SAPLING,
    POTTED_SPRUCE_SAPLING,
    POTTED_BIRCH_SAPLING,
    POTTED_JUNGLE_SAPLING,
    POTTED_ACACIA_SAPLING,
    POTTED_DARK_OAK_SAPLING,
    POTTED_FERN,
    POTTED_DANDELION,
    POTTED_POPPY,
    POTTED_BLUE_ORCHID,
    POTTED_ALLIUM,
    POTTED_AZURE_BLUET,
    POTTED_RED_TULIP,
    POTTED_ORANGE_TULIP,
    POTTED_WHITE_TULIP,
    POTTED_PINK_TULIP,
    POTTED_OXEYE_DAISY,
    POTTED_CORNFLOWER,
    POTTED_LILY_OF_THE_VALLEY,
    POTTED_WITHER_ROSE,
    POTTED_RED_MUSHROOM,
    POTTED_BROWN_MUSHROOM,
    POTTED_DEAD_BUSH,
    POTTED_CACTUS,
    CARROTS,
    POTATOES,
    OAK_BUTTON,
    SPRUCE_BUTTON,
    BIRCH_BUTTON,
    JUNGLE_BUTTON,
    ACACIA_BUTTON,
    DARK_OAK_BUTTON,
    SKELETON_SKULL,
    SKELETON_WALL_SKULL,
    WITHER_SKELETON_SKULL,
    WITHER_SKELETON_WALL_SKULL,
    ZOMBIE_HEAD,
    ZOMBIE_WALL_HEAD,
    PLAYER_HEAD,
    PLAYER_WALL_HEAD,
    CREEPER_HEAD,
    CREEPER_WALL_HEAD,
    DRAGON_HEAD,
    DRAGON_WALL_HEAD,
    ANVIL,
    CHIPPED_ANVIL,
    DAMAGED_ANVIL,
    TRAPPED_CHEST,
    LIGHT_WEIGHTED_PRESSURE_PLATE,
    HEAVY_WEIGHTED_PRESSURE_PLATE,
    COMPARATOR,
    DAYLIGHT_DETECTOR,
    REDSTONE_BLOCK,
    NETHER_QUARTZ_ORE,
    HOPPER,
    QUARTZ_BLOCK,
    CHISELED_QUARTZ_BLOCK,
    QUARTZ_PILLAR,
    QUARTZ_STAIRS,
    ACTIVATOR_RAIL,
    DROPPER,
    WHITE_TERRACOTTA,
    ORANGE_TERRACOTTA,
    MAGENTA_TERRACOTTA,
    LIGHT_BLUE_TERRACOTTA,
    YELLOW_TERRACOTTA,
    LIME_TERRACOTTA,
    PINK_TERRACOTTA,
    GRAY_TERRACOTTA,
    LIGHT_GRAY_TERRACOTTA,
    CYAN_TERRACOTTA,
    PURPLE_TERRACOTTA,
    BLUE_TERRACOTTA,
    BROWN_TERRACOTTA,
    GREEN_TERRACOTTA,
    RED_TERRACOTTA,
    BLACK_TERRACOTTA,
    WHITE_STAINED_GLASS_PANE,
    ORANGE_STAINED_GLASS_PANE,
    MAGENTA_STAINED_GLASS_PANE,
    LIGHT_BLUE_STAINED_GLASS_PANE,
    YELLOW_STAINED_GLASS_PANE,
    LIME_STAINED_GLASS_PANE,
    PINK_STAINED_GLASS_PANE,
    GRAY_STAINED_GLASS_PANE,
    LIGHT_GRAY_STAINED_GLASS_PANE,
    CYAN_STAINED_GLASS_PANE,
    PURPLE_STAINED_GLASS_PANE,
    BLUE_STAINED_GLASS_PANE,
    BROWN_STAINED_GLASS_PANE,
    GREEN_STAINED_GLASS_PANE,
    RED_STAINED_GLASS_PANE,
    BLACK_STAINED_GLASS_PANE,
    ACACIA_STAIRS,
    DARK_OAK_STAIRS,
    SLIME_BLOCK,
    BARRIER,
    IRON_TRAPDOOR,
    PRISMARINE,
    PRISMARINE_BRICKS,
    DARK_PRISMARINE,
    PRISMARINE_STAIRS,
    PRISMARINE_BRICK_STAIRS,
    DARK_PRISMARINE_STAIRS,
    PRISMARINE_SLAB,
    PRISMARINE_BRICK_SLAB,
    DARK_PRISMARINE_SLAB,
    SEA_LANTERN,
    HAY_BLOCK,
    WHITE_CARPET,
    ORANGE_CARPET,
    MAGENTA_CARPET,
    LIGHT_BLUE_CARPET,
    YELLOW_CARPET,
    LIME_CARPET,
    PINK_CARPET,
    GRAY_CARPET,
    LIGHT_GRAY_CARPET,
    CYAN_CARPET,
    PURPLE_CARPET,
    BLUE_CARPET,
    BROWN_CARPET,
    GREEN_CARPET,
    RED_CARPET,
    BLACK_CARPET,
    TERRACOTTA,
    COAL_BLOCK,
    PACKED_ICE,
    SUNFLOWER,
    LILAC,
    ROSE_BUSH,
    PEONY,
    TALL_GRASS,
    LARGE_FERN,
    WHITE_BANNER,
    ORANGE_BANNER,
    MAGENTA_BANNER,
    LIGHT_BLUE_BANNER,
    YELLOW_BANNER,
    LIME_BANNER,
    PINK_BANNER,
    GRAY_BANNER,
    LIGHT_GRAY_BANNER,
    CYAN_BANNER,
    PURPLE_BANNER,
    BLUE_BANNER,
    BROWN_BANNER,
    GREEN_BANNER,
    RED_BANNER,
    BLACK_BANNER,
    WHITE_WALL_BANNER,
    ORANGE_WALL_BANNER,
    MAGENTA_WALL_BANNER,
    LIGHT_BLUE_WALL_BANNER,
    YELLOW_WALL_BANNER,
    LIME_WALL_BANNER,
    PINK_WALL_BANNER,
    GRAY_WALL_BANNER,
    LIGHT_GRAY_WALL_BANNER,
    CYAN_WALL_BANNER,
    PURPLE_WALL_BANNER,
    BLUE_WALL_BANNER,
    BROWN_WALL_BANNER,
    GREEN_WALL_BANNER,
    RED_WALL_BANNER,
    BLACK_WALL_BANNER,
    RED_SANDSTONE,
    CHISELED_RED_SANDSTONE,
    CUT_RED_SANDSTONE,
    RED_SANDSTONE_STAIRS,
    OAK_SLAB,
    SPRUCE_SLAB,
    BIRCH_SLAB,
    JUNGLE_SLAB,
    ACACIA_SLAB,
    DARK_OAK_SLAB,
    STONE_SLAB,
    SMOOTH_STONE_SLAB,
    SANDSTONE_SLAB,
    CUT_SANDSTONE_SLAB,
    PETRIFIED_OAK_SLAB,
    COBBLESTONE_SLAB,
    BRICK_SLAB,
    STONE_BRICK_SLAB,
    NETHER_BRICK_SLAB,
    QUARTZ_SLAB,
    RED_SANDSTONE_SLAB,
    CUT_RED_SANDSTONE_SLAB,
    PURPUR_SLAB,
    SMOOTH_STONE,
    SMOOTH_SANDSTONE,
    SMOOTH_QUARTZ,
    SMOOTH_RED_SANDSTONE,
    SPRUCE_FENCE_GATE,
    BIRCH_FENCE_GATE,
    JUNGLE_FENCE_GATE,
    ACACIA_FENCE_GATE,
    DARK_OAK_FENCE_GATE,
    SPRUCE_FENCE,
    BIRCH_FENCE,
    JUNGLE_FENCE,
    ACACIA_FENCE,
    DARK_OAK_FENCE,
    SPRUCE_DOOR,
    BIRCH_DOOR,
    JUNGLE_DOOR,
    ACACIA_DOOR,
    DARK_OAK_DOOR,
    END_ROD,
    CHORUS_PLANT,
    CHORUS_FLOWER,
    PURPUR_BLOCK,
    PURPUR_PILLAR,
    PURPUR_STAIRS,
    END_STONE_BRICKS,
    BEETROOTS,
    DIRT_PATH,
    END_GATEWAY,
    REPEATING_COMMAND_BLOCK,
    CHAIN_COMMAND_BLOCK,
    FROSTED_ICE,
    MAGMA_BLOCK,
    NETHER_WART_BLOCK,
    RED_NETHER_BRICKS,
    BONE_BLOCK,
    STRUCTURE_VOID,
    OBSERVER,
    SHULKER_BOX,
    WHITE_SHULKER_BOX,
    ORANGE_SHULKER_BOX,
    MAGENTA_SHULKER_BOX,
    LIGHT_BLUE_SHULKER_BOX,
    YELLOW_SHULKER_BOX,
    LIME_SHULKER_BOX,
    PINK_SHULKER_BOX,
    GRAY_SHULKER_BOX,
    LIGHT_GRAY_SHULKER_BOX,
    CYAN_SHULKER_BOX,
    PURPLE_SHULKER_BOX,
    BLUE_SHULKER_BOX,
    BROWN_SHULKER_BOX,
    GREEN_SHULKER_BOX,
    RED_SHULKER_BOX,
    BLACK_SHULKER_BOX,
    WHITE_GLAZED_TERRACOTTA,
    ORANGE_GLAZED_TERRACOTTA,
    MAGENTA_GLAZED_TERRACOTTA,
    LIGHT_BLUE_GLAZED_TERRACOTTA,
    YELLOW_GLAZED_TERRACOTTA,
    LIME_GLAZED_TERRACOTTA,
    PINK_GLAZED_TERRACOTTA,
    GRAY_GLAZED_TERRACOTTA,
    LIGHT_GRAY_GLAZED_TERRACOTTA,
    CYAN_GLAZED_TERRACOTTA,
    PURPLE_GLAZED_TERRACOTTA,
    BLUE_GLAZED_TERRACOTTA,
    BROWN_GLAZED_TERRACOTTA,
    GREEN_GLAZED_TERRACOTTA,
    RED_GLAZED_TERRACOTTA,
    BLACK_GLAZED_TERRACOTTA,
    WHITE_CONCRETE,
    ORANGE_CONCRETE,
    MAGENTA_CONCRETE,
    LIGHT_BLUE_CONCRETE,
    YELLOW_CONCRETE,
    LIME_CONCRETE,
    PINK_CONCRETE,
    GRAY_CONCRETE,
    LIGHT_GRAY_CONCRETE,
    CYAN_CONCRETE,
    PURPLE_CONCRETE,
    BLUE_CONCRETE,
    BROWN_CONCRETE,
    GREEN_CONCRETE,
    RED_CONCRETE,
    BLACK_CONCRETE,
    WHITE_CONCRETE_POWDER,
    ORANGE_CONCRETE_POWDER,
    MAGENTA_CONCRETE_POWDER,
    LIGHT_BLUE_CONCRETE_POWDER,
    YELLOW_CONCRETE_POWDER,
    LIME_CONCRETE_POWDER,
    PINK_CONCRETE_POWDER,
    GRAY_CONCRETE_POWDER,
    LIGHT_GRAY_CONCRETE_POWDER,
    CYAN_CONCRETE_POWDER,
    PURPLE_CONCRETE_POWDER,
    BLUE_CONCRETE_POWDER,
    BROWN_CONCRETE_POWDER,
    GREEN_CONCRETE_POWDER,
    RED_CONCRETE_POWDER,
    BLACK_CONCRETE_POWDER,
    KELP,
    KELP_PLANT,
    DRIED_KELP_BLOCK,
    TURTLE_EGG,
    DEAD_TUBE_CORAL_BLOCK,
    DEAD_BRAIN_CORAL_BLOCK,
    DEAD_BUBBLE_CORAL_BLOCK,
    DEAD_FIRE_CORAL_BLOCK,
    DEAD_HORN_CORAL_BLOCK,
    TUBE_CORAL_BLOCK,
    BRAIN_CORAL_BLOCK,
    BUBBLE_CORAL_BLOCK,
    FIRE_CORAL_BLOCK,
    HORN_CORAL_BLOCK,
    DEAD_TUBE_CORAL,
    DEAD_BRAIN_CORAL,
    DEAD_BUBBLE_CORAL,
    DEAD_FIRE_CORAL,
    DEAD_HORN_CORAL,
    TUBE_CORAL,
    BRAIN_CORAL,
    BUBBLE_CORAL,
    FIRE_CORAL,
    HORN_CORAL,
    DEAD_TUBE_CORAL_FAN,
    DEAD_BRAIN_CORAL_FAN,
    DEAD_BUBBLE_CORAL_FAN,
    DEAD_FIRE_CORAL_FAN,
    DEAD_HORN_CORAL_FAN,
    TUBE_CORAL_FAN,
    BRAIN_CORAL_FAN,
    BUBBLE_CORAL_FAN,
    FIRE_CORAL_FAN,
    HORN_CORAL_FAN,
    DEAD_TUBE_CORAL_WALL_FAN,
    DEAD_BRAIN_CORAL_WALL_FAN,
    DEAD_BUBBLE_CORAL_WALL_FAN,
    DEAD_FIRE_CORAL_WALL_FAN,
    DEAD_HORN_CORAL_WALL_FAN,
    TUBE_CORAL_WALL_FAN,
    BRAIN_CORAL_WALL_FAN,
    BUBBLE_CORAL_WALL_FAN,
    FIRE_CORAL_WALL_FAN,
    HORN_CORAL_WALL_FAN,
    SEA_PICKLE,
    BLUE_ICE,
    CONDUIT,
    BAMBOO_SAPLING,
    BAMBOO,
    POTTED_BAMBOO,
    VOID_AIR,
    CAVE_AIR,
    BUBBLE_COLUMN,
    POLISHED_GRANITE_STAIRS,
    SMOOTH_RED_SANDSTONE_STAIRS,
    MOSSY_STONE_BRICK_STAIRS,
    POLISHED_DIORITE_STAIRS,
    MOSSY_COBBLESTONE_STAIRS,
    END_STONE_BRICK_STAIRS,
    STONE_STAIRS,
    SMOOTH_SANDSTONE_STAIRS,
    SMOOTH_QUARTZ_STAIRS,
    GRANITE_STAIRS,
    ANDESITE_STAIRS,
    RED_NETHER_BRICK_STAIRS,
    POLISHED_ANDESITE_STAIRS,
    DIORITE_STAIRS,
    POLISHED_GRANITE_SLAB,
    SMOOTH_RED_SANDSTONE_SLAB,
    MOSSY_STONE_BRICK_SLAB,
    POLISHED_DIORITE_SLAB,
    MOSSY_COBBLESTONE_SLAB,
    END_STONE_BRICK_SLAB,
    SMOOTH_SANDSTONE_SLAB,
    SMOOTH_QUARTZ_SLAB,
    GRANITE_SLAB,
    ANDESITE_SLAB,
    RED_NETHER_BRICK_SLAB,
    POLISHED_ANDESITE_SLAB,
    DIORITE_SLAB,
    BRICK_WALL,
    PRISMARINE_WALL,
    RED_SANDSTONE_WALL,
    MOSSY_STONE_BRICK_WALL,
    GRANITE_WALL,
    STONE_BRICK_WALL,
    NETHER_BRICK_WALL,
    ANDESITE_WALL,
    RED_NETHER_BRICK_WALL,
    SANDSTONE_WALL,
    END_STONE_BRICK_WALL,
    DIORITE_WALL,
    SCAFFOLDING,
    LOOM,
    BARREL,
    SMOKER,
    BLAST_FURNACE,
    CARTOGRAPHY_TABLE,
    FLETCHING_TABLE,
    GRINDSTONE,
    LECTERN,
    SMITHING_TABLE,
    STONECUTTER,
    BELL,
    LANTERN,
    SOUL_LANTERN,
    CAMPFIRE,
    SOUL_CAMPFIRE,
    SWEET_BERRY_BUSH,
    WARPED_STEM,
    STRIPPED_WARPED_STEM,
    WARPED_HYPHAE,
    STRIPPED_WARPED_HYPHAE,
    WARPED_NYLIUM,
    WARPED_FUNGUS,
    WARPED_WART_BLOCK,
    WARPED_ROOTS,
    NETHER_SPROUTS,
    CRIMSON_STEM,
    STRIPPED_CRIMSON_STEM,
    CRIMSON_HYPHAE,
    STRIPPED_CRIMSON_HYPHAE,
    CRIMSON_NYLIUM,
    CRIMSON_FUNGUS,
    SHROOMLIGHT,
    WEEPING_VINES,
    WEEPING_VINES_PLANT,
    TWISTING_VINES,
    TWISTING_VINES_PLANT,
    CRIMSON_ROOTS,
    CRIMSON_PLANKS,
    WARPED_PLANKS,
    CRIMSON_SLAB,
    WARPED_SLAB,
    CRIMSON_PRESSURE_PLATE,
    WARPED_PRESSURE_PLATE,
    CRIMSON_FENCE,
    WARPED_FENCE,
    CRIMSON_TRAPDOOR,
    WARPED_TRAPDOOR,
    CRIMSON_FENCE_GATE,
    WARPED_FENCE_GATE,
    CRIMSON_STAIRS,
    WARPED_STAIRS,
    CRIMSON_BUTTON,
    WARPED_BUTTON,
    CRIMSON_DOOR,
    WARPED_DOOR,
    CRIMSON_SIGN,
    WARPED_SIGN,
    CRIMSON_WALL_SIGN,
    WARPED_WALL_SIGN,
    STRUCTURE_BLOCK,
    JIGSAW,
    COMPOSTER,
    TARGET,
    BEE_NEST,
    BEEHIVE,
    HONEY_BLOCK,
    HONEYCOMB_BLOCK,
    NETHERITE_BLOCK,
    ANCIENT_DEBRIS,
    CRYING_OBSIDIAN,
    RESPAWN_ANCHOR,
    POTTED_CRIMSON_FUNGUS,
    POTTED_WARPED_FUNGUS,
    POTTED_CRIMSON_ROOTS,
    POTTED_WARPED_ROOTS,
    LODESTONE,
    BLACKSTONE,
    BLACKSTONE_STAIRS,
    BLACKSTONE_WALL,
    BLACKSTONE_SLAB,
    POLISHED_BLACKSTONE,
    POLISHED_BLACKSTONE_BRICKS,
    CRACKED_POLISHED_BLACKSTONE_BRICKS,
    CHISELED_POLISHED_BLACKSTONE,
    POLISHED_BLACKSTONE_BRICK_SLAB,
    POLISHED_BLACKSTONE_BRICK_STAIRS,
    POLISHED_BLACKSTONE_BRICK_WALL,
    GILDED_BLACKSTONE,
    POLISHED_BLACKSTONE_STAIRS,
    POLISHED_BLACKSTONE_SLAB,
    POLISHED_BLACKSTONE_PRESSURE_PLATE,
    POLISHED_BLACKSTONE_BUTTON,
    POLISHED_BLACKSTONE_WALL,
    CHISELED_NETHER_BRICKS,
    CRACKED_NETHER_BRICKS,
    QUARTZ_BRICKS,
    CANDLE,
    WHITE_CANDLE,
    ORANGE_CANDLE,
    MAGENTA_CANDLE,
    LIGHT_BLUE_CANDLE,
    YELLOW_CANDLE,
    LIME_CANDLE,
    PINK_CANDLE,
    GRAY_CANDLE,
    LIGHT_GRAY_CANDLE,
    CYAN_CANDLE,
    PURPLE_CANDLE,
    BLUE_CANDLE,
    BROWN_CANDLE,
    GREEN_CANDLE,
    RED_CANDLE,
    BLACK_CANDLE,
    CANDLE_CAKE,
    WHITE_CANDLE_CAKE,
    ORANGE_CANDLE_CAKE,
    MAGENTA_CANDLE_CAKE,
    LIGHT_BLUE_CANDLE_CAKE,
    YELLOW_CANDLE_CAKE,
    LIME_CANDLE_CAKE,
    PINK_CANDLE_CAKE,
    GRAY_CANDLE_CAKE,
    LIGHT_GRAY_CANDLE_CAKE,
    CYAN_CANDLE_CAKE,
    PURPLE_CANDLE_CAKE,
    BLUE_CANDLE_CAKE,
    BROWN_CANDLE_CAKE,
    GREEN_CANDLE_CAKE,
    RED_CANDLE_CAKE,
    BLACK_CANDLE_CAKE,
    AMETHYST_BLOCK,
    BUDDING_AMETHYST,
    AMETHYST_CLUSTER,
    LARGE_AMETHYST_BUD,
    MEDIUM_AMETHYST_BUD,
    SMALL_AMETHYST_BUD,
    TUFF,
    CALCITE,
    TINTED_GLASS,
    POWDER_SNOW,
    SCULK_SENSOR,
    WEATHERED_COPPER_BLOCK,
    SEMI_WEATHERED_COPPER_BLOCK,
    LIGHTLY_WEATHERED_COPPER_BLOCK,
    COPPER_BLOCK,
    COPPER_ORE,
    WEATHERED_CUT_COPPER,
    SEMI_WEATHERED_CUT_COPPER,
    LIGHTLY_WEATHERED_CUT_COPPER,
    CUT_COPPER,
    WEATHERED_CUT_COPPER_STAIRS,
    SEMI_WEATHERED_CUT_COPPER_STAIRS,
    LIGHTLY_WEATHERED_CUT_COPPER_STAIRS,
    CUT_COPPER_STAIRS,
    WEATHERED_CUT_COPPER_SLAB,
    SEMI_WEATHERED_CUT_COPPER_SLAB,
    LIGHTLY_WEATHERED_CUT_COPPER_SLAB,
    CUT_COPPER_SLAB,
    WAXED_COPPER,
    WAXED_SEMI_WEATHERED_COPPER,
    WAXED_LIGHTLY_WEATHERED_COPPER,
    WAXED_SEMI_WEATHERED_CUT_COPPER,
    WAXED_LIGHTLY_WEATHERED_CUT_COPPER,
    WAXED_CUT_COPPER,
    WAXED_SEMI_WEATHERED_CUT_COPPER_STAIRS,
    WAXED_LIGHTLY_WEATHERED_CUT_COPPER_STAIRS,
    WAXED_CUT_COPPER_STAIRS,
    WAXED_SEMI_WEATHERED_CUT_COPPER_SLAB,
    WAXED_LIGHTLY_WEATHERED_CUT_COPPER_SLAB,
    WAXED_CUT_COPPER_SLAB,
    LIGHTNING_ROD,
    POINTED_DRIPSTONE,
    DRIPSTONE_BLOCK,
    GLOW_LICHEN;
    public enum ModBlockType implements Types.BlockType {
        FORGE,
        PISTON,
        FABRIC,
        UNKNOWN;
        private Supplier<Block> specificBlock;
        public void setSpecificBlock(Supplier<Block> specificBlock) {
            this.specificBlock = specificBlock;
        }
        public Block getSpecificBlock() {
            return specificBlock.get();
        }
    }
}
