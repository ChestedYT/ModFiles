package items;

import com.ChestedYT.Mod.MoreMod;
import com.ChestedYT.Mod.Reference;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;

public class ItemObsidianPickaxe extends ItemPickaxe {

	public ItemObsidianPickaxe(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
		setCreativeTab(MoreMod.tabMoreMod);
	}

}
