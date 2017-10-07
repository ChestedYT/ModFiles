package com.ChestedYT.Mod;

public class Reference {
	
	public static final String MOD_ID = "cytmm";
	public static final String NAME = "Tons of Item";
	public static final String VERSION = "1.8.3";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.ChestedYT.Mod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.ChestedYT.Mod.proxy.ServerProxy";
	
	public static enum MoreModItems {
		OBSIDIANINGOT("obsidianingot", "itemobsidianingot"),
		OBSIDIANNUGGET("obsidiannugget", "itemobsidiannugget"),
		SMELTEDOBSIDIAN("smeltedobsidian", "itemsmeltedobsidian"),
		OBSIDIANSTEAK("obsidiansteak", "itemobsidiansteak"),
		OBSIDIANHELMET("obsidianhelmet", "obsidianhelmet"),
		OBSIDIANCHESTPLATE("obsidianchestplate", "obsidianchestplate"),
		OBSIDIANLEGGINGS("obsidianleggings", "obsidianleggings"),
		OBSIDIANBOOTS("obsidianboots", "obsidianboots");
		
		private String unlocalizedName;
		private String registryName;
		
		MoreModItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
			
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
	
	public static enum MoreModBlocks {
		OBSIDIANSLAB ("blockobsidianslab", "obsidianslab");
		
		private String unlocalizedName;
		private String registryName;
		
		MoreModBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
			
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
