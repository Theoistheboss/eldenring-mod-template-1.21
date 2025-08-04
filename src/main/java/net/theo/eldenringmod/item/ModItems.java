package net.theo.eldenringmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.theo.eldenringmod.EldenringMod;

public class ModItems {
    public static final Item PEBBLE = registeritem("pebble", new Item( new Item.Settings()));


    public static Item registeritem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EldenringMod.MOD_ID, name), item);
    }

    public static void RegisterModItems() {
        EldenringMod.LOGGER.info("Registering Mod Items For " + EldenringMod.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PEBBLE);
        });
    }
}
