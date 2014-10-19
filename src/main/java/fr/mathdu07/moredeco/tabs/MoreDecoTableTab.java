package fr.mathdu07.moredeco.tabs;

import fr.mathdu07.moredeco.MoreDeco;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MoreDecoTableTab extends CreativeTabs {

	public MoreDecoTableTab() {
		super("moredeco_table");
	}

	@Override
	public Item getTabIconItem() 
	{
		return Item.getItemFromBlock(MoreDeco.blocks.WOODEN_0_TABLE);
	}

}
