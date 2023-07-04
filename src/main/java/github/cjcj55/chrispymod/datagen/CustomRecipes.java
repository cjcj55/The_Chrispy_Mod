//package github.cjcj55.chrispymod.datagen;
//
//public class CustomRecipes extends RecipeProvider implements IConditionBuilder {
//    public CustomRecipes(DataGenerator pGenerator) {
//        super(pGenerator);
//    }
//
//    public static void register(Consumer<FinishedRecipe> consumer) {
//        buildJamAndJellyMakerRecipes(consumer);
//        buildAlloyFurnaceRecipes(consumer);
//    }
//
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
//
//    public static void buildAlloyFurnaceRecipes(Consumer<FinishedRecipe> consumer) {
//        new AlloyFurnaceRecipeBuilder(Items.DIAMOND, Items.EMERALD, ItemInit.BLUE_EMERALD.get(), 1).unlockedBy("has_diamond", inventoryTrigger(ItemPredicate.Builder.item().of(Items.DIAMOND).build())).save(consumer);
//    }
//}
