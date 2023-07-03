package github.cjcj55.chrispymod.items;

import github.cjcj55.chrispymod.registry.CMItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

// TODO:  uncomment lines
public class BerryJamItem extends Item {
    public BerryJamItem(FoodProperties chrispyModFood) {
        super(new Item.Properties().food(chrispyModFood));
    }

//    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pEntityLiving) {
//        super.finishUsingItem(pStack, pLevel, pEntityLiving);
//        if (pEntityLiving instanceof ServerPlayer) {
//            ServerPlayer serverplayer = (ServerPlayer)pEntityLiving;
//            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, pStack);
//            serverplayer.awardStat(Stats.ITEM_USED.get(this));
//        }
//
//        if (!pLevel.isClientSide) {
//            //pEntityLiving.removeEffect(MobEffects.POISON);
//        }
//
//        if (pStack.isEmpty()) {
//            return new ItemStack(CMItems.MASON_JAR.get());
//        } else {
//            if (pEntityLiving instanceof Player && !((Player)pEntityLiving).getAbilities().instabuild) {
//                ItemStack itemstack = new ItemStack(CMItems.MASON_JAR.get());
//                Player player = (Player)pEntityLiving;
//                if (!player.getInventory().add(itemstack)) {
//                    player.drop(itemstack, false);
//                }
//            }
//
//            return pStack;
//        }
//    }
}