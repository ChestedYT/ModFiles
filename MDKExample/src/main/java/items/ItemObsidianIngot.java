package items;

import com.ChestedYT.Mod.MoreMod;
import com.ChestedYT.Mod.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemObsidianIngot extends Item {

	public ItemObsidianIngot() {
		setUnlocalizedName(Reference.MoreModItems.OBSIDIANINGOT.getUnlocalizedName());
		setRegistryName(Reference.MoreModItems.OBSIDIANINGOT.getRegistryName());
		setCreativeTab(MoreMod.tabMoreMod);
	}
}
