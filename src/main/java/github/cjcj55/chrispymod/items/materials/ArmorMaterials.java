package github.cjcj55.chrispymod.items.materials;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.core.init.ItemInit;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.util.Lazy;

import java.util.function.Supplier;

public enum ArmorMaterials implements ArmorMaterial {
    /*
    LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> { return Ingredient.of(Items.LEATHER); }),
    CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> { return Ingredient.of(Items.IRON_INGOT); }),
    IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> { return Ingredient.of(Items.IRON_INGOT); }),
    GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> { return Ingredient.of(Items.GOLD_INGOT); }),
    DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> { return Ingredient.of(Items.DIAMOND); }),
    TURTLE("turtle", 25, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_TURTLE, 0.0F, 0.0F, () -> { return Ingredient.of(Items.SCUTE); }),
    NETHERITE("netherite", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> { return Ingredient.of(Items.NETHERITE_INGOT); }),
    */

    RUBY("ruby",                            15, new int[]{2, 5, 6, 2}, 14, SoundEvents.ARMOR_EQUIP_IRON,        0.0F, 0.0F, () -> { return Ingredient.of(CMItems.RUBY.get()); }),
    OPAL("opal",                            12, new int[]{1, 4, 5, 1}, 17, SoundEvents.ARMOR_EQUIP_IRON,        0.0F, 0.0F, () -> { return Ingredient.of(CMItems.OPAL.get()); }),
    TANGERINE("tangerine",                  8,  new int[]{2, 4, 5, 1}, 8, SoundEvents.ARMOR_EQUIP_IRON,        0.0F, 0.0F, () -> { return Ingredient.of(CMItems.TANGERINE.get()); }),
    COBALT("cobalt",                        20, new int[]{2, 5, 6, 3}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND,     0.0F, 0.0F, () -> { return Ingredient.of(CMItems.COBALT.get()); }),
    BLUE_EMERALD("blue_emerald",            30, new int[]{3, 6, 9, 4}, 11, SoundEvents.ARMOR_EQUIP_DIAMOND,     2.0F, 0.0F, () -> { return Ingredient.of(CMItems.BLUE_EMERALD.get()); }),
    PARYTH("paryth",                        10, new int[]{1, 5, 6, 2}, 6, SoundEvents.ARMOR_EQUIP_GOLD,        0.0F, 0.0F, () -> { return Ingredient.of(CMItems.PARYTH.get()); }),
    LIGHTNING("lightning",                  23, new int[]{2, 5, 6, 3}, 9, SoundEvents.ARMOR_EQUIP_DIAMOND,     1.0F, 0.0F, () -> { return Ingredient.of(CMItems.LIGHTNING.get()); }),
    FLAME("flame",                          13, new int[]{2, 4, 5, 2}, 12, SoundEvents.ARMOR_EQUIP_LEATHER,     0.0F, 0.0F, () -> { return Ingredient.of(CMItems.FLAME.get()); }),
    REDSTONE("redstone",                    15, new int[]{2, 4, 5, 2}, 14, SoundEvents.ARMOR_EQUIP_GOLD,        0.0F, 0.0F, () -> { return Ingredient.of(CMItems.REDSTONE_INGOT.get()); }),
    EMERALD("emerald",                      28, new int[]{3, 6, 7, 3}, 12, SoundEvents.ARMOR_EQUIP_DIAMOND,     0.0F, 0.0F, () -> { return Ingredient.of(Items.EMERALD); }),
    WHITE_DWARF_STAR("white_dwarf_star",    20, new int[]{2, 5, 6, 2}, 16, SoundEvents.ARMOR_EQUIP_NETHERITE,   0.0F, 0.0F, () -> { return Ingredient.of(CMItems.WHITE_DWARF_STAR.get()); }),
    HONEY("honey",                          12, new int[]{1, 2, 3, 1}, 15, SoundEvents.HONEY_BLOCK_PLACE,       0.0F, 0.0F, () -> { return Ingredient.of(Items.HONEY_BLOCK); });

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredient;

    private ArmorMaterials(String name, int durabilityMultiplier, int[] slotsProtection, int enchantmentValue, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotsProtection; // boots to helmet
        this.enchantmentValue = enchantmentValue;
        this.sound = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = Lazy.of(repairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return ChrispyMod.MODID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    /**
     * Gets the percentage of knockback resistance provided by armor of the material.
     */
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}