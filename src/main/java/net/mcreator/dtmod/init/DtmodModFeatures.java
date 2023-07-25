
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dtmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.dtmod.world.features.ores.BlockgadoliniumoreFeature;
import net.mcreator.dtmod.DtmodMod;

@Mod.EventBusSubscriber
public class DtmodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, DtmodMod.MODID);
	public static final RegistryObject<Feature<?>> BLOCK_GADOLINIUM_ORE = REGISTRY.register("block_gadolinium_ore", BlockgadoliniumoreFeature::new);
}