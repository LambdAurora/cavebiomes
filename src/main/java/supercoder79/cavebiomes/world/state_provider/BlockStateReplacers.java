package supercoder79.cavebiomes.world.state_provider;

import net.minecraft.block.Blocks;
import net.minecraft.tag.BlockTags;

public final class BlockStateReplacers {
    public static final BlockStateReplacer COBBLE_STATE_REPLACER = (world, random, pos, current) -> {
        if (current.isIn(BlockTags.STONE_ORE_REPLACEABLES)) {
            return Blocks.COBBLESTONE.getDefaultState();
        } else if (current.isIn(BlockTags.DEEPSLATE_ORE_REPLACEABLES)) {
            return Blocks.COBBLED_DEEPSLATE.getDefaultState();
        }
        return null;
    };

    public static final BlockStateReplacer COAL_ORE_STATE_REPLACER = (world, random, pos, current) -> {
        if (current.isIn(BlockTags.STONE_ORE_REPLACEABLES)) {
            return Blocks.COAL_ORE.getDefaultState();
        } else if (current.isIn(BlockTags.DEEPSLATE_ORE_REPLACEABLES)) {
            return Blocks.DEEPSLATE_COAL_ORE.getDefaultState();
        }
        return null;
    };

    public static final BlockStateReplacer IRON_ORE_STATE_REPLACER = (world, random, pos, current) -> {
        if (current.isIn(BlockTags.STONE_ORE_REPLACEABLES)) {
            return Blocks.IRON_ORE.getDefaultState();
        } else if (current.isIn(BlockTags.DEEPSLATE_ORE_REPLACEABLES)) {
            return Blocks.DEEPSLATE_IRON_ORE.getDefaultState();
        }
        return null;
    };

    public static final BlockStateReplacer GOLD_ORE_STATE_REPLACER = (world, random, pos, current) -> {
        if (current.isIn(BlockTags.STONE_ORE_REPLACEABLES)) {
            return Blocks.GOLD_ORE.getDefaultState();
        } else if (current.isIn(BlockTags.DEEPSLATE_ORE_REPLACEABLES)) {
            return Blocks.DEEPSLATE_GOLD_ORE.getDefaultState();
        }
        return null;
    };

    public static final BlockStateReplacer REDSTONE_ORE_STATE_REPLACER = (world, random, pos, current) -> {
        if (current.isIn(BlockTags.STONE_ORE_REPLACEABLES)) {
            return Blocks.REDSTONE_ORE.getDefaultState();
        } else if (current.isIn(BlockTags.DEEPSLATE_ORE_REPLACEABLES)) {
            return Blocks.DEEPSLATE_REDSTONE_ORE.getDefaultState();
        }
        return null;
    };

    public static final BlockStateReplacer LAPIS_ORE_STATE_REPLACER = (world, random, pos, current) -> {
        if (current.isIn(BlockTags.STONE_ORE_REPLACEABLES)) {
            return Blocks.LAPIS_ORE.getDefaultState();
        } else if (current.isIn(BlockTags.DEEPSLATE_ORE_REPLACEABLES)) {
            return Blocks.DEEPSLATE_LAPIS_ORE.getDefaultState();
        }
        return null;
    };

    public static final BlockStateReplacer EMERALD_ORE_STATE_REPLACER = (world, random, pos, current) -> {
        if (current.isIn(BlockTags.STONE_ORE_REPLACEABLES)) {
            return Blocks.EMERALD_ORE.getDefaultState();
        } else if (current.isIn(BlockTags.DEEPSLATE_ORE_REPLACEABLES)) {
            return Blocks.DEEPSLATE_EMERALD_ORE.getDefaultState();
        }
        return null;
    };

    public static final BlockStateReplacer DIAMOND_ORE_STATE_REPLACER = (world, random, pos, current) -> {
        if (current.isIn(BlockTags.STONE_ORE_REPLACEABLES)) {
            return Blocks.DIAMOND_ORE.getDefaultState();
        } else if (current.isIn(BlockTags.DEEPSLATE_ORE_REPLACEABLES)) {
            return Blocks.DEEPSLATE_DIAMOND_ORE.getDefaultState();
        }
        return null;
    };
}
