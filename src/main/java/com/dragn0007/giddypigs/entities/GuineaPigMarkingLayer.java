package com.dragn0007.giddypigs.entities;

import com.dragn0007.giddypigs.GiddyGuineaPigs;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoLayerRenderer;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

public class GuineaPigMarkingLayer extends GeoLayerRenderer<GuineaPig> {
    public GuineaPigMarkingLayer(IGeoRenderer entityRendererIn) {
        super(entityRendererIn);
    }

    @Override
    public void render(PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn, GuineaPig entityLivingBaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        RenderType renderType = RenderType.entityCutout(((GuineaPig)entityLivingBaseIn).getOverlayLocation());
        matrixStackIn.pushPose();
        matrixStackIn.scale(1.0f, 1.0f, 1.0f);
        matrixStackIn.translate(0.0d, 0.0d, 0.0d);
        this.getRenderer().render(
                this.getEntityModel().getModel(this.getEntityModel().getModelLocation(entityLivingBaseIn)),
                entityLivingBaseIn,
                partialTicks,
                renderType,
                matrixStackIn,
                bufferIn,
                bufferIn.getBuffer(renderType), packedLightIn, OverlayTexture.NO_OVERLAY, 1f, 1f, 1f, 1f);
        matrixStackIn.popPose();
    }

    public enum Overlay {
        NONE(new ResourceLocation(GiddyGuineaPigs.MODID, "textures/guinea_pig/pattern/none.png")),
        ALPACA(new ResourceLocation(GiddyGuineaPigs.MODID, "textures/guinea_pig/pattern/ov_alpaca.png")),
        ALPACA_HALVED(new ResourceLocation(GiddyGuineaPigs.MODID, "textures/guinea_pig/pattern/ov_alpaca_halved.png")),
        BEE(new ResourceLocation(GiddyGuineaPigs.MODID, "textures/guinea_pig/pattern/ov_bee.png")),
        BLACK_HALVED(new ResourceLocation(GiddyGuineaPigs.MODID, "textures/guinea_pig/pattern/ov_black_halved.png")),
        BLOTCH(new ResourceLocation(GiddyGuineaPigs.MODID, "textures/guinea_pig/pattern/ov_blotch.png")),
        CALICO(new ResourceLocation(GiddyGuineaPigs.MODID, "textures/guinea_pig/pattern/ov_calico.png")),
        DALMATION(new ResourceLocation(GiddyGuineaPigs.MODID, "textures/guinea_pig/pattern/ov_dalmation.png")),
        DUTCH(new ResourceLocation(GiddyGuineaPigs.MODID, "textures/guinea_pig/pattern/ov_dutch.png")),
        FRONTEDED(new ResourceLocation(GiddyGuineaPigs.MODID, "textures/guinea_pig/pattern/ov_frontended.png")),
        GILDED(new ResourceLocation(GiddyGuineaPigs.MODID, "textures/guinea_pig/pattern/ov_gilded.png")),
        GREY_HALVED(new ResourceLocation(GiddyGuineaPigs.MODID, "textures/guinea_pig/pattern/ov_grey_halved.png")),
        HALVED(new ResourceLocation(GiddyGuineaPigs.MODID, "textures/guinea_pig/pattern/ov_halved.png")),
        HEAD_SPOT(new ResourceLocation(GiddyGuineaPigs.MODID, "textures/guinea_pig/pattern/ov_head_spot.png")),
        PERUVIAN(new ResourceLocation(GiddyGuineaPigs.MODID, "textures/guinea_pig/pattern/ov_peruvian.png")),
        RED_BLACK(new ResourceLocation(GiddyGuineaPigs.MODID, "textures/guinea_pig/pattern/ov_red_black.png")),
        STRIPED(new ResourceLocation(GiddyGuineaPigs.MODID, "textures/guinea_pig/pattern/ov_striped.png")),
        TRICOLORED(new ResourceLocation(GiddyGuineaPigs.MODID, "textures/guinea_pig/pattern/ov_tricolored.png"));

        public final ResourceLocation resourceLocation;
        Overlay(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Overlay overlayFromOrdinal(int overlay) { return Overlay.values()[overlay % Overlay.values().length];
        }
    }

}
