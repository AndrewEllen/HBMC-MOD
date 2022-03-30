package hbmcteam.hbmcmod.hbmcmod.util.handlers;

import hbmcteam.hbmcmod.hbmcmod.init.InitializeEntity;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistryHandler {

    public static void preInitRegistries(FMLPreInitializationEvent event) {
        InitializeEntity.RegisterEntities();
        RenderHandler.RegisterEntityRenders();
    }

}
