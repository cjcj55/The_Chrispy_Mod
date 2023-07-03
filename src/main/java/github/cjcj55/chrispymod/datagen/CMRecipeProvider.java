package github.cjcj55.chrispymod.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class CMRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> SMELTABLES = List.of(Items.RAW_COPPER, Blocks.COPPER_ORE, Blocks.DEEPSLATE_COPPER_ORE);

    public CMRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.GRASS)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', Items.NAME_TAG)
                .unlockedBy("has_name_tag", inventoryTrigger(ItemPredicate.Builder.item().of(Items.NAME_TAG).build())).save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, Blocks.GRASS_BLOCK, 9)
                .requires(Blocks.DIRT)
                .unlockedBy("has_dirt_block", inventoryTrigger(ItemPredicate.Builder.item().of(Blocks.DIRT).build())).save(pWriter);

//        nineBlockStorageRecipes()
//        oreSmelting(pWriter, SMELTABLES, RecipeCategory.MISC, Items.COPPER, 0.3f, 200, "smeltable");
//        oreBlasting(pWriter, SMELTABLES, RecipeCategory.MISC, Items.COPPER, 0.3f, 100, "smeltable");
    }
}
