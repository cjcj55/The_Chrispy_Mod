package io.github.cjcj55.chrispymod.core.init;

import io.github.cjcj55.chrispymod.ChrispyMod;
import io.github.cjcj55.chrispymod.common.block.entity.JamAndJellyMakerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityInit {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, ChrispyMod.MODID);

    public static final RegistryObject<BlockEntityType<JamAndJellyMakerBlockEntity>> JAM_AND_JELLY_MAKER = BLOCK_ENTITIES.register("jam_and_jelly_maker", () -> BlockEntityType.Builder.of(JamAndJellyMakerBlockEntity::new, BlockInit.JAM_AND_JELLY_MAKER.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
