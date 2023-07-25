
package net.mcreator.dtmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.dtmod.init.DtmodModItems;

public class GadoliniumSwordItem extends SwordItem {
	public GadoliniumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 3032;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DtmodModItems.ITEMGADOLINIUMINGOT.get()));
			}
		}, 3, -2.2f, new Item.Properties());
	}
}
