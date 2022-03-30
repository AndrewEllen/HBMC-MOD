package hbmcteam.hbmcmod.hbmcmod.entity;

import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityHerobrine extends EntityEnderman {

    public EntityHerobrine(World worldIn) {
        super(worldIn);
    }

    @Override
    public void initEntityAI() {
        this.tasks.addTask(0, new EntityAIWatchClosest(this, EntityPlayer.class, 10000.0F, 0));
    }

    @Override
    public void updateAITasks() {

    }

    @Override
    public boolean teleportRandomly() {
        return false;
    }

    @Override
    protected SoundEvent getAmbientSound() {

        return null;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {

        return null;
    }

    @Override
    protected SoundEvent getDeathSound() {

        return null;
    }

}
