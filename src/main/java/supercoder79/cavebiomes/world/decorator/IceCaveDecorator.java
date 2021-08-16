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

public class IceCaveDecorator extends CaveDecorator {
    @Override
    public void decorate(ChunkRegion world, Random random, OpenSimplexNoise noise, BlockPos pos, DecorationContext context) {
        if (context != DecorationContext.AIR) {
            return;
        }

        // Try to set a packed ice block in every direction
        for (var direction : DirectionUtil.DIRECTIONS) {
            trySet(world, random, pos.offset(direction));
        }

        // Set snow on top of solid blocks
        BlockState state = world.getBlockState(pos.down());
        if (state.isOpaque() && !state.isOf(Blocks.SNOW)) {
            if (random.nextInt(6) == 0) {
                world.setBlockState(pos, Blocks.SNOW.getDefaultState(), 3);
            }
        }
    }

    private static void trySet(ChunkRegion world, Random random, BlockPos pos) {
        if (random.nextInt(16) == 0) {
            BlockState state = world.getBlockState(pos);
            if (state.isOpaque() && !state.isOf(Blocks.SNOW)) {
                world.setBlockState(pos, Blocks.PACKED_ICE.getDefaultState(), 3);
            }
        }
    }
}
