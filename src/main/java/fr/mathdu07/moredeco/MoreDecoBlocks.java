package fr.mathdu07.moredeco;

import net.minecraft.block.Block;
import net.minecraft.block.BlockQuartz;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockWood;
import net.minecraft.item.ItemDye;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.mathdu07.moredeco.block.BlockChair;
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
	
	public final int WOODEN_CHAIR_ID = WOODEN_TABLE_ID + 100;
	public final int PLANKS_CHAIR_ID = WOODEN_CHAIR_ID + 1;
	public final int GLASS_CHAIR_ID = WOODEN_CHAIR_ID + 2;
	public final int STONE_CHAIR_ID = WOODEN_CHAIR_ID + 3;
	public final int COBBLESTONE_CHAIR_ID = WOODEN_CHAIR_ID + 4;
	public final int STONEBRICK_CHAIR_ID = WOODEN_CHAIR_ID + 5;
	public final int COAL_CHAIR_ID = WOODEN_CHAIR_ID + 6;
	public final int IRON_CHAIR_ID = WOODEN_CHAIR_ID + 7;
	public final int GOLD_CHAIR_ID = WOODEN_CHAIR_ID + 8;
	public final int LAPIS_CHAIR_ID = WOODEN_CHAIR_ID + 9;
	public final int REDSTONE_CHAIR_ID = WOODEN_CHAIR_ID + 10;
	public final int DIAMOND_CHAIR_ID = WOODEN_CHAIR_ID + 11;
	public final int EMERALD_CHAIR_ID = WOODEN_CHAIR_ID + 12;
	public final int SANDSTONE_CHAIR_ID = WOODEN_CHAIR_ID + 13;
	public final int QUARTZ_CHAIR_ID = WOODEN_CHAIR_ID + 14;
	public final int WOOL_0_CHAIR_ID = WOODEN_CHAIR_ID + 15;
	public final int WOOL_1_CHAIR_ID = WOODEN_CHAIR_ID + 16;
	public final int WOOL_2_CHAIR_ID = WOODEN_CHAIR_ID + 17;
	public final int WOOL_3_CHAIR_ID = WOODEN_CHAIR_ID + 18;
	public final int HARDENED_CLAY_CHAIR_ID = WOODEN_CHAIR_ID + 19;
	public final int STAINED_CLAY_0_CHAIR_ID = WOODEN_CHAIR_ID + 20;
	public final int STAINED_CLAY_1_CHAIR_ID = WOODEN_CHAIR_ID + 21;
	public final int STAINED_CLAY_2_CHAIR_ID = WOODEN_CHAIR_ID + 22;
	public final int STAINED_CLAY_3_CHAIR_ID = WOODEN_CHAIR_ID + 23;
	public final int NETHERRACK_CHAIR_ID = WOODEN_CHAIR_ID + 24;
	public final int SOULSAND_CHAIR_ID = WOODEN_CHAIR_ID + 25;
	public final int GLOWSTONE_CHAIR_ID = WOODEN_CHAIR_ID + 26;
	public final int NETHER_BRICK_CHAIR_ID = WOODEN_CHAIR_ID + 27;
	
	protected void init()
	{
		final Block woodenTable = new BlockTable(WOODEN_TABLE_ID, Block.wood, Block.planks, BlockWood.woodType).setUnlocalizedName("wooden_table");
		GameRegistry.registerBlock(woodenTable, ItemMultipleBlock.class, "wooden_table");
		final Block woodenChair = new BlockChair(WOODEN_CHAIR_ID, Block.wood, Block.planks, BlockWood.woodType).setUnlocalizedName("wooden_chair");
		GameRegistry.registerBlock(woodenChair, ItemMultipleBlock.class, "wooden_chair");
		
		final Block planksTable = new BlockTable(PLANKS_TABLE_ID, Block.planks, BlockWood.woodType).setUnlocalizedName("planks_table");
		GameRegistry.registerBlock(planksTable, ItemMultipleBlock.class, "planks_table");
		final Block planksChair = new BlockChair(PLANKS_CHAIR_ID, Block.planks, BlockWood.woodType).setUnlocalizedName("planks_chair");
		GameRegistry.registerBlock(planksChair, ItemMultipleBlock.class, "planks_chair");
		
		final Block glassTable = new BlockTable(GLASS_TABLE_ID, Block.glass, Block.planks).setUnlocalizedName("glass_table");
		GameRegistry.registerBlock(glassTable, "glass_table");
		final Block glassChair = new BlockChair(GLASS_CHAIR_ID, Block.glass, Block.planks).setUnlocalizedName("glass_chair");
		GameRegistry.registerBlock(glassChair, "glass_chair");
		
		final Block stoneTable = new BlockTable(STONE_TABLE_ID, Block.stone, Block.planks).setUnlocalizedName("stone_table");
		GameRegistry.registerBlock(stoneTable, "stone_table");
		final Block stoneChair = new BlockChair(STONE_CHAIR_ID, Block.stone, Block.planks).setUnlocalizedName("stone_chair");
		GameRegistry.registerBlock(stoneChair, "stone_chair");
		
		final Block cobblestoneTable = new BlockTable(COBBLESTONE_TABLE_ID, Block.cobblestone, Block.planks).setUnlocalizedName("cobblestone_table");
		GameRegistry.registerBlock(cobblestoneTable, "cobblestone_table");
		final Block cobblestoneChair = new BlockChair(COBBLESTONE_CHAIR_ID, Block.cobblestone, Block.planks).setUnlocalizedName("cobblestone_chair");
		GameRegistry.registerBlock(cobblestoneChair, "cobblestone_chair");
		
		final Block stonebrickTable = new BlockTable(STONEBRICK_TABLE_ID, Block.stoneBrick, Block.planks, 0, BlockStoneBrick.STONE_BRICK_TYPES).setUnlocalizedName("stonebrick_table");
		GameRegistry.registerBlock(stonebrickTable, ItemMultipleBlock.class, "stonebrick_table");
		final Block stonebrickChair = new BlockChair(STONEBRICK_CHAIR_ID, Block.stoneBrick, Block.planks, 0, BlockStoneBrick.STONE_BRICK_TYPES).setUnlocalizedName("stonebrick_chair");
		GameRegistry.registerBlock(stonebrickChair, ItemMultipleBlock.class, "stonebrick_chair");
		
		final Block coalTable = new BlockTable(COAL_TABLE_ID, Block.coalBlock, Block.planks).setUnlocalizedName("coal_table");
		GameRegistry.registerBlock(coalTable, "coal_table");
		final Block coalChair = new BlockChair(COAL_CHAIR_ID, Block.coalBlock, Block.planks).setUnlocalizedName("coal_chair");
		GameRegistry.registerBlock(coalChair, "coal_chair");
		
		final Block ironTable = new BlockTable(IRON_TABLE_ID, Block.blockIron, Block.planks).setUnlocalizedName("iron_table");
		GameRegistry.registerBlock(ironTable, "iron_table");
		final Block ironChair = new BlockChair(IRON_CHAIR_ID, Block.blockIron, Block.planks).setUnlocalizedName("iron_chair");
		GameRegistry.registerBlock(ironChair, "iron_chair");
		
		final Block goldTable = new BlockTable(GOLD_TABLE_ID, Block.blockGold, Block.planks).setUnlocalizedName("gold_table");
		GameRegistry.registerBlock(goldTable, "gold_table");
		final Block goldChair = new BlockChair(GOLD_CHAIR_ID, Block.blockGold, Block.planks).setUnlocalizedName("gold_chair");
		GameRegistry.registerBlock(goldChair, "gold_chair");
		
		final Block lapisTable = new BlockTable(LAPIS_TABLE_ID, Block.blockLapis, Block.planks).setUnlocalizedName("lapis_table");
		GameRegistry.registerBlock(lapisTable, "lapis_table");
		final Block lapisChair = new BlockChair(LAPIS_CHAIR_ID, Block.blockLapis, Block.planks).setUnlocalizedName("lapis_chair");
		GameRegistry.registerBlock(lapisChair, "lapis_chair");
		
		final Block redstoneTable = new BlockTable(REDSTONE_TABLE_ID, Block.blockRedstone, Block.planks).setUnlocalizedName("redstone_table");
		GameRegistry.registerBlock(redstoneTable, "redstone_table");
		final Block redstoneChair = new BlockChair(REDSTONE_CHAIR_ID, Block.blockRedstone, Block.planks).setUnlocalizedName("redstone_chair");
		GameRegistry.registerBlock(redstoneChair, "redstone_chair");
		
		final Block diamondTable = new BlockTable(DIAMOND_TABLE_ID, Block.blockDiamond, Block.planks).setUnlocalizedName("diamond_table");
		GameRegistry.registerBlock(diamondTable, "diamond_table");
		final Block diamondChair = new BlockChair(DIAMOND_CHAIR_ID, Block.blockDiamond, Block.planks).setUnlocalizedName("diamond_chair");
		GameRegistry.registerBlock(diamondChair, "diamond_chair");
		
		final Block emeraldTable = new BlockTable(EMERALD_TABLE_ID, Block.blockEmerald, Block.planks).setUnlocalizedName("emerald_table");
		GameRegistry.registerBlock(emeraldTable, "emerald_table");
		final Block emeraldChair = new BlockChair(EMERALD_CHAIR_ID, Block.blockEmerald, Block.planks).setUnlocalizedName("emerald_chair");
		GameRegistry.registerBlock(emeraldChair, "emerald_chair");
		
		final Block sandstoneTable = new BlockTable(SANDSTONE_TABLE_ID, Block.sandStone, Block.planks).setUnlocalizedName("sandstone_table");
		GameRegistry.registerBlock(sandstoneTable, "sandstone_table");
		final Block sandstoneChair = new BlockChair(SANDSTONE_CHAIR_ID, Block.sandStone, Block.planks).setUnlocalizedName("sandstone_chair");
		GameRegistry.registerBlock(sandstoneChair, "sandstone_chair");
		
		final Block quartzTable = new BlockTable(QUARTZ_TABLE_ID, Block.blockNetherQuartz, Block.planks, 0, BlockQuartz.quartzBlockTypes).setUnlocalizedName("quartz_table");
		GameRegistry.registerBlock(quartzTable, ItemMultipleBlock.class, "quartz_table");
		final Block quartzChair = new BlockChair(QUARTZ_CHAIR_ID, Block.blockNetherQuartz, Block.planks, 0, BlockQuartz.quartzBlockTypes).setUnlocalizedName("quartz_chair");
		GameRegistry.registerBlock(quartzChair, ItemMultipleBlock.class, "quartz_chair");
		
		String[] colorNames = MoreDecoUtil.reverseArray(ItemDye.dyeItemNames, new String[ItemDye.dyeItemNames.length]);
		final Block woolTable = new BlockTable(WOOL_TABLE_ID, Block.cloth, Block.planks, 0, colorNames).setUnlocalizedName("wool_table");
		GameRegistry.registerBlock(woolTable, ItemMultipleBlock.class, "wool_table");
		for (int i = 0; i < colorNames.length / 4; i++)
		{
			final Block woolChair = new BlockChair(WOOL_0_CHAIR_ID + i, Block.cloth, Block.planks, 0, 4*i, MoreDecoUtil.cutArray(colorNames, new String[4], 4 * i, 4 * (i + 1)))
			.setUnlocalizedName("wool_chair");
			GameRegistry.registerBlock(woolChair, ItemMultipleBlock.class, "wool_chair_" + i);
		}
		
		final Block hardenedClayTable = new BlockTable(HARDENED_CLAY_TABLE_ID, Block.hardenedClay, Block.planks).setUnlocalizedName("hardened_clay_table");
		GameRegistry.registerBlock(hardenedClayTable, "hardened_clay_table");
		final Block hardenedClayChair = new BlockChair(HARDENED_CLAY_CHAIR_ID, Block.hardenedClay, Block.planks).setUnlocalizedName("hardened_clay_chair");
		GameRegistry.registerBlock(hardenedClayChair, "hardened_clay_chair");
		
		final Block stainedClayTable = new BlockTable(STAINED_CLAY_TABLE_ID, Block.stainedClay, Block.planks, 0, colorNames).setUnlocalizedName("stained_clay_table");
		GameRegistry.registerBlock(stainedClayTable, ItemMultipleBlock.class, "stained_clay_table");
		for (int i = 0; i < colorNames.length / 4; i++)
		{
			final Block stainedChair = new BlockChair(STAINED_CLAY_0_CHAIR_ID + i, Block.stainedClay, Block.planks, 0, 4*i, MoreDecoUtil.cutArray(colorNames, new String[4], 4 * i, 4 * (i + 1)))
			.setUnlocalizedName("stained_clay_chair");
			GameRegistry.registerBlock(stainedChair, ItemMultipleBlock.class, "stained_clay_chair_" + i);
		}
		
		final Block netherrackTable = new BlockTable(NETHERRACK_TABLE_ID, Block.netherrack, Block.planks).setUnlocalizedName("netherrack_table");
		GameRegistry.registerBlock(netherrackTable, "netherrack_table");
		final Block netherrackChair = new BlockChair(NETHERRACK_CHAIR_ID, Block.netherrack, Block.planks).setUnlocalizedName("netherrack_chair");
		GameRegistry.registerBlock(netherrackChair, "netherrack_chair");
		
		final Block soulsandTable = new BlockTable(SOULSAND_TABLE_ID, Block.slowSand, Block.planks).setUnlocalizedName("soulsand_table");
		GameRegistry.registerBlock(soulsandTable, "soulsand_table");
		final Block soulsandChair = new BlockChair(SOULSAND_CHAIR_ID, Block.slowSand, Block.planks).setUnlocalizedName("soulsand_chair");
		GameRegistry.registerBlock(soulsandChair, "soulsand_chair");
		
		final Block glowstoneTable = new BlockTable(GLOWSTONE_TABLE_ID, Block.glowStone, Block.planks).setUnlocalizedName("glowstone_table").setLightValue(1f);
		GameRegistry.registerBlock(glowstoneTable, "glowstone_table");
		final Block glowstoneChair = new BlockChair(GLOWSTONE_CHAIR_ID, Block.glowStone, Block.planks).setUnlocalizedName("glowstone_chair").setLightValue(1f);
		GameRegistry.registerBlock(glowstoneChair, "glowstone_chair");
		
		final Block netherBrickTable = new BlockTable(NETHER_BRICK_TABLE_ID, Block.netherBrick, Block.planks).setUnlocalizedName("nether_brick_table");
		GameRegistry.registerBlock(netherBrickTable, "nether_brick_table");
		final Block netherBrickChair = new BlockChair(NETHER_BRICK_CHAIR_ID, Block.netherBrick, Block.planks).setUnlocalizedName("nether_brick_chair");
		GameRegistry.registerBlock(netherBrickChair, "nether_brick_chair");
	}

}
