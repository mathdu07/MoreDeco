package fr.mathdu07.moredeco;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockQuartz;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockWood;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import fr.mathdu07.moredeco.block.BlockTable;
import fr.mathdu07.moredeco.item.ItemMultipleBlock;

public final class MoreDecoBlocks {
	
	public final int WOODEN_TABLE_ID = 3124;
	public final int PLANKS_TABLE_ID = WOODEN_TABLE_ID + 1;
	public final int GLASS_TABLE_ID = WOODEN_TABLE_ID + 2;
	public final int STONE_TABLE_ID = WOODEN_TABLE_ID + 3;
	public final int COBBLESTONE_TABLE_ID = WOODEN_TABLE_ID + 4;
	public final int STONEBRICK_TABLE_ID = WOODEN_TABLE_ID + 5;
	public final int COAL_TABLE_ID = WOODEN_TABLE_ID + 6;
	public final int IRON_TABLE_ID = WOODEN_TABLE_ID + 7;
	public final int GOLD_TABLE_ID = WOODEN_TABLE_ID + 8;
	public final int LAPIS_TABLE_ID = WOODEN_TABLE_ID + 9;
	public final int REDSTONE_TABLE_ID = WOODEN_TABLE_ID + 10;
	public final int DIAMOND_TABLE_ID = WOODEN_TABLE_ID + 11;
	public final int EMERALD_TABLE_ID = WOODEN_TABLE_ID + 12;
	public final int SANDSTONE_TABLE_ID = WOODEN_TABLE_ID + 13;
	public final int QUARTZ_TABLE_ID = WOODEN_TABLE_ID + 14;
	public final int WOOL_TABLE_ID = WOODEN_TABLE_ID + 15;
	public final int HARDENED_CLAY_TABLE_ID = WOODEN_TABLE_ID + 16;
	public final int STAINED_CLAY_TABLE_ID = WOODEN_TABLE_ID + 17;
	
	//TODO Register block/item's names from a config file
	
