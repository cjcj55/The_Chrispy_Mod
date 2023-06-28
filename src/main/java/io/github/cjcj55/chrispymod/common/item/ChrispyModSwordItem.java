package io.github.cjcj55.chrispymod.common.item;

import io.github.cjcj55.chrispymod.common.itemgroups.ChrispyModItemGroups;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class ChrispyModSwordItem extends SwordItem {

    public ChrispyModSwordItem(Tier tier, int attackDamageModifier, float attackSpeedModifier) {
        super(tier, attackDamageModifier, attackSpeedModifier, new Item.Properties());
    }
}
