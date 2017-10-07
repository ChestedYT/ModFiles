package items;

import com.ChestedYT.Mod.MoreMod;
import com.ChestedYT.Mod.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemObsidianNugget extends Item {

	public ItemObsidianNugget() {
		setUnlocalizedName(Reference.MoreModItems.OBSIDIANNUGGET.getUnlocalizedName());
		setRegistryName(Reference.MoreModItems.OBSIDIANNUGGET.getRegistryName());
		setCreativeTab(MoreMod.tabMoreMod);
	}
}
