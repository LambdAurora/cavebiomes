package supercoder79.cavebiomes.world.decorator;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ChunkRegion;
import supercoder79.cavebiomes.api.CaveDecorator;
import supercoder79.cavebiomes.util.DirectionUtil;
import supercoder79.cavebiomes.world.noise.OpenSimplexNoise;
import supercoder79.cavebiomes.world.state_provider.BlockStateReplacer;

import java.util.Random;

public class SingleBlockStateCaveDecorator extends CaveDecorator {
    private final BlockStateReplacer replacer;

    public SingleBlockStateCaveDecorator(BlockStateReplacer replacer) {
        this.replacer = replacer;
    }

    @Override
    public void decorate(ChunkRegion world, Random random, OpenSimplexNoise noise, BlockPos pos, DecorationContext context) {
        // Try to set a  block in every direction
        for (var direction : DirectionUtil.DIRECTIONS) {
            trySet(world, random, pos.offset(direction));
        }
    }

    private void trySet(ChunkRegion world, Random random, BlockPos pos) {
        BlockState toPlace = this.replacer.provide(world, random, pos, world.getBlockState(pos));
        if (toPlace != null) {
            world.setBlockState(pos, toPlace, Block.NOTIFY_ALL);
        }
    }
}
