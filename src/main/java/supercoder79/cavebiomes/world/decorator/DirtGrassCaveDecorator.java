package supercoder79.cavebiomes.world.decorator;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ChunkRegion;
import supercoder79.cavebiomes.api.CaveDecorator;

import java.util.Random;

public class DirtGrassCaveDecorator extends CaveDecorator {
    @Override
    public void decorate(ChunkRegion world, Random random, BlockPos pos) {
        if (world.getBlockState(pos.down()).isOpaque()) {
            if (random.nextInt(3) == 0) {
                world.setBlockState(pos.down(), Blocks.DIRT.getDefaultState(), 3);
                if (random.nextInt(2) == 0) {
                    world.setBlockState(pos, Blocks.GRASS.getDefaultState(), 3);
                }
            }
        }
    }
}
