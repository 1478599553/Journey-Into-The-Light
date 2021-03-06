package net.journey.util.gen.lang;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.EntityEntry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LangSection<T> {
	static final ArrayList<LangSection<?>> SECTIONS = new ArrayList<>(); // should be the first statement in class
	public static final LangSection<CreativeTabs> CREATIVE_TABS = new LangSection<>("CreativeTabs", CreativeTabs::getTranslationKey);
	public static final LangSection<Block> BLOCKS = new LangSection<>("Blocks", block -> block.getTranslationKey() + ".name");
	public static final LangSection<Item> ITEMS = new LangSection<>("Items", item -> item.getTranslationKey() + ".name");
	public static final LangSection<ArmorData> ARMOR = new LangSection<>("Armor", (ArmorData data) -> data.getItem().getTranslationKey() + ".name")
			.setSortingComparator(Comparator.<Map.Entry<ArmorData, String>, String>comparing(mapEntry -> mapEntry.getKey().getType().getArmorMaterial().getName().toLowerCase())
					.thenComparingInt((mapEntry) -> {
						EntityEquipmentSlot armorType = mapEntry.getKey().getItem().armorType;
						if (armorType == EntityEquipmentSlot.HEAD) return 1;
						if (armorType == EntityEquipmentSlot.CHEST) return 2;
						if (armorType == EntityEquipmentSlot.LEGS) return 3;
						if (armorType == EntityEquipmentSlot.FEET) return 4;

						return 5;
					})
			);
	public static final LangSection<EntityEntry> ENTITIES = new LangSection<>("Entities", s -> "entity." + s.getName() + ".name");
	public static final LangSection<String> MISC = new LangSection<>("Miscellaneous", s -> s);
	private HashMap<T, String> entries = new HashMap<>();
	private String name;
	private Function<T, String> keyCreator;
	private Comparator<Map.Entry<T, String>> sorter = null;

	public LangSection(String name, @NotNull Function<T, String> keyCreator) {
		this.name = name;
		this.keyCreator = keyCreator;

		SECTIONS.add(this);
	}

	public LangSection<T> setSortingComparator(@Nullable Comparator<Map.Entry<T, String>> sorter) {
		this.sorter = sorter;

		return this;
	}

	public String getComment() {
		return "#" + name;
	}

	public String createKey(T entry) {
		return keyCreator.apply(entry);
	}

	public String createLangEntry(T entry, String enName) {
		return createKey(entry) + "=" + enName;
	}

	void addEntry(T entry, String enName) {
		if (entries == null)
			throw new IllegalStateException("Entry map has already been saved. You should add entries only before its saving.");
		entries.put(entry, enName);
	}

	List<String> convertEntries() {
		List<String> collect = entries.entrySet()
				.stream()
				.sorted(sorter != null ? sorter : Comparator.<Map.Entry<T, String>, String>comparing(o -> createKey(o.getKey()).toLowerCase()))
				.map(mapEntry -> createLangEntry(mapEntry.getKey(), mapEntry.getValue()))
				.collect(Collectors.toList());

		entries.clear();
		entries = null;
		return collect;
	}
}
