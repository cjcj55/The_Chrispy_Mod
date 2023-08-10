package github.cjcj55.chrispymod.datagen;

import github.cjcj55.chrispymod.datagen.loot.CMBlockLootTables;
import github.cjcj55.chrispymod.datagen.loot.CMEntityLootTables;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class CMLootTableProvider {
    public static LootTableProvider create(PackOutput packOutput) {
        return new LootTableProvider(packOutput, Set.of(),
                List.of(new LootTableProvider.SubProviderEntry(CMBlockLootTables::new, LootContextParamSets.BLOCK), new LootTableProvider.SubProviderEntry(CMEntityLootTables::new, LootContextParamSets.ENTITY)));
    }
}
