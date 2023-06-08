package net.ryebread.computermod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.ryebread.computermod.ComputerMod;

public class ModItems {
    public static final Item COMPUTER = registerItem(
            "computer",
            new Item(new Item.Settings()),
            ItemGroups.TOOLS);
    public static final Item PHONE = registerItem(
            "phone",
            new Item(new Item.Settings()),
            ItemGroups.TOOLS);

    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(itemGroup -> itemGroup.add(item));
        return Registry.register(Registries.ITEM, new Identifier(ComputerMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ComputerMod.LOGGER.debug("Registering Mod Items for " + ComputerMod.MOD_ID);
    }
}
