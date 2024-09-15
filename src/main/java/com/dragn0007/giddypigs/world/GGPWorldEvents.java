package com.dragn0007.giddypigs.world;

import com.dragn0007.giddypigs.GiddyGuineaPigs;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber (modid = GiddyGuineaPigs.MODID)
public class GGPWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        PigSpawnGeneration.onEntitySpawn(event);
    }
}
