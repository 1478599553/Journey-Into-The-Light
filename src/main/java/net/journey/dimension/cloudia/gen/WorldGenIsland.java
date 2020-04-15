package net.journey.dimension.cloudia.gen;

import net.journey.init.blocks.JourneyBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenIsland extends WorldGenerator {

    @Override
    public boolean generate(World world, Random rand, BlockPos pos) {
        int i = pos.getX(), j = pos.getY(), k = pos.getZ();

        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 1, j + 4, k + 4), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 1, j + 4, k + 5), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 3, k + 5), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 3, k + 6), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 4, k + 3), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 4, k + 4), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 4, k + 5), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 4, k + 6), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 2, j + 4, k + 7), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 2, k + 5), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 2, k + 6), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 3, k + 3), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 3, k + 4), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 3, k + 5), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 3, k + 6), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 3, k + 7), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 4, k + 2), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 4, k + 3), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 4, k + 4), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 4, k + 5), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 4, k + 6), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 4, k + 7), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 3, j + 4, k + 8), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 2, k + 4), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 2, k + 5), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 2, k + 6), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 2, k + 7), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 3, k + 3), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 3, k + 4), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 3, k + 5), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 3, k + 6), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 3, k + 7), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 4, k + 2), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 4, k + 3), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 4, k + 4), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 4, k + 5), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 4, k + 6), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 4, k + 7), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 4, k + 8), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 4, j + 4, k + 9), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 1, k + 5), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 1, k + 6), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 2, k + 3), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 2, k + 4), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 2, k + 5), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 2, k + 6), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 2, k + 7), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 2, k + 8), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 3, k + 2), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 3, k + 3), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 3, k + 4), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 3, k + 5), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 3, k + 6), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 3, k + 7), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 3, k + 8), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 4, k + 1), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 4, k + 2), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 4, k + 3), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 4, k + 4), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 4, k + 5), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 4, k + 6), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 4, k + 7), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 4, k + 8), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 5, j + 4, k + 9), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 0, k + 5), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 1, k + 4), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 1, k + 5), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 1, k + 6), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 1, k + 7), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 2, k + 2), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 2, k + 3), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 2, k + 4), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 2, k + 5), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 2, k + 6), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 2, k + 7), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 2, k + 8), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 3, k + 1), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 3, k + 2), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 3, k + 3), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 3, k + 4), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 3, k + 5), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 3, k + 6), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 3, k + 7), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 3, k + 8), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 3, k + 9), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 4, k + 0), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 4, k + 1), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 4, k + 2), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 4, k + 3), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 4, k + 4), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 4, k + 5), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 4, k + 6), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 4, k + 7), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 4, k + 8), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 4, k + 9), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 6, j + 4, k + 10), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 1, k + 5), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 1, k + 6), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 2, k + 2), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 2, k + 3), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 2, k + 4), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 2, k + 5), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 2, k + 6), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 2, k + 7), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 3, k + 1), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 3, k + 2), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 3, k + 3), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 3, k + 4), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 3, k + 5), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 3, k + 6), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 3, k + 7), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 3, k + 8), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 4, k + 0), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 4, k + 1), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 4, k + 2), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 4, k + 3), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 4, k + 4), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 4, k + 5), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 4, k + 6), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 4, k + 7), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 4, k + 8), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 4, k + 9), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 7, j + 4, k + 10), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 8, j + 1, k + 5), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 8, j + 2, k + 3), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 8, j + 2, k + 4), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 8, j + 2, k + 5), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 8, j + 2, k + 6), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 8, j + 2, k + 7), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 8, j + 3, k + 2), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 8, j + 3, k + 3), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 8, j + 3, k + 4), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 8, j + 3, k + 5), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 8, j + 3, k + 6), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 8, j + 3, k + 7), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 8, j + 4, k + 1), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 8, j + 4, k + 2), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 8, j + 4, k + 3), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 8, j + 4, k + 4), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 8, j + 4, k + 5), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 8, j + 4, k + 6), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 8, j + 4, k + 7), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 8, j + 4, k + 8), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 8, j + 4, k + 9), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 9, j + 2, k + 4), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 9, j + 2, k + 5), JourneyBlocks.cloudiaRock.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 9, j + 3, k + 3), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 9, j + 3, k + 4), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 9, j + 3, k + 5), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 9, j + 3, k + 6), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 9, j + 3, k + 7), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 9, j + 4, k + 2), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 9, j + 4, k + 3), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 9, j + 4, k + 4), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 9, j + 4, k + 5), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 9, j + 4, k + 6), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 9, j + 4, k + 7), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 9, j + 4, k + 8), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 10, j + 3, k + 4), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 10, j + 3, k + 5), JourneyBlocks.cloudiaDirt.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 10, j + 4, k + 3), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 10, j + 4, k + 4), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 10, j + 4, k + 5), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 10, j + 4, k + 6), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 10, j + 4, k + 7), JourneyBlocks.cloudiaGrass.getDefaultState());
        this.setBlockAndNotifyAdequately(world, new BlockPos(i + 11, j + 4, k + 5), JourneyBlocks.cloudiaGrass.getDefaultState());

        return true;
    }
}
