package net.journey;

import net.journey.blocks.tileentity.TileEntityHandler;
import net.journey.init.JourneyEnchantments;
import net.journey.init.JourneySounds;
import net.journey.init.blocks.JourneyBlocks;
import net.journey.init.items.JourneyItems;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;

@EventBusSubscriber(modid = JITL.MOD_ID)
public class Registries {

	public static final List<SoundEvent> SOUNDS = new ArrayList<>();

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		for (Item item : JourneyItems.items) {
			event.getRegistry().register(item);
		}
		for (Item item : JourneyBlocks.itemBlocks) {
			event.getRegistry().register(item);
		}
		JITL.LOGGER.info("Successfully registered " + JourneyItems.items.size() + " items");
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		for (Block block : JourneyBlocks.blocks) {
			event.getRegistry().register(block);
		}
		JITL.LOGGER.info("Successfully registered " + JourneyBlocks.blocks.size() + " blocks");

		TileEntityHandler.register();
	}

	@SubscribeEvent
	public static void registerEnchantments(RegistryEvent.Register<Enchantment> e) {
		IForgeRegistry<Enchantment> enchant = e.getRegistry();

		enchant.register(JourneyEnchantments.hotTouch);

		JITL.LOGGER.info("Successfully registered 1 Enchantments");
	}

	//TODO remove, it's never called
	@SubscribeEvent
	public void onSoundRegistry(Register<SoundEvent> event) {
		JourneySounds.init();

		for (SoundEvent sound : SOUNDS) {
			event.getRegistry().register(sound);
		}

		JITL.LOGGER.info("Successfully registered " + SOUNDS.size() + " Sounds");

		SOUNDS.clear();
	}
}