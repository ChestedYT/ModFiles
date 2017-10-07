package init;

import com.ChestedYT.Mod.Reference;

import items.ItemObsidianAxe;
import items.ItemObsidianHoe;
import items.ItemObsidianPickaxe;
import items.ItemObsidianShovel;
import items.ItemObsidianSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTools {
	
	public static final ToolMaterial obsidianMaterial = EnumHelper.addToolMaterial(Reference.MOD_ID + ":obsidian", 3, 2000, 15.0F, 8.0F, 10);
	
	public static ItemPickaxe obsidianPickaxe;
	public static ItemSpade obsidianShovel;
	public static ItemTool obsidianAxe;
	public static ItemSword obsidianSword;
	public static ItemHoe obsidianHoe;
	
	public static void init() {
		obsidianPickaxe = new ItemObsidianPickaxe(obsidianMaterial, "obsidian_pickaxe");
		obsidianShovel = new ItemObsidianShovel(obsidianMaterial, "obsidian_shovel");
		obsidianAxe = new ItemObsidianAxe(obsidianMaterial, "obsidian_axe");
		obsidianSword = new ItemObsidianSword(obsidianMaterial, "obsidian_sword");
		obsidianHoe = new ItemObsidianHoe(obsidianMaterial, "obsidian_hoe");
	}
	
	public static void register() {
		registerItem(obsidianPickaxe);
		registerItem(obsidianShovel);
		registerItem(obsidianAxe);
		registerItem(obsidianSword);
		registerItem(obsidianHoe);
	}
	
	public static void registerRenders() {
		registerRender(obsidianPickaxe);
		registerRender(obsidianShovel);
		registerRender(obsidianAxe);
		registerRender(obsidianSword);
		registerRender(obsidianHoe);
	}
	
	private static void registerItem(Item item) {
		GameRegistry.register(item);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

	}
}
