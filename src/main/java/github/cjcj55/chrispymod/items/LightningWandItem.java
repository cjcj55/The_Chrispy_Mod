package github.cjcj55.chrispymod.items;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class LightningWandItem extends Item {
    public LightningWandItem() {
        super(new Item.Properties().durability(64));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        ItemStack itemStack = player.getItemInHand(usedHand);
        player.getCooldowns().addCooldown(this, 20);
        if (!level.isClientSide()) {
            HitResult rayTraceResult = getPlayerHitResult(level, player, ClipContext.Fluid.NONE);
            if (rayTraceResult.getType() == HitResult.Type.BLOCK) {
                ServerLevel world = ((ServerLevel) player.level());
                BlockHitResult blockHitResult = (BlockHitResult) rayTraceResult;
                BlockPos blockPos = blockHitResult.getBlockPos().relative(blockHitResult.getDirection());
                BlockState state = level.getBlockState(blockPos);
                if (!player.isCreative()) {
                    itemStack.setDamageValue(itemStack.getDamageValue() + 1);
                }
                if (!level.isClientSide) {
                    EntityType.LIGHTNING_BOLT.spawn(world, null, player, blockPos, MobSpawnType.TRIGGERED, true, true);
                }
            }
            return new InteractionResultHolder<>(InteractionResult.SUCCESS, itemStack);
        }
        return new InteractionResultHolder<>(InteractionResult.FAIL, itemStack);
    }

    private static BlockHitResult getPlayerHitResult(Level pLevel, Player pPlayer, ClipContext.Fluid pFluidMode) {
        float f = pPlayer.getXRot();
        float f1 = pPlayer.getYRot();
        Vec3 vec3 = pPlayer.getEyePosition();
        float f2 = Mth.cos(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
        float f3 = Mth.sin(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
        float f4 = -Mth.cos(-f * ((float)Math.PI / 180F));
        float f5 = Mth.sin(-f * ((float)Math.PI / 180F));
        float f6 = f3 * f4;
        float f7 = f2 * f4;
        double d0 = 64;
        Vec3 vec31 = vec3.add((double)f6 * d0, (double)f5 * d0, (double)f7 * d0);
        return pLevel.clip(new ClipContext(vec3, vec31, ClipContext.Block.OUTLINE, pFluidMode, pPlayer));
    }
}