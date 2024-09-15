package com.dragn0007.giddypigs.event;

import com.dragn0007.giddypigs.GiddyGuineaPigs;
import com.dragn0007.giddypigs.entities.GuineaPig;
import com.dragn0007.giddypigs.entities.GuineaPigRender;
import com.dragn0007.giddypigs.entities.util.EntityTypes;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = GiddyGuineaPigs.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class GiddyGuineaPigsEvent {

    @SubscribeEvent
    public static void entityAttrbiuteCreationEvent(EntityAttributeCreationEvent event) {
        event.put(EntityTypes.GUINEA_PIG_ENTITY.get(), GuineaPig.createAttributes().build());
    }

    @SubscribeEvent
    public static void clientSetupEvent(FMLClientSetupEvent event) {
        EntityRenderers.register(EntityTypes.GUINEA_PIG_ENTITY.get(), GuineaPigRender::new);
    }
}