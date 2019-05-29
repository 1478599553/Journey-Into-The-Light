package net.journey.items.bows;

import net.journey.entity.projectile.EntityEssenceArrow;
import net.journey.items.ItemModBow;
import net.journey.util.PotionEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.PotionEffect;

public class WastefulBow extends ItemModBow {

    public WastefulBow(String unlocalizedName, int damage, int durability) {
        super(unlocalizedName, "Wasteful Bow", durability, damage, "Poisons targets");
        this.effect = EntityEssenceArrow.BowEffects.POISON_BOW;
    }



}