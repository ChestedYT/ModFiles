package init;

import com.ChestedYT.Mod.Reference;

import items.ItemObsidianArmor;
import items.ItemObsidianIngot;
import items.ItemObsidianNugget;
import items.ItemObsidianSteak;
import items.ItemSmeltedObsidian;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ArmorMaterial obsidianMaterial = EnumHelper.addArmorMaterial("obsidian", Reference.MOD_ID + ":obsidian", 15, new int[] {2,6,5,2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 10.0F);
	
	public static Item obsidianIngot;
	public static Item obsidianNugget;
	public static Item smeltedObsidian;
	public static Item obsidianSteak;
	public static Item obsidianhelmet;
	public static Item obsidianchestplate;
	public static Item obsidianleggings;
	public static Item obsidianboots;
	
	public static void init() {
		obsidianIngot = new ItemObsidianIngot();
		obsidianNugget = new ItemObsidianNugget();
		smeltedObsidian = new ItemSmeltedObsidian();
		obsidianSteak = new ItemObsidianSteak();
		obsidianhelmet = new ItemObsidianArmor(obsidianMaterial, 1, EntityEquipmentSlot.HEAD, "obsidian_helmet");
		obsidianchestplate = new ItemObsidianArmor(obsidianMaterial, 1, EntityEquipmentSlot.CHEST, "obsidian_chestplate");
		obsidianleggings = new ItemObsidianArmor(obsidianMaterial, 2, EntityEquipmentSlot.LEGS, "obsidian_leggings");
		obsidianboots = new ItemObsidianArmor(obsidianMaterial, 1, EntityEquipmentSlot.FEET, "obsidian_boots");
	}
	
	public static void register() {
		GameRegistry.register(obsidianIngot);
		GameRegistry.register(obsidianNugget);
		GameRegistry.register(smeltedObsidian);
		GameRegistry.register(obsidianSteak);
		GameRegistry.register(obsidianhelmet);
		GameRegistry.register(obsidianchestplate);
		GameRegistry.register(obsidianleggings);
		GameRegistry.register(obsidianboots);
	}
	
	public static void registerRenders() {
		registerRender(obsidianIngot);
		registerRender(obsidianNugget);
		registerRender(smeltedObsidian);
		registerRender(obsidianSteak);
		registerRender(obsidianhelmet);
		registerRender(obsidianchestplate);
		registerRender(obsidianleggings);
		registerRender(obsidianboots);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

	}
}
