package fr.mathdu07.moredeco;

import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.mathdu07.moredeco.block.BlockTable;

public final class MoreDecoCrafts {
	
	protected void init()
	{
		BlockTable woodenTable = (BlockTable) Block.blocksList[MoreDeco.blocks.WOODEN_TABLE_ID];
		for (int i = 0; i < woodenTable.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(woodenTable, 3, i), new Object[]{
				"###", "I I", "I I",
		        '#', new ItemStack(Block.wood, 1, i),
		        'I', Item.stick
			});
		
		BlockTable planksTable = (BlockTable) Block.blocksList[MoreDeco.blocks.PLANKS_TABLE_ID];
		for (int i = 0; i < planksTable.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(planksTable, 3, i), new Object[]{
				"###", "I I", "I I",
		        '#', new ItemStack(Block.planks, 1, i),
		        'I', Item.stick
			});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.GLASS_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Block.glass,
			'I', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.STONE_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Block.stone,
			'I', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.COBBLESTONE_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Block.cobblestone,
			'I', Item.stick
		});
		
		BlockTable stonebrickTable = (BlockTable) Block.blocksList[MoreDeco.blocks.STONEBRICK_TABLE_ID];
		for (int i = 0; i < stonebrickTable.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(stonebrickTable, 3, i), new Object[]{
				"###", "I I", "I I",
		        '#', new ItemStack(Block.stoneBrick, 1, i),
		        'I', Item.stick
			});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.COAL_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Item.coal,
			'I', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.IRON_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Item.ingotIron,
			'I', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.GOLD_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Item.ingotGold,
			'I', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.LAPIS_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', new ItemStack(Item.dyePowder, 1, 4),
			'I', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.REDSTONE_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Item.redstone,
			'I', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.DIAMOND_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Item.diamond,
			'I', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.EMERALD_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Item.emerald,
			'I', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.SANDSTONE_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
		    '#', Block.sandStone,
		    'I', Item.stick
		});
		
		BlockTable quartzTable = (BlockTable) Block.blocksList[MoreDeco.blocks.QUARTZ_TABLE_ID];
		for (int i = 0; i < quartzTable.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(quartzTable, 3, i), new Object[]{
				"###", "I I", "I I",
		        '#', new ItemStack(Block.blockNetherQuartz, 1, i),
		        'I', Item.stick
			});
		
		BlockTable woolTable = (BlockTable) Block.blocksList[MoreDeco.blocks.WOOL_TABLE_ID];
		for (int i = 0; i < woolTable.getSubTypesCount(); i++)
		{
			GameRegistry.addRecipe(new ItemStack(woolTable, 3, i), new Object[]{
				"###", "I I", "I I",
		        '#', new ItemStack(Block.cloth, 1, i),
		        'I', Item.stick
			});
			
			for (int j = 0; j < woolTable.getSubTypesCount(); j++)
			{
				if (j != i)
					GameRegistry.addShapelessRecipe(new ItemStack(woolTable, 1, i), 
							new ItemStack(Item.itemsList[woolTable.blockID], 1, j), new ItemStack(Item.dyePowder, 1, BlockColored.getDyeFromBlock(i)));
			}
			
		}
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.HARDENED_CLAY_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Block.hardenedClay,
			'I', Item.stick
		});
		
		BlockTable stainedClayTable = (BlockTable) Block.blocksList[MoreDeco.blocks.STAINED_CLAY_TABLE_ID];
		for (int i = 0; i < stainedClayTable.getSubTypesCount(); i++)
		{
			GameRegistry.addRecipe(new ItemStack(stainedClayTable, 3, i), new Object[]{
				"###", "I I", "I I",
		        '#', new ItemStack(Block.stainedClay, 1, i),
		        'I', Item.stick
			});
			
			for (int j = 0; j < stainedClayTable.getSubTypesCount(); j++)
			{
				if (j != i)
					GameRegistry.addShapelessRecipe(new ItemStack(stainedClayTable, 1, i), 
							new ItemStack(Item.itemsList[stainedClayTable.blockID], 1, j), new ItemStack(Item.dyePowder, 1, BlockColored.getDyeFromBlock(i)));
			}
			
		}
	}

}
