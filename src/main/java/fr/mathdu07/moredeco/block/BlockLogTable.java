package fr.mathdu07.moredeco.block;

import net.minecraft.block.Block;
import net.minecraft.util.IIcon;

public class BlockLogTable extends BlockTable
{
	
	private int logType;

	public BlockLogTable(Block parentBlock, Block leg, String[] suffix, int type)
	{
		super(parentBlock, leg, suffix);
		this.logType = type;
	}

	@Override
	public IIcon getLegIcon(int face, int metadata)
	{
		return super.getLegIcon(face, logType * 4 + metadata);
	}
	
	
}
