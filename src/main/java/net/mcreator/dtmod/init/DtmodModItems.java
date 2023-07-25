
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
import net.mcreator.dtmod.DtmodMod;

public class DtmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DtmodMod.MODID);
	public static final RegistryObject<Item> ITEM_RAW_GADOLINIUM = REGISTRY.register("item_raw_gadolinium", () -> new ItemrawgadoliniumItem());
	public static final RegistryObject<Item> BLOCK_GADOLINIUM_ORE = block(DtmodModBlocks.BLOCK_GADOLINIUM_ORE);
	public static final RegistryObject<Item> ITEMGADOLINIUMINGOT = REGISTRY.register("itemgadoliniumingot", () -> new ItemgadoliniumingotItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
