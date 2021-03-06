package net.journey.entity.mob.depths;

import net.journey.entity.base.EntityAttributesHelper;
import net.journey.init.JourneyLootTables;
import net.journey.init.JourneySounds;
import net.journey.util.PotionEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.slayer.api.entity.JEntityMob;

import java.util.List;

public class EntityDarknessCrawler extends JEntityMob {

    public EntityDarknessCrawler(World par1World) {
        super(par1World);
        addMeleeAttackingAI();
        setSize(0.7F, 1.0F);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();

        EntityAttributesHelper.setMaxHealth(this, 58);
        EntityAttributesHelper.setAttackDamage(this, 11);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return JourneySounds.SPIKED_BEAST;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource d) {
        return JourneySounds.SPIKED_BEAST_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return JourneySounds.SPIKED_BEAST_HURT;
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.world.isDaytime() && !this.world.isRemote) {
            float var1 = getBrightness();
        }

        List<Entity> e = this.world.getEntitiesWithinAABBExcludingEntity(this, this.getEntityBoundingBox());
        for (Entity entity : e) {
            if (entity instanceof EntityPlayer && canEntityBeSeen(entity))
                ((EntityPlayer) entity).addPotionEffect(PotionEffects.setPotionEffect(PotionEffects.blindness, 60, 1));
        }
    }

	@Override
	public ResourceLocation getLootTable() {
		return JourneyLootTables.DARKNESS_CRAWLER;
	}
}