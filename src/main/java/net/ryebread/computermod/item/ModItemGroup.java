package net.ryebread.computermod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.ryebread.computermod.ComputerMod;

public class ModItemGroup {
    public static final ItemGroup GADGETS = FabricItemGroup.builder(
                    new Identifier(ComputerMod.MOD_ID, "gadgets"))
            .icon(() -> new ItemStack(ModItems.COMPUTER))
            .build();
}
