package fr.mathdu07.moredeco.tabs;

import fr.mathdu07.moredeco.MoreDeco;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MoreDecoTab extends CreativeTabs {

	public MoreDecoTab() {
		super("moredeco");
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(Block.blocksList[MoreDeco.blocks.PLANKS_TABLE_ID], 1);
	}

}
