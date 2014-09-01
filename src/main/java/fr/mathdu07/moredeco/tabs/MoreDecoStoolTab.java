package fr.mathdu07.moredeco.tabs;

import fr.mathdu07.moredeco.MoreDeco;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MoreDecoStoolTab extends CreativeTabs {

	public MoreDecoStoolTab()
	{
		super("moredeco_stool");
	}

	@Override
	public ItemStack getIconItemStack()
	{
		return new ItemStack(MoreDeco.blocks.PLANKS_STOOL_ID, 1, 0);
	}
	
	

}
