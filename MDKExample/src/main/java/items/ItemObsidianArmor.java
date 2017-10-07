package items;

import com.ChestedYT.Mod.MoreMod;
import com.ChestedYT.Mod.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;

public class ItemObsidianArmor extends ItemArmor {

	public ItemObsidianArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String unlocalizedName) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
		setCreativeTab(MoreMod.tabMoreMod);
	}

}
