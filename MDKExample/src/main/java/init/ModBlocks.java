package init;

import com.ChestedYT.Mod.Reference;
import com.ChestedYT.Mod.blocks.BlockTinOre;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block tin_ore;
	
	public static void init() {
		tin_ore = new BlockTinOre("tin_ore", "tin_ore");
	}
	
	public static void register() {
		registerBlock(tin_ore);		
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(tin_ore);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(tin_ore);
	}
	

	
	private static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, block.getUnlocalizedName().substring(5)), "inventory"));
		
	}
}
