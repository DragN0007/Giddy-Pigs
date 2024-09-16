package com.dragn0007.giddypigs.datagen.biglooter;

import com.dragn0007.giddypigs.blocks.GGPBlocks;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class GGPBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        this.dropSelf(GGPBlocks.GUINEA_PIG_HOUSE.get());
        this.dropSelf(GGPBlocks.ENCLOSURE_PANE.get());
        this.dropSelf(GGPBlocks.ENCLOSURE_PANE_CORNER.get());
        this.dropSelf(GGPBlocks.FOOD_DISH_BLACK.get());
        this.dropSelf(GGPBlocks.FOOD_DISH_BROWN.get());
        this.dropSelf(GGPBlocks.FOOD_DISH_WHITE.get());
        this.dropSelf(GGPBlocks.WATER_BOTTLE.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return GGPBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
