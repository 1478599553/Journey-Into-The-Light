package net.slayer.api.item;

import net.journey.JITL;
import net.journey.client.ItemDescription;
import net.journey.init.JourneyTabs;
import net.journey.init.items.JourneyConsumables;
import net.journey.init.items.JourneyItems;
import net.journey.util.PotionEffects;
import net.journey.util.gen.lang.LangGeneratorFacade;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class ItemModFood extends ItemFood {

    private int time = 32;
    private boolean op = false;

    public ItemModFood(String name, String f, int food, float sat, boolean wolfFood) {
        super(food, sat, wolfFood);
        setTranslationKey(name);
        setCreativeTab(JourneyTabs.CROPS);
        JourneyItems.items.add(this);
        setRegistryName(JITL.MOD_ID, name);
        LangGeneratorFacade.addItemEntry(this, f);
    }

    public ItemModFood(String name, String f, int food, float sat, int timeToEat, boolean wolfFood) {
        this(name, f, food, sat, wolfFood);
        time = timeToEat;
    }

    public ItemModFood(String name, String f, int food, float sat, boolean wolfFood, PotionEffect potionID, float potionEffectProbability) {
        this(name, f, food, sat, wolfFood);
        setPotionEffect(potionID, potionEffectProbability);
    }

    public ItemModFood(String name, String actual, int heal, float f, boolean sat, boolean b) {
        super(heal, sat);
        setTranslationKey(name);
        JourneyItems.items.add(this);
        setCreativeTab(JourneyTabs.CROPS);
        setRegistryName(JITL.MOD_ID, name);
        LangGeneratorFacade.addItemEntry(this, actual);
        this.op = b;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack) {
        return time;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack i) {
        return op;
    }

    @Override
    protected void onFoodEaten(ItemStack i, World w, EntityPlayer p) {
        if (this == JourneyConsumables.honglowShroom || this == JourneyConsumables.redHonglowShroom || this == JourneyConsumables.greenHonglowShroom || this == JourneyConsumables.blueHonglowShroom)
            p.addPotionEffect(new PotionEffect(PotionEffects.setPotionEffect(PotionEffects.nightVision, 2400, 0)));
        super.onFoodEaten(i, w, p);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        ItemDescription.addInformation(stack, tooltip);
        tooltip.add("Fills " + (double) getHealAmount(stack) / 2 + " Hunger Bars");
        tooltip.add(getSaturationModifier(stack) + " Saturation");
        if (time <= 32) tooltip.add("Faster eating");
    }
}