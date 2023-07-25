
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dtmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.dtmod.block.BlockgadoliniumoreBlock;
import net.mcreator.dtmod.DtmodMod;

public class DtmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DtmodMod.MODID);
	public static final RegistryObject<Block> BLOCK_GADOLINIUM_ORE = REGISTRY.register("block_gadolinium_ore", () -> new BlockgadoliniumoreBlock());
}