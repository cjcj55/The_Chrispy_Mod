package github.cjcj55.chrispymod.datagen;

import github.cjcj55.chrispymod.datagen.builder.AlloyFurnaceRecipeBuilder;
import github.cjcj55.chrispymod.registry.CMBlocks;
import github.cjcj55.chrispymod.registry.CMItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Consumer;

public class CMRecipeProvider extends RecipeProvider implements IConditionBuilder {
//    private static final List<ItemLike> ALUMINUM_SMELTABLES = List.of(CMItems.RAW_ALUMINUM.get(), CMBlocks.ALUMINUM_ORE.get(), CMBlocks.DEEPSLATE_ALUMINUM_ORE.get());
//    private static final List<ItemLike> ANTIMONY_SMELTABLES = List.of(CMItems.RAW_ANTIMONY.get(), CMBlocks.ANTIMONY_ORE.get(), CMBlocks.DEEPSLATE_ANTIMONY_ORE.get());
//    private static final List<ItemLike> ARSENIC_SMELTABLES = List.of(CMItems.RAW_ARSENIC.get(), CMBlocks.ARSENIC_ORE.get(), CMBlocks.DEEPSLATE_ARSENIC_ORE.get());
//    private static final List<ItemLike> BARIUM_SMELTABLES = List.of(CMItems.RAW_BARIUM.get(), CMBlocks.BARIUM_ORE.get(), CMBlocks.DEEPSLATE_BARIUM_ORE.get());
//    private static final List<ItemLike> BERYLLIUM_SMELTABLES = List.of(CMItems.RAW_BERYLLIUM.get(), CMBlocks.BERYLLIUM_ORE.get(), CMBlocks.DEEPSLATE_BERYLLIUM_ORE.get());
//    private static final List<ItemLike> BISMUTH_SMELTABLES = List.of(CMItems.RAW_BISMUTH.get(), CMBlocks.BISMUTH_ORE.get(), CMBlocks.DEEPSLATE_BISMUTH_ORE.get());
//    private static final List<ItemLike> BORON_SMELTABLES = List.of(CMItems.RAW_BORON.get(), CMBlocks.BORON_ORE.get(), CMBlocks.DEEPSLATE_BORON_ORE.get());
//    private static final List<ItemLike> CADMIUM_SMELTABLES = List.of(CMItems.RAW_CADMIUM.get(), CMBlocks.CADMIUM_ORE.get(), CMBlocks.DEEPSLATE_CADMIUM_ORE.get());
//    private static final List<ItemLike> CALCIUM_SMELTABLES = List.of(CMItems.RAW_CALCIUM.get(), CMBlocks.CALCIUM_ORE.get(), CMBlocks.DEEPSLATE_CALCIUM_ORE.get());
//    private static final List<ItemLike> CERIUM_SMELTABLES = List.of(CMItems.RAW_CERIUM.get(), CMBlocks.CERIUM_ORE.get(), CMBlocks.DEEPSLATE_CERIUM_ORE.get());
//    private static final List<ItemLike> CESIUM_SMELTABLES = List.of(CMItems.RAW_CESIUM.get(), CMBlocks.CESIUM_ORE.get(), CMBlocks.DEEPSLATE_CESIUM_ORE.get());
//    private static final List<ItemLike> CHROMIUM_SMELTABLES = List.of(CMItems.RAW_CHROMIUM.get(), CMBlocks.CHROMIUM_ORE.get(), CMBlocks.DEEPSLATE_CHROMIUM_ORE.get());
//    private static final List<ItemLike> DYSPROSIUM_SMELTABLES = List.of(CMItems.RAW_DYSPROSIUM.get(), CMBlocks.DYSPROSIUM_ORE.get(), CMBlocks.DEEPSLATE_DYSPROSIUM_ORE.get());
//    private static final List<ItemLike> ERBIUM_SMELTABLES = List.of(CMItems.RAW_ERBIUM.get(), CMBlocks.ERBIUM_ORE.get(), CMBlocks.DEEPSLATE_ERBIUM_ORE.get());
//    private static final List<ItemLike> EUROPIUM_SMELTABLES = List.of(CMItems.RAW_EUROPIUM.get(), CMBlocks.EUROPIUM_ORE.get(), CMBlocks.DEEPSLATE_EUROPIUM_ORE.get());
//    private static final List<ItemLike> FRANCIUM_SMELTABLES = List.of(CMItems.RAW_FRANCIUM.get(), CMBlocks.FRANCIUM_ORE.get(), CMBlocks.DEEPSLATE_FRANCIUM_ORE.get());
//    private static final List<ItemLike> GADOLINIUM_SMELTABLES = List.of(CMItems.RAW_GADOLINIUM.get(), CMBlocks.GADOLINIUM_ORE.get(), CMBlocks.DEEPSLATE_GADOLINIUM_ORE.get());
//    private static final List<ItemLike> GALLIUM_SMELTABLES = List.of(CMItems.RAW_GALLIUM.get(), CMBlocks.GALLIUM_ORE.get(), CMBlocks.DEEPSLATE_GALLIUM_ORE.get());
//    private static final List<ItemLike> GERMANIUM_SMELTABLES = List.of(CMItems.RAW_GERMANIUM.get(), CMBlocks.GERMANIUM_ORE.get(), CMBlocks.DEEPSLATE_GERMANIUM_ORE.get());
//    private static final List<ItemLike> HAFNIUM_SMELTABLES = List.of(CMItems.RAW_HAFNIUM.get(), CMBlocks.HAFNIUM_ORE.get(), CMBlocks.DEEPSLATE_HAFNIUM_ORE.get());
//    private static final List<ItemLike> HOLMIUM_SMELTABLES = List.of(CMItems.RAW_HOLMIUM.get(), CMBlocks.HOLMIUM_ORE.get(), CMBlocks.DEEPSLATE_HOLMIUM_ORE.get());
//    private static final List<ItemLike> INDIUM_SMELTABLES = List.of(CMItems.RAW_INDIUM.get(), CMBlocks.INDIUM_ORE.get(), CMBlocks.DEEPSLATE_INDIUM_ORE.get());
//    private static final List<ItemLike> IRIDIUM_SMELTABLES = List.of(CMItems.RAW_IRIDIUM.get(), CMBlocks.IRIDIUM_ORE.get(), CMBlocks.DEEPSLATE_IRIDIUM_ORE.get());
//    private static final List<ItemLike> LANTHANUM_SMELTABLES = List.of(CMItems.RAW_LANTHANUM.get(), CMBlocks.LANTHANUM_ORE.get(), CMBlocks.DEEPSLATE_LANTHANUM_ORE.get());
//    private static final List<ItemLike> LEAD_SMELTABLES = List.of(CMItems.RAW_LEAD.get(), CMBlocks.LEAD_ORE.get(), CMBlocks.DEEPSLATE_LEAD_ORE.get());
//    private static final List<ItemLike> LITHIUM_SMELTABLES = List.of(CMItems.RAW_LITHIUM.get(), CMBlocks.LITHIUM_ORE.get(), CMBlocks.DEEPSLATE_LITHIUM_ORE.get());
//    private static final List<ItemLike> LUTETIUM_SMELTABLES = List.of(CMItems.RAW_LUTETIUM.get(), CMBlocks.LUTETIUM_ORE.get(), CMBlocks.DEEPSLATE_LUTETIUM_ORE.get());
//    private static final List<ItemLike> MAGNESIUM_SMELTABLES = List.of(CMItems.RAW_MAGNESIUM.get(), CMBlocks.MAGNESIUM_ORE.get(), CMBlocks.DEEPSLATE_MAGNESIUM_ORE.get());
//    private static final List<ItemLike> MANGANESE_SMELTABLES = List.of(CMItems.RAW_MANGANESE.get(), CMBlocks.MANGANESE_ORE.get(), CMBlocks.DEEPSLATE_MANGANESE_ORE.get());
//    private static final List<ItemLike> MERCURY_SMELTABLES = List.of(CMItems.RAW_MERCURY.get(), CMBlocks.MERCURY_ORE.get(), CMBlocks.DEEPSLATE_MERCURY_ORE.get());
//    private static final List<ItemLike> MYTHRIL_SMELTABLES = List.of(CMItems.RAW_MYTHRIL.get(), CMBlocks.MYTHRIL_ORE.get(), CMBlocks.DEEPSLATE_MYTHRIL_ORE.get());
//    private static final List<ItemLike> MOLYBDENUM_SMELTABLES = List.of(CMItems.RAW_MOLYBDENUM.get(), CMBlocks.MOLYBDENUM_ORE.get(), CMBlocks.DEEPSLATE_MOLYBDENUM_ORE.get());
//    private static final List<ItemLike> NEODYMIUM_SMELTABLES = List.of(CMItems.RAW_NEODYMIUM.get(), CMBlocks.NEODYMIUM_ORE.get(), CMBlocks.DEEPSLATE_NEODYMIUM_ORE.get());
//    private static final List<ItemLike> NICKEL_SMELTABLES = List.of(CMItems.RAW_NICKEL.get(), CMBlocks.NICKEL_ORE.get(), CMBlocks.DEEPSLATE_NICKEL_ORE.get());
//    private static final List<ItemLike> OSMIUM_SMELTABLES = List.of(CMItems.RAW_OSMIUM.get(), CMBlocks.OSMIUM_ORE.get(), CMBlocks.DEEPSLATE_OSMIUM_ORE.get());
//    private static final List<ItemLike> PALLADIUM_SMELTABLES = List.of(CMItems.RAW_PALLADIUM.get(), CMBlocks.PALLADIUM_ORE.get(), CMBlocks.DEEPSLATE_PALLADIUM_ORE.get());
//    private static final List<ItemLike> PLATINUM_SMELTABLES = List.of(CMItems.RAW_PLATINUM.get(), CMBlocks.PLATINUM_ORE.get(), CMBlocks.DEEPSLATE_PLATINUM_ORE.get());
//    private static final List<ItemLike> PLUTONIUM_SMELTABLES = List.of(CMItems.RAW_PLUTONIUM.get(), CMBlocks.PLUTONIUM_ORE.get(), CMBlocks.DEEPSLATE_PLUTONIUM_ORE.get());
//    private static final List<ItemLike> POLONIUM_SMELTABLES = List.of(CMItems.RAW_POLONIUM.get(), CMBlocks.POLONIUM_ORE.get(), CMBlocks.DEEPSLATE_POLONIUM_ORE.get());
//    private static final List<ItemLike> POTASSIUM_SMELTABLES = List.of(CMItems.RAW_POTASSIUM.get(), CMBlocks.POTASSIUM_ORE.get(), CMBlocks.DEEPSLATE_POTASSIUM_ORE.get());
//    private static final List<ItemLike> PRASEODYMIUM_SMELTABLES = List.of(CMItems.RAW_PRASEODYMIUM.get(), CMBlocks.PRASEODYMIUM_ORE.get(), CMBlocks.DEEPSLATE_PRASEODYMIUM_ORE.get());
//    private static final List<ItemLike> PROMETHIUM_SMELTABLES = List.of(CMItems.RAW_PROMETHIUM.get(), CMBlocks.PROMETHIUM_ORE.get(), CMBlocks.DEEPSLATE_PROMETHIUM_ORE.get());
//    private static final List<ItemLike> RADIUM_SMELTABLES = List.of(CMItems.RAW_RADIUM.get(), CMBlocks.RADIUM_ORE.get(), CMBlocks.DEEPSLATE_RADIUM_ORE.get());
//    private static final List<ItemLike> RHODIUM_SMELTABLES = List.of(CMItems.RAW_RHODIUM.get(), CMBlocks.RHODIUM_ORE.get(), CMBlocks.DEEPSLATE_RHODIUM_ORE.get());
//    private static final List<ItemLike> RUTHENIUM_SMELTABLES = List.of(CMItems.RAW_RUTHENIUM.get(), CMBlocks.RUTHENIUM_ORE.get(), CMBlocks.DEEPSLATE_RUTHENIUM_ORE.get());
//    private static final List<ItemLike> SAMARIUM_SMELTABLES = List.of(CMItems.RAW_SAMARIUM.get(), CMBlocks.SAMARIUM_ORE.get(), CMBlocks.DEEPSLATE_SAMARIUM_ORE.get());
//    private static final List<ItemLike> SCANDIUM_SMELTABLES = List.of(CMItems.RAW_SCANDIUM.get(), CMBlocks.SCANDIUM_ORE.get(), CMBlocks.DEEPSLATE_SCANDIUM_ORE.get());
//    private static final List<ItemLike> SELENIUM_SMELTABLES = List.of(CMItems.RAW_SELENIUM.get(), CMBlocks.SELENIUM_ORE.get(), CMBlocks.DEEPSLATE_SELENIUM_ORE.get());
//    private static final List<ItemLike> SILICON_SMELTABLES = List.of(CMItems.RAW_SILICON.get(), CMBlocks.SILICON_ORE.get(), CMBlocks.DEEPSLATE_SILICON_ORE.get());
//    private static final List<ItemLike> SILVER_SMELTABLES = List.of(CMItems.RAW_SILVER.get(), CMBlocks.SILVER_ORE.get(), CMBlocks.DEEPSLATE_SILVER_ORE.get());
//    private static final List<ItemLike> SODIUM_SMELTABLES = List.of(CMItems.RAW_SODIUM.get(), CMBlocks.SODIUM_ORE.get(), CMBlocks.DEEPSLATE_SODIUM_ORE.get());
//    private static final List<ItemLike> STRONTIUM_SMELTABLES = List.of(CMItems.RAW_STRONTIUM.get(), CMBlocks.STRONTIUM_ORE.get(), CMBlocks.DEEPSLATE_STRONTIUM_ORE.get());
//    private static final List<ItemLike> TELLURIUM_SMELTABLES = List.of(CMItems.RAW_TELLURIUM.get(), CMBlocks.TELLURIUM_ORE.get(), CMBlocks.DEEPSLATE_TELLURIUM_ORE.get());
//    private static final List<ItemLike> TERBIUM_SMELTABLES = List.of(CMItems.RAW_TERBIUM.get(), CMBlocks.TERBIUM_ORE.get(), CMBlocks.DEEPSLATE_TERBIUM_ORE.get());
//    private static final List<ItemLike> THALLIUM_SMELTABLES = List.of(CMItems.RAW_THALLIUM.get(), CMBlocks.THALLIUM_ORE.get(), CMBlocks.DEEPSLATE_THALLIUM_ORE.get());
//    private static final List<ItemLike> THORIUM_SMELTABLES = List.of(CMItems.RAW_THORIUM.get(), CMBlocks.THORIUM_ORE.get(), CMBlocks.DEEPSLATE_THORIUM_ORE.get());
//    private static final List<ItemLike> THULIUM_SMELTABLES = List.of(CMItems.RAW_THULIUM.get(), CMBlocks.THULIUM_ORE.get(), CMBlocks.DEEPSLATE_THULIUM_ORE.get());
//    private static final List<ItemLike> TIN_SMELTABLES = List.of(CMItems.RAW_TIN.get(), CMBlocks.TIN_ORE.get(), CMBlocks.DEEPSLATE_TIN_ORE.get());
//    private static final List<ItemLike> TITANIUM_SMELTABLES = List.of(CMItems.RAW_TITANIUM.get(), CMBlocks.TITANIUM_ORE.get(), CMBlocks.DEEPSLATE_TITANIUM_ORE.get());
//    private static final List<ItemLike> URANIUM_SMELTABLES = List.of(CMItems.RAW_URANIUM.get(), CMBlocks.URANIUM_ORE.get(), CMBlocks.DEEPSLATE_URANIUM_ORE.get());
//    private static final List<ItemLike> VANADIUM_SMELTABLES = List.of(CMItems.RAW_VANADIUM.get(), CMBlocks.VANADIUM_ORE.get(), CMBlocks.DEEPSLATE_VANADIUM_ORE.get());
//    private static final List<ItemLike> VIBRANIUM_SMELTABLES = List.of(CMItems.RAW_VIBRANIUM.get(), CMBlocks.VIBRANIUM_ORE.get(), CMBlocks.DEEPSLATE_VIBRANIUM_ORE.get());
//    private static final List<ItemLike> YTTERBIUM_SMELTABLES = List.of(CMItems.RAW_YTTERBIUM.get(), CMBlocks.YTTERBIUM_ORE.get(), CMBlocks.DEEPSLATE_YTTERBIUM_ORE.get());
//    private static final List<ItemLike> ZIRCONIUM_SMELTABLES = List.of(CMItems.RAW_ZIRCONIUM.get(), CMBlocks.ZIRCONIUM_ORE.get(), CMBlocks.DEEPSLATE_ZIRCONIUM_ORE.get());

