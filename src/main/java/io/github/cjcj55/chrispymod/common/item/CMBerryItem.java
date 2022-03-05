package io.github.cjcj55.chrispymod.common.item;

import io.github.cjcj55.chrispymod.common.itemgroups.ChrispyModItemGroups;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;

public class CMBerryItem extends ItemNameBlockItem {
    public CMBerryItem(Block block, FoodProperties foodProperties) {
        super(block, new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB).food(foodProperties));

    }

    /*@Override
    public void fillItemCategory(CreativeModeTab pGroup, NonNullList<ItemStack> pItems) {
        if (this.getCreativeTabs().equals(ChrispyModItemGroups.CHRISPY_ITEMS_TAB)) {
            pItems.add(new ItemStack(this));
        }
    }*/

    /*public boolean itemInteractionForEntity(ItemStack itemstack, Player player, LivingEntity entity, InteractionHand hand) {

        ItemStack stack = player.getItemInHand(hand);

        if (!entity.level.isClientSide() && !entity.isBaby() && entity instanceof AgeableMob && (int) ((AgeableMob) entity).getAge() == 0) {
            if (entity instanceof Pig) {
                if (((Pig) entity).isInLove()) {
                    return false;
                } else {
                    ((Pig) entity).setInLove(player);
                    if (!player.isCreative())
                        stack.shrink(1);
                    return true;
                }

            }

        }

        if (entity.isBaby()) {
            if (!player.isCreative())
                stack.shrink(1);
            ((AgeableMob) entity).ageUp((int) ((float) (-((AgeableMob) entity).getAge() / 20) * 0.1F),
                    true);
            return true;
        }

        return false;

    }*/
}
