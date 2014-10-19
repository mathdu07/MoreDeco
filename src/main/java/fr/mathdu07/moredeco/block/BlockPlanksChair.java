package fr.mathdu07.moredeco.block;

import net.minecraft.block.Block;
import net.minecraft.util.IIcon;

public class BlockPlanksChair extends BlockChair
{
	private int planksType;

	public BlockPlanksChair(Block parentBlock, String[] suffix, int planksType)
	{
		super(parentBlock, suffix);
		this.planksType = planksType;
	}

	@Override
	public IIcon getIcon(int side, int data)
	{
		return super.getIcon(side, 16 * planksType + data);
	}

}
