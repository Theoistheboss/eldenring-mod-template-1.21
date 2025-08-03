package net.theo.eldenringmod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.theo.eldenringmod.EldenringMod;

public class ModItems {

    public static Item registeritem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EldenringMod.MOD_ID, name), item);
    }

    public static void RegisterModItems() {
        EldenringMod.LOGGER.info("Registering Mod Items For " + EldenringMod.MOD_ID);
    }
}
