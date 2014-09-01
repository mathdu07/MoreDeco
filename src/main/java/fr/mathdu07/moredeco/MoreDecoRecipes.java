package fr.mathdu07.moredeco;

import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.mathdu07.moredeco.block.BlockChair;
import fr.mathdu07.moredeco.block.BlockStool;
import fr.mathdu07.moredeco.block.BlockTable;

public final class MoreDecoRecipes {
	
	protected void init()
	{
		BlockTable woodenTable = (BlockTable) Block.blocksList[MoreDeco.blocks.WOODEN_TABLE_ID];
		for (int i = 0; i < woodenTable.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(woodenTable, 3, i), new Object[]{
				"###", "I I", "I I",
		        '#', new ItemStack(Block.wood, 1, i),
		        'I', Item.stick
			});
		BlockStool woodenStool = (BlockStool) Block.blocksList[MoreDeco.blocks.WOODEN_STOOL_ID];
		for (int i = 0; i < woodenStool.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(woodenStool, 3, i), new Object[]{
				"###", "I I",
		        '#', new ItemStack(Block.wood, 1, i),
		        'I', Item.stick
			});
		BlockChair woodenChair = (BlockChair) Block.blocksList[MoreDeco.blocks.WOODEN_CHAIR_ID];
		for (int i = 0; i < woodenChair.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(woodenChair, 4, 4 * i), new Object[]{
				"  #", "###", "I I",
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
		BlockStool planksStool = (BlockStool) Block.blocksList[MoreDeco.blocks.PLANKS_STOOL_ID];
		for (int i = 0; i < planksStool.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(planksStool, 3, i), new Object[]{
				"###", "I I",
		        '#', new ItemStack(Block.planks, 1, i),
		        'I', Item.stick
			});
		BlockChair planksChair = (BlockChair) Block.blocksList[MoreDeco.blocks.PLANKS_CHAIR_ID];
		for (int i = 0; i < planksChair.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(planksChair, 4, 4 * i), new Object[]{
				"  #", "###", "I I",
		        '#', new ItemStack(Block.planks, 1, i),
		        'I', Item.stick
			});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.GLASS_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Block.glass,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.GLASS_STOOL_ID], 3), new Object[]{
			"###", "I I",
			'#', Block.glass,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.GLASS_CHAIR_ID], 4), new Object[]{
			"#  ", "###", "I I",
			'#', Block.glass,
			'I', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.STONE_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Block.stone,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.STONE_STOOL_ID], 3), new Object[]{
			"###", "I I",
			'#', Block.stone,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.STONE_CHAIR_ID], 4), new Object[]{
			"#  ", "###", "I I",
			'#', Block.stone,
			'I', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.COBBLESTONE_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Block.cobblestone,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.COBBLESTONE_STOOL_ID], 3), new Object[]{
			"###", "I I",
			'#', Block.cobblestone,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.COBBLESTONE_CHAIR_ID], 4), new Object[]{
			"#  ", "###", "I I",
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
		BlockStool stonebrickStool = (BlockStool) Block.blocksList[MoreDeco.blocks.STONEBRICK_STOOL_ID];
		for (int i = 0; i < stonebrickStool.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(stonebrickStool, 3, i), new Object[]{
				"###", "I I",
		        '#', new ItemStack(Block.stoneBrick, 1, i),
		        'I', Item.stick
			});
		BlockChair stonebrickChair = (BlockChair) Block.blocksList[MoreDeco.blocks.STONEBRICK_CHAIR_ID];
		for (int i = 0; i < stonebrickChair.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(stonebrickChair, 4, 4 * i), new Object[]{
				"  #", "###", "I I",
		        '#', new ItemStack(Block.stoneBrick, 1, i),
		        'I', Item.stick
			});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.COAL_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Item.coal,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.COAL_STOOL_ID], 3), new Object[]{
			"###", "I I",
			'#', Item.coal,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.COAL_CHAIR_ID], 4), new Object[]{
			"#  ", "###", "I I",
			'#', Item.coal,
			'I', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.IRON_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Item.ingotIron,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.IRON_STOOL_ID], 3), new Object[]{
			"###", "I I",
			'#', Item.ingotIron,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.IRON_CHAIR_ID], 4), new Object[]{
			"#  ", "###", "I I",
			'#', Item.ingotIron,
			'I', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.GOLD_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Item.ingotGold,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.GOLD_STOOL_ID], 3), new Object[]{
			"###", "I I",
			'#', Item.ingotGold,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.GOLD_CHAIR_ID], 4), new Object[]{
			"#  ", "###", "I I",
			'#', Item.ingotGold,
			'I', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.LAPIS_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', new ItemStack(Item.dyePowder, 1, 4),
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.LAPIS_STOOL_ID], 3), new Object[]{
			"###", "I I",
			'#', new ItemStack(Item.dyePowder, 1, 4),
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.LAPIS_CHAIR_ID], 4), new Object[]{
			"#  ", "###", "I I",
			'#', new ItemStack(Item.dyePowder, 1, 4),
			'I', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.REDSTONE_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Item.redstone,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.REDSTONE_STOOL_ID], 3), new Object[]{
			"###", "I I",
			'#', Item.redstone,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.REDSTONE_CHAIR_ID], 4), new Object[]{
			"#  ", "###", "I I",
			'#', Item.redstone,
			'I', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.DIAMOND_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Item.diamond,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.DIAMOND_STOOL_ID], 3), new Object[]{
			"###", "I I",
			'#', Item.diamond,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.DIAMOND_CHAIR_ID], 4), new Object[]{
			"#  ", "###", "I I",
			'#', Item.diamond,
			'I', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.EMERALD_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Item.emerald,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.EMERALD_STOOL_ID], 3), new Object[]{
			"###", "I I",
			'#', Item.emerald,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.EMERALD_CHAIR_ID], 4), new Object[]{
			"#  ", "###", "I I",
			'#', Item.emerald,
			'I', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.SANDSTONE_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
		    '#', Block.sandStone,
		    'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.SANDSTONE_STOOL_ID], 3), new Object[]{
			"###", "I I",
		    '#', Block.sandStone,
		    'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.SANDSTONE_CHAIR_ID], 4), new Object[]{
			"#  ", "###", "I I",
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
		BlockStool quartzStool = (BlockStool) Block.blocksList[MoreDeco.blocks.QUARTZ_STOOL_ID];
		for (int i = 0; i < quartzStool.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(quartzStool, 3, i), new Object[]{
				"###", "I I",
		        '#', new ItemStack(Block.blockNetherQuartz, 1, i),
		        'I', Item.stick
			});
		BlockChair quartzChair = (BlockChair) Block.blocksList[MoreDeco.blocks.QUARTZ_CHAIR_ID];
		for (int i = 0; i < quartzChair.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(quartzChair, 4, 4 * i), new Object[]{
				"  #", "###", "I I",
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
			GameRegistry.addShapelessRecipe(new ItemStack(woolTable, 1, i), new ItemStack(Item.itemsList[woolTable.blockID]),
					new ItemStack(Item.dyePowder, 1, BlockColored.getDyeFromBlock(i)));
		}
		BlockStool woolStool = (BlockStool) Block.blocksList[MoreDeco.blocks.WOOL_STOOL_ID];
		for (int i = 0; i < woolStool.getSubTypesCount(); i++)
		{
			GameRegistry.addRecipe(new ItemStack(woolStool, 3, i), new Object[]{
				"###", "I I",
		        '#', new ItemStack(Block.cloth, 1, i),
		        'I', Item.stick
			});
			GameRegistry.addShapelessRecipe(new ItemStack(woolStool, 1, i), new ItemStack(Item.itemsList[woolStool.blockID]),
					new ItemStack(Item.dyePowder, 1, BlockColored.getDyeFromBlock(i)));
		}
		for (int i = 0; i < 4; i++)
		{
			BlockChair woolChair = (BlockChair) Block.blocksList[MoreDeco.blocks.WOOL_0_CHAIR_ID + i];
			for (int j = 0; j < woolChair.getSubTypesCount(); j++)
			{
				GameRegistry.addRecipe(new ItemStack(woolChair, 4, 4 * j), new Object[]{
					"#  ", "###", "I I",
					'#', new ItemStack(Block.cloth, 1, 4 * i + j),
					'I', Item.stick
				});
				GameRegistry.addShapelessRecipe(new ItemStack(woolChair, 4, 4 * j), new ItemStack(MoreDeco.blocks.WOOL_0_CHAIR_ID, 1, 0),
						new ItemStack(Item.dyePowder, 1, BlockColored.getDyeFromBlock(4 * i + j)));
			}
		}
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.HARDENED_CLAY_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Block.hardenedClay,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.HARDENED_CLAY_STOOL_ID], 3), new Object[]{
			"###", "I I",
			'#', Block.hardenedClay,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.HARDENED_CLAY_CHAIR_ID], 4), new Object[]{
			"#  ", "###", "I I",
			'#', Block.hardenedClay,
			'I', Item.stick
		});
		
		BlockTable hardenedClayTable = (BlockTable) Block.blocksList[MoreDeco.blocks.HARDENED_CLAY_TABLE_ID];
		BlockTable stainedClayTable = (BlockTable) Block.blocksList[MoreDeco.blocks.STAINED_CLAY_TABLE_ID];
		for (int i = 0; i < stainedClayTable.getSubTypesCount(); i++)
		{
			GameRegistry.addRecipe(new ItemStack(stainedClayTable, 3, i), new Object[]{
				"###", "I I", "I I",
		        '#', new ItemStack(Block.stainedClay, 1, i),
		        'I', Item.stick
			});
			
			GameRegistry.addShapelessRecipe(new ItemStack(stainedClayTable, 1, i), new ItemStack(Item.itemsList[hardenedClayTable.blockID]),
					new ItemStack(Item.dyePowder, 1, BlockColored.getDyeFromBlock(i)));			
		}
		BlockStool hardenedClayStool = (BlockStool) Block.blocksList[MoreDeco.blocks.HARDENED_CLAY_STOOL_ID];
		BlockStool stainedClayStool = (BlockStool) Block.blocksList[MoreDeco.blocks.STAINED_CLAY_STOOL_ID];
		for (int i = 0; i < stainedClayStool.getSubTypesCount(); i++)
		{
			GameRegistry.addRecipe(new ItemStack(stainedClayStool, 3, i), new Object[]{
				"###", "I I",
		        '#', new ItemStack(Block.stainedClay, 1, i),
		        'I', Item.stick
			});
			
			GameRegistry.addShapelessRecipe(new ItemStack(stainedClayStool, 1, i), new ItemStack(Item.itemsList[hardenedClayStool.blockID]),
					new ItemStack(Item.dyePowder, 1, BlockColored.getDyeFromBlock(i)));			
		}
		for (int i = 0; i < 4; i++)
		{
			BlockChair stainedClayChair = (BlockChair) Block.blocksList[MoreDeco.blocks.STAINED_CLAY_0_CHAIR_ID + i];
			for (int j = 0; j < stainedClayChair.getSubTypesCount(); j++)
			{
				GameRegistry.addRecipe(new ItemStack(stainedClayChair, 4, 4 * j), new Object[]{
					"#  ", "###", "I I",
					'#', new ItemStack(Block.stainedClay, 1, 4 * i + j),
					'I', Item.stick
				});
				GameRegistry.addShapelessRecipe(new ItemStack(stainedClayChair, 4, 4 * j), new ItemStack(MoreDeco.blocks.STAINED_CLAY_0_CHAIR_ID, 1, 0),
						new ItemStack(Item.dyePowder, 1, BlockColored.getDyeFromBlock(4 * i + j)));
			}
		}
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.NETHERRACK_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Block.netherrack,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.NETHERRACK_STOOL_ID], 3), new Object[]{
			"###", "I I",
			'#', Block.netherrack,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.NETHERRACK_CHAIR_ID], 4), new Object[]{
			"#  ", "###", "I I",
			'#', Block.netherrack,
			'I', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.SOULSAND_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Block.slowSand,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.SOULSAND_STOOL_ID], 3), new Object[]{
			"###", "I I",
			'#', Block.slowSand,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.SOULSAND_CHAIR_ID], 4), new Object[]{
			"#  ", "###", "I I",
			'#', Block.slowSand,
			'I', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.GLOWSTONE_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Block.glowStone,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.GLOWSTONE_STOOL_ID], 3), new Object[]{
			"###", "I I",
			'#', Block.glowStone,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.GLOWSTONE_CHAIR_ID], 4), new Object[]{
			"#  ", "###", "I I",
			'#', Block.glowStone,
			'I', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.NETHER_BRICK_TABLE_ID], 3), new Object[]{
			"###", "I I", "I I",
			'#', Block.netherBrick,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.NETHER_BRICK_STOOL_ID], 3), new Object[]{
			"###", "I I",
			'#', Block.netherBrick,
			'I', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(Block.blocksList[MoreDeco.blocks.NETHER_BRICK_CHAIR_ID], 4), new Object[]{
			"#  ", "###", "I I",
			'#', Block.netherBrick,
			'I', Item.stick
		});
	}

}
