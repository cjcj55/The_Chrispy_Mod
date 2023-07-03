package github.cjcj55.chrispymod.items;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class LightningSwordItem extends SwordItem {
    public LightningSwordItem(Tier tier, int attackDamageModifier, float attackSpeedModifier) {
        super(tier, attackDamageModifier, attackSpeedModifier, new Item.Properties());
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if(!player.level().isClientSide()) {
            ServerLevel world = ((ServerLevel) player.level());
            EntityType.LIGHTNING_BOLT.spawn(world, null, player, entity.blockPosition(), MobSpawnType.TRIGGERED, true, true);
        }
        return false;
    }
}