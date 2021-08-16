package supercoder79.cavebiomes.world.decorator;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.ChunkRegion;
import supercoder79.cavebiomes.api.CaveDecorator;
import supercoder79.cavebiomes.util.DirectionUtil;
import supercoder79.cavebiomes.world.noise.OpenSimplexNoise;

import java.util.Random;

public class SandstoneCaveDecorator extends CaveDecorator {
    @Override
    public void decorate(ChunkRegion world, Random random, OpenSimplexNoise noise, BlockPos pos, DecorationContext context) {
        if (context != DecorationContext.AIR) {
            return;
        }

        // Set sandstone
        for (var direction : DirectionUtil.DIRECTIONS) {
            trySet(world, random, pos.offset(direction));
        }

        // Generate bone structure rarely
        if (random.nextInt(256) == 0) {
            if (world.getBlockState(pos.down()).isOf(Blocks.SANDSTONE)) {
                Direction direction = Direction.Type.HORIZONTAL.random(random);
                int height = random.nextInt(2) + 2;
                if (checkSpace(world, pos, height, direction)) {
                    makeBone(world, pos, height, direction);
                }
            }
        }
    }

    private void trySet(ChunkRegion world, Random random, BlockPos pos) {
        // Generate sand or sandstone 83% of the time
        if (random.nextInt(6) != 0) {
            if (world.getBlockState(pos).isOf(Blocks.STONE)) {
                // Generate sand and cacti sometimes
                if (random.nextInt(8) == 0) {
                    world.setBlockState(pos, Blocks.SAND.getDefaultState(), Block.NOTIFY_ALL);
                    // Try to generate a cactus here
                    tryGenerateCactus(world, pos.up());
                } else {
                    world.setBlockState(pos, Blocks.SANDSTONE.getDefaultState(), Block.NOTIFY_ALL);
                }
            }
        }
    }

    private void makeBone(ChunkRegion world, BlockPos origin, int height, Direction direction) {
        for (int i = 0; i < height; i++) {
            world.setBlockState(origin.up(i), Blocks.BONE_BLOCK.getDefaultState(), Block.NOTIFY_ALL);
        }

        world.setBlockState(origin.up(height).offset(direction), Blocks.BONE_BLOCK.getDefaultState().with(Properties.AXIS, direction.getAxis()), 3);
    }

    private boolean checkSpace(ChunkRegion world, BlockPos origin, int height, Direction direction) {
        BlockPos.Mutable mutable = origin.mutableCopy();
        for (int i = 0; i < height; i++) {
            mutable.move(Direction.UP);
            if (world.getBlockState(mutable).isOpaque() || world.getBlockState(mutable.offset(direction)).isOpaque()) {
                return false;
            }
        }

        return true;
    }

    private void tryGenerateCactus(ChunkRegion world, BlockPos pos) {
        for (var direction : Direction.Type.HORIZONTAL) {
            if (world.getBlockState(pos.offset(direction)).isOpaque()) {
                return;
            }
        }

        if (world.getBlockState(pos.up()).isOpaque()) {
            return;
        }

        world.setBlockState(pos, Blocks.CACTUS.getDefaultState(), Block.NOTIFY_ALL);
    }
}
