package supercoder79.cavebiomes.world.decorator;

import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import supercoder79.cavebiomes.CaveBiomes;
import supercoder79.cavebiomes.api.CaveDecorator;
import supercoder79.cavebiomes.world.state_provider.BlockStateReplacer;
import supercoder79.cavebiomes.world.state_provider.BlockStateReplacers;

public class CaveDecorators {
    //global
    public static final CaveDecorator NONE = new NoOpCaveDecorator();

    //upper
    public static final CaveDecorator ICE = new IceCaveDecorator();
    public static final CaveDecorator TAIGA = new TaigaCaveDecorator();
    public static final CaveDecorator DIRT_GRASS = new DirtGrassCaveDecorator();
    public static final CaveDecorator SWAMP = new JungleCaveDecorator(true, true, true);
    public static final CaveDecorator JUNGLE = new JungleCaveDecorator(true, false, true);
    public static final CaveDecorator SAND = new FloorStateCaveDecorator(Blocks.SAND.getDefaultState(), 3);
    public static final CaveDecorator RED_SAND = new FloorStateCaveDecorator(Blocks.RED_SAND.getDefaultState(), 3);

    //lower
    public static final CaveDecorator LAVA = new FluidCaveDecorator(Blocks.LAVA.getDefaultState(), 3);
    public static final CaveDecorator WATER = new FluidCaveDecorator(Blocks.WATER.getDefaultState(), 2);
    public static final CaveDecorator OVERGROWN = new OvergrownCaveDecorator();
    public static final CaveDecorator MUSHROOM = new MushroomCaveDecorator();
    public static final CaveDecorator COBWEB = new CobwebCaveDecorator();
    public static final CaveDecorator ANDESITE = new SingleBlockStateCaveDecorator(BlockStateReplacer.simple(Blocks.STONE, Blocks.ANDESITE.getDefaultState()));
    public static final CaveDecorator DIORITE = new SingleBlockStateCaveDecorator(BlockStateReplacer.simple(Blocks.STONE, Blocks.DIORITE.getDefaultState()));
    public static final CaveDecorator GRANITE = new SingleBlockStateCaveDecorator(BlockStateReplacer.simple(Blocks.STONE, Blocks.GRANITE.getDefaultState()));
    public static final CaveDecorator TUFF = new SingleBlockStateCaveDecorator(BlockStateReplacer.simple(Blocks.DEEPSLATE, Blocks.TUFF.getDefaultState()));
    public static final CaveDecorator FULL_OBSIDIAN = new SingleBlockStateCaveDecorator(BlockStateReplacer.simple(Blocks.DEEPSLATE, Blocks.OBSIDIAN.getDefaultState()));
    public static final CaveDecorator OBSIDIAN = new RandomBlockStateCaveDecorator(BlockStateReplacer.simple(Blocks.DEEPSLATE, Blocks.OBSIDIAN.getDefaultState()), 8);
    public static final CaveDecorator MAGMA = new RandomBlockStateCaveDecorator(BlockStateReplacer.simple(TagRegistry.block(CaveBiomes.id("magma_replaceable")), Blocks.MAGMA_BLOCK.getDefaultState()), 12);
    public static final CaveDecorator COBBLESTONE = new RandomBlockStateCaveDecorator(BlockStateReplacers.COBBLE_STATE_REPLACER, 6);
    public static final CaveDecorator GRAVEL = new FloorStateCaveDecorator(Blocks.GRAVEL.getDefaultState(), 3);
    public static final CaveDecorator SANDSTONE = new SandstoneCaveDecorator();

    //ore caves (lower)
    public static final CaveDecorator COAL = new RandomBlockStateCaveDecorator(BlockStateReplacers.COAL_ORE_STATE_REPLACER, 16);
    public static final CaveDecorator IRON = new RandomBlockStateCaveDecorator(BlockStateReplacers.IRON_ORE_STATE_REPLACER, 48);
    public static final CaveDecorator GOLD = new RandomBlockStateCaveDecorator(BlockStateReplacers.GOLD_ORE_STATE_REPLACER, 96);
    public static final CaveDecorator REDSTONE = new RandomBlockStateCaveDecorator(BlockStateReplacers.REDSTONE_ORE_STATE_REPLACER, 24);
    public static final CaveDecorator LAPIS = new RandomBlockStateCaveDecorator(BlockStateReplacers.LAPIS_ORE_STATE_REPLACER, 72);
    public static final CaveDecorator DIAMOND = new RandomBlockStateCaveDecorator(BlockStateReplacers.DIAMOND_ORE_STATE_REPLACER, 512);

    // Temp minecraft stuff
    public static final CaveDecorator DRIPSTONE = new DripstoneCaveDecorator();
    public static final CaveDecorator LUSH = new LushCaveDecorator();

    //TODO: honey cave
    //TODO: emerald
}
