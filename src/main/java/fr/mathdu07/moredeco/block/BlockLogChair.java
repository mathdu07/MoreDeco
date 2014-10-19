package fr.mathdu07.moredeco.block;

import net.minecraft.block.Block;
import net.minecraft.util.IIcon;

public class BlockLogChair extends BlockChair
{
	private int logType;

	public BlockLogChair(Block parentBlock, Block leg, String[] suffix, int type)
	{
		super(parentBlock, leg, suffix);
		this.logType = type;
	}
	
	public BlockLogChair(Block parentBlock, Block leg, int firstMeta, String[] suffix, int type)
	{
		super(parentBlock, leg, firstMeta, suffix);
		this.logType = type;
	}

	@Override
	public IIcon getLegIcon(int face, int metadata) 
	{
		return super.getLegIcon(face, 16 * logType + metadata);
	}

}
