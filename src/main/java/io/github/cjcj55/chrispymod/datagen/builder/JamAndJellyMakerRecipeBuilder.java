/*package io.github.cjcj55.chrispymod.datagen.builder;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.common.recipe.JamAndJellyMakerRecipe;
import mezz.jei.api.MethodsReturnNonnullByDefault;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;
import java.util.function.Consumer;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class JamAndJellyMakerRecipeBuilder {
    private final List<Ingredient> ingredients = Lists.newArrayList();
    private final Item result;
    private final int count;
    private final Item container;



    private JamAndJellyMakerRecipeBuilder(ItemLike resultIn, int count, @Nullable ItemLike container) {
        this.result = resultIn.asItem();
        this.count = count;
        this.container = container != null ? container.asItem() : null;
    }

    public static JamAndJellyMakerRecipeBuilder jamAndJellyMakerRecipe(ItemLike mainResult, int count) {
        return new JamAndJellyMakerRecipeBuilder(mainResult, count, null);
    }

    public static JamAndJellyMakerRecipeBuilder jamAndJellyMakerRecipe(ItemLike mainResult, int count, ItemLike container) {
        return new JamAndJellyMakerRecipeBuilder(mainResult, count, container);
    }

    public JamAndJellyMakerRecipeBuilder addIngredient(Tag<Item> tagIn) {
        return this.addIngredient(Ingredient.of(tagIn));
    }

    public JamAndJellyMakerRecipeBuilder addIngredient(ItemLike itemIn) {
        return this.addIngredient(itemIn, 1);
    }

    public JamAndJellyMakerRecipeBuilder addIngredient(ItemLike itemIn, int quantity) {
        for (int i = 0; i < quantity; ++i) {
            this.addIngredient(Ingredient.of(itemIn));
        }
        return this;
    }

    public JamAndJellyMakerRecipeBuilder addIngredient(Ingredient ingredientIn) {
        return this.addIngredient(ingredientIn, 1);
    }

    public JamAndJellyMakerRecipeBuilder addIngredient(Ingredient ingredientIn, int quantity) {
        for (int i = 0; i < quantity; ++i) {
            this.ingredients.add(ingredientIn);
        }
        return this;
    }

    public void build(Consumer<FinishedRecipe> consumerIn) {
        ResourceLocation location = ForgeRegistries.ITEMS.getKey(this.result);
        this.build(consumerIn, ChrispyMod.MODID + ":jam_and_jelly_making/" + location.getPath());
    }

    public void build(Consumer<FinishedRecipe> consumerIn, String save) {
        ResourceLocation resourcelocation = ForgeRegistries.ITEMS.getKey(this.result);
        if ((new ResourceLocation(save)).equals(resourcelocation)) {
            throw new IllegalStateException("Jam and Jelly Making Recipe " + save + " should remove its 'save' argument");
        } else {
            this.build(consumerIn, new ResourceLocation(save));
        }
    }

    public void build(Consumer<FinishedRecipe> consumerIn, ResourceLocation id) {
        consumerIn.accept(new JamAndJellyMakerRecipeBuilder.Result(id, this.result, this.count, this.ingredients, this.container));
    }

    public static class Result implements FinishedRecipe
    {
        private final ResourceLocation id;
        private final List<Ingredient> ingredients;
        private final Item result;
        private final int count;
        private final Item container;

        public Result(ResourceLocation idIn, Item resultIn, int countIn, List<Ingredient> ingredientsIn, @Nullable Item containerIn) {
            this.id = idIn;
            this.ingredients = ingredientsIn;
            this.result = resultIn;
            this.count = countIn;
            this.container = containerIn;
        }

        @Override
        public void serializeRecipeData(JsonObject json) {
            JsonArray arrayIngredients = new JsonArray();

            for (Ingredient ingredient : this.ingredients) {
                arrayIngredients.add(ingredient.toJson());
            }
            json.add("ingredients", arrayIngredients);

            JsonObject objectResult = new JsonObject();
            objectResult.addProperty("item", ForgeRegistries.ITEMS.getKey(this.result).toString());
            if (this.count > 1) {
                objectResult.addProperty("count", this.count);
            }
            json.add("output", objectResult);

            if (this.container != null) {
                JsonObject objectContainer = new JsonObject();
                objectContainer.addProperty("item", ForgeRegistries.ITEMS.getKey(this.container).toString());
                json.add("container", objectContainer);
            }
        }

        @Override
        public ResourceLocation getId() {
            return this.id;
        }

        @Override
        public RecipeSerializer<?> getType() {
            return JamAndJellyMakerRecipe.Serializer.INSTANCE;
        }

        @Nullable
        @Override
        public JsonObject serializeAdvancement() {
            return null;
        }

        @Nullable
        @Override
        public ResourceLocation getAdvancementId() {
            return null;
        }
    }
}*/