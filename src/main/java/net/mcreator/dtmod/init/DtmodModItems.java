
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dtmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.dtmod.item.ItemrawgadoliniumItem;
import net.mcreator.dtmod.item.ItemgadoliniumingotItem;
import net.mcreator.dtmod.item.GadoliniumSwordItem;
import net.mcreator.dtmod.item.GadoliniumShovelItem;
import net.mcreator.dtmod.item.GadoliniumPickaxeItem;
import net.mcreator.dtmod.item.GadoliniumHoeItem;
import net.mcreator.dtmod.item.GadoliniumAxeItem;
import net.mcreator.dtmod.item.GadoliniumArmorItem;
import net.mcreator.dtmod.DtmodMod;

public class DtmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DtmodMod.MODID);
	public static final RegistryObject<Item> RAW_GADOLINIUM = REGISTRY.register("raw_gadolinium", () -> new ItemrawgadoliniumItem());
	public static final RegistryObject<Item> GADOLINIUM_ORE = block(DtmodModBlocks.GADOLINIUM_ORE);
	public static final RegistryObject<Item> GADOLINIUM_INGOT = REGISTRY.register("gadolinium_ingot", () -> new ItemgadoliniumingotItem());
	public static final RegistryObject<Item> GADOLINIUM_ARMOR_HELMET = REGISTRY.register("gadolinium_armor_helmet", () -> new GadoliniumArmorItem.Helmet());
	public static final RegistryObject<Item> GADOLINIUM_ARMOR_CHESTPLATE = REGISTRY.register("gadolinium_armor_chestplate", () -> new GadoliniumArmorItem.Chestplate());
	public static final RegistryObject<Item> GADOLINIUM_ARMOR_LEGGINGS = REGISTRY.register("gadolinium_armor_leggings", () -> new GadoliniumArmorItem.Leggings());
	public static final RegistryObject<Item> GADOLINIUM_ARMOR_BOOTS = REGISTRY.register("gadolinium_armor_boots", () -> new GadoliniumArmorItem.Boots());
	public static final RegistryObject<Item> GADOLINIUM_AXE = REGISTRY.register("gadolinium_axe", () -> new GadoliniumAxeItem());
	public static final RegistryObject<Item> GADOLINIUM_PICKAXE = REGISTRY.register("gadolinium_pickaxe", () -> new GadoliniumPickaxeItem());
	public static final RegistryObject<Item> GADOLINIUM_SWORD = REGISTRY.register("gadolinium_sword", () -> new GadoliniumSwordItem());
	public static final RegistryObject<Item> GADOLINIUM_SHOVEL = REGISTRY.register("gadolinium_shovel", () -> new GadoliniumShovelItem());
	public static final RegistryObject<Item> GADOLINIUM_HOE = REGISTRY.register("gadolinium_hoe", () -> new GadoliniumHoeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
