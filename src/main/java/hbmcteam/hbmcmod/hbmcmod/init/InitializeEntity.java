package hbmcteam.hbmcmod.hbmcmod.init;

import hbmcteam.hbmcmod.hbmcmod.Main;
import hbmcteam.hbmcmod.hbmcmod.entity.EntityHerobrine;
import hbmcteam.hbmcmod.hbmcmod.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class InitializeEntity {

    public static void RegisterEntities() {
        RegisterEntity("Herobrine", EntityHerobrine.class, Reference.ENTITY_HEROBRINE, 50, 13608848, 16777215);
    }

    private static void RegisterEntity(
            String entityName, Class<? extends Entity> entityClass, int id, int trackingRange, int eggPrimaryColour, int eggSecondaryColour) {
        EntityRegistry.registerModEntity(
                new ResourceLocation(Main.MOD_ID + ":" + entityName),
                    entityClass,
                    entityName,
                    id,
                    Main.INSTANCE,
                    trackingRange,
                    1,
                    true,
                    eggPrimaryColour,
                    eggSecondaryColour
        );
    }
}
