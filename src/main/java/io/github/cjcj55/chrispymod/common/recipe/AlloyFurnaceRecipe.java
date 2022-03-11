package io.github.cjcj55.chrispymod.common.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import io.github.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;

import javax.annotation.Nullable;

public class AlloyFurnaceRecipe implements Recipe<SimpleContainer> {
    private final ResourceLocation id;
    private final ItemStack output;
    private final NonNullList<Ingredient> recipeItems;
    private final float experience;
    private final int cookTime;

    public AlloyFurnaceRecipe(ResourceLocation id, ItemStack output, NonNullList<Ingredient> recipeItems, float experience, int cookTime) {
        this.id = id;
        this.output = output;
        this.recipeItems = recipeItems;
        this.experience = experience;
        this.cookTime = cookTime;
    }

    // Need to have more checks if more than 2 inputs
    @Override
    public boolean matches(SimpleContainer pContainer, net.minecraft.world.level.Level pLevel) {
        if(recipeItems.get(0).test(pContainer.getItem(1))) {
            return recipeItems.get(1).test(pContainer.getItem(2));
        }
        if (recipeItems.get(1).test(pContainer.getItem(1))) {
            return recipeItems.get(0).test(pContainer.getItem(2));
        }

        return false;
    }

    @Override
    public ItemStack assemble(SimpleContainer pContainer) {
        return output;
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public ItemStack getResultItem() {
        return output.copy();
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public float getExperience() {
        return this.experience;
    }

    public static class Type implements RecipeType<AlloyFurnaceRecipe> {
        public Type() { }
        public static final Type INSTANCE = new Type();
        public static final String ID = "alloy_smelting";
    }

    public static class Serializer implements RecipeSerializer<AlloyFurnaceRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID = new ResourceLocation(ChrispyMod.MODID,"alloy_smelting");

        @Override
        public AlloyFurnaceRecipe fromJson(ResourceLocation id, JsonObject json) {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "output"));

            JsonArray ingredients = GsonHelper.getAsJsonArray(json, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(2, Ingredient.EMPTY); // size is number of inputs

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            final float experienceIn = GsonHelper.getAsFloat(json, "experience", 0.0F);
            final int cookTimeIn = GsonHelper.getAsInt(json, "cookingtime", 200);

            return new AlloyFurnaceRecipe(id, output, inputs, experienceIn, cookTimeIn);
        }

        @Override
        public AlloyFurnaceRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(buf.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromNetwork(buf));
            }

            ItemStack output = buf.readItem();
            float experienceIn = buf.readFloat();
            int cookTimeIn = buf.readVarInt();

            return new AlloyFurnaceRecipe(id, output, inputs, experienceIn, cookTimeIn);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buf, AlloyFurnaceRecipe recipe) {
            buf.writeInt(recipe.getIngredients().size());
            for (Ingredient ing : recipe.getIngredients()) {
                ing.toNetwork(buf);
            }
            buf.writeItemStack(recipe.getResultItem(), false);
            buf.writeFloat(recipe.experience);
            buf.writeVarInt(recipe.cookTime);
        }

        @Override
        public RecipeSerializer<?> setRegistryName(ResourceLocation name) {
            return INSTANCE;
        }

        @Nullable
        @Override
        public ResourceLocation getRegistryName() {
            return ID;
        }

        @Override
        public Class<RecipeSerializer<?>> getRegistryType() {
            return Serializer.castClass(RecipeSerializer.class);
        }

        @SuppressWarnings("unchecked") // Need this wrapper, because generics
        private static <G> Class<G> castClass(Class<?> cls) {
            return (Class<G>)cls;
        }
    }
}