    public CMRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        buildAlloyFurnaceRecipes(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, CMItems.MASON_JAR.get())
                .pattern("x x")
                .pattern("xxx")
                .define('x', Tags.Items.GLASS_PANES)
                .group("chrispymod")
                .unlockedBy("has_glass_panes", InventoryChangeTrigger.TriggerInstance.hasItems(Items.GLASS_PANE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CMBlocks.ALLOY_FURNACE.get())
                .pattern("iii")
                .pattern("aia")
                .pattern("sbs")
                .define('a', Items.BLAST_FURNACE)
                .define('i', Tags.Items.INGOTS_IRON)
                .define('s', Tags.Items.STONE)
                .define('b', Items.IRON_BLOCK)
                .group("chrispymod")
                .unlockedBy("has_blast_furnace", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BLAST_FURNACE))
                .save(pWriter);

//        ShapedRecipeBuilder.shaped(CMBlocks.JAM_AND_JELLY_MAKER.get())
//                .pattern("iii")
//                .pattern("rgr")
//                .pattern("iii")
//                .define('g', Tags.Items.GLASS)
//                .define('i', Tags.Items.INGOTS_IRON)
//                .define('r', Tags.Items.DUSTS_REDSTONE)
//                .group("chrispymod")
//                .unlockedBy("has_redstone", InventoryChangeTrigger.TriggerInstance.hasItems(Items.REDSTONE))
//                .save(pWriter);

//        oreSmeltingRecipes(pWriter, ALUMINUM_SMELTABLES, CMItems.ALUMINUM, 0.3f, "aluminum_smeltable");
//        oreSmeltingRecipes(pWriter, ANTIMONY_SMELTABLES, CMItems.ANTIMONY, 0.3f, "antimony_smeltable");
//        oreSmeltingRecipes(pWriter, ARSENIC_SMELTABLES, CMItems.ARSENIC, 0.3f, "arsenic_smeltable");
//        oreSmeltingRecipes(pWriter, BARIUM_SMELTABLES, CMItems.BARIUM, 0.3f, "barium_smeltable");
//        oreSmeltingRecipes(pWriter, BERYLLIUM_SMELTABLES, CMItems.BERYLLIUM, 0.3f, "beryllium_smeltable");
//        oreSmeltingRecipes(pWriter, BISMUTH_SMELTABLES, CMItems.BISMUTH, 0.3f, "bismuth_smeltable");
//        oreSmeltingRecipes(pWriter, BORON_SMELTABLES, CMItems.BORON, 0.3f, "boron_smeltable");
//        oreSmeltingRecipes(pWriter, CADMIUM_SMELTABLES, CMItems.CADMIUM, 0.3f, "cadmium_smeltable");
//        oreSmeltingRecipes(pWriter, CALCIUM_SMELTABLES, CMItems.CALCIUM, 0.3f, "calcium_smeltable");
//        oreSmeltingRecipes(pWriter, CERIUM_SMELTABLES, CMItems.CERIUM, 0.3f, "cerium_smeltable");
//        oreSmeltingRecipes(pWriter, CESIUM_SMELTABLES, CMItems.CESIUM, 0.3f, "cesium_smeltable");
//        oreSmeltingRecipes(pWriter, CHROMIUM_SMELTABLES, CMItems.CHROMIUM, 0.3f, "chromium_smeltable");
//        oreSmeltingRecipes(pWriter, DYSPROSIUM_SMELTABLES, CMItems.DYSPROSIUM, 0.3f, "dysprosium_smeltable");
//        oreSmeltingRecipes(pWriter, ERBIUM_SMELTABLES, CMItems.ERBIUM, 0.3f, "erbium_smeltable");
//        oreSmeltingRecipes(pWriter, EUROPIUM_SMELTABLES, CMItems.EUROPIUM, 0.3f, "europium_smeltable");
//        oreSmeltingRecipes(pWriter, FRANCIUM_SMELTABLES, CMItems.FRANCIUM, 0.3f, "francium_smeltable");
//        oreSmeltingRecipes(pWriter, GADOLINIUM_SMELTABLES, CMItems.GADOLINIUM, 0.3f, "gadolinium_smeltable");
//        oreSmeltingRecipes(pWriter, GALLIUM_SMELTABLES, CMItems.GALLIUM, 0.3f, "gallium_smeltable");
//        oreSmeltingRecipes(pWriter, GERMANIUM_SMELTABLES, CMItems.GERMANIUM, 0.3f, "germanium_smeltable");
//        oreSmeltingRecipes(pWriter, HAFNIUM_SMELTABLES, CMItems.HAFNIUM, 0.3f, "hafnium_smeltable");
//        oreSmeltingRecipes(pWriter, HOLMIUM_SMELTABLES, CMItems.HOLMIUM, 0.3f, "holmium_smeltable");
//        oreSmeltingRecipes(pWriter, INDIUM_SMELTABLES, CMItems.INDIUM, 0.3f, "indium_smeltable");
//        oreSmeltingRecipes(pWriter, IRIDIUM_SMELTABLES, CMItems.IRIDIUM, 0.3f, "iridium_smeltable");
//        oreSmeltingRecipes(pWriter, LANTHANUM_SMELTABLES, CMItems.LANTHANUM, 0.3f, "lanthanum_smeltable");
//        oreSmeltingRecipes(pWriter, LEAD_SMELTABLES, CMItems.LEAD, 0.3f, "lead_smeltable");
//        oreSmeltingRecipes(pWriter, LITHIUM_SMELTABLES, CMItems.LITHIUM, 0.3f, "lithium_smeltable");
//        oreSmeltingRecipes(pWriter, LUTETIUM_SMELTABLES, CMItems.LUTETIUM, 0.3f, "lutetium_smeltable");
//        oreSmeltingRecipes(pWriter, MAGNESIUM_SMELTABLES, CMItems.MAGNESIUM, 0.3f, "magnesium_smeltable");
//        oreSmeltingRecipes(pWriter, MANGANESE_SMELTABLES, CMItems.MANGANESE, 0.3f, "manganese_smeltable");
//        oreSmeltingRecipes(pWriter, MERCURY_SMELTABLES, CMItems.MERCURY, 0.3f, "mercury_smeltable");
//        oreSmeltingRecipes(pWriter, MYTHRIL_SMELTABLES, CMItems.MYTHRIL, 0.3f, "mythril_smeltable");
//        oreSmeltingRecipes(pWriter, MOLYBDENUM_SMELTABLES, CMItems.MOLYBDENUM, 0.3f, "molybdenum_smeltable");
//        oreSmeltingRecipes(pWriter, NEODYMIUM_SMELTABLES, CMItems.NEODYMIUM, 0.3f, "neodymium_smeltable");
//        oreSmeltingRecipes(pWriter, NICKEL_SMELTABLES, CMItems.NICKEL, 0.3f, "nickel_smeltable");
//        oreSmeltingRecipes(pWriter, OSMIUM_SMELTABLES, CMItems.OSMIUM, 0.3f, "osmium_smeltable");
//        oreSmeltingRecipes(pWriter, PALLADIUM_SMELTABLES, CMItems.PALLADIUM, 0.3f, "palladium_smeltable");
//        oreSmeltingRecipes(pWriter, PLATINUM_SMELTABLES, CMItems.PLATINUM, 0.3f, "platinum_smeltable");
//        oreSmeltingRecipes(pWriter, PLUTONIUM_SMELTABLES, CMItems.PLUTONIUM, 0.3f, "plutonium_smeltable");
//        oreSmeltingRecipes(pWriter, POLONIUM_SMELTABLES, CMItems.POLONIUM, 0.3f, "polonium_smeltable");
//        oreSmeltingRecipes(pWriter, POTASSIUM_SMELTABLES, CMItems.POTASSIUM, 0.3f, "potassium_smeltable");
//        oreSmeltingRecipes(pWriter, PRASEODYMIUM_SMELTABLES, CMItems.PRASEODYMIUM, 0.3f, "praseodymium_smeltable");
//        oreSmeltingRecipes(pWriter, PROMETHIUM_SMELTABLES, CMItems.PROMETHIUM, 0.3f, "promethium_smeltable");
//        oreSmeltingRecipes(pWriter, RADIUM_SMELTABLES, CMItems.RADIUM, 0.3f, "radium_smeltable");
//        oreSmeltingRecipes(pWriter, RHODIUM_SMELTABLES, CMItems.RHODIUM, 0.3f, "rhodium_smeltable");
//        oreSmeltingRecipes(pWriter, RUTHENIUM_SMELTABLES, CMItems.RUTHENIUM, 0.3f, "ruthenium_smeltable");
//        oreSmeltingRecipes(pWriter, SAMARIUM_SMELTABLES, CMItems.SAMARIUM, 0.3f, "samarium_smeltable");
//        oreSmeltingRecipes(pWriter, SCANDIUM_SMELTABLES, CMItems.SCANDIUM, 0.3f, "scandium_smeltable");
//        oreSmeltingRecipes(pWriter, SELENIUM_SMELTABLES, CMItems.SELENIUM, 0.3f, "selenium_smeltable");
//        oreSmeltingRecipes(pWriter, SILICON_SMELTABLES, CMItems.SILICON, 0.3f, "silicon_smeltable");
//        oreSmeltingRecipes(pWriter, SILVER_SMELTABLES, CMItems.SILVER, 0.3f, "silver_smeltable");
//        oreSmeltingRecipes(pWriter, SODIUM_SMELTABLES, CMItems.SODIUM, 0.3f, "sodium_smeltable");
//        oreSmeltingRecipes(pWriter, STRONTIUM_SMELTABLES, CMItems.STRONTIUM, 0.3f, "strontium_smeltable");
//        oreSmeltingRecipes(pWriter, TELLURIUM_SMELTABLES, CMItems.TELLURIUM, 0.3f, "tellurium_smeltable");
//        oreSmeltingRecipes(pWriter, TERBIUM_SMELTABLES, CMItems.TERBIUM, 0.3f, "terbium_smeltable");
//        oreSmeltingRecipes(pWriter, THALLIUM_SMELTABLES, CMItems.THALLIUM, 0.3f, "thallium_smeltable");
//        oreSmeltingRecipes(pWriter, THORIUM_SMELTABLES, CMItems.THORIUM, 0.3f, "thorium_smeltable");
//        oreSmeltingRecipes(pWriter, THULIUM_SMELTABLES, CMItems.THULIUM, 0.3f, "thulium_smeltable");
//        oreSmeltingRecipes(pWriter, TIN_SMELTABLES, CMItems.TIN, 0.3f, "tin_smeltable");
//        oreSmeltingRecipes(pWriter, TITANIUM_SMELTABLES, CMItems.TITANIUM, 0.3f, "titanium_smeltable");
//        oreSmeltingRecipes(pWriter, URANIUM_SMELTABLES, CMItems.URANIUM, 0.3f, "uranium_smeltable");
//        oreSmeltingRecipes(pWriter, VANADIUM_SMELTABLES, CMItems.VANADIUM, 0.3f, "vanadium_smeltable");
//        oreSmeltingRecipes(pWriter, VIBRANIUM_SMELTABLES, CMItems.VIBRANIUM, 0.3f, "vibranium_smeltable");
//        oreSmeltingRecipes(pWriter, YTTERBIUM_SMELTABLES, CMItems.YTTERBIUM, 0.3f, "ytterbium_smeltable");
//        oreSmeltingRecipes(pWriter, ZIRCONIUM_SMELTABLES, CMItems.ZIRCONIUM, 0.3f, "zirconium_smeltable");

//        furnaceOreRecipe(BlockInit.ALUMINUM_ORE, BlockInit.DEEPSLATE_ALUMINUM_ORE, ItemInit.ALUMINUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_ALUMINUM, ItemInit.ALUMINUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_ALUMINUM, BlockInit.RAW_ALUMINUM_BLOCK);
//        furnaceOreRecipe(BlockInit.ANTIMONY_ORE, BlockInit.DEEPSLATE_ANTIMONY_ORE, ItemInit.ANTIMONY, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_ANTIMONY, ItemInit.ANTIMONY, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_ANTIMONY, BlockInit.RAW_ANTIMONY_BLOCK);
//        furnaceOreRecipe(BlockInit.ARSENIC_ORE, BlockInit.DEEPSLATE_ARSENIC_ORE, ItemInit.ARSENIC, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_ARSENIC, ItemInit.ARSENIC, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_ARSENIC, BlockInit.RAW_ARSENIC_BLOCK);
//        furnaceOreRecipe(BlockInit.BARIUM_ORE, BlockInit.DEEPSLATE_BARIUM_ORE, ItemInit.BARIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_BARIUM, ItemInit.BARIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_BARIUM, BlockInit.RAW_BARIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.BERYLLIUM_ORE, BlockInit.DEEPSLATE_BERYLLIUM_ORE, ItemInit.BERYLLIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_BERYLLIUM, ItemInit.BERYLLIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_BERYLLIUM, BlockInit.RAW_BERYLLIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.BISMUTH_ORE, BlockInit.DEEPSLATE_BISMUTH_ORE, ItemInit.BISMUTH, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_BISMUTH, ItemInit.BISMUTH, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_BISMUTH, BlockInit.RAW_BISMUTH_BLOCK);
//        furnaceOreRecipe(BlockInit.BORON_ORE, BlockInit.DEEPSLATE_BORON_ORE, ItemInit.BORON, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_BORON, ItemInit.BORON, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_BORON, BlockInit.RAW_BORON_BLOCK);
//        furnaceOreRecipe(BlockInit.CADMIUM_ORE, BlockInit.DEEPSLATE_CADMIUM_ORE, ItemInit.CADMIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_CADMIUM, ItemInit.CADMIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_CADMIUM, BlockInit.RAW_CADMIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.CALCIUM_ORE, BlockInit.DEEPSLATE_CALCIUM_ORE, ItemInit.CALCIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_CALCIUM, ItemInit.CALCIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_CALCIUM, BlockInit.RAW_CALCIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.CERIUM_ORE, BlockInit.DEEPSLATE_CERIUM_ORE, ItemInit.CERIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_CERIUM, ItemInit.CERIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_CERIUM, BlockInit.RAW_CERIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.CESIUM_ORE, BlockInit.DEEPSLATE_CESIUM_ORE, ItemInit.CESIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_CESIUM, ItemInit.CESIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_CESIUM, BlockInit.RAW_CESIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.CHROMIUM_ORE, BlockInit.DEEPSLATE_CHROMIUM_ORE, ItemInit.CHROMIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_CHROMIUM, ItemInit.CHROMIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_CHROMIUM, BlockInit.RAW_CHROMIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.DYSPROSIUM_ORE, BlockInit.DEEPSLATE_DYSPROSIUM_ORE, ItemInit.DYSPROSIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_DYSPROSIUM, ItemInit.DYSPROSIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_DYSPROSIUM, BlockInit.RAW_DYSPROSIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.ERBIUM_ORE, BlockInit.DEEPSLATE_ERBIUM_ORE, ItemInit.ERBIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_ERBIUM, ItemInit.ERBIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_ERBIUM, BlockInit.RAW_ERBIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.EUROPIUM_ORE, BlockInit.DEEPSLATE_EUROPIUM_ORE, ItemInit.EUROPIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_EUROPIUM, ItemInit.EUROPIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_EUROPIUM, BlockInit.RAW_EUROPIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.FRANCIUM_ORE, BlockInit.DEEPSLATE_FRANCIUM_ORE, ItemInit.FRANCIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_FRANCIUM, ItemInit.FRANCIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_FRANCIUM, BlockInit.RAW_FRANCIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.GADOLINIUM_ORE, BlockInit.DEEPSLATE_GADOLINIUM_ORE, ItemInit.GADOLINIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_GADOLINIUM, ItemInit.GADOLINIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_GADOLINIUM, BlockInit.RAW_GADOLINIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.GALLIUM_ORE, BlockInit.DEEPSLATE_GALLIUM_ORE, ItemInit.GALLIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_GALLIUM, ItemInit.GALLIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_GALLIUM, BlockInit.RAW_GALLIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.GERMANIUM_ORE, BlockInit.DEEPSLATE_GERMANIUM_ORE, ItemInit.GERMANIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_GERMANIUM, ItemInit.GERMANIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_GERMANIUM, BlockInit.RAW_GERMANIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.HAFNIUM_ORE, BlockInit.DEEPSLATE_HAFNIUM_ORE, ItemInit.HAFNIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_HAFNIUM, ItemInit.HAFNIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_HAFNIUM, BlockInit.RAW_HAFNIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.HOLMIUM_ORE, BlockInit.DEEPSLATE_HOLMIUM_ORE, ItemInit.HOLMIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_HOLMIUM, ItemInit.HOLMIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_HOLMIUM, BlockInit.RAW_HOLMIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.INDIUM_ORE, BlockInit.DEEPSLATE_INDIUM_ORE, ItemInit.INDIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_INDIUM, ItemInit.INDIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_INDIUM, BlockInit.RAW_INDIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.IRIDIUM_ORE, BlockInit.DEEPSLATE_IRIDIUM_ORE, ItemInit.IRIDIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_IRIDIUM, ItemInit.IRIDIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_IRIDIUM, BlockInit.RAW_IRIDIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.LANTHANUM_ORE, BlockInit.DEEPSLATE_LANTHANUM_ORE, ItemInit.LANTHANUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_LANTHANUM, ItemInit.LANTHANUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_LANTHANUM, BlockInit.RAW_LANTHANUM_BLOCK);
//        furnaceOreRecipe(BlockInit.LEAD_ORE, BlockInit.DEEPSLATE_LEAD_ORE, ItemInit.LEAD, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_LEAD, ItemInit.LEAD, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_LEAD, BlockInit.RAW_LEAD_BLOCK);
//        furnaceOreRecipe(BlockInit.LITHIUM_ORE, BlockInit.DEEPSLATE_LITHIUM_ORE, ItemInit.LITHIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_LITHIUM, ItemInit.LITHIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_LITHIUM, BlockInit.RAW_LITHIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.LUTETIUM_ORE, BlockInit.DEEPSLATE_LUTETIUM_ORE, ItemInit.LUTETIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_LUTETIUM, ItemInit.LUTETIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_LUTETIUM, BlockInit.RAW_LUTETIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.MAGNESIUM_ORE, BlockInit.DEEPSLATE_MAGNESIUM_ORE, ItemInit.MAGNESIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_MAGNESIUM, ItemInit.MAGNESIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_MAGNESIUM, BlockInit.RAW_MAGNESIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.MANGANESE_ORE, BlockInit.DEEPSLATE_MANGANESE_ORE, ItemInit.MANGANESE, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_MANGANESE, ItemInit.MANGANESE, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_MANGANESE, BlockInit.RAW_MANGANESE_BLOCK);
//        furnaceOreRecipe(BlockInit.MERCURY_ORE, BlockInit.DEEPSLATE_MERCURY_ORE, ItemInit.MERCURY, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_MERCURY, ItemInit.MERCURY, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_MERCURY, BlockInit.RAW_MERCURY_BLOCK);
//        furnaceOreRecipe(BlockInit.MYTHRIL_ORE, BlockInit.DEEPSLATE_MYTHRIL_ORE, ItemInit.MYTHRIL, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_MYTHRIL, ItemInit.MYTHRIL, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_MYTHRIL, BlockInit.RAW_MYTHRIL_BLOCK);
//        furnaceOreRecipe(BlockInit.MOLYBDENUM_ORE, BlockInit.DEEPSLATE_MOLYBDENUM_ORE, ItemInit.MOLYBDENUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_MOLYBDENUM, ItemInit.MOLYBDENUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_MOLYBDENUM, BlockInit.RAW_MOLYBDENUM_BLOCK);
//        furnaceOreRecipe(BlockInit.NEODYMIUM_ORE, BlockInit.DEEPSLATE_NEODYMIUM_ORE, ItemInit.NEODYMIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_NEODYMIUM, ItemInit.NEODYMIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_NEODYMIUM, BlockInit.RAW_NEODYMIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.NICKEL_ORE, BlockInit.DEEPSLATE_NICKEL_ORE, ItemInit.NICKEL, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_NICKEL, ItemInit.NICKEL, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_NICKEL, BlockInit.RAW_NICKEL_BLOCK);
//        furnaceOreRecipe(BlockInit.OSMIUM_ORE, BlockInit.DEEPSLATE_OSMIUM_ORE, ItemInit.OSMIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_OSMIUM, ItemInit.OSMIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_OSMIUM, BlockInit.RAW_OSMIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.PALLADIUM_ORE, BlockInit.DEEPSLATE_PALLADIUM_ORE, ItemInit.PALLADIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_PALLADIUM, ItemInit.PALLADIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_PALLADIUM, BlockInit.RAW_PALLADIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.PLATINUM_ORE, BlockInit.DEEPSLATE_PLATINUM_ORE, ItemInit.PLATINUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_PLATINUM, ItemInit.PLATINUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_PLATINUM, BlockInit.RAW_PLATINUM_BLOCK);
//        furnaceOreRecipe(BlockInit.PLUTONIUM_ORE, BlockInit.DEEPSLATE_PLUTONIUM_ORE, ItemInit.PLUTONIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_PLUTONIUM, ItemInit.PLUTONIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_PLUTONIUM, BlockInit.RAW_PLUTONIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.POLONIUM_ORE, BlockInit.DEEPSLATE_POLONIUM_ORE, ItemInit.POLONIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_POLONIUM, ItemInit.POLONIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_POLONIUM, BlockInit.RAW_POLONIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.POTASSIUM_ORE, BlockInit.DEEPSLATE_POTASSIUM_ORE, ItemInit.POTASSIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_POTASSIUM, ItemInit.POTASSIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_POTASSIUM, BlockInit.RAW_POTASSIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.PRASEODYMIUM_ORE, BlockInit.DEEPSLATE_PRASEODYMIUM_ORE, ItemInit.PRASEODYMIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_PRASEODYMIUM, ItemInit.PRASEODYMIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_PRASEODYMIUM, BlockInit.RAW_PRASEODYMIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.PROMETHIUM_ORE, BlockInit.DEEPSLATE_PROMETHIUM_ORE, ItemInit.PROMETHIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_PROMETHIUM, ItemInit.PROMETHIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_PROMETHIUM, BlockInit.RAW_PROMETHIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.RADIUM_ORE, BlockInit.DEEPSLATE_RADIUM_ORE, ItemInit.RADIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_RADIUM, ItemInit.RADIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_RADIUM, BlockInit.RAW_RADIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.RHODIUM_ORE, BlockInit.DEEPSLATE_RHODIUM_ORE, ItemInit.RHODIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_RHODIUM, ItemInit.RHODIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_RHODIUM, BlockInit.RAW_RHODIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.RUTHENIUM_ORE, BlockInit.DEEPSLATE_RUTHENIUM_ORE, ItemInit.RUTHENIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_RUTHENIUM, ItemInit.RUTHENIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_RUTHENIUM, BlockInit.RAW_RUTHENIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.SAMARIUM_ORE, BlockInit.DEEPSLATE_SAMARIUM_ORE, ItemInit.SAMARIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_SAMARIUM, ItemInit.SAMARIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_SAMARIUM, BlockInit.RAW_SAMARIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.SCANDIUM_ORE, BlockInit.DEEPSLATE_SCANDIUM_ORE, ItemInit.SCANDIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_SCANDIUM, ItemInit.SCANDIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_SCANDIUM, BlockInit.RAW_SCANDIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.SELENIUM_ORE, BlockInit.DEEPSLATE_SELENIUM_ORE, ItemInit.SELENIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_SELENIUM, ItemInit.SELENIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_SELENIUM, BlockInit.RAW_SELENIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.SILICON_ORE, BlockInit.DEEPSLATE_SILICON_ORE, ItemInit.SILICON, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_SILICON, ItemInit.SILICON, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_SILICON, BlockInit.RAW_SILICON_BLOCK);
//        furnaceOreRecipe(BlockInit.SILVER_ORE, BlockInit.DEEPSLATE_SILVER_ORE, ItemInit.SILVER, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_SILVER, ItemInit.SILVER, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_SILVER, BlockInit.RAW_SILVER_BLOCK);
//        furnaceOreRecipe(BlockInit.SODIUM_ORE, BlockInit.DEEPSLATE_SODIUM_ORE, ItemInit.SODIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_SODIUM, ItemInit.SODIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_SODIUM, BlockInit.RAW_SODIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.STRONTIUM_ORE, BlockInit.DEEPSLATE_STRONTIUM_ORE, ItemInit.STRONTIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_STRONTIUM, ItemInit.STRONTIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_STRONTIUM, BlockInit.RAW_STRONTIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.TELLURIUM_ORE, BlockInit.DEEPSLATE_TELLURIUM_ORE, ItemInit.TELLURIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_TELLURIUM, ItemInit.TELLURIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_TELLURIUM, BlockInit.RAW_TELLURIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.TERBIUM_ORE, BlockInit.DEEPSLATE_TERBIUM_ORE, ItemInit.TERBIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_TERBIUM, ItemInit.TERBIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_TERBIUM, BlockInit.RAW_TERBIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.THALLIUM_ORE, BlockInit.DEEPSLATE_THALLIUM_ORE, ItemInit.THALLIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_THALLIUM, ItemInit.THALLIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_THALLIUM, BlockInit.RAW_THALLIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.THORIUM_ORE, BlockInit.DEEPSLATE_THORIUM_ORE, ItemInit.THORIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_THORIUM, ItemInit.THORIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_THORIUM, BlockInit.RAW_THORIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.THULIUM_ORE, BlockInit.DEEPSLATE_THULIUM_ORE, ItemInit.THULIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_THULIUM, ItemInit.THULIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_THULIUM, BlockInit.RAW_THULIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.TIN_ORE, BlockInit.DEEPSLATE_TIN_ORE, ItemInit.TIN, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_TIN, ItemInit.TIN, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_TIN, BlockInit.RAW_TIN_BLOCK);
//        furnaceOreRecipe(BlockInit.TITANIUM_ORE, BlockInit.DEEPSLATE_TITANIUM_ORE, ItemInit.TITANIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_TITANIUM, ItemInit.TITANIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_TITANIUM, BlockInit.RAW_TITANIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.URANIUM_ORE, BlockInit.DEEPSLATE_URANIUM_ORE, ItemInit.URANIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_URANIUM, ItemInit.URANIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_URANIUM, BlockInit.RAW_URANIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.VANADIUM_ORE, BlockInit.DEEPSLATE_VANADIUM_ORE, ItemInit.VANADIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_VANADIUM, ItemInit.VANADIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_VANADIUM, BlockInit.RAW_VANADIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.VIBRANIUM_ORE, BlockInit.DEEPSLATE_VIBRANIUM_ORE, ItemInit.VIBRANIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_VIBRANIUM, ItemInit.VIBRANIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_VIBRANIUM, BlockInit.RAW_VIBRANIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.YTTERBIUM_ORE, BlockInit.DEEPSLATE_YTTERBIUM_ORE, ItemInit.YTTERBIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_YTTERBIUM, ItemInit.YTTERBIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_YTTERBIUM, BlockInit.RAW_YTTERBIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.YTTRIUM_ORE, BlockInit.DEEPSLATE_YTTRIUM_ORE, ItemInit.YTTRIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_YTTRIUM, ItemInit.YTTRIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_YTTRIUM, BlockInit.RAW_YTTRIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.ZIRCONIUM_ORE, BlockInit.DEEPSLATE_ZIRCONIUM_ORE, ItemInit.ZIRCONIUM, 1.0f, 200, pWriter);
//        furnaceRawRecipe(ItemInit.RAW_ZIRCONIUM, ItemInit.ZIRCONIUM, 1.0f, 200, pWriter);
//        //rawMaterialBlockCrafting(ItemInit.RAW_ZIRCONIUM, BlockInit.RAW_ZIRCONIUM_BLOCK);

//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.GRASS)
//                .pattern("AAA")
//                .pattern("AAA")
//                .pattern("AAA")
//                .define('A', Items.NAME_TAG)
//                .unlockedBy("has_name_tag", inventoryTrigger(ItemPredicate.Builder.item().of(Items.NAME_TAG).build())).save(pWriter);
//
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, Blocks.GRASS_BLOCK, 9)
//                .requires(Blocks.DIRT)
//                .unlockedBy("has_dirt_block", inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIRT).build())).save(pWriter);

