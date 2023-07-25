
package net.mcreator.dtmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.dtmod.init.DtmodModItems;

public class GadoliniumHoeItem extends HoeItem {
	public GadoliniumHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 3032;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DtmodModItems.GADOLINIUM_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties());
	}
}
