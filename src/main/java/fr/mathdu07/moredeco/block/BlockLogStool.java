package fr.mathdu07.moredeco.block;

import net.minecraft.block.Block;
import net.minecraft.util.IIcon;

public class BlockLogStool extends BlockStool
{
	private int logType;

	public BlockLogStool(Block parentBlock, Block leg, String[] suffix, int type)
	{
		super(parentBlock, leg, suffix);
		this.logType = type;
	}

	@Override
	public IIcon getLegIcon(int face, int metadata)
	{
		return super.getLegIcon(face, 4 * logType + metadata);
	}

}
