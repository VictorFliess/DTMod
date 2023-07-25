
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.dtmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class DtmodModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.DRAGON_BREATH, 10),

					new ItemStack(DtmodModItems.SOUL_FRAGMENT.get()), 10, 5, 0.05f));
		}
	}
}
