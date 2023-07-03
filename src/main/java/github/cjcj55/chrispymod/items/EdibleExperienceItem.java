package github.cjcj55.chrispymod.items;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Random;

public class EdibleExperienceItem extends Item {
    public EdibleExperienceItem() {
        super(new Item.Properties());
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        Random random = new Random();
        level.playSound((Player)null, player.getX(), player.getY(), player.getZ(), SoundEvents.EXPERIENCE_ORB_PICKUP, SoundSource.NEUTRAL, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
        if(!level.isClientSide()) {
            int amount = 8;
            ExperienceOrb experienceOrb = new ExperienceOrb(level, player.getX(), player.getY(), player.getZ(), amount);
            level.addFreshEntity(experienceOrb);
            player.awardStat(Stats.ITEM_USED.get(this));
            if (!player.getAbilities().mayfly) {
                stack.shrink(1);
            }
        }
        return InteractionResultHolder.success(stack);
    }

    @Override
    public boolean isFoil(ItemStack pStack) {
        return true;
    }
}