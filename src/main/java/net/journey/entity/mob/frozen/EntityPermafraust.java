package net.journey.entity.mob.frozen;

import net.journey.entity.base.EntityAttributesHelper;
import net.journey.init.JourneyLootTables;
import net.journey.init.JourneySounds;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.slayer.api.entity.JEntityMob;

public class EntityPermafraust extends JEntityMob {

    public EntityPermafraust(World par1World) {
        super(par1World);
        addMeleeAttackingAI();
        this.setSize(0.5F, 2F);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();

        EntityAttributesHelper.setMaxHealth(this, 44);
        EntityAttributesHelper.setAttackDamage(this, 10);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return JourneySounds.SMALL_HONGO;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource d) {
        return JourneySounds.SMALL_HONGO_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return JourneySounds.SMALL_HONGO_HURT;
    }

    @Override
    public boolean shouldRenderInPass(int pass) {
        return pass == 1;
    }

    @Override
    public boolean getCanSpawnHere() {
        return this.posY > 60.0D && super.getCanSpawnHere();
    }

    @Override
    public ResourceLocation getLootTable() {
        return JourneyLootTables.PERMAFRAUST;
    }
}