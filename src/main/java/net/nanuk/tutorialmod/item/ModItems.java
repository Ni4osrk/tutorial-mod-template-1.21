package net.nanuk.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nanuk.tutorialmod.TutorialMod;

public class ModItems {
    public static final Item PURPITE_INGOT = registerItem("purpite_ingot", new Item(new Item.Settings()));
    public static final Item RAW_PURPITE = registerItem("raw_purpite", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registerin Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PURPITE_INGOT);
            entries.add(RAW_PURPITE);
        });
    }
}
