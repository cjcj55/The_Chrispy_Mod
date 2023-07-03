package github.cjcj55.chrispymod.datagen;

import github.cjcj55.chrispymod.ChrispyMod;
import github.cjcj55.chrispymod.registry.CMItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class CMItemModelProvider extends ItemModelProvider {
    public CMItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ChrispyMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(CMItems.BLACK_OPAL);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ChrispyMod.MODID, "item/" + item.getId().getPath()));
    }
}