//        nineBlockStorageRecipes()
//        oreSmelting(pWriter, SMELTABLES, RecipeCategory.MISC, Items.COPPER, 0.3f, 200, "smeltable");
//        oreBlasting(pWriter, SMELTABLES, RecipeCategory.MISC, Items.COPPER, 0.3f, 100, "smeltable");
    }

    //    public static void buildJamAndJellyMakerRecipes(Consumer<FinishedRecipe> consumer) {
//        new JamAndJellyMakerRecipeBuilder(ItemInit.STRAWBERRY.get(), ItemInit.STRAWBERRY_JAM.get()).unlockedBy("has_strawberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.STRAWBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.BLUEBERRY.get(), ItemInit.BLUEBERRY_JAM.get()).unlockedBy("has_blueberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.BLUEBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.LOGANBERRY.get(), ItemInit.LOGANBERRY_JAM.get()).unlockedBy("has_loganberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.LOGANBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.RED_RASPBERRY.get(), ItemInit.RED_RASPBERRY_JAM.get()).unlockedBy("has_red_raspberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.RED_RASPBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.BLACK_RASPBERRY.get(), ItemInit.BLACK_RASPBERRY_JAM.get()).unlockedBy("has_black_raspberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.BLACK_RASPBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.GOLDEN_RASPBERRY.get(), ItemInit.GOLDEN_RASPBERRY_JAM.get()).unlockedBy("has_golden_raspberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.GOLDEN_RASPBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.WHITE_RASPBERRY.get(), ItemInit.WHITE_RASPBERRY_JAM.get()).unlockedBy("has_white_raspberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.WHITE_RASPBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.MARIONBERRY.get(), ItemInit.MARIONBERRY_JAM.get()).unlockedBy("has_marionberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MARIONBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.BLACKCURRANT.get(), ItemInit.BLACKCURRANT_JAM.get()).unlockedBy("has_blackcurrant", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.BLACKCURRANT.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.REDCURRANT.get(), ItemInit.REDCURRANT_JAM.get()).unlockedBy("has_redcurrant", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.REDCURRANT.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.HUCKLEBERRY.get(), ItemInit.HUCKLEBERRY_JAM.get()).unlockedBy("has_huckleberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.HUCKLEBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.WINEBERRY.get(), ItemInit.WINEBERRY_JAM.get()).unlockedBy("has_wineberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.WINEBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.ELDERBERRY.get(), ItemInit.ELDERBERRY_JAM.get()).unlockedBy("has_elderberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.ELDERBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.BLACKBERRY.get(), ItemInit.BLACKBERRY_JAM.get()).unlockedBy("has_blackberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.BLACKBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.BOYSENBERRY.get(), ItemInit.BOYSENBERRY_JAM.get()).unlockedBy("has_boysenberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.BOYSENBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.GROUND_CHERRY.get(), ItemInit.GROUND_CHERRY_JAM.get()).unlockedBy("has_ground_cherry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.GROUND_CHERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.ARONIA_BERRY.get(), ItemInit.ARONIA_BERRY_JAM.get()).unlockedBy("has_aronia_berry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.ARONIA_BERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.SERVICEBERRY.get(), ItemInit.SERVICEBERRY_JAM.get()).unlockedBy("has_serviceberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.SERVICEBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.WONDERBERRY.get(), ItemInit.WONDERBERRY_JAM.get()).unlockedBy("has_wonderberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.WONDERBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.MULBERRY.get(), ItemInit.MULBERRY_JAM.get()).unlockedBy("has_mulberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.MULBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.LINGONBERRY.get(), ItemInit.LINGONBERRY_JAM.get()).unlockedBy("has_lingonberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.LINGONBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.CRANBERRY.get(), ItemInit.CRANBERRY_JAM.get()).unlockedBy("has_cranberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.CRANBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.DEWBERRY.get(), ItemInit.DEWBERRY_JAM.get()).unlockedBy("has_dewberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.DEWBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.THIMBLEBERRY.get(), ItemInit.THIMBLEBERRY_JAM.get()).unlockedBy("has_thimbleberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.THIMBLEBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.GOOSEBERRY.get(), ItemInit.GOOSEBERRY_JAM.get()).unlockedBy("has_gooseberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.GOOSEBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.CHOKEBERRY.get(), ItemInit.CHOKEBERRY_JAM.get()).unlockedBy("has_chokeberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.CHOKEBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.OLALLIEBERRY.get(), ItemInit.OLALLIEBERRY_JAM.get()).unlockedBy("has_olallieberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.OLALLIEBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.ACEROLA_CHERRY.get(), ItemInit.ACEROLA_CHERRY_JAM.get()).unlockedBy("has_acerola_cherry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.ACEROLA_CHERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.BARBERRY.get(), ItemInit.BARBERRY_JAM.get()).unlockedBy("has_barberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.BARBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.BAYBERRY.get(), ItemInit.BAYBERRY_JAM.get()).unlockedBy("has_bayberry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.BAYBERRY.get()).build())).save(consumer);
//        new JamAndJellyMakerRecipeBuilder(ItemInit.GOGI_BERRY.get(), ItemInit.GOGI_BERRY_JAM.get()).unlockedBy("has_gogi_berry", inventoryTrigger(ItemPredicate.Builder.item().of(ItemInit.GOGI_BERRY.get()).build())).save(consumer);
//    }

    public static void buildAlloyFurnaceRecipes(Consumer<FinishedRecipe> consumer) {
        new AlloyFurnaceRecipeBuilder(Items.DIAMOND, Items.EMERALD, CMItems.BLUE_EMERALD.get(), 1).unlockedBy("has_diamond", inventoryTrigger(ItemPredicate.Builder.item().of(Items.DIAMOND).build())).save(consumer);
    }

    private void oreSmeltingRecipes(Consumer<FinishedRecipe> pWriter, List<ItemLike> smeltables, RegistryObject<Item> resultItem, float experience, String group) {
        oreSmelting(pWriter, smeltables, RecipeCategory.MISC, resultItem.get(), experience, 200, group);
        oreBlasting(pWriter, smeltables, RecipeCategory.MISC, resultItem.get(), experience, 100, group);
    }
}
