package github.cjcj55.chrispymod.entity.projectile;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public class LightningBowArrowProjectileEntity extends Arrow {
    public LightningBowArrowProjectileEntity(EntityType<? extends Arrow> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public LightningBowArrowProjectileEntity(Level pLevel, double pX, double pY, double pZ) {
        super(pLevel, pX, pY, pZ);
    }

    public LightningBowArrowProjectileEntity(Level pLevel, LivingEntity pShooter) {
        super(pLevel, pShooter);
    }

    public static AbstractArrow createArrow(Level pLevel, ItemStack pStack, LivingEntity pShooter) {
        LightningBowArrowProjectileEntity arrow = new LightningBowArrowProjectileEntity(pLevel, pShooter);
        arrow.setEffectsFromItem(pStack);
        return arrow;
    }

    @Override
    protected void onHitEntity(EntityHitResult pResult) {
        if(!pResult.getEntity().level().isClientSide()) {
            ServerLevel world = ((ServerLevel) pResult.getEntity().level());
            EntityType.LIGHTNING_BOLT.spawn(world, pResult.getEntity().blockPosition(), MobSpawnType.TRIGGERED);
        }

        super.onHitEntity(pResult);
    }
}
