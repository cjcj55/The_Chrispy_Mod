package github.cjcj55.chrispymod.registry;

import github.cjcj55.chrispymod.ChrispyMod;
import github.cjcj55.chrispymod.blocks.entity.AlloyFurnaceBlockEntity;
import github.cjcj55.chrispymod.blocks.entity.JamAndJellyMakerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CMBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ChrispyMod.MODID);

    public static final RegistryObject<BlockEntityType<AlloyFurnaceBlockEntity>> ALLOY_FURNACE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("alloy_furnace_block_entity", () ->
                    BlockEntityType.Builder.of(AlloyFurnaceBlockEntity::new, CMBlocks.ALLOY_FURNACE.get()).build(null));
    public static final RegistryObject<BlockEntityType<JamAndJellyMakerBlockEntity>> JAM_AND_JELLY_MAKER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("jam_and_jelly_maker_block_entity", () ->
                    BlockEntityType.Builder.of(JamAndJellyMakerBlockEntity::new, CMBlocks.JAM_AND_JELLY_MAKER.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
