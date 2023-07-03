package github.cjcj55.chrispymod.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class SpeedBlock extends Block {
    public SpeedBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState block, Entity entity) {
        if (!level.isClientSide()) {
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 5, 0));
            }
        }
        super.stepOn(level, pos, block, entity);
    }
}
