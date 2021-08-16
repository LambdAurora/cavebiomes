package supercoder79.cavebiomes.world.state_provider;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tag.Tag;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.StructureWorldAccess;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public interface BlockStateReplacer {
    /**
     * Provides a block state depending on the given context.
     *
     * @param world the world in which a block state should be provided
     * @param random the random instance
     * @param pos the position at which a block state should be provided
     * @param current the current block state which should be replaced
     * @return {@code null} if the context does not allow to provide a new block state, else a new block state to place
     */
    @Nullable BlockState provide(StructureWorldAccess world, Random random, BlockPos pos, BlockState current);

    static BlockStateReplacer simple(Block toReplace, BlockState toPlace) {
        return (world, random, pos, current) -> current.isOf(toReplace) ? toPlace : null;
    }

    static BlockStateReplacer simple(Tag<Block> toReplace, BlockState toPlace) {
        return (world, random, pos, current) -> current.isIn(toReplace) ? toPlace : null;
    }
}
