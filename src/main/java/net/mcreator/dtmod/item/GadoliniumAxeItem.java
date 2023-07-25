
package net.mcreator.dtmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.dtmod.init.DtmodModItems;

public class GadoliniumAxeItem extends AxeItem {
	public GadoliniumAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3032;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DtmodModItems.GADOLINIUM_INGOT.get()));
			}
		}, 1, -2.8f, new Item.Properties());
	}
}
