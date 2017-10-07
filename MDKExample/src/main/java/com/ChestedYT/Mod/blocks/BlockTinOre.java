package com.ChestedYT.Mod.blocks;

import com.ChestedYT.Mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlockTinOre extends Block {

	public BlockTinOre(String unlocalizedName, String registryName) {
		super(Material.ROCK);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, registryName));
		this.setHardness(20);
		this.setResistance(20);
	}
	
}
