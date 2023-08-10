package github.cjcj55.chrispymod.worldgen.entity;

import github.cjcj55.chrispymod.ChrispyMod;
import github.cjcj55.chrispymod.registry.CMEntities;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

public class CMEntityBiomeModifiers {
    public static final ResourceKey<BiomeModifier> SPAWN_SANDY_COW = registerKey("spawn_sandy_cow");



    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(SPAWN_SANDY_COW, new ForgeBiomeModifiers.AddSpawnsBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_DRY_OVERWORLD),
                List.of(new MobSpawnSettings.SpawnerData(CMEntities.SANDY_COW.get(), 50, 1, 3))));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(ChrispyMod.MODID, name));
    }
}
