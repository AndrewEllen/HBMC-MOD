package hbmcteam.hbmcmod.hbmcmod.util.handlers;

import hbmcteam.hbmcmod.hbmcmod.entity.EntityHerobrine;
import hbmcteam.hbmcmod.hbmcmod.entity.render.RenderHerobrine;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void RegisterEntityRenders() {

        RenderingRegistry.registerEntityRenderingHandler(EntityHerobrine.class, new IRenderFactory<EntityHerobrine>() {
            @Override
            public Render<? super EntityHerobrine> createRenderFor(RenderManager manager) {
                return new RenderHerobrine(manager);
            }
        });
    }

}
