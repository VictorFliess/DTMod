
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dtmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DtmodModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("dtmod", "tab_divine_trinity"),
				builder -> builder.title(Component.translatable("item_group.dtmod.tab_divine_trinity")).icon(() -> new ItemStack(Blocks.STRUCTURE_BLOCK)).displayItems((parameters, tabData) -> {
					tabData.accept(DtmodModItems.RAW_GADOLINIUM.get());
					tabData.accept(DtmodModBlocks.GADOLINIUM_ORE.get().asItem());
					tabData.accept(DtmodModItems.GADOLINIUM_INGOT.get());
					tabData.accept(DtmodModItems.GADOLINIUM_ARMOR_HELMET.get());
					tabData.accept(DtmodModItems.GADOLINIUM_ARMOR_CHESTPLATE.get());
					tabData.accept(DtmodModItems.GADOLINIUM_ARMOR_LEGGINGS.get());
					tabData.accept(DtmodModItems.GADOLINIUM_ARMOR_BOOTS.get());
					tabData.accept(DtmodModItems.GADOLINIUM_AXE.get());
					tabData.accept(DtmodModItems.GADOLINIUM_PICKAXE.get());
					tabData.accept(DtmodModItems.GADOLINIUM_SWORD.get());
					tabData.accept(DtmodModItems.GADOLINIUM_SHOVEL.get());
					tabData.accept(DtmodModItems.GADOLINIUM_HOE.get());
				})

		);
	}
}
