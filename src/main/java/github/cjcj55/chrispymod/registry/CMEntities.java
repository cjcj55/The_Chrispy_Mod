package github.cjcj55.chrispymod.registry;

import github.cjcj55.chrispymod.ChrispyMod;
import github.cjcj55.chrispymod.entity.projectile.LightningBowArrowProjectileEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CMEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ChrispyMod.MODID);

    public static final RegistryObject<EntityType<LightningBowArrowProjectileEntity>> LIGHTNING_BOW_ARROW = ENTITY_TYPES.register("lightning_bow_arrow_projectile",
            () -> EntityType.Builder.<LightningBowArrowProjectileEntity>of(LightningBowArrowProjectileEntity::new, MobCategory.MISC)
                .sized(0.5f, 0.5f)
                .clientTrackingRange(4)
                .updateInterval(20)
//                .setCustomClientFactory((spawnEntity, level) -> new LightningBowArrowProjectileEntity(level))
                .build("lightning_bow_arrow_projectile"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}