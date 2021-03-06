package net.journey.dimension.frozen.gen;

import net.journey.init.blocks.JourneyBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenLamp5 extends WorldGenerator {

    @Override
    public boolean generate(World world, Random r, BlockPos pos) {
        int i = pos.getX(), j = pos.getY() + 1, k = pos.getZ();
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 0, j + 0, k + 0), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 0, j + 0, k + 1), JourneyBlocks.workshopStone.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 0, j + 0, k + 2), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 0, j + 1, k + 0), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 0, j + 1, k + 1), JourneyBlocks.workshopStone.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 0, j + 1, k + 2), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 0, j + 2, k + 0), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 0, j + 2, k + 1), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 0, j + 2, k + 2), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 0, j + 3, k + 0), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 0, j + 3, k + 1), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 0, j + 3, k + 2), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 1, j + 0, k + 0), JourneyBlocks.workshopStone.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 1, j + 0, k + 1), JourneyBlocks.workshopStone.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 1, j + 0, k + 2), JourneyBlocks.workshopStone.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 1, j + 1, k + 0), JourneyBlocks.workshopStone.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 1, j + 1, k + 1), JourneyBlocks.frozenLamp.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 1, j + 1, k + 2), JourneyBlocks.workshopStone.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 1, j + 2, k + 0), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 1, j + 2, k + 1), JourneyBlocks.frozenLamp.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 1, j + 2, k + 2), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 1, j + 3, k + 0), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 1, j + 3, k + 1), JourneyBlocks.frozenLamp.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 1, j + 3, k + 2), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 0, k + 0), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 0, k + 1), JourneyBlocks.workshopStone.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 0, k + 2), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 1, k + 0), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 1, k + 1), JourneyBlocks.workshopStone.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 1, k + 2), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 2, k + 0), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 2, k + 1), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 2, k + 2), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 3, k + 0), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 3, k + 1), Blocks.AIR.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 3, k + 2), Blocks.AIR.getDefaultState());
        return true;
    }
}