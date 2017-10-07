package items;

import com.ChestedYT.Mod.MoreMod;
import com.ChestedYT.Mod.Reference;

import net.minecraft.item.ItemSpade;
import net.minecraft.util.ResourceLocation;

public class ItemObsidianShovel extends ItemSpade {

	public ItemObsidianShovel(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
		setCreativeTab(MoreMod.tabMoreMod);
	}

}
