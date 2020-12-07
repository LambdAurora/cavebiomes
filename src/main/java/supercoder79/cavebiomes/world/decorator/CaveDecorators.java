package supercoder79.cavebiomes.world.decorator;

import net.minecraft.block.Blocks;
import supercoder79.cavebiomes.api.CaveDecorator;

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
    public static final CaveDecorator LUSH = new LushCaveDecorator();
    public static final CaveDecorator MUSHROOM = new MushroomCaveDecorator();
    public static final CaveDecorator COBWEB = new CobwebCaveDecorator();
    public static final CaveDecorator ANDESITE = new SingleBlockStateCaveDecorator(Blocks.ANDESITE.getDefaultState());
    public static final CaveDecorator DIORITE = new SingleBlockStateCaveDecorator(Blocks.DIORITE.getDefaultState());
    public static final CaveDecorator GRANITE = new SingleBlockStateCaveDecorator(Blocks.GRANITE.getDefaultState());
    public static final CaveDecorator FULL_OBSIDIAN = new SingleBlockStateCaveDecorator(Blocks.OBSIDIAN.getDefaultState());
    public static final CaveDecorator OBSIDIAN = new RandomBlockStateCaveDecorator(Blocks.OBSIDIAN.getDefaultState(), 8);
    public static final CaveDecorator MAGMA = new RandomBlockStateCaveDecorator(Blocks.MAGMA_BLOCK.getDefaultState(), 12);
    public static final CaveDecorator COBBLESTONE = new RandomBlockStateCaveDecorator(Blocks.COBBLESTONE.getDefaultState(), 6);
    public static final CaveDecorator GRAVEL = new FloorStateCaveDecorator(Blocks.GRAVEL.getDefaultState(), 3);
    public static final CaveDecorator SANDSTONE = new SandstoneCaveDecorator();

    //ore caves (lower)
    public static final CaveDecorator COAL = new RandomBlockStateCaveDecorator(Blocks.COAL_ORE.getDefaultState(), 16);
    public static final CaveDecorator IRON = new RandomBlockStateCaveDecorator(Blocks.IRON_ORE.getDefaultState(), 48);
    public static final CaveDecorator GOLD = new RandomBlockStateCaveDecorator(Blocks.GOLD_ORE.getDefaultState(), 96);
    public static final CaveDecorator REDSTONE = new RandomBlockStateCaveDecorator(Blocks.REDSTONE_ORE.getDefaultState(), 24);
    public static final CaveDecorator LAPIS = new RandomBlockStateCaveDecorator(Blocks.LAPIS_ORE.getDefaultState(), 72);
    public static final CaveDecorator DIAMOND = new RandomBlockStateCaveDecorator(Blocks.DIAMOND_ORE.getDefaultState(), 512);

    // Temp minecraft stuff
    public static final CaveDecorator DRIPSTONE = new DripstoneCaveDecorator();

    //TODO: honey cave
    //TODO: emerald
}
