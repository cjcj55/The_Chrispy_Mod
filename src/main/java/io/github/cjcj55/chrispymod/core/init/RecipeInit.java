package io.github.cjcj55.chrispymod.core.init;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.common.recipe.AlloyFurnaceRecipe;
import io.github.cjcj55.chrispymod.common.recipe.JamAndJellyMakerRecipe;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RecipeInit {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ChrispyMod.MODID);

    public static final RegistryObject<RecipeSerializer<AlloyFurnaceRecipe>> ALLOY_FURNACE_SERIALIZER =
            SERIALIZERS.register("alloy_smelting", () -> AlloyFurnaceRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<JamAndJellyMakerRecipe>> JAM_AND_JELLY_MAKER_SERIALIZER =
            SERIALIZERS.register("jam_and_jelly_making", () -> JamAndJellyMakerRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
        Registry.register(Registry.RECIPE_TYPE, AlloyFurnaceRecipe.Type.ID, AlloyFurnaceRecipe.Type.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, AlloyFurnaceRecipe.Type.ID, JamAndJellyMakerRecipe.Type.INSTANCE);
    }
}
