package com.dragn0007.giddypigs.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class GGPItemGroup {

    public static final CreativeModeTab GIDDY_PIGS_GROUP = new CreativeModeTab("giddy_pigs")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(GGPItems.GIDDY_PIGS.get());
        }
    };

}
