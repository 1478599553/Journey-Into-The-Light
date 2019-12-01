package net.journey.items;

import net.journey.JourneyTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.slayer.api.item.ItemMod;

public class ItemThrowableArrow extends ItemMod {

	private Class<? extends EntityThrowable> entity;
	private float damage;
	private int maxBounces = 0;
	
	public ItemThrowableArrow(String name, String f, float damage, int bounces, Class<? extends EntityThrowable> entity) {
		super(name, f);
		this.maxBounces = bounces;
		this.damage = damage;
		this.entity = entity;
		setCreativeTab(JourneyTabs.weapons);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand handIn) {
		ItemStack stack = player.getHeldItem(handIn);
		try {
			if(!world.isRemote) {
				EntityThrowable t = entity.getConstructor(World.class, EntityLivingBase.class, float.class).newInstance(world, player, damage);
				t.shoot(player, player.rotationPitch, player.rotationYaw, -10.0F, 0.8F, 1.0F);
				world.spawnEntity(t);
				if(!player.capabilities.isCreativeMode) stack.shrink(1);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(handIn));	
	}
}