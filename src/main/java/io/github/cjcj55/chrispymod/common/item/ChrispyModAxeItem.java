package io.github.cjcj55.chrispymod.common.item;

import io.github.cjcj55.chrispymod.common.itemgroups.ChrispyModItemGroups;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

public class ChrispyModAxeItem extends AxeItem {
    public ChrispyModAxeItem(Tier tier, float attackDamageModifier, float attackSpeedModifier) {
        super(tier, attackDamageModifier, attackSpeedModifier, new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB));
    }
}
