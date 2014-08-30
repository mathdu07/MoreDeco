package fr.mathdu07.moredeco.tabs;

import fr.mathdu07.moredeco.MoreDeco;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MoreDecoChairTab extends CreativeTabs {

	public MoreDecoChairTab()
	{
		super("moredeco_chair");
	}

	@Override
	public ItemStack getIconItemStack()
	{
		return new ItemStack(Block.blocksList[MoreDeco.blocks.PLANKS_CHAIR_ID]);
	}
	
	

}
