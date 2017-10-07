package init;

import com.ChestedYT.Mod.Reference;

import items.ItemObsidianArmor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;

public class ModArmor {
	
	public static ArmorMaterial obsidianMaterial = EnumHelper.addArmorMaterial("obsidian", Reference.MOD_ID + ":obsidian", 46, new int[] {3,8,6,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 10.0F);
	
	public static ItemObsidianArmor obsidianhelmet;
	public static ItemObsidianArmor obsidianchestplate;
	public static ItemObsidianArmor obsidianleggings;
	public static ItemObsidianArmor obsidianboots;
	
	public static void init() {
		obsidianhelmet = new ItemObsidianArmor(obsidianMaterial, 1, EntityEquipmentSlot.HEAD, "obsidianhelmet");
		obsidianchestplate = new ItemObsidianArmor(obsidianMaterial, 1, EntityEquipmentSlot.CHEST, "obsidianchestplate");
		obsidianleggings = new ItemObsidianArmor(obsidianMaterial, 2, EntityEquipmentSlot.LEGS, "obsidianleggings");
		obsidianboots = new ItemObsidianArmor(obsidianMaterial, 1, EntityEquipmentSlot.FEET, "obsidianboots");
	}
	
	public static void register() {
		registerItem(obsidianhelmet);
		registerItem(obsidianchestplate);
		registerItem(obsidianleggings);
		registerItem(obsidianboots);
	}
	


	public static void registerRenders() {
		registerRender(obsidianhelmet);
		registerRender(obsidianchestplate);
		registerRender(obsidianleggings);
		registerRender(obsidianboots);
	}
	
	private static void registerItem(ItemObsidianArmor obsidianBoots2) {
		
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

	}
}
