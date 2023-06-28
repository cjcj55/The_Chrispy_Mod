package io.github.cjcj55.chrispymod.common.item;

import io.github.cjcj55.chrispymod.common.itemgroups.ChrispyModItemGroups;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

public class ChrispyModHoeItem extends HoeItem {
    public ChrispyModHoeItem(Tier tier, int attackDamageModifier, float attackSpeedModifier) {
        super(tier, attackDamageModifier, attackSpeedModifier, new Item.Properties());
    }
}
