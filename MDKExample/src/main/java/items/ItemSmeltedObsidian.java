package items;

import com.ChestedYT.Mod.MoreMod;
import com.ChestedYT.Mod.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSmeltedObsidian extends Item {
	
	public ItemSmeltedObsidian() {
		setUnlocalizedName(Reference.MoreModItems.SMELTEDOBSIDIAN.getUnlocalizedName());
		setRegistryName(Reference.MoreModItems.SMELTEDOBSIDIAN.getRegistryName());
		setCreativeTab(MoreMod.tabMoreMod);
	}
}
