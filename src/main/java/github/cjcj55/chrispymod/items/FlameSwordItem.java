package github.cjcj55.chrispymod.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class FlameSwordItem extends SwordItem {

    public FlameSwordItem(Tier tier, int attackDamageModifier, float attackSpeedModifier) {
        super(tier, attackDamageModifier, attackSpeedModifier, new Item.Properties());
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.setSecondsOnFire(3);
        return super.hurtEnemy(stack, target, attacker);
    }
}