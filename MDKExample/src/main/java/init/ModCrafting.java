package init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianIngot), "OOO", "OOO", "OOO", 'O', ModItems.obsidianNugget);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.obsidianNugget, 9), ModItems.obsidianIngot);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.OBSIDIAN), "OOO", "OOO", "OOO", 'O', ModItems.obsidianIngot);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.obsidianIngot, 9), ModItems.smeltedObsidian);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.obsidianSteak), Items.COOKED_BEEF, ModItems.smeltedObsidian);
		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.smeltedObsidian), 0.7F);
		GameRegistry.addRecipe(new ItemStack(ModArmor.obsidianhelmet), new Object[] { "III","I I","   ",'I', ModItems.obsidianIngot});
		GameRegistry.addRecipe(new ItemStack(ModArmor.obsidianhelmet), new Object[] { "   ","III","I I",'I', ModItems.obsidianIngot});
		GameRegistry.addRecipe(new ItemStack(ModArmor.obsidianchestplate), new Object[] { "I I","III","III",'I', ModItems.obsidianIngot});
		GameRegistry.addRecipe(new ItemStack(ModArmor.obsidianleggings), new Object[] { "III","I I","I I",'I', ModItems.obsidianIngot});
		GameRegistry.addRecipe(new ItemStack(ModArmor.obsidianboots), new Object[] { "I I","I I","   ",'I', ModItems.obsidianIngot});
		GameRegistry.addRecipe(new ItemStack(ModArmor.obsidianboots), new Object[] { "   ","I I","I I",'I', ModItems.obsidianIngot});
		GameRegistry.addShapedRecipe(new ItemStack(ModTools.obsidianPickaxe), "OOO", "XSX","XSX", 'O', ModItems.obsidianIngot, 'S', Items.STICK);
		
	}
}
