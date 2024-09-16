package com.dragn0007.giddypigs;

import com.dragn0007.giddypigs.blocks.GGPBlocks;
import com.dragn0007.giddypigs.entities.util.EntityTypes;
import com.dragn0007.giddypigs.items.GGPItems;
import com.dragn0007.giddypigs.util.GiddyGuineaPigsCommonConfig;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

import static com.dragn0007.giddypigs.GiddyGuineaPigs.MODID;

@Mod(MODID)
public class GiddyGuineaPigs
{
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "giddypigs";

    public GiddyGuineaPigs()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        GGPItems.register(eventBus);
        GGPBlocks.register(eventBus);
        EntityTypes.ENTITY_TYPES.register(eventBus);

        GeckoLib.initialize();
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GiddyGuineaPigsCommonConfig.SPEC, "guinea_pigs-common.toml");

        MinecraftForge.EVENT_BUS.register(this);
    }
}
