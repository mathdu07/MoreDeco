package fr.mathdu07.moredeco.tabs;

import fr.mathdu07.moredeco.MoreDeco;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MoreDecoStoolTab extends CreativeTabs {

	public MoreDecoStoolTab()
	{
		super("moredeco_stool");
	}
	
	@Override
	public Item getTabIconItem() 
	{
		return Item.getItemFromBlock(MoreDeco.blocks.WOODEN_0_STOOL);
	}
	
	

}
