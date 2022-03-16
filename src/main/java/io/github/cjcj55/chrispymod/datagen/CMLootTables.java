package io.github.cjcj55.chrispymod.datagen;

import io.github.cjcj55.chrispymod.core.init.BlockInit;
import io.github.cjcj55.chrispymod.core.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class CMLootTables extends BaseLootTableProvider {

    public CMLootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {
        addBerryBushes();
    }

    private void addBerryBushes() {
        addBerryBushTable(BlockInit.STRAWBERRY_BUSH, ItemInit.STRAWBERRY, 1, 2);
        addBerryBushTable(BlockInit.BLUEBERRY_BUSH, ItemInit.BLUEBERRY, 1, 2);
        addBerryBushTable(BlockInit.LOGANBERRY_BUSH, ItemInit.LOGANBERRY, 1, 2);
        addBerryBushTable(BlockInit.RED_RASPBERRY_BUSH, ItemInit.RED_RASPBERRY, 1, 2);
        addBerryBushTable(BlockInit.BLACK_RASPBERRY_BUSH, ItemInit.BLACK_RASPBERRY, 1, 2);
        addBerryBushTable(BlockInit.GOLDEN_RASPBERRY_BUSH, ItemInit.GOLDEN_RASPBERRY, 1, 2);
        addBerryBushTable(BlockInit.WHITE_RASPBERRY_BUSH, ItemInit.WHITE_RASPBERRY, 1, 2);
        addBerryBushTable(BlockInit.MARIONBERRY_BUSH, ItemInit.MARIONBERRY, 1, 2);
        addBerryBushTable(BlockInit.BLACKCURRANT_BUSH, ItemInit.BLACKCURRANT, 1, 2);
        addBerryBushTable(BlockInit.REDCURRANT_BUSH, ItemInit.REDCURRANT, 1, 2);
        addBerryBushTable(BlockInit.HUCKLEBERRY_BUSH, ItemInit.HUCKLEBERRY, 1, 2);
        addBerryBushTable(BlockInit.WINEBERRY_BUSH, ItemInit.WINEBERRY, 1, 2);
        addBerryBushTable(BlockInit.ELDERBERRY_BUSH, ItemInit.ELDERBERRY, 1, 2);
        addBerryBushTable(BlockInit.BLACKBERRY_BUSH, ItemInit.BLACKBERRY, 1, 2);
        addBerryBushTable(BlockInit.BOYSENBERRY_BUSH, ItemInit.BOYSENBERRY, 1, 2);
        addBerryBushTable(BlockInit.GROUND_CHERRY_BUSH, ItemInit.GROUND_CHERRY, 1, 2);
        addBerryBushTable(BlockInit.ARONIA_BERRY_BUSH, ItemInit.ARONIA_BERRY, 1, 2);
        addBerryBushTable(BlockInit.SERVICEBERRY_BUSH, ItemInit.SERVICEBERRY, 1, 2);
        addBerryBushTable(BlockInit.WONDERBERRY_BUSH, ItemInit.WONDERBERRY, 1, 2);
        addBerryBushTable(BlockInit.MULBERRY_BUSH, ItemInit.MULBERRY, 1, 2);
        addBerryBushTable(BlockInit.LINGONBERRY_BUSH, ItemInit.LINGONBERRY, 1, 2);
        addBerryBushTable(BlockInit.CRANBERRY_BUSH, ItemInit.CRANBERRY, 1, 2);
        addBerryBushTable(BlockInit.DEWBERRY_BUSH, ItemInit.DEWBERRY, 1, 2);
        addBerryBushTable(BlockInit.THIMBLEBERRY_BUSH, ItemInit.THIMBLEBERRY, 1, 2);
        addBerryBushTable(BlockInit.GOOSEBERRY_BUSH, ItemInit.GOOSEBERRY, 1, 2);
        addBerryBushTable(BlockInit.CHOKEBERRY_BUSH, ItemInit.CHOKEBERRY, 1, 2);
        addBerryBushTable(BlockInit.OLALLIEBERRY_BUSH, ItemInit.OLALLIEBERRY, 1, 2);
        addBerryBushTable(BlockInit.ACEROLA_CHERRY_BUSH, ItemInit.ACEROLA_CHERRY, 1, 2);
        addBerryBushTable(BlockInit.BARBERRY_BUSH, ItemInit.BARBERRY, 1, 2);
        addBerryBushTable(BlockInit.BAYBERRY_BUSH, ItemInit.BAYBERRY, 1, 2);
        addBerryBushTable(BlockInit.GOGI_BERRY_BUSH, ItemInit.GOGI_BERRY, 1, 2);
    }

    private void addBerryBushTable(RegistryObject<Block> block, RegistryObject<Item> item, int min, int max) {
        lootTables.put(block.get(), createBerryTable(block.get().getRegistryName().toString(), block.get(), item.get(), min, max));
    }
}
