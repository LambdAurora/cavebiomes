package supercoder79.cavebiomes.world.decorator;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ChunkRegion;
import supercoder79.cavebiomes.api.CaveDecorator;

import java.util.Random;

public class NoOpCaveDecorator extends CaveDecorator {
    @Override
    public void decorate(ChunkRegion world, Random random, BlockPos pos) {
    }
}