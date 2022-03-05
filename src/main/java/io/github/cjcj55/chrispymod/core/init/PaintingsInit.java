package io.github.cjcj55.chrispymod.core.init;

import io.github.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PaintingsInit {
    public static final DeferredRegister<Motive> PAINTING_MOTIVES = DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, ChrispyMod.MODID);

    public static final RegistryObject<Motive> MOUNTAIN = PAINTING_MOTIVES.register("mountain", () -> new Motive(64, 48));

    public static void register(IEventBus eventBus) {
        PAINTING_MOTIVES.register(eventBus);
    }
}
