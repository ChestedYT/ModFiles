package items;

import com.ChestedYT.Mod.MoreMod;
import com.ChestedYT.Mod.Reference;

import net.minecraft.item.ItemFood;

public class ItemObsidianSteak extends ItemFood {

	public ItemObsidianSteak() {
		super(10, 0.8F, false);
		setUnlocalizedName(Reference.MoreModItems.OBSIDIANSTEAK.getUnlocalizedName());
		setRegistryName(Reference.MoreModItems.OBSIDIANSTEAK.getRegistryName());
		setCreativeTab(MoreMod.tabMoreMod);
	}

}
