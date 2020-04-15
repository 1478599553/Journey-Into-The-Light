package net.journey.dimension.base.gen;

import net.journey.init.blocks.JourneyBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenAncientBlock extends WorldGenerator {

    @Override
    public boolean generate(World world, Random rand, BlockPos pos) {
        int i = pos.getX(), j = pos.getY(), k = pos.getZ();
        if (world.getBlockState(pos.down()).isFullBlock() && world.getBlockState(pos.up()).getBlock() == Blocks.AIR) {
            this.setBlockAndNotifyAdequately(world, new BlockPos(i + 0, j + 0, k + 0), JourneyBlocks.ancientMachineBlock.getDefaultState());
        }
        return true;
    }
}
