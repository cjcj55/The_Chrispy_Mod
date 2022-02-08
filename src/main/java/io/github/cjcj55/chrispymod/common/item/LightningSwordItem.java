package io.github.cjcj55.chrispymod.common.item;

import io.github.cjcj55.chrispymod.common.itemgroups.ChrispyModItemGroups;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public class LightningSwordItem extends SwordItem {
    public LightningSwordItem(Tier tier, int attackDamageModifier, float attackSpeedModifier) {
        super(tier, attackDamageModifier, attackSpeedModifier, new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB));
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if(!player.level.isClientSide()) {
            ServerLevel world = ((ServerLevel) player.level);
            EntityType.LIGHTNING_BOLT.spawn(world, null, player, entity.blockPosition(), MobSpawnType.TRIGGERED, true, true);
        }
        return false;
    }

    @Override
    public Rarity getRarity(ItemStack pStack) {
        return ChrispyModRarity.BLUE;
    }
}