	protected void init()
	{
		final Block woodenTable = new BlockTable(WOODEN_TABLE_ID, Block.wood, Block.planks, BlockWood.woodType).setUnlocalizedName("wooden_table");
		GameRegistry.registerBlock(woodenTable, ItemMultipleBlock.class, "wooden_table");
		LanguageRegistry.addName(new ItemStack(woodenTable, 1, 0), "Table en bois de chêne");
		LanguageRegistry.addName(new ItemStack(woodenTable, 1, 1), "Table en bois de sapin");
		LanguageRegistry.addName(new ItemStack(woodenTable, 1, 2), "Table en bois de bouleau");
		LanguageRegistry.addName(new ItemStack(woodenTable, 1, 3), "Table en bois d'acajou");
		
		final Block planksTable = new BlockTable(PLANKS_TABLE_ID, Block.planks, BlockWood.woodType).setUnlocalizedName("planks_table");
		GameRegistry.registerBlock(planksTable, ItemMultipleBlock.class, "planks_table");
		LanguageRegistry.addName(new ItemStack(planksTable, 1, 0), "Table en planches de chêne");
		LanguageRegistry.addName(new ItemStack(planksTable, 1, 1), "Table en planches de sapin");
		LanguageRegistry.addName(new ItemStack(planksTable, 1, 2), "Table en planches de bouleau");
		LanguageRegistry.addName(new ItemStack(planksTable, 1, 3), "Table en planches d'acajou");
		
		final Block glassTable = new BlockTable(GLASS_TABLE_ID, Block.glass, Block.planks).setUnlocalizedName("glass_table");
		GameRegistry.registerBlock(glassTable, "glass_table");
		LanguageRegistry.addName(glassTable, "Table en verre");
		
		final Block stoneTable = new BlockTable(STONE_TABLE_ID, Block.stone, Block.planks).setUnlocalizedName("stone_table");
		GameRegistry.registerBlock(stoneTable, "stone_table");
		LanguageRegistry.addName(stoneTable, "Table en roche");
		
		final Block cobblestoneTable = new BlockTable(COBBLESTONE_TABLE_ID, Block.cobblestone, Block.planks).setUnlocalizedName("cobblestone_table");
		GameRegistry.registerBlock(cobblestoneTable, "cobblestone_table");
		LanguageRegistry.addName(cobblestoneTable, "Table en pierres");
		
		final Block stonebrickTable = new BlockTable(STONEBRICK_TABLE_ID, Block.stoneBrick, Block.planks, 0, BlockStoneBrick.STONE_BRICK_TYPES).setUnlocalizedName("stonebrick_table");
		GameRegistry.registerBlock(stonebrickTable, ItemMultipleBlock.class, "stonebrick_table");
		LanguageRegistry.addName(new ItemStack(stonebrickTable, 1, 0), "Table en pierre taillée");
		LanguageRegistry.addName(new ItemStack(stonebrickTable, 1, 1), "Table en pierre taillée moussue");
		LanguageRegistry.addName(new ItemStack(stonebrickTable, 1, 2), "Table en pierre taillée craquelées");
		LanguageRegistry.addName(new ItemStack(stonebrickTable, 1, 3), "Table en pierre sculptée");
		
		final Block coalTable = new BlockTable(COAL_TABLE_ID, Block.coalBlock, Block.planks).setUnlocalizedName("coal_table");
		GameRegistry.registerBlock(coalTable, "coal_table");
		LanguageRegistry.addName(coalTable, "Table en charbon");
		
		final Block ironTable = new BlockTable(IRON_TABLE_ID, Block.blockIron, Block.planks).setUnlocalizedName("iron_table");
		GameRegistry.registerBlock(ironTable, "iron_table");
		LanguageRegistry.addName(ironTable, "Table en fer");
		
		final Block goldTable = new BlockTable(GOLD_TABLE_ID, Block.blockGold, Block.planks).setUnlocalizedName("gold_table");
		GameRegistry.registerBlock(goldTable, "gold_table");
		LanguageRegistry.addName(goldTable, "Table en or");
		
		final Block lapisTable = new BlockTable(LAPIS_TABLE_ID, Block.blockLapis, Block.planks).setUnlocalizedName("lapis_table");
		GameRegistry.registerBlock(lapisTable, "lapis_table");
		LanguageRegistry.addName(lapisTable, "Table en lapis-lazulis");
		
		final Block redstoneTable = new BlockTable(REDSTONE_TABLE_ID, Block.blockRedstone, Block.planks).setUnlocalizedName("redstone_table");
		GameRegistry.registerBlock(redstoneTable, "redstone_table");
		LanguageRegistry.addName(redstoneTable, "Table en redstone");
		
		final Block diamondTable = new BlockTable(DIAMOND_TABLE_ID, Block.blockDiamond, Block.planks).setUnlocalizedName("diamond_table");
		GameRegistry.registerBlock(diamondTable, "diamond_table");
		LanguageRegistry.addName(diamondTable, "Table en diamant");
		
		final Block emeraldTable = new BlockTable(EMERALD_TABLE_ID, Block.blockEmerald, Block.planks).setUnlocalizedName("emerald_table");
		GameRegistry.registerBlock(emeraldTable, "emerald_table");
		LanguageRegistry.addName(emeraldTable, "Table en émeraude");
		
		final Block sandstoneTable = new BlockTable(SANDSTONE_TABLE_ID, Block.sandStone, Block.planks).setUnlocalizedName("sandstone_table");
		GameRegistry.registerBlock(sandstoneTable, "sandstone_table");
		LanguageRegistry.addName(sandstoneTable, "Table en grès");
		
		final Block quartzTable = new BlockTable(QUARTZ_TABLE_ID, Block.blockNetherQuartz, Block.planks, 0, BlockQuartz.quartzBlockTypes).setUnlocalizedName("quartz_table");
		GameRegistry.registerBlock(quartzTable, ItemMultipleBlock.class, "quartz_table");
		LanguageRegistry.addName(new ItemStack(quartzTable, 1, 0), "Table en quartz");
		LanguageRegistry.addName(new ItemStack(quartzTable, 1, 1), "Table en quartz gravé");
		LanguageRegistry.addName(new ItemStack(quartzTable, 1, 2), "Table en quartz rayé");
		
		final Block woolTable = new BlockTable(WOOL_TABLE_ID, Block.cloth, Block.planks, 0, MoreDecoUtil.reverseArray(ItemDye.dyeItemNames, new String[ItemDye.dyeItemNames.length]))
				.setUnlocalizedName("wool_table");
		GameRegistry.registerBlock(woolTable, ItemMultipleBlock.class, "wool_table");
		LanguageRegistry.addName(new ItemStack(woolTable, 1, 0), "Table en laine blanche");
		LanguageRegistry.addName(new ItemStack(woolTable, 1, 1), "Table en laine orange");
		LanguageRegistry.addName(new ItemStack(woolTable, 1, 2), "Table en laine magenta");
		LanguageRegistry.addName(new ItemStack(woolTable, 1, 3), "Table en laine bleu clair");
		LanguageRegistry.addName(new ItemStack(woolTable, 1, 4), "Table en laine jaune");
		LanguageRegistry.addName(new ItemStack(woolTable, 1, 5), "Table en laine vert clair");
		LanguageRegistry.addName(new ItemStack(woolTable, 1, 6), "Table en laine rose");
		LanguageRegistry.addName(new ItemStack(woolTable, 1, 7), "Table en laine grise");
		LanguageRegistry.addName(new ItemStack(woolTable, 1, 8), "Table en laine gris clair");
		LanguageRegistry.addName(new ItemStack(woolTable, 1, 9), "Table en laine cyan");
		LanguageRegistry.addName(new ItemStack(woolTable, 1, 10), "Table en laine violettte");
		LanguageRegistry.addName(new ItemStack(woolTable, 1, 11), "Table en laine bleue");
		LanguageRegistry.addName(new ItemStack(woolTable, 1, 12), "Table en laine marron");
		LanguageRegistry.addName(new ItemStack(woolTable, 1, 13), "Table en laine verte");
		LanguageRegistry.addName(new ItemStack(woolTable, 1, 14), "Table en laine rouge");
		LanguageRegistry.addName(new ItemStack(woolTable, 1, 15), "Table en laine noire");
		
		final Block hardenedClayTable = new BlockTable(HARDENED_CLAY_TABLE_ID, Block.hardenedClay, Block.planks).setUnlocalizedName("hardened_clay_table");
		GameRegistry.registerBlock(hardenedClayTable, "hardened_clay_table");
		LanguageRegistry.addName(hardenedClayTable, "Table en argile durcie");
		
		final Block stainedClayTable = new BlockTable(STAINED_CLAY_TABLE_ID, Block.stainedClay, Block.planks, 0, MoreDecoUtil.reverseArray(ItemDye.dyeItemNames, new String[ItemDye.dyeItemNames.length]))
		.setUnlocalizedName("stained_clay_table");
		GameRegistry.registerBlock(stainedClayTable, ItemMultipleBlock.class, "stained_clay_table");
		LanguageRegistry.addName(new ItemStack(stainedClayTable, 1, 0), "Table en argile durcie blanche");
		LanguageRegistry.addName(new ItemStack(stainedClayTable, 1, 1), "Table en argile durcie orange");
		LanguageRegistry.addName(new ItemStack(stainedClayTable, 1, 2), "Table en argile durcie magenta");
		LanguageRegistry.addName(new ItemStack(stainedClayTable, 1, 3), "Table en argile durcie bleu clair");
		LanguageRegistry.addName(new ItemStack(stainedClayTable, 1, 4), "Table en argile durcie jaune");
		LanguageRegistry.addName(new ItemStack(stainedClayTable, 1, 5), "Table en argile durcie vert clair");
		LanguageRegistry.addName(new ItemStack(stainedClayTable, 1, 6), "Table en argile durcie rose");
		LanguageRegistry.addName(new ItemStack(stainedClayTable, 1, 7), "Table en argile durcie grise");
		LanguageRegistry.addName(new ItemStack(stainedClayTable, 1, 8), "Table en argile durcie gris clair");
		LanguageRegistry.addName(new ItemStack(stainedClayTable, 1, 9), "Table en argile durcie cyan");
		LanguageRegistry.addName(new ItemStack(stainedClayTable, 1, 10), "Table en argile durcie violettte");
		LanguageRegistry.addName(new ItemStack(stainedClayTable, 1, 11), "Table en argile durcie bleue");
		LanguageRegistry.addName(new ItemStack(stainedClayTable, 1, 12), "Table en argile durcie marron");
		LanguageRegistry.addName(new ItemStack(stainedClayTable, 1, 13), "Table en argile durcie verte");
		LanguageRegistry.addName(new ItemStack(stainedClayTable, 1, 14), "Table en argile durcie rouge");
		LanguageRegistry.addName(new ItemStack(stainedClayTable, 1, 15), "Table en argile durcie noire");
	}

}
