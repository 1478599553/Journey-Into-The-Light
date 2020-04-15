package net.journey.dimension.euca.gen.trees;

import net.journey.init.blocks.JourneyBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.slayer.api.worldgen.WorldGenAPI;

import java.util.Random;

public class WorldGenEucaTree9 extends WorldGenerator {

    @Override
    public boolean generate(World world, Random r, BlockPos pos) {
        int i = pos.getX(), j = pos.getY() - 1, k = pos.getZ();
        int height = r.nextInt(3);
        Block log = JourneyBlocks.eucaGoldLog;
        Block leaves = JourneyBlocks.eucaDarkGreenLeaves;
        WorldGenAPI.addRectangle(1, 1, 9 + height, world, i + 3, j + 1, k + 3, log);
        j = j + height + 2;
        this.setBlockAndNotifyAdequately(world, new BlockPos(i, j + 1, k + 2), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i, j + 1, k + 3), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i, j + 1, k + 4), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 1, j + 1, k + 1), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 1, j + 1, k + 2), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 1, j + 1, k + 3), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 1, j + 1, k + 4), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 1, j + 1, k + 5), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 1, j + 3, k + 2), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 1, j + 3, k + 3), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 1, j + 3, k + 4), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 1, k), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 1, k + 1), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 1, k + 2), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 1, k + 3), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 1, k + 4), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 1, k + 5), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 1, k + 6), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 2, k + 3), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 3, k + 1), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 3, k + 2), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 3, k + 3), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 3, k + 4), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 3, k + 5), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 4, k + 3), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 5, k + 2), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 5, k + 3), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 5, k + 4), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 7, k + 3), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 1, k), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 1, k + 1), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 1, k + 2), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 1, k + 4), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 1, k + 5), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 1, k + 6), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 2, k + 2), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 2, k + 4), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 3, k + 1), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 3, k + 2), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 3, k + 4), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 3, k + 5), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 4, k + 2), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 4, k + 4), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 5, k + 2), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 5, k + 4), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 7, k + 2), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 7, k + 4), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 8, k + 3), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 1, k), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 1, k + 1), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 1, k + 2), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 1, k + 3), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 1, k + 4), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 1, k + 5), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 1, k + 6), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 2, k + 3), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 3, k + 1), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 3, k + 2), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 3, k + 3), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 3, k + 4), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 3, k + 5), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 4, k + 3), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 5, k + 2), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 5, k + 3), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 5, k + 4), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 7, k + 3), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 1, k + 1), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 1, k + 2), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 1, k + 3), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 1, k + 4), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 1, k + 5), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 3, k + 2), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 3, k + 3), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 3, k + 4), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 1, k + 2), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 1, k + 3), leaves.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 1, k + 4), leaves.getDefaultState());
        return true;
    }
}