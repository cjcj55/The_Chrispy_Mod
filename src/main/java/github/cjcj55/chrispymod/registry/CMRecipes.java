package github.cjcj55.chrispymod.registry;

import github.cjcj55.chrispymod.ChrispyMod;
import github.cjcj55.chrispymod.recipe.AlloyFurnaceRecipe;
import github.cjcj55.chrispymod.recipe.JamAndJellyMakerRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CMRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ChrispyMod.MODID);

    public static final RegistryObject<RecipeSerializer<AlloyFurnaceRecipe>> ALLOY_FURNACE_SERIALIZER = SERIALIZERS.register("alloy_furnace_smelting", () -> AlloyFurnaceRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<JamAndJellyMakerRecipe>> JAM_AND_JELLY_MAKER_SERIALIZER = SERIALIZERS.register("jam_and_jelly_making", () -> JamAndJellyMakerRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
