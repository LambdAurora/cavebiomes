package supercoder79.cavebiomes.world.decorator;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.ChunkRegion;
import supercoder79.cavebiomes.api.CaveDecorator;
import supercoder79.cavebiomes.util.DirectionUtil;
import supercoder79.cavebiomes.world.noise.OpenSimplexNoise;

import java.util.Random;

public class DirtGrassCaveDecorator extends CaveDecorator {
    @Override
    public void decorate(ChunkRegion world, Random random, OpenSimplexNoise noise, BlockPos pos, DecorationContext context) {
        if (context != DecorationContext.AIR) {
            return;
        }

        for (var direction : DirectionUtil.DIRECTIONS) {
            BlockPos local = pos.offset(direction);
            BlockState state = world.getBlockState(local);
            if (state.isOf(Blocks.GRASS_BLOCK)) {
                continue;
            }

            if (!state.isOpaque()) {
                continue;
            }

            double dirtDensity = noise.sample(local, 32.0) * 0.7 + (random.nextDouble() * 0.85);
            if (dirtDensity > 0.35) {
                world.setBlockState(local, Blocks.DIRT.getDefaultState(), 3);
            }
        }

        if (world.getBlockState(pos).isAir() && world.getBlockState(pos.down()).isOf(Blocks.DIRT)) {
            if (random.nextBoolean()) {
                world.setBlockState(pos, Blocks.GRASS.getDefaultState(), 3);
            }
        }
    }
}
