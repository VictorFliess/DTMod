
package net.mcreator.dtmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.dtmod.init.DtmodModItems;

public abstract class Painite_reinforced_GadoliniumArmorItem extends ArmorItem {
	public Painite_reinforced_GadoliniumArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 60;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{8, 11, 13, 8}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 12;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DtmodModItems.GADOLINIUM_INGOT.get()));
			}

			@Override
			public String getName() {
				return "painite_reinforced_gadolinium_armor";
			}

			@Override
			public float getToughness() {
				return 8f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.5f;
			}
		}, type, properties);
	}

	public static class Helmet extends Painite_reinforced_GadoliniumArmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dtmod:textures/models/armor/painite_reinforced_gadolinium_layer_1.png";
		}
	}

	public static class Chestplate extends Painite_reinforced_GadoliniumArmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dtmod:textures/models/armor/painite_reinforced_gadolinium_layer_1.png";
		}
	}

	public static class Leggings extends Painite_reinforced_GadoliniumArmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dtmod:textures/models/armor/painite_reinforced_gadolinium_layer_2.png";
		}
	}

	public static class Boots extends Painite_reinforced_GadoliniumArmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dtmod:textures/models/armor/painite_reinforced_gadolinium_layer_1.png";
		}
	}
}
