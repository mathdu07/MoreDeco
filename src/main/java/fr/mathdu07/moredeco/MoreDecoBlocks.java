package fr.mathdu07.moredeco;

import net.minecraft.block.Block;
import net.minecraft.block.BlockQuartz;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.block.BlockWood;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemDye;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.mathdu07.moredeco.block.BlockChair;
import fr.mathdu07.moredeco.block.BlockLogChair;
import fr.mathdu07.moredeco.block.BlockLogStool;
import fr.mathdu07.moredeco.block.BlockLogTable;
import fr.mathdu07.moredeco.block.BlockPlanksChair;
import fr.mathdu07.moredeco.block.BlockStool;
import fr.mathdu07.moredeco.block.BlockTable;
import fr.mathdu07.moredeco.item.ItemMultipleBlock;

public final class MoreDecoBlocks
{
	public BlockTable WOODEN_0_TABLE;
	public BlockTable WOODEN_1_TABLE;
	public BlockTable PLANKS_TABLE;
	public BlockTable GLASS_TABLE;
	public BlockTable STONE_TABLE;
	public BlockTable COBBLESTONE_TABLE;
	public BlockTable STONEBRICK_TABLE;
	public BlockTable COAL_TABLE;
	public BlockTable IRON_TABLE;
	public BlockTable GOLD_TABLE;
	public BlockTable LAPIS_TABLE;
	public BlockTable REDSTONE_TABLE;
	public BlockTable DIAMOND_TABLE;
	public BlockTable EMERALD_TABLE;
	public BlockTable SANDSTONE_TABLE;
	public BlockTable QUARTZ_TABLE;
	public BlockTable WOOL_TABLE;
	public BlockTable HARDENED_CLAY_TABLE;
	public BlockTable STAINED_CLAY_TABLE;
	public BlockTable NETHERRACK_TABLE;
	public BlockTable SOULSAND_TABLE;
	public BlockTable GLOWSTONE_TABLE;
	public BlockTable NETHER_BRICK_TABLE;
	
	public BlockStool WOODEN_0_STOOL;
	public BlockStool WOODEN_1_STOOL;
	public BlockStool PLANKS_STOOL;
	public BlockStool GLASS_STOOL;
	public BlockStool STONE_STOOL;
	public BlockStool COBBLESTONE_STOOL;
	public BlockStool STONEBRICK_STOOL;
	public BlockStool COAL_STOOL;
	public BlockStool IRON_STOOL;
	public BlockStool GOLD_STOOL;
	public BlockStool LAPIS_STOOL;
	public BlockStool REDSTONE_STOOL;
	public BlockStool DIAMOND_STOOL;
	public BlockStool EMERALD_STOOL;
	public BlockStool SANDSTONE_STOOL;
	public BlockStool QUARTZ_STOOL;
	public BlockStool WOOL_STOOL;
	public BlockStool HARDENED_CLAY_STOOL;
	public BlockStool STAINED_CLAY_STOOL;
	public BlockStool NETHERRACK_STOOL;
	public BlockStool SOULSAND_STOOL;
	public BlockStool GLOWSTONE_STOOL;
	public BlockStool NETHER_BRICK_STOOL;
	
	public BlockChair WOODEN_0_CHAIR;
	public BlockChair WOODEN_1_CHAIR;
	public BlockChair PLANKS_0_CHAIR;
	public BlockChair PLANKS_1_CHAIR;
	public BlockChair GLASS_CHAIR;
	public BlockChair STONE_CHAIR;
	public BlockChair COBBLESTONE_CHAIR;
	public BlockChair STONEBRICK_CHAIR;
	public BlockChair COAL_CHAIR;
	public BlockChair IRON_CHAIR;
	public BlockChair GOLD_CHAIR;
	public BlockChair LAPIS_CHAIR;
	public BlockChair REDSTONE_CHAIR;
	public BlockChair DIAMOND_CHAIR;
	public BlockChair EMERALD_CHAIR;
	public BlockChair SANDSTONE_CHAIR;
	public BlockChair QUARTZ_CHAIR;
	public BlockChair WOOL_0_CHAIR;
	public BlockChair WOOL_1_CHAIR;
	public BlockChair WOOL_2_CHAIR;
	public BlockChair WOOL_3_CHAIR;
	public BlockChair HARDENED_CLAY_CHAIR;
	public BlockChair STAINED_CLAY_0_CHAIR;
	public BlockChair STAINED_CLAY_1_CHAIR;
	public BlockChair STAINED_CLAY_2_CHAIR;
	public BlockChair STAINED_CLAY_3_CHAIR;
	public BlockChair NETHERRACK_CHAIR;
	public BlockChair SOULSAND_CHAIR;
	public BlockChair GLOWSTONE_CHAIR;
	public BlockChair NETHER_BRICK_CHAIR;
	
