package com.ChestedYT.Mod;

import com.ChestedYT.Mod.proxy.CommonProxy;

import init.ModArmor;
import init.ModBlocks;
import init.ModCrafting;
import init.ModItems;
import init.ModTools;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class MoreMod {

	@Instance
	public static MoreMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
		
		ModTools.init();
		ModTools.register();
		
		ModArmor.init();
		ModArmor.register();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.init();
		
		ModCrafting.register();
	}
	
	@EventHandler
	public void Post(FMLPostInitializationEvent event)
	{
		
	}
	
	public static CreativeTabs tabMoreMod = new CreativeTabs("tab_moremod") {
		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Blocks.OBSIDIAN);
		}
	};
}
