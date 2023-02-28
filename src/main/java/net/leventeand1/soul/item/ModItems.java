package net.leventeand1.soul.item;

import net.leventeand1.soul.SoulMod;
import net.leventeand1.soul.tool.ModItemTier;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SoulMod.MOD_ID);

    public static final RegistryObject<Item> SOUL_SAND_DUST = ITEMS.register("soul_dust", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SOUL_SAND_SWORD = ITEMS.register("soul_sand_sword", () -> new SwordItem(ModItemTier.SOUL_SAND, 8, 4f, new Item.Properties()));

    public static final RegistryObject<Item> SOUL_SAND_PICKAXE = ITEMS.register("soul_sand_pickaxe", () -> new PickaxeItem(ModItemTier.SOUL_SAND, 3, 2f, new Item.Properties()));

    public static final RegistryObject<Item> SOUL_SAND_SHOVEL = ITEMS.register("soul_sand_shovel", () -> new ShovelItem(ModItemTier.SOUL_SAND, 2, 3f, new Item.Properties()));

    public static final RegistryObject<Item> SOUL_SAND_AXE = ITEMS.register("soul_sand_axe", () -> new AxeItem(ModItemTier.SOUL_SAND, 6, 1f, new Item.Properties()));

    public static final RegistryObject<Item> SOUL_SAND_HOE = ITEMS.register("soul_sand_hoe", () -> new HoeItem(ModItemTier.SOUL_SAND, 5, 4f, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