	protected void init()
	{
		final Block wood = Blocks.log, wood2 = Blocks.log2, planks = Blocks.planks;
		WOODEN_0_TABLE = (BlockTable) new BlockLogTable(wood, planks, MoreDecoUtil.cutArray(BlockWood.field_150096_a/*woodType*/, new String[4], 0, 4), 0).setBlockName("wooden_table");
		GameRegistry.registerBlock(WOODEN_0_TABLE, ItemMultipleBlock.class, "wooden_table_0");
		WOODEN_1_TABLE = (BlockTable) new BlockLogTable(wood2, planks, MoreDecoUtil.cutArray(BlockWood.field_150096_a/*woodType*/, new String[2], 4, 6), 1).setBlockName("wooden_table");
		GameRegistry.registerBlock(WOODEN_1_TABLE, ItemMultipleBlock.class, "wooden_table_1");
		WOODEN_0_STOOL = (BlockStool) new BlockLogStool(wood, planks, MoreDecoUtil.cutArray(BlockWood.field_150096_a/*woodType*/, new String[4], 0, 4), 0).setBlockName("wooden_stool");
		GameRegistry.registerBlock(WOODEN_0_STOOL, ItemMultipleBlock.class, "wooden_stool_0");
		WOODEN_1_STOOL = (BlockStool) new BlockLogStool(wood2, planks, MoreDecoUtil.cutArray(BlockWood.field_150096_a/*woodType*/, new String[2], 4, 6), 1).setBlockName("wooden_stool");
		GameRegistry.registerBlock(WOODEN_1_STOOL, ItemMultipleBlock.class, "wooden_stool_1");
		WOODEN_0_CHAIR = (BlockChair) new BlockLogChair(wood, planks, MoreDecoUtil.cutArray(BlockWood.field_150096_a/*woodType*/, new String[4], 0, 4), 0).setBlockName("wooden_chair");
		GameRegistry.registerBlock(WOODEN_0_CHAIR, ItemMultipleBlock.class, "wooden_chair_0");
		WOODEN_1_CHAIR = (BlockChair) new BlockLogChair(wood2, planks, MoreDecoUtil.cutArray(BlockWood.field_150096_a/*woodType*/, new String[2], 4, 6), 1).setBlockName("wooden_chair");
		GameRegistry.registerBlock(WOODEN_1_CHAIR, ItemMultipleBlock.class, "wooden_chair_1");
		
		PLANKS_TABLE = (BlockTable) new BlockTable(planks, BlockWood.field_150096_a/*woodType*/).setBlockName("planks_table");
		GameRegistry.registerBlock(PLANKS_TABLE, ItemMultipleBlock.class, "planks_table");
		PLANKS_STOOL = (BlockStool) new BlockStool(planks, BlockWood.field_150096_a/*woodType*/).setBlockName("planks_stool");
		GameRegistry.registerBlock(PLANKS_STOOL, ItemMultipleBlock.class, "planks_stool");
		PLANKS_0_CHAIR = (BlockChair) new BlockPlanksChair(planks, MoreDecoUtil.cutArray(BlockWood.field_150096_a/*woodType*/, new String[4], 0, 4), 0).setBlockName("planks_chair");
		GameRegistry.registerBlock(PLANKS_0_CHAIR, ItemMultipleBlock.class, "planks_chair_0");
		PLANKS_1_CHAIR = (BlockChair) new BlockPlanksChair(planks, MoreDecoUtil.cutArray(BlockWood.field_150096_a/*woodType*/, new String[2], 4, 6), 1).setBlockName("planks_chair");
		GameRegistry.registerBlock(PLANKS_1_CHAIR, ItemMultipleBlock.class, "planks_chair_1");
		
		final Block glass = Blocks.glass;
		GLASS_TABLE = (BlockTable) new BlockTable(glass, planks).setBlockName("glass_table");
		GameRegistry.registerBlock(GLASS_TABLE, "glass_table");
		GLASS_STOOL = (BlockStool) new BlockStool(glass, planks).setBlockName("glass_stool");
		GameRegistry.registerBlock(GLASS_STOOL, "glass_stool");
		GLASS_CHAIR = (BlockChair) new BlockChair(glass, planks).setBlockName("glass_chair");
		GameRegistry.registerBlock(GLASS_CHAIR, "glass_chair");
		
		final Block stone = Blocks.stone;
		STONE_TABLE = (BlockTable) new BlockTable(stone, planks).setBlockName("stone_table");
		GameRegistry.registerBlock(STONE_TABLE, "stone_table");
		STONE_STOOL = (BlockStool) new BlockStool(stone, planks).setBlockName("stone_stool");
		GameRegistry.registerBlock(STONE_STOOL, "stone_stool");
		STONE_CHAIR = (BlockChair) new BlockChair(stone, planks).setBlockName("stone_chair");
		GameRegistry.registerBlock(STONE_CHAIR, "stone_chair");
		
		final Block cobblestone = Blocks.cobblestone;
		COBBLESTONE_TABLE = (BlockTable) new BlockTable(cobblestone, planks).setBlockName("cobblestone_table");
		GameRegistry.registerBlock(COBBLESTONE_TABLE, "cobblestone_table");
		COBBLESTONE_STOOL = (BlockStool) new BlockStool(cobblestone, planks).setBlockName("cobblestone_stool");
		GameRegistry.registerBlock(COBBLESTONE_STOOL, "cobblestone_stool");
		COBBLESTONE_CHAIR = (BlockChair) new BlockChair(cobblestone, planks).setBlockName("cobblestone_chair");
		GameRegistry.registerBlock(COBBLESTONE_CHAIR, "cobblestone_chair");
		
		final Block stoneBrick = Blocks.stonebrick;
		STONEBRICK_TABLE = (BlockTable) new BlockTable(stoneBrick, planks, 0, BlockStoneBrick.field_150142_a/*STONE_BRICK_TYPES*/).setBlockName("stonebrick_table");
		GameRegistry.registerBlock(STONEBRICK_TABLE, ItemMultipleBlock.class, "stonebrick_table");
		STONEBRICK_STOOL = (BlockStool) new BlockStool(stoneBrick, planks, 0, BlockStoneBrick.field_150142_a/*STONE_BRICK_TYPES*/).setBlockName("stonebrick_stool");
		GameRegistry.registerBlock(STONEBRICK_STOOL, ItemMultipleBlock.class, "stonebrick_stool");
		STONEBRICK_CHAIR = (BlockChair) new BlockChair(stoneBrick, planks, 0, BlockStoneBrick.field_150142_a/*STONE_BRICK_TYPES*/).setBlockName("stonebrick_chair");
		GameRegistry.registerBlock(STONEBRICK_CHAIR, ItemMultipleBlock.class, "stonebrick_chair");
		
		final Block coalBlock = Blocks.coal_block;
		COAL_TABLE = (BlockTable) new BlockTable(coalBlock, planks).setBlockName("coal_table");
		GameRegistry.registerBlock(COAL_TABLE, "coal_table");
		COAL_STOOL = (BlockStool) new BlockStool(coalBlock, planks).setBlockName("coal_stool");
		GameRegistry.registerBlock(COAL_STOOL, "coal_stool");
		COAL_CHAIR = (BlockChair) new BlockChair(coalBlock, planks).setBlockName("coal_chair");
		GameRegistry.registerBlock(COAL_CHAIR, "coal_chair");
		
		final Block blockIron = Blocks.iron_block;
		IRON_TABLE = (BlockTable) new BlockTable(blockIron, planks).setBlockName("iron_table");
		GameRegistry.registerBlock(IRON_TABLE, "iron_table");
		IRON_STOOL = (BlockStool) new BlockStool(blockIron, planks).setBlockName("iron_stool");
		GameRegistry.registerBlock(IRON_STOOL, "iron_stool");
		IRON_CHAIR = (BlockChair) new BlockChair(blockIron, planks).setBlockName("iron_chair");
		GameRegistry.registerBlock(IRON_CHAIR, "iron_chair");
		
		final Block blockGold = Blocks.gold_block;
		GOLD_TABLE = (BlockTable) new BlockTable(blockGold, planks).setBlockName("gold_table");
		GameRegistry.registerBlock(GOLD_TABLE, "gold_table");
		GOLD_STOOL = (BlockStool) new BlockStool(blockGold, planks).setBlockName("gold_stool");
		GameRegistry.registerBlock(GOLD_STOOL, "gold_stool");
		GOLD_CHAIR = (BlockChair) new BlockChair(blockGold, planks).setBlockName("gold_chair");
		GameRegistry.registerBlock(GOLD_CHAIR, "gold_chair");
		
		final Block blockLapis = Blocks.lapis_block;
		LAPIS_TABLE = (BlockTable) new BlockTable(blockLapis, planks).setBlockName("lapis_table");
		GameRegistry.registerBlock(LAPIS_TABLE, "lapis_table");
		LAPIS_STOOL = (BlockStool) new BlockStool(blockLapis, planks).setBlockName("lapis_stool");
		GameRegistry.registerBlock(LAPIS_STOOL, "lapis_stool");
		LAPIS_CHAIR = (BlockChair) new BlockChair(blockLapis, planks).setBlockName("lapis_chair");
		GameRegistry.registerBlock(LAPIS_CHAIR, "lapis_chair");
		
		final Block blockRedstone = Blocks.redstone_block;
		REDSTONE_TABLE = (BlockTable) new BlockTable(blockRedstone, planks).setBlockName("redstone_table");
		GameRegistry.registerBlock(REDSTONE_TABLE, "redstone_table");
		REDSTONE_STOOL = (BlockStool) new BlockStool(blockRedstone, planks).setBlockName("redstone_stool");
		GameRegistry.registerBlock(REDSTONE_STOOL, "redstone_stool");
		REDSTONE_CHAIR = (BlockChair) new BlockChair(blockRedstone, planks).setBlockName("redstone_chair");
		GameRegistry.registerBlock(REDSTONE_CHAIR, "redstone_chair");
		
		final Block blockDiamond = Blocks.diamond_block;
		DIAMOND_TABLE = (BlockTable) new BlockTable(blockDiamond, planks).setBlockName("diamond_table");
		GameRegistry.registerBlock(DIAMOND_TABLE, "diamond_table");
		DIAMOND_STOOL = (BlockStool) new BlockStool(blockDiamond, planks).setBlockName("diamond_stool");
		GameRegistry.registerBlock(DIAMOND_STOOL, "diamond_stool");
		DIAMOND_CHAIR = (BlockChair) new BlockChair(blockDiamond, planks).setBlockName("diamond_chair");
		GameRegistry.registerBlock(DIAMOND_CHAIR, "diamond_chair");
		
		final Block blockEmerald = Blocks.emerald_block;
		EMERALD_TABLE = (BlockTable) new BlockTable(blockEmerald, planks).setBlockName("emerald_table");
		GameRegistry.registerBlock(EMERALD_TABLE, "emerald_table");
		EMERALD_STOOL = (BlockStool) new BlockStool(blockEmerald, planks).setBlockName("emerald_stool");
		GameRegistry.registerBlock(EMERALD_STOOL, "emerald_stool");
		EMERALD_CHAIR = (BlockChair) new BlockChair(blockEmerald, planks).setBlockName("emerald_chair");
		GameRegistry.registerBlock(EMERALD_CHAIR, "emerald_chair");
		
		final Block sandStone = Blocks.sandstone;
		SANDSTONE_TABLE = (BlockTable) new BlockTable(sandStone, planks).setBlockName("sandstone_table");
		GameRegistry.registerBlock(SANDSTONE_TABLE, "sandstone_table");
		SANDSTONE_STOOL = (BlockStool) new BlockStool(sandStone, planks).setBlockName("sandstone_stool");
		GameRegistry.registerBlock(SANDSTONE_STOOL, "sandstone_stool");
		SANDSTONE_CHAIR = (BlockChair) new BlockChair(sandStone, planks).setBlockName("sandstone_chair");
		GameRegistry.registerBlock(SANDSTONE_CHAIR, "sandstone_chair");
		
		final Block blockNetherQuartz = Blocks.quartz_block;
		QUARTZ_TABLE = (BlockTable) new BlockTable(blockNetherQuartz, planks, 0, BlockQuartz.field_150191_a/*quartzBlockTypes*/).setBlockName("quartz_table");
		GameRegistry.registerBlock(QUARTZ_TABLE, ItemMultipleBlock.class, "quartz_table");
		QUARTZ_STOOL = (BlockStool) new BlockStool(blockNetherQuartz, planks, 0, BlockQuartz.field_150191_a/*quartzBlockTypes*/).setBlockName("quartz_stool");
		GameRegistry.registerBlock(QUARTZ_STOOL, ItemMultipleBlock.class, "quartz_stool");
		QUARTZ_CHAIR = (BlockChair) new BlockChair(blockNetherQuartz, planks, 0, BlockQuartz.field_150191_a/*quartzBlockTypes*/).setBlockName("quartz_chair");
		GameRegistry.registerBlock(QUARTZ_CHAIR, ItemMultipleBlock.class, "quartz_chair");
		
		final Block cloth = Blocks.wool;
		String[] colorNames = MoreDecoUtil.reverseArray(ItemDye.field_150921_b/*dyeItemNames*/, new String[ItemDye.field_150921_b/*dyeItemNames*/.length]);
		WOOL_TABLE = (BlockTable) new BlockTable(cloth, planks, 0, colorNames).setBlockName("wool_table");
		GameRegistry.registerBlock(WOOL_TABLE, ItemMultipleBlock.class, "wool_table");
		WOOL_STOOL = (BlockStool) new BlockStool(cloth, planks, 0, colorNames).setBlockName("wool_stool");
		GameRegistry.registerBlock(WOOL_STOOL, ItemMultipleBlock.class, "wool_stool");
		WOOL_0_CHAIR = (BlockChair) new BlockChair(cloth, planks, 0, 0, MoreDecoUtil.cutArray(colorNames, new String[4], 0, 4)).setBlockName("wool_chair");
		GameRegistry.registerBlock(WOOL_0_CHAIR, ItemMultipleBlock.class, "wool_chair_0");
		WOOL_1_CHAIR = (BlockChair) new BlockChair(cloth, planks, 0, 4, MoreDecoUtil.cutArray(colorNames, new String[4], 4, 8)).setBlockName("wool_chair");
		GameRegistry.registerBlock(WOOL_1_CHAIR, ItemMultipleBlock.class, "wool_chair_1");
		WOOL_2_CHAIR = (BlockChair) new BlockChair(cloth, planks, 0, 8, MoreDecoUtil.cutArray(colorNames, new String[4], 8, 12)).setBlockName("wool_chair");
		GameRegistry.registerBlock(WOOL_2_CHAIR, ItemMultipleBlock.class, "wool_chair_2");
		WOOL_3_CHAIR = (BlockChair) new BlockChair(cloth, planks, 0, 12, MoreDecoUtil.cutArray(colorNames, new String[4], 12, 16)).setBlockName("wool_chair");
		GameRegistry.registerBlock(WOOL_3_CHAIR, ItemMultipleBlock.class, "wool_chair_3");
		
		final Block hardenedClay = Blocks.hardened_clay;
		HARDENED_CLAY_TABLE = (BlockTable) new BlockTable(hardenedClay, planks).setBlockName("hardened_clay_table");
		GameRegistry.registerBlock(HARDENED_CLAY_TABLE, "hardened_clay_table");
		HARDENED_CLAY_STOOL = (BlockStool) new BlockStool(hardenedClay, planks).setBlockName("hardened_clay_stool");
		GameRegistry.registerBlock(HARDENED_CLAY_STOOL, "hardened_clay_stool");
		HARDENED_CLAY_CHAIR = (BlockChair) new BlockChair(hardenedClay, planks).setBlockName("hardened_clay_chair");
		GameRegistry.registerBlock(HARDENED_CLAY_CHAIR, "hardened_clay_chair");
		
		final Block stainedClay = Blocks.stained_hardened_clay;
		STAINED_CLAY_TABLE = (BlockTable) new BlockTable(stainedClay, planks, 0, colorNames).setBlockName("stained_clay_table");
		GameRegistry.registerBlock(STAINED_CLAY_TABLE, ItemMultipleBlock.class, "stained_clay_table");
		STAINED_CLAY_STOOL = (BlockStool) new BlockStool(stainedClay, planks, 0, colorNames).setBlockName("stained_clay_stool");
		GameRegistry.registerBlock(STAINED_CLAY_STOOL, ItemMultipleBlock.class, "stained_clay_stool");
		STAINED_CLAY_0_CHAIR = (BlockChair) new BlockChair(stainedClay, planks, 0, 0, MoreDecoUtil.cutArray(colorNames, new String[4], 0, 4)).setBlockName("stained_clay_chair");
		GameRegistry.registerBlock(STAINED_CLAY_0_CHAIR, ItemMultipleBlock.class, "stained_clay_chair_0");
		STAINED_CLAY_1_CHAIR = (BlockChair) new BlockChair(stainedClay, planks, 0, 4, MoreDecoUtil.cutArray(colorNames, new String[4], 4, 8)).setBlockName("stained_clay_chair");
		GameRegistry.registerBlock(STAINED_CLAY_1_CHAIR, ItemMultipleBlock.class, "stained_clay_chair_1");
		STAINED_CLAY_2_CHAIR = (BlockChair) new BlockChair(stainedClay, planks, 0, 8, MoreDecoUtil.cutArray(colorNames, new String[4], 8, 12)).setBlockName("stained_clay_chair");
		GameRegistry.registerBlock(STAINED_CLAY_2_CHAIR, ItemMultipleBlock.class, "stained_clay_chair_2");
		STAINED_CLAY_3_CHAIR = (BlockChair) new BlockChair(stainedClay, planks, 0, 12, MoreDecoUtil.cutArray(colorNames, new String[4], 12, 16)).setBlockName("stained_clay_chair");
		GameRegistry.registerBlock(STAINED_CLAY_3_CHAIR, ItemMultipleBlock.class, "stained_clay_chair_3");
		
		final Block netherrack = Blocks.netherrack;
		NETHERRACK_TABLE = (BlockTable) new BlockTable(netherrack, planks).setBlockName("netherrack_table");
		GameRegistry.registerBlock(NETHERRACK_TABLE, "netherrack_table");
		NETHERRACK_STOOL = (BlockStool) new BlockStool(netherrack, planks).setBlockName("netherrack_stool");
		GameRegistry.registerBlock(NETHERRACK_STOOL, "netherrack_stool");
		NETHERRACK_CHAIR = (BlockChair) new BlockChair(netherrack, planks).setBlockName("netherrack_chair");
		GameRegistry.registerBlock(NETHERRACK_CHAIR, "netherrack_chair");
		
		final Block slowSand = Blocks.soul_sand;
		SOULSAND_TABLE = (BlockTable) new BlockTable(slowSand, planks).setBlockName("soulsand_table");
		GameRegistry.registerBlock(SOULSAND_TABLE, "soulsand_table");
		SOULSAND_STOOL = (BlockStool) new BlockStool(slowSand, planks).setBlockName("soulsand_stool");
		GameRegistry.registerBlock(SOULSAND_STOOL, "soulsand_stool");
		SOULSAND_CHAIR = (BlockChair) new BlockChair(slowSand, planks).setBlockName("soulsand_chair");
		GameRegistry.registerBlock(SOULSAND_CHAIR, "soulsand_chair");
		
		final Block glowStone = Blocks.glowstone;
		GLOWSTONE_TABLE = (BlockTable) new BlockTable(glowStone, planks).setBlockName("glowstone_table").setLightLevel(1f);
		GameRegistry.registerBlock(GLOWSTONE_TABLE, "glowstone_table");
		GLOWSTONE_STOOL = (BlockStool) new BlockStool(glowStone, planks).setBlockName("glowstone_stool").setLightLevel(1f);
		GameRegistry.registerBlock(GLOWSTONE_STOOL, "glowstone_stool");
		GLOWSTONE_CHAIR = (BlockChair) new BlockChair(glowStone, planks).setBlockName("glowstone_chair").setLightLevel(1f);
		GameRegistry.registerBlock(GLOWSTONE_CHAIR, "glowstone_chair");
		
		final Block netherBrick = Blocks.nether_brick;
		NETHER_BRICK_TABLE = (BlockTable) new BlockTable(netherBrick, planks).setBlockName("nether_brick_table");
		GameRegistry.registerBlock(NETHER_BRICK_TABLE, "nether_brick_table");
		NETHER_BRICK_STOOL = (BlockStool) new BlockStool(netherBrick, planks).setBlockName("nether_brick_stool");
		GameRegistry.registerBlock(NETHER_BRICK_STOOL, "nether_brick_stool");
		NETHER_BRICK_CHAIR = (BlockChair) new BlockChair(netherBrick, planks).setBlockName("nether_brick_chair");
		GameRegistry.registerBlock(NETHER_BRICK_CHAIR, "nether_brick_chair");
	}

}
