package github.cjcj55.chrispymod.entity;

import github.cjcj55.chrispymod.registry.CMEntities;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;

public class DynamiteProjectileEntity extends ThrowableItemProjectile {
    protected boolean exploded = false;

    public DynamiteProjectileEntity(EntityType<? extends ThrowableItemProjectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
//        this.playFlyingSound();
    }
    public DynamiteProjectileEntity(Level pLevel) {
        this(CMEntities.DYNAMITE_PROJECTILE.get(), pLevel);
    }
    public DynamiteProjectileEntity(Level pLevel, LivingEntity livingEntity) {
        super(CMEntities.DYNAMITE_PROJECTILE.get(), livingEntity, pLevel);
//        this.playFlyingSound();
    }

    @Override
    protected Item getDefaultItem() {
        return null;
    }

    protected void explode() {
        if (!this.level().isClientSide() && !this.exploded) {
            this.exploded = true;
            float f = 4.0F;
            this.level().explode(this, this.getX(), this.getY(0.0625D), this.getZ(), 4.0F, Level.ExplosionInteraction.TNT);
        }
    }

    @Override
    protected void onHitBlock(BlockHitResult pResult) {
        super.onHitBlock(pResult); // Call the correct superclass method before performing any actions

        if (!this.level().isClientSide() && !this.exploded) {
            this.level().broadcastEntityEvent(this, (byte) 3);
            this.explode();
            this.discard(); // Destroy the entity after explosion
        }
    }

    private void playFlyingSound() {
        this.level().playSound(null, this.getX(), this.getY(), this.getZ(), SoundEvents.TNT_PRIMED, this.getSoundSource(), 1.0F, 1.0F);
    }
}
