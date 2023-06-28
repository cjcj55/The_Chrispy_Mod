//package io.github.cjcj55.chrispymod.datagen;
//
//import io.github.cjcj55.chrispymod.core.init.BlockInit;
//import io.github.cjcj55.chrispymod.core.init.ItemInit;
//import net.minecraft.advancements.critereon.InventoryChangeTrigger;
//import net.minecraft.data.DataGenerator;
//import net.minecraft.data.recipes.*;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.Items;
//import net.minecraft.world.item.crafting.Ingredient;
//import net.minecraft.world.level.block.Block;
//import net.minecraftforge.common.Tags;
//import net.minecraftforge.registries.RegistryObject;
//
//import java.util.function.Consumer;
//
//public class CMRecipes extends RecipeProvider {
//
//    public CMRecipes(DataGenerator generatorIn) {
//        super(generatorIn);
//    }
//
//    @Override
//    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
//
//        CustomRecipes.register(consumer);
//
//        ShapedRecipeBuilder.shaped(ItemInit.MASON_JAR.get())
//                .pattern("x x")
//                .pattern("xxx")
//                .define('x', Tags.Items.GLASS_PANES)
//                .group("chrispymod")
//                .unlockedBy("has_glass_panes", InventoryChangeTrigger.TriggerInstance.hasItems(Items.GLASS_PANE))
//                .save(consumer);
//
//        ShapedRecipeBuilder.shaped(BlockInit.ALLOY_FURNACE.get())
//                .pattern("iii")
//                .pattern("aia")
//                .pattern("sbs")
//                .define('a', Items.BLAST_FURNACE)
//                .define('i', Tags.Items.INGOTS_IRON)
//                .define('s', Tags.Items.STONE)
//                .define('b', Items.IRON_BLOCK)
//                .group("chrispymod")
//                .unlockedBy("has_blast_furnace", InventoryChangeTrigger.TriggerInstance.hasItems(Items.BLAST_FURNACE))
//                .save(consumer);
//
//        ShapedRecipeBuilder.shaped(BlockInit.JAM_AND_JELLY_MAKER.get())
//                .pattern("iii")
//                .pattern("rgr")
//                .pattern("iii")
//                .define('g', Tags.Items.GLASS)
//                .define('i', Tags.Items.INGOTS_IRON)
//                .define('r', Tags.Items.DUSTS_REDSTONE)
//                .group("chrispymod")
//                .unlockedBy("has_redstone", InventoryChangeTrigger.TriggerInstance.hasItems(Items.REDSTONE))
//                .save(consumer);
//
//        furnaceOreRecipe(BlockInit.ALUMINUM_ORE, BlockInit.DEEPSLATE_ALUMINUM_ORE, ItemInit.ALUMINUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_ALUMINUM, ItemInit.ALUMINUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_ALUMINUM, BlockInit.RAW_ALUMINUM_BLOCK);
//        furnaceOreRecipe(BlockInit.ANTIMONY_ORE, BlockInit.DEEPSLATE_ANTIMONY_ORE, ItemInit.ANTIMONY, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_ANTIMONY, ItemInit.ANTIMONY, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_ANTIMONY, BlockInit.RAW_ANTIMONY_BLOCK);
//        furnaceOreRecipe(BlockInit.ARSENIC_ORE, BlockInit.DEEPSLATE_ARSENIC_ORE, ItemInit.ARSENIC, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_ARSENIC, ItemInit.ARSENIC, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_ARSENIC, BlockInit.RAW_ARSENIC_BLOCK);
//        furnaceOreRecipe(BlockInit.BARIUM_ORE, BlockInit.DEEPSLATE_BARIUM_ORE, ItemInit.BARIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_BARIUM, ItemInit.BARIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_BARIUM, BlockInit.RAW_BARIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.BERYLLIUM_ORE, BlockInit.DEEPSLATE_BERYLLIUM_ORE, ItemInit.BERYLLIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_BERYLLIUM, ItemInit.BERYLLIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_BERYLLIUM, BlockInit.RAW_BERYLLIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.BISMUTH_ORE, BlockInit.DEEPSLATE_BISMUTH_ORE, ItemInit.BISMUTH, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_BISMUTH, ItemInit.BISMUTH, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_BISMUTH, BlockInit.RAW_BISMUTH_BLOCK);
//        furnaceOreRecipe(BlockInit.BORON_ORE, BlockInit.DEEPSLATE_BORON_ORE, ItemInit.BORON, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_BORON, ItemInit.BORON, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_BORON, BlockInit.RAW_BORON_BLOCK);
//        furnaceOreRecipe(BlockInit.CADMIUM_ORE, BlockInit.DEEPSLATE_CADMIUM_ORE, ItemInit.CADMIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_CADMIUM, ItemInit.CADMIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_CADMIUM, BlockInit.RAW_CADMIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.CALCIUM_ORE, BlockInit.DEEPSLATE_CALCIUM_ORE, ItemInit.CALCIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_CALCIUM, ItemInit.CALCIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_CALCIUM, BlockInit.RAW_CALCIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.CERIUM_ORE, BlockInit.DEEPSLATE_CERIUM_ORE, ItemInit.CERIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_CERIUM, ItemInit.CERIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_CERIUM, BlockInit.RAW_CERIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.CESIUM_ORE, BlockInit.DEEPSLATE_CESIUM_ORE, ItemInit.CESIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_CESIUM, ItemInit.CESIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_CESIUM, BlockInit.RAW_CESIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.CHROMIUM_ORE, BlockInit.DEEPSLATE_CHROMIUM_ORE, ItemInit.CHROMIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_CHROMIUM, ItemInit.CHROMIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_CHROMIUM, BlockInit.RAW_CHROMIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.DYSPROSIUM_ORE, BlockInit.DEEPSLATE_DYSPROSIUM_ORE, ItemInit.DYSPROSIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_DYSPROSIUM, ItemInit.DYSPROSIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_DYSPROSIUM, BlockInit.RAW_DYSPROSIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.ERBIUM_ORE, BlockInit.DEEPSLATE_ERBIUM_ORE, ItemInit.ERBIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_ERBIUM, ItemInit.ERBIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_ERBIUM, BlockInit.RAW_ERBIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.EUROPIUM_ORE, BlockInit.DEEPSLATE_EUROPIUM_ORE, ItemInit.EUROPIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_EUROPIUM, ItemInit.EUROPIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_EUROPIUM, BlockInit.RAW_EUROPIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.FRANCIUM_ORE, BlockInit.DEEPSLATE_FRANCIUM_ORE, ItemInit.FRANCIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_FRANCIUM, ItemInit.FRANCIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_FRANCIUM, BlockInit.RAW_FRANCIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.GADOLINIUM_ORE, BlockInit.DEEPSLATE_GADOLINIUM_ORE, ItemInit.GADOLINIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_GADOLINIUM, ItemInit.GADOLINIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_GADOLINIUM, BlockInit.RAW_GADOLINIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.GALLIUM_ORE, BlockInit.DEEPSLATE_GALLIUM_ORE, ItemInit.GALLIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_GALLIUM, ItemInit.GALLIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_GALLIUM, BlockInit.RAW_GALLIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.GERMANIUM_ORE, BlockInit.DEEPSLATE_GERMANIUM_ORE, ItemInit.GERMANIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_GERMANIUM, ItemInit.GERMANIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_GERMANIUM, BlockInit.RAW_GERMANIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.HAFNIUM_ORE, BlockInit.DEEPSLATE_HAFNIUM_ORE, ItemInit.HAFNIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_HAFNIUM, ItemInit.HAFNIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_HAFNIUM, BlockInit.RAW_HAFNIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.HOLMIUM_ORE, BlockInit.DEEPSLATE_HOLMIUM_ORE, ItemInit.HOLMIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_HOLMIUM, ItemInit.HOLMIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_HOLMIUM, BlockInit.RAW_HOLMIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.INDIUM_ORE, BlockInit.DEEPSLATE_INDIUM_ORE, ItemInit.INDIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_INDIUM, ItemInit.INDIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_INDIUM, BlockInit.RAW_INDIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.IRIDIUM_ORE, BlockInit.DEEPSLATE_IRIDIUM_ORE, ItemInit.IRIDIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_IRIDIUM, ItemInit.IRIDIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_IRIDIUM, BlockInit.RAW_IRIDIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.LANTHANUM_ORE, BlockInit.DEEPSLATE_LANTHANUM_ORE, ItemInit.LANTHANUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_LANTHANUM, ItemInit.LANTHANUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_LANTHANUM, BlockInit.RAW_LANTHANUM_BLOCK);
//        furnaceOreRecipe(BlockInit.LEAD_ORE, BlockInit.DEEPSLATE_LEAD_ORE, ItemInit.LEAD, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_LEAD, ItemInit.LEAD, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_LEAD, BlockInit.RAW_LEAD_BLOCK);
//        furnaceOreRecipe(BlockInit.LITHIUM_ORE, BlockInit.DEEPSLATE_LITHIUM_ORE, ItemInit.LITHIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_LITHIUM, ItemInit.LITHIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_LITHIUM, BlockInit.RAW_LITHIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.LUTETIUM_ORE, BlockInit.DEEPSLATE_LUTETIUM_ORE, ItemInit.LUTETIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_LUTETIUM, ItemInit.LUTETIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_LUTETIUM, BlockInit.RAW_LUTETIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.MAGNESIUM_ORE, BlockInit.DEEPSLATE_MAGNESIUM_ORE, ItemInit.MAGNESIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_MAGNESIUM, ItemInit.MAGNESIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_MAGNESIUM, BlockInit.RAW_MAGNESIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.MANGANESE_ORE, BlockInit.DEEPSLATE_MANGANESE_ORE, ItemInit.MANGANESE, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_MANGANESE, ItemInit.MANGANESE, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_MANGANESE, BlockInit.RAW_MANGANESE_BLOCK);
//        furnaceOreRecipe(BlockInit.MERCURY_ORE, BlockInit.DEEPSLATE_MERCURY_ORE, ItemInit.MERCURY, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_MERCURY, ItemInit.MERCURY, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_MERCURY, BlockInit.RAW_MERCURY_BLOCK);
//        furnaceOreRecipe(BlockInit.MYTHRIL_ORE, BlockInit.DEEPSLATE_MYTHRIL_ORE, ItemInit.MYTHRIL, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_MYTHRIL, ItemInit.MYTHRIL, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_MYTHRIL, BlockInit.RAW_MYTHRIL_BLOCK);
//        furnaceOreRecipe(BlockInit.MOLYBDENUM_ORE, BlockInit.DEEPSLATE_MOLYBDENUM_ORE, ItemInit.MOLYBDENUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_MOLYBDENUM, ItemInit.MOLYBDENUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_MOLYBDENUM, BlockInit.RAW_MOLYBDENUM_BLOCK);
//        furnaceOreRecipe(BlockInit.NEODYMIUM_ORE, BlockInit.DEEPSLATE_NEODYMIUM_ORE, ItemInit.NEODYMIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_NEODYMIUM, ItemInit.NEODYMIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_NEODYMIUM, BlockInit.RAW_NEODYMIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.NICKEL_ORE, BlockInit.DEEPSLATE_NICKEL_ORE, ItemInit.NICKEL, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_NICKEL, ItemInit.NICKEL, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_NICKEL, BlockInit.RAW_NICKEL_BLOCK);
//        furnaceOreRecipe(BlockInit.OSMIUM_ORE, BlockInit.DEEPSLATE_OSMIUM_ORE, ItemInit.OSMIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_OSMIUM, ItemInit.OSMIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_OSMIUM, BlockInit.RAW_OSMIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.PALLADIUM_ORE, BlockInit.DEEPSLATE_PALLADIUM_ORE, ItemInit.PALLADIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_PALLADIUM, ItemInit.PALLADIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_PALLADIUM, BlockInit.RAW_PALLADIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.PLATINUM_ORE, BlockInit.DEEPSLATE_PLATINUM_ORE, ItemInit.PLATINUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_PLATINUM, ItemInit.PLATINUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_PLATINUM, BlockInit.RAW_PLATINUM_BLOCK);
//        furnaceOreRecipe(BlockInit.PLUTONIUM_ORE, BlockInit.DEEPSLATE_PLUTONIUM_ORE, ItemInit.PLUTONIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_PLUTONIUM, ItemInit.PLUTONIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_PLUTONIUM, BlockInit.RAW_PLUTONIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.POLONIUM_ORE, BlockInit.DEEPSLATE_POLONIUM_ORE, ItemInit.POLONIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_POLONIUM, ItemInit.POLONIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_POLONIUM, BlockInit.RAW_POLONIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.POTASSIUM_ORE, BlockInit.DEEPSLATE_POTASSIUM_ORE, ItemInit.POTASSIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_POTASSIUM, ItemInit.POTASSIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_POTASSIUM, BlockInit.RAW_POTASSIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.PRASEODYMIUM_ORE, BlockInit.DEEPSLATE_PRASEODYMIUM_ORE, ItemInit.PRASEODYMIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_PRASEODYMIUM, ItemInit.PRASEODYMIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_PRASEODYMIUM, BlockInit.RAW_PRASEODYMIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.PROMETHIUM_ORE, BlockInit.DEEPSLATE_PROMETHIUM_ORE, ItemInit.PROMETHIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_PROMETHIUM, ItemInit.PROMETHIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_PROMETHIUM, BlockInit.RAW_PROMETHIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.RADIUM_ORE, BlockInit.DEEPSLATE_RADIUM_ORE, ItemInit.RADIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_RADIUM, ItemInit.RADIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_RADIUM, BlockInit.RAW_RADIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.RHODIUM_ORE, BlockInit.DEEPSLATE_RHODIUM_ORE, ItemInit.RHODIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_RHODIUM, ItemInit.RHODIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_RHODIUM, BlockInit.RAW_RHODIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.RUTHENIUM_ORE, BlockInit.DEEPSLATE_RUTHENIUM_ORE, ItemInit.RUTHENIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_RUTHENIUM, ItemInit.RUTHENIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_RUTHENIUM, BlockInit.RAW_RUTHENIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.SAMARIUM_ORE, BlockInit.DEEPSLATE_SAMARIUM_ORE, ItemInit.SAMARIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_SAMARIUM, ItemInit.SAMARIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_SAMARIUM, BlockInit.RAW_SAMARIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.SCANDIUM_ORE, BlockInit.DEEPSLATE_SCANDIUM_ORE, ItemInit.SCANDIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_SCANDIUM, ItemInit.SCANDIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_SCANDIUM, BlockInit.RAW_SCANDIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.SELENIUM_ORE, BlockInit.DEEPSLATE_SELENIUM_ORE, ItemInit.SELENIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_SELENIUM, ItemInit.SELENIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_SELENIUM, BlockInit.RAW_SELENIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.SILICON_ORE, BlockInit.DEEPSLATE_SILICON_ORE, ItemInit.SILICON, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_SILICON, ItemInit.SILICON, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_SILICON, BlockInit.RAW_SILICON_BLOCK);
//        furnaceOreRecipe(BlockInit.SILVER_ORE, BlockInit.DEEPSLATE_SILVER_ORE, ItemInit.SILVER, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_SILVER, ItemInit.SILVER, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_SILVER, BlockInit.RAW_SILVER_BLOCK);
//        furnaceOreRecipe(BlockInit.SODIUM_ORE, BlockInit.DEEPSLATE_SODIUM_ORE, ItemInit.SODIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_SODIUM, ItemInit.SODIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_SODIUM, BlockInit.RAW_SODIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.STRONTIUM_ORE, BlockInit.DEEPSLATE_STRONTIUM_ORE, ItemInit.STRONTIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_STRONTIUM, ItemInit.STRONTIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_STRONTIUM, BlockInit.RAW_STRONTIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.TELLURIUM_ORE, BlockInit.DEEPSLATE_TELLURIUM_ORE, ItemInit.TELLURIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_TELLURIUM, ItemInit.TELLURIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_TELLURIUM, BlockInit.RAW_TELLURIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.TERBIUM_ORE, BlockInit.DEEPSLATE_TERBIUM_ORE, ItemInit.TERBIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_TERBIUM, ItemInit.TERBIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_TERBIUM, BlockInit.RAW_TERBIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.THALLIUM_ORE, BlockInit.DEEPSLATE_THALLIUM_ORE, ItemInit.THALLIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_THALLIUM, ItemInit.THALLIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_THALLIUM, BlockInit.RAW_THALLIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.THORIUM_ORE, BlockInit.DEEPSLATE_THORIUM_ORE, ItemInit.THORIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_THORIUM, ItemInit.THORIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_THORIUM, BlockInit.RAW_THORIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.THULIUM_ORE, BlockInit.DEEPSLATE_THULIUM_ORE, ItemInit.THULIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_THULIUM, ItemInit.THULIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_THULIUM, BlockInit.RAW_THULIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.TIN_ORE, BlockInit.DEEPSLATE_TIN_ORE, ItemInit.TIN, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_TIN, ItemInit.TIN, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_TIN, BlockInit.RAW_TIN_BLOCK);
//        furnaceOreRecipe(BlockInit.TITANIUM_ORE, BlockInit.DEEPSLATE_TITANIUM_ORE, ItemInit.TITANIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_TITANIUM, ItemInit.TITANIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_TITANIUM, BlockInit.RAW_TITANIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.URANIUM_ORE, BlockInit.DEEPSLATE_URANIUM_ORE, ItemInit.URANIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_URANIUM, ItemInit.URANIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_URANIUM, BlockInit.RAW_URANIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.VANADIUM_ORE, BlockInit.DEEPSLATE_VANADIUM_ORE, ItemInit.VANADIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_VANADIUM, ItemInit.VANADIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_VANADIUM, BlockInit.RAW_VANADIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.VIBRANIUM_ORE, BlockInit.DEEPSLATE_VIBRANIUM_ORE, ItemInit.VIBRANIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_VIBRANIUM, ItemInit.VIBRANIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_VIBRANIUM, BlockInit.RAW_VIBRANIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.YTTERBIUM_ORE, BlockInit.DEEPSLATE_YTTERBIUM_ORE, ItemInit.YTTERBIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_YTTERBIUM, ItemInit.YTTERBIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_YTTERBIUM, BlockInit.RAW_YTTERBIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.YTTRIUM_ORE, BlockInit.DEEPSLATE_YTTRIUM_ORE, ItemInit.YTTRIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_YTTRIUM, ItemInit.YTTRIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_YTTRIUM, BlockInit.RAW_YTTRIUM_BLOCK);
//        furnaceOreRecipe(BlockInit.ZIRCONIUM_ORE, BlockInit.DEEPSLATE_ZIRCONIUM_ORE, ItemInit.ZIRCONIUM, 1.0f, 200, consumer);
//        furnaceRawRecipe(ItemInit.RAW_ZIRCONIUM, ItemInit.ZIRCONIUM, 1.0f, 200, consumer);
//        //rawMaterialBlockCrafting(ItemInit.RAW_ZIRCONIUM, BlockInit.RAW_ZIRCONIUM_BLOCK);
//    }
//
//    private void furnaceOreRecipe(RegistryObject<Block> stone_ore, RegistryObject<Block> deepslate_ore, RegistryObject<Item> ingot, float experience, int cookingTime, Consumer<FinishedRecipe> consumer) {
//        SimpleCookingRecipeBuilder.smelting(Ingredient.of(stone_ore.get()),
//                        ingot.get(), experience, cookingTime)
//                .unlockedBy("has_ore", has(stone_ore.get()))
//                .save(consumer, ingot.getId().getPath() + "_ingot_from_smelting_" + stone_ore.getId().getPath());
//        SimpleCookingRecipeBuilder.blasting(Ingredient.of(stone_ore.get()),
//                        ingot.get(), experience, cookingTime / 2)
//                .unlockedBy("has_ore", has(stone_ore.get()))
//                .save(consumer, ingot.getId().getPath() + "_ingot_from_blasting_" + stone_ore.getId().getPath());
//        SimpleCookingRecipeBuilder.smelting(Ingredient.of(deepslate_ore.get()),
//                        ingot.get(), experience, cookingTime)
//                .unlockedBy("has_ore", has(deepslate_ore.get()))
//                .save(consumer, ingot.getId().getPath() + "_ingot_from_smelting_" + deepslate_ore.getId().getPath());
//        SimpleCookingRecipeBuilder.blasting(Ingredient.of(deepslate_ore.get()),
//                        ingot.get(), experience, cookingTime / 2)
//                .unlockedBy("has_ore", has(deepslate_ore.get()))
//                .save(consumer, ingot.getId().getPath() + "_ingot_from_blasting_" + deepslate_ore.getId().getPath());
//    }
//
//    private void furnaceRawRecipe(RegistryObject<Item> raw_material, RegistryObject<Item> ingot, float experience, int cookingTime, Consumer<FinishedRecipe> consumer) {
//        SimpleCookingRecipeBuilder.smelting(Ingredient.of(raw_material.get()),
//                        ingot.get(), experience, cookingTime)
//                .unlockedBy("has_raw_material", has(raw_material.get()))
//                .save(consumer, ingot.getId().getPath() + "_ingot_from_smelting_raw_" + ingot.getId().getPath());
//        SimpleCookingRecipeBuilder.blasting(Ingredient.of(raw_material.get()),
//                        ingot.get(), experience, cookingTime / 2)
//                .unlockedBy("has_raw_material", has(raw_material.get()))
//                .save(consumer, ingot.getId().getPath() + "_ingot_from_blasting_raw_" + ingot.getId().getPath());
//    }
//
//    private void rawMaterialBlockCrafting(RegistryObject<Item> raw_material, RegistryObject<Block> raw_block, Consumer<FinishedRecipe> consumer) {
//        ShapedRecipeBuilder.shaped(BlockInit.ALLOY_FURNACE.get())
//                .pattern("aaa")
//                .pattern("aaa")
//                .pattern("aaa")
//                .define('a', raw_material.get())
//                .group("chrispymod")
//                .unlockedBy("has_raw_material", InventoryChangeTrigger.TriggerInstance.hasItems(raw_material.get()))
//                .save(consumer);
//        ShapelessRecipeBuilder.shapeless(raw_material.get(), 9)
//                .requires(raw_block.get())
//                .group("chrispymod")
//                .unlockedBy("has_raw_material_block", InventoryChangeTrigger.TriggerInstance.hasItems(raw_block.get()))
//                .save(consumer);
//    }
//}
