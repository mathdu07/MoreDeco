package fr.mathdu07.moredeco;

import net.minecraft.block.BlockColored;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.mathdu07.moredeco.block.BlockChair;
import fr.mathdu07.moredeco.block.BlockStool;
import fr.mathdu07.moredeco.block.BlockTable;

public final class MoreDecoRecipes {
	
	protected void init()
	{
		for (int i = 0; i < MoreDeco.blocks.WOODEN_0_TABLE.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.WOODEN_0_TABLE, 3, i), new Object[]{
				"###", "I I", "I I",
		        '#', new ItemStack(Blocks.log, 1, i),
		        'I', Items.stick
			});
		for (int i = 0; i < MoreDeco.blocks.WOODEN_1_TABLE.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.WOODEN_1_TABLE, 3, i), new Object[]{
				"###", "I I", "I I",
		        '#', new ItemStack(Blocks.log2, 1, i),
		        'I', Items.stick
			});
		for (int i = 0; i < MoreDeco.blocks.WOODEN_0_STOOL.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.WOODEN_0_STOOL, 3, i), new Object[]{
				"###", "I I",
		        '#', new ItemStack(Blocks.log, 1, i),
		        'I', Items.stick
			});
		for (int i = 0; i < MoreDeco.blocks.WOODEN_1_STOOL.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.WOODEN_1_STOOL, 3, i), new Object[]{
				"###", "I I",
		        '#', new ItemStack(Blocks.log2, 1, i),
		        'I', Items.stick
			});
		for (int i = 0; i < MoreDeco.blocks.WOODEN_0_CHAIR.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.WOODEN_0_CHAIR, 4, 4 * i), new Object[]{
				"  #", "###", "I I",
		        '#', new ItemStack(Blocks.log, 1, i),
		        'I', Items.stick
			});
		for (int i = 0; i < MoreDeco.blocks.WOODEN_1_CHAIR.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.WOODEN_1_CHAIR, 4, 4 * i), new Object[]{
				"  #", "###", "I I",
		        '#', new ItemStack(Blocks.log2, 1, i),
		        'I', Items.stick
			});
		
		for (int i = 0; i < MoreDeco.blocks.PLANKS_TABLE.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.PLANKS_TABLE, 3, i), new Object[]{
				"###", "I I", "I I",
		        '#', new ItemStack(Blocks.planks, 1, i),
		        'I', Items.stick
			});
		for (int i = 0; i < MoreDeco.blocks.PLANKS_STOOL.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.PLANKS_STOOL, 3, i), new Object[]{
				"###", "I I",
		        '#', new ItemStack(Blocks.planks, 1, i),
		        'I', Items.stick
			});
		for (int i = 0; i < MoreDeco.blocks.PLANKS_0_CHAIR.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.PLANKS_0_CHAIR, 4, 4 * i), new Object[]{
				"  #", "###", "I I",
		        '#', new ItemStack(Blocks.planks, 1, i),
		        'I', Items.stick
			});
		for (int i = 0; i < MoreDeco.blocks.PLANKS_1_CHAIR.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.PLANKS_1_CHAIR, 4, 4 * i), new Object[]{
				"  #", "###", "I I",
		        '#', new ItemStack(Blocks.planks, 1, 4 + i),
		        'I', Items.stick
			});
		
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.GLASS_TABLE, 3), new Object[]{
			"###", "I I", "I I",
			'#', Blocks.glass,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.GLASS_STOOL, 3), new Object[]{
			"###", "I I",
			'#', Blocks.glass,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.GLASS_CHAIR, 4), new Object[]{
			"#  ", "###", "I I",
			'#', Blocks.glass,
			'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.STONE_TABLE, 3), new Object[]{
			"###", "I I", "I I",
			'#', Blocks.stone,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.STONE_STOOL, 3), new Object[]{
			"###", "I I",
			'#', Blocks.stone,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.STONE_CHAIR, 4), new Object[]{
			"#  ", "###", "I I",
			'#', Blocks.stone,
			'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.COBBLESTONE_TABLE, 3), new Object[]{
			"###", "I I", "I I",
			'#', Blocks.cobblestone,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.COBBLESTONE_STOOL, 3), new Object[]{
			"###", "I I",
			'#', Blocks.cobblestone,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.COBBLESTONE_CHAIR, 4), new Object[]{
			"#  ", "###", "I I",
			'#', Blocks.cobblestone,
			'I', Items.stick
		});
		
		BlockTable stonebrickTable = MoreDeco.blocks.STONEBRICK_TABLE;
		for (int i = 0; i < stonebrickTable.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(stonebrickTable, 3, i), new Object[]{
				"###", "I I", "I I",
		        '#', new ItemStack(Blocks.stonebrick, 1, i),
		        'I', Items.stick
			});
		BlockStool stonebrickStool = MoreDeco.blocks.STONEBRICK_STOOL;
		for (int i = 0; i < stonebrickStool.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(stonebrickStool, 3, i), new Object[]{
				"###", "I I",
		        '#', new ItemStack(Blocks.stonebrick, 1, i),
		        'I', Items.stick
			});
		BlockChair stonebrickChair = MoreDeco.blocks.STONEBRICK_CHAIR;
		for (int i = 0; i < stonebrickChair.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(stonebrickChair, 4, 4 * i), new Object[]{
				"  #", "###", "I I",
		        '#', new ItemStack(Blocks.stonebrick, 1, i),
		        'I', Items.stick
			});
		
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.COAL_TABLE, 3), new Object[]{
			"###", "I I", "I I",
			'#', Items.coal,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.COAL_STOOL, 3), new Object[]{
			"###", "I I",
			'#', Items.coal,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.COAL_CHAIR, 4), new Object[]{
			"#  ", "###", "I I",
			'#', Items.coal,
			'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.IRON_TABLE, 3), new Object[]{
			"###", "I I", "I I",
			'#', Items.iron_ingot,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.IRON_STOOL, 3), new Object[]{
			"###", "I I",
			'#', Items.iron_ingot,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.IRON_CHAIR, 4), new Object[]{
			"#  ", "###", "I I",
			'#', Items.iron_ingot,
			'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.GOLD_TABLE, 3), new Object[]{
			"###", "I I", "I I",
			'#', Items.gold_ingot,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.GOLD_STOOL, 3), new Object[]{
			"###", "I I",
			'#', Items.gold_ingot,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.GOLD_CHAIR, 4), new Object[]{
			"#  ", "###", "I I",
			'#', Items.gold_ingot,
			'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.LAPIS_TABLE, 3), new Object[]{
			"###", "I I", "I I",
			'#', new ItemStack(Items.dye, 1, 4),
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.LAPIS_STOOL, 3), new Object[]{
			"###", "I I",
			'#', new ItemStack(Items.dye, 1, 4),
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.LAPIS_CHAIR, 4), new Object[]{
			"#  ", "###", "I I",
			'#', new ItemStack(Items.dye, 1, 4),
			'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.REDSTONE_TABLE, 3), new Object[]{
			"###", "I I", "I I",
			'#', Items.redstone,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.REDSTONE_STOOL, 3), new Object[]{
			"###", "I I",
			'#', Items.redstone,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.REDSTONE_CHAIR, 4), new Object[]{
			"#  ", "###", "I I",
			'#', Items.redstone,
			'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.DIAMOND_TABLE, 3), new Object[]{
			"###", "I I", "I I",
			'#', Items.diamond,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.DIAMOND_STOOL, 3), new Object[]{
			"###", "I I",
			'#', Items.diamond,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.DIAMOND_CHAIR, 4), new Object[]{
			"#  ", "###", "I I",
			'#', Items.diamond,
			'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.EMERALD_TABLE, 3), new Object[]{
			"###", "I I", "I I",
			'#', Items.emerald,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.EMERALD_STOOL, 3), new Object[]{
			"###", "I I",
			'#', Items.emerald,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.EMERALD_CHAIR, 4), new Object[]{
			"#  ", "###", "I I",
			'#', Items.emerald,
			'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.SANDSTONE_TABLE, 3), new Object[]{
			"###", "I I", "I I",
		    '#', Blocks.sandstone,
		    'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.SANDSTONE_STOOL, 3), new Object[]{
			"###", "I I",
		    '#', Blocks.sandstone,
		    'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.SANDSTONE_CHAIR, 4), new Object[]{
			"#  ", "###", "I I",
			'#', Blocks.sandstone,
			'I', Items.stick
		});
		
		BlockTable quartzTable = (BlockTable) MoreDeco.blocks.QUARTZ_TABLE;
		for (int i = 0; i < quartzTable.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(quartzTable, 3, i), new Object[]{
				"###", "I I", "I I",
		        '#', new ItemStack(Blocks.quartz_block, 1, i),
		        'I', Items.stick
			});
		BlockStool quartzStool = (BlockStool) MoreDeco.blocks.QUARTZ_STOOL;
		for (int i = 0; i < quartzStool.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(quartzStool, 3, i), new Object[]{
				"###", "I I",
		        '#', new ItemStack(Blocks.quartz_block, 1, i),
		        'I', Items.stick
			});
		BlockChair quartzChair = (BlockChair) MoreDeco.blocks.QUARTZ_CHAIR;
		for (int i = 0; i < quartzChair.getSubTypesCount(); i++)
			GameRegistry.addRecipe(new ItemStack(quartzChair, 4, 4 * i), new Object[]{
				"  #", "###", "I I",
		        '#', new ItemStack(Blocks.quartz_block, 1, i),
		        'I', Items.stick
			});
		
		BlockTable woolTable = (BlockTable) MoreDeco.blocks.WOOL_TABLE;
		for (int i = 0; i < woolTable.getSubTypesCount(); i++)
		{
			GameRegistry.addRecipe(new ItemStack(woolTable, 3, i), new Object[]{
				"###", "I I", "I I",
		        '#', new ItemStack(Blocks.wool, 1, i),
		        'I', Items.stick
			});
			GameRegistry.addShapelessRecipe(new ItemStack(woolTable, 1, i), new ItemStack(MoreDeco.blocks.WOOL_TABLE),
					new ItemStack(Items.dye, 1, BlockColored.func_150031_c/*getDyeFromBlock*/(i)));
		}
		BlockStool woolStool = (BlockStool) MoreDeco.blocks.WOOL_STOOL;
		for (int i = 0; i < woolStool.getSubTypesCount(); i++)
		{
			GameRegistry.addRecipe(new ItemStack(woolStool, 3, i), new Object[]{
				"###", "I I",
		        '#', new ItemStack(Blocks.wool, 1, i),
		        'I', Items.stick
			});
			GameRegistry.addShapelessRecipe(new ItemStack(woolStool, 1, i), new ItemStack(MoreDeco.blocks.WOOL_STOOL),
					new ItemStack(Items.dye, 1, BlockColored.func_150031_c/*getDyeFromBlock*/(i)));
		}
		for (int i = 0; i < 4; i++)
		{
			BlockChair woolChair = (i == 0  ? MoreDeco.blocks.WOOL_0_CHAIR : (i == 1 ? MoreDeco.blocks.WOOL_1_CHAIR : 
				(i == 2 ? MoreDeco.blocks.WOOL_2_CHAIR : MoreDeco.blocks.WOOL_3_CHAIR)));
			for (int j = 0; j < woolChair.getSubTypesCount(); j++)
			{
				GameRegistry.addRecipe(new ItemStack(woolChair, 4, 4 * j), new Object[]{
					"#  ", "###", "I I",
					'#', new ItemStack(Blocks.wool, 1, 4 * i + j),
					'I', Items.stick
				});
				GameRegistry.addShapelessRecipe(new ItemStack(woolChair, 4, 4 * j), new ItemStack(woolChair, 1, 0),
						new ItemStack(Items.dye, 1, BlockColored.func_150031_c/*getDyeFromBlock*/(4 * i + j)));
			}
		}
		
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.HARDENED_CLAY_TABLE, 3), new Object[]{
			"###", "I I", "I I",
			'#', Blocks.hardened_clay,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.HARDENED_CLAY_STOOL, 3), new Object[]{
			"###", "I I",
			'#', Blocks.hardened_clay,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.HARDENED_CLAY_CHAIR, 4), new Object[]{
			"#  ", "###", "I I",
			'#', Blocks.hardened_clay,
			'I', Items.stick
		});
		
		BlockTable hardenedClayTable = MoreDeco.blocks.HARDENED_CLAY_TABLE;
		BlockTable stainedClayTable = MoreDeco.blocks.STAINED_CLAY_TABLE;
		for (int i = 0; i < stainedClayTable.getSubTypesCount(); i++)
		{
			GameRegistry.addRecipe(new ItemStack(stainedClayTable, 3, i), new Object[]{
				"###", "I I", "I I",
		        '#', new ItemStack(Blocks.stained_hardened_clay, 1, i),
		        'I', Items.stick
			});
			
			GameRegistry.addShapelessRecipe(new ItemStack(stainedClayTable, 1, i), new ItemStack(hardenedClayTable),
					new ItemStack(Items.dye, 1, BlockColored.func_150031_c/*getDyeFromBlock*/(i)));			
		}
		BlockStool hardenedClayStool = (BlockStool) MoreDeco.blocks.HARDENED_CLAY_STOOL;
		BlockStool stainedClayStool = (BlockStool) MoreDeco.blocks.STAINED_CLAY_STOOL;
		for (int i = 0; i < stainedClayStool.getSubTypesCount(); i++)
		{
			GameRegistry.addRecipe(new ItemStack(stainedClayStool, 3, i), new Object[]{
				"###", "I I",
		        '#', new ItemStack(Blocks.stained_hardened_clay, 1, i),
		        'I', Items.stick
			});
			
			GameRegistry.addShapelessRecipe(new ItemStack(stainedClayStool, 1, i), new ItemStack(hardenedClayStool),
					new ItemStack(Items.dye, 1, BlockColored.func_150031_c/*getDyeFromBlock*/(i)));			
		}
		for (int i = 0; i < 4; i++)
		{
			BlockChair stainedClayChair = (i == 0  ? MoreDeco.blocks.STAINED_CLAY_0_CHAIR : (i == 1 ? MoreDeco.blocks.STAINED_CLAY_1_CHAIR : 
				(i == 2 ? MoreDeco.blocks.STAINED_CLAY_2_CHAIR : MoreDeco.blocks.STAINED_CLAY_3_CHAIR)));
			for (int j = 0; j < stainedClayChair.getSubTypesCount(); j++)
			{
				GameRegistry.addRecipe(new ItemStack(stainedClayChair, 4, 4 * j), new Object[]{
					"#  ", "###", "I I",
					'#', new ItemStack(Blocks.stained_hardened_clay, 1, 4 * i + j),
					'I', Items.stick
				});
				GameRegistry.addShapelessRecipe(new ItemStack(stainedClayChair, 4, 4 * j), new ItemStack(stainedClayChair, 1, 0),
						new ItemStack(Items.dye, 1, BlockColored.func_150031_c/*getDyeFromBlock*/(4 * i + j)));
			}
		}
		
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.NETHERRACK_TABLE, 3), new Object[]{
			"###", "I I", "I I",
			'#', Blocks.netherrack,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.NETHERRACK_STOOL, 3), new Object[]{
			"###", "I I",
			'#', Blocks.netherrack,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.NETHERRACK_CHAIR, 4), new Object[]{
			"#  ", "###", "I I",
			'#', Blocks.netherrack,
			'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.SOULSAND_TABLE, 3), new Object[]{
			"###", "I I", "I I",
			'#', Blocks.soul_sand,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.SOULSAND_STOOL, 3), new Object[]{
			"###", "I I",
			'#', Blocks.soul_sand,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.SOULSAND_CHAIR, 4), new Object[]{
			"#  ", "###", "I I",
			'#', Blocks.soul_sand,
			'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.GLOWSTONE_TABLE, 3), new Object[]{
			"###", "I I", "I I",
			'#', Blocks.glowstone,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.GLOWSTONE_STOOL, 3), new Object[]{
			"###", "I I",
			'#', Blocks.glowstone,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.GLOWSTONE_CHAIR, 4), new Object[]{
			"#  ", "###", "I I",
			'#', Blocks.glowstone,
			'I', Items.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.NETHER_BRICK_TABLE, 3), new Object[]{
			"###", "I I", "I I",
			'#', Blocks.nether_brick,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.NETHER_BRICK_STOOL, 3), new Object[]{
			"###", "I I",
			'#', Blocks.nether_brick,
			'I', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(MoreDeco.blocks.NETHER_BRICK_CHAIR, 4), new Object[]{
			"#  ", "###", "I I",
			'#', Blocks.nether_brick,
			'I', Items.stick
		});
	}

}
