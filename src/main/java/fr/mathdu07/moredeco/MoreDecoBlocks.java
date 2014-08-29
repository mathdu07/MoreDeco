package fr.mathdu07.moredeco;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockQuartz;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockWood;
import net.minecraft.block.material.Material;
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
	public final int NETHERRACK_TABLE_ID = WOODEN_TABLE_ID + 18;
	public final int SOULSAND_TABLE_ID = WOODEN_TABLE_ID + 19;
	public final int GLOWSTONE_TABLE_ID = WOODEN_TABLE_ID + 20;
	public final int NETHER_BRICK_TABLE_ID = WOODEN_TABLE_ID + 21;
	
	protected void init()
	{
		final Block woodenTable = new BlockTable(WOODEN_TABLE_ID, Block.wood, Block.planks, BlockWood.woodType).setUnlocalizedName("wooden_table");
		GameRegistry.registerBlock(woodenTable, ItemMultipleBlock.class, "wooden_table");
		
		final Block planksTable = new BlockTable(PLANKS_TABLE_ID, Block.planks, BlockWood.woodType).setUnlocalizedName("planks_table");
		GameRegistry.registerBlock(planksTable, ItemMultipleBlock.class, "planks_table");
		
		final Block glassTable = new BlockTable(GLASS_TABLE_ID, Block.glass, Block.planks).setUnlocalizedName("glass_table");
		GameRegistry.registerBlock(glassTable, "glass_table");
		
		final Block stoneTable = new BlockTable(STONE_TABLE_ID, Block.stone, Block.planks).setUnlocalizedName("stone_table");
		GameRegistry.registerBlock(stoneTable, "stone_table");
		
		final Block cobblestoneTable = new BlockTable(COBBLESTONE_TABLE_ID, Block.cobblestone, Block.planks).setUnlocalizedName("cobblestone_table");
		GameRegistry.registerBlock(cobblestoneTable, "cobblestone_table");
		
		final Block stonebrickTable = new BlockTable(STONEBRICK_TABLE_ID, Block.stoneBrick, Block.planks, 0, BlockStoneBrick.STONE_BRICK_TYPES).setUnlocalizedName("stonebrick_table");
		GameRegistry.registerBlock(stonebrickTable, ItemMultipleBlock.class, "stonebrick_table");
		
		final Block coalTable = new BlockTable(COAL_TABLE_ID, Block.coalBlock, Block.planks).setUnlocalizedName("coal_table");
		GameRegistry.registerBlock(coalTable, "coal_table");
		
		final Block ironTable = new BlockTable(IRON_TABLE_ID, Block.blockIron, Block.planks).setUnlocalizedName("iron_table");
		GameRegistry.registerBlock(ironTable, "iron_table");
		
		final Block goldTable = new BlockTable(GOLD_TABLE_ID, Block.blockGold, Block.planks).setUnlocalizedName("gold_table");
		GameRegistry.registerBlock(goldTable, "gold_table");
		
		final Block lapisTable = new BlockTable(LAPIS_TABLE_ID, Block.blockLapis, Block.planks).setUnlocalizedName("lapis_table");
		GameRegistry.registerBlock(lapisTable, "lapis_table");
		
		final Block redstoneTable = new BlockTable(REDSTONE_TABLE_ID, Block.blockRedstone, Block.planks).setUnlocalizedName("redstone_table");
		GameRegistry.registerBlock(redstoneTable, "redstone_table");
		
		final Block diamondTable = new BlockTable(DIAMOND_TABLE_ID, Block.blockDiamond, Block.planks).setUnlocalizedName("diamond_table");
		GameRegistry.registerBlock(diamondTable, "diamond_table");
		
		final Block emeraldTable = new BlockTable(EMERALD_TABLE_ID, Block.blockEmerald, Block.planks).setUnlocalizedName("emerald_table");
		GameRegistry.registerBlock(emeraldTable, "emerald_table");
		
		final Block sandstoneTable = new BlockTable(SANDSTONE_TABLE_ID, Block.sandStone, Block.planks).setUnlocalizedName("sandstone_table");
		GameRegistry.registerBlock(sandstoneTable, "sandstone_table");
		
		final Block quartzTable = new BlockTable(QUARTZ_TABLE_ID, Block.blockNetherQuartz, Block.planks, 0, BlockQuartz.quartzBlockTypes).setUnlocalizedName("quartz_table");
		GameRegistry.registerBlock(quartzTable, ItemMultipleBlock.class, "quartz_table");
		
		final Block woolTable = new BlockTable(WOOL_TABLE_ID, Block.cloth, Block.planks, 0, MoreDecoUtil.reverseArray(ItemDye.dyeItemNames, new String[ItemDye.dyeItemNames.length]))
				.setUnlocalizedName("wool_table");
		GameRegistry.registerBlock(woolTable, ItemMultipleBlock.class, "wool_table");
		
		final Block hardenedClayTable = new BlockTable(HARDENED_CLAY_TABLE_ID, Block.hardenedClay, Block.planks).setUnlocalizedName("hardened_clay_table");
		GameRegistry.registerBlock(hardenedClayTable, "hardened_clay_table");
		
		final Block stainedClayTable = new BlockTable(STAINED_CLAY_TABLE_ID, Block.stainedClay, Block.planks, 0, MoreDecoUtil.reverseArray(ItemDye.dyeItemNames, new String[ItemDye.dyeItemNames.length]))
		.setUnlocalizedName("stained_clay_table");
		GameRegistry.registerBlock(stainedClayTable, ItemMultipleBlock.class, "stained_clay_table");
		
		final Block netherrackTable = new BlockTable(NETHERRACK_TABLE_ID, Block.netherrack, Block.planks).setUnlocalizedName("netherrack_table");
		GameRegistry.registerBlock(netherrackTable, "netherrack_table");
		
		final Block soulsandTable = new BlockTable(SOULSAND_TABLE_ID, Block.slowSand, Block.planks).setUnlocalizedName("soulsand_table");
		GameRegistry.registerBlock(soulsandTable, "soulsand_table");
		
		final Block glowstoneTable = new BlockTable(GLOWSTONE_TABLE_ID, Block.glowStone, Block.planks).setUnlocalizedName("glowstone_table").setLightValue(1f);
		GameRegistry.registerBlock(glowstoneTable, "glowstone_table");
		
		final Block netherBrickTable = new BlockTable(NETHER_BRICK_TABLE_ID, Block.netherBrick, Block.planks).setUnlocalizedName("nether_brick_table");
		GameRegistry.registerBlock(netherBrickTable, "nether_brick_table");
	}

}
