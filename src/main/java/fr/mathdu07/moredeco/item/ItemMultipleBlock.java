package fr.mathdu07.moredeco.item;

import fr.mathdu07.moredeco.block.IMultipleBlock;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemMultipleBlock extends ItemBlockWithMetadata {
	
	private final IMultipleBlock multipleBlock;
	
	public ItemMultipleBlock(int id, Block block) {
		super(id, block);
		
		if (!(block instanceof IMultipleBlock))
			throw new IllegalArgumentException("The block " + block + " does not implement IMultipleBlock interface");
		
		multipleBlock = (IMultipleBlock) block;
	}

	@Override
	public String getUnlocalizedName(ItemStack is) {
		return multipleBlock.getUnlocalizedName(is.getItemDamage());
	}

}
