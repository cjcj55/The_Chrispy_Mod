package io.github.cjcj55.chrispymod.datafixers;

import io.github.cjcj55.chrispymod.ChrispyMod;
import net.minecraft.resources.ResourceLocation;

public class CMResourceLocation extends ResourceLocation {
    public CMResourceLocation(String name) {
        super(ChrispyMod.MODID, name);
    }
}
