package hbmcteam.hbmcmod.hbmcmod.entity.render;

import hbmcteam.hbmcmod.hbmcmod.Main;
import hbmcteam.hbmcmod.hbmcmod.entity.EntityHerobrine;
import hbmcteam.hbmcmod.hbmcmod.entity.model.ModelHerobrine;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHerobrine extends RenderLiving<EntityHerobrine> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Main.MOD_ID + ":textures/entity/herobrine.png");

    public RenderHerobrine(RenderManager renderManager) {

        super(renderManager, new ModelHerobrine(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityHerobrine entity) {

        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityHerobrine entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {

        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
}
