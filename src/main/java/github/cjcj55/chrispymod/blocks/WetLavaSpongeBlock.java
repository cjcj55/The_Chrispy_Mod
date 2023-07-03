package github.cjcj55.chrispymod.blocks;

import github.cjcj55.chrispymod.registry.CMBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BiomeTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class WetLavaSpongeBlock extends Block {
    public WetLavaSpongeBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    public void onPlace(BlockState pState, Level pLevel, BlockPos pPos, BlockState pOldState, boolean pIsMoving) {
        if (pLevel.getBiome(pPos).containsTag(BiomeTags.IS_TAIGA)) {
            // TODO:  uncomment below line
//            pLevel.setBlock(pPos, CMBlocks.LAVA_SPONGE.get().defaultBlockState(), 3);
            pLevel.levelEvent(2009, pPos, 0);
            pLevel.playSound((Player)null, pPos, SoundEvents.FIRE_EXTINGUISH, SoundSource.BLOCKS, 1.0F, (1.0F + pLevel.getRandom().nextFloat() * 0.2F) * 0.7F);
        }

    }

    /**
     * Called periodically clientside on blocks near the player to show effects (like furnace fire particles).
     */
    public void animateTick(BlockState pState, Level pLevel, BlockPos pPos, RandomSource pRand) {
        Direction direction = Direction.getRandom(pRand);
        if (direction != Direction.UP) {
            BlockPos blockpos = pPos.relative(direction);
            BlockState blockstate = pLevel.getBlockState(blockpos);
            if (!pState.canOcclude() || !blockstate.isFaceSturdy(pLevel, blockpos, direction.getOpposite())) {
                double d0 = (double)pPos.getX();
                double d1 = (double)pPos.getY();
                double d2 = (double)pPos.getZ();
                if (direction == Direction.DOWN) {
                    d1 -= 0.05D;
                    d0 += pRand.nextDouble();
                    d2 += pRand.nextDouble();
                } else {
                    d1 += pRand.nextDouble() * 0.8D;
                    if (direction.getAxis() == Direction.Axis.X) {
                        d2 += pRand.nextDouble();
                        if (direction == Direction.EAST) {
                            ++d0;
                        } else {
                            d0 += 0.05D;
                        }
                    } else {
                        d0 += pRand.nextDouble();
                        if (direction == Direction.SOUTH) {
                            ++d2;
                        } else {
                            d2 += 0.05D;
                        }
                    }
                }

                pLevel.addParticle(ParticleTypes.DRIPPING_LAVA, d0, d1, d2, 0.0D, 0.0D, 0.0D);
            }
        }
    }
}
