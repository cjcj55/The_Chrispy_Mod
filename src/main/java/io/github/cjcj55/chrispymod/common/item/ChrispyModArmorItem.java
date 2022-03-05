package io.github.cjcj55.chrispymod.common.item;

import io.github.cjcj55.chrispymod.common.itemgroups.ChrispyModItemGroups;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;

public class ChrispyModArmorItem extends ArmorItem {
    public ChrispyModArmorItem(ArmorMaterial material, EquipmentSlot slot) {
        super(material, slot, new Item.Properties().tab(ChrispyModItemGroups.CHRISPY_ITEMS_TAB));
    }
}
