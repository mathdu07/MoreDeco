package fr.mathdu07.moredeco.block;

import java.util.List;

import fr.mathdu07.moredeco.MoreDeco;
import fr.mathdu07.moredeco.MoreDecoUtil;
import net.minecraft.block.Block;
import net.minecraft.block.MoreDecoBlockUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockStool extends BlockMountable implements IMultipleBlock
{
	private Block legBlock;
	private int legMetadata;
	private String[] suffixes;
	
	/**
	 * A stool block, with an uniform texture (leg's texture is the same as top's texture)
	 * 
	 * @param id - block's id
	 * @param parentBlock - model of the stool, the stool inherits some of it's properties (texture, hardness ...)
	 * @param suffix - if the parent block uses metadata, add all suffix for the unlocalized names, 
	 *         to give a name which changes with metadata
	 */
	public BlockStool(Block parentBlock, String... suffix)
	{
		super(parentBlock);
		this.setResistance(MoreDecoBlockUtil.getResistance(parentBlock) / 3.f);
		this.setLightOpacity(0);
		this.setCreativeTab(MoreDeco.tabStools);
		this.suffixes = suffix;
		
		this.legBlock = null;
		this.legMetadata = -1;
	}
	
	/**
	 * A stool block
	 * 
	 * @param id - block's id
	 * @param parentBlock - model of the stool, the stool inherits some of it's properties (texture, hardness ...)
	 * @param leg - the block model for the leg
	 * @param suffix - if the parent block uses metadata, add all suffix for the unlocalized names, 
	 *         to give a name which changes with metadata
	 */
	public BlockStool(Block parentBlock, Block leg, String... suffix)
	{
		this(parentBlock, leg, -1, suffix);
	}
	
	/**
	 * A stool block
	 * 
	 * @param id - block's id
	 * @param parentBlock - model of the stool, the stool inherits some of it's properties (texture, hardness ...)
	 * @param leg - the block model for the leg
	 * @param legMetadata - the metadata to use to get leg's icon, if -1, then the metadata of this block is used
	 * @param suffix - if the parent block uses metadata, add all suffix for the unlocalized names, 
	 *         to give a name which changes with metadata
	 */
	public BlockStool(Block parentBlock, Block leg, int legMetadata, String... suffix)
	{
		this(parentBlock, suffix);
		
		this.legBlock = leg;
		this.legMetadata = legMetadata;
	}
	
	@Override
	public void tryToMount(World world, int x, int y, int z, EntityPlayer player)
	{
		tryToMount(world, x, y, z, player, 0.5f, 0.5f, 0.5f);
	}
	
	public IIcon getLegIcon(int face, int metadata)
	{
		if (legBlock != null)
			return legBlock.getIcon(face, legMetadata == -1 ? metadata : legMetadata);
		else
			return getIcon(face, metadata); 
	}
	
	@Override
	public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side)
	{
		return true;
	}
	
	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z)
	{
		float x0 = isBlockStool(world, x - 1, y, z) ? 0f : 0.2f;
		float z0 = isBlockStool(world, x, y, z - 1) ? 0f : 0.2f;
		float x1 = isBlockStool(world, x + 1, y, z) ? 1f : 0.8f;
		float z1 = isBlockStool(world, x, y, z + 1) ? 1f : 0.8f;
		
		boolean hasLeg = !isBlockStool(world, x - 1, y, z) && !isBlockStool(world, x, y, z - 1)
				|| !isBlockStool(world, x + 1, y, z) && !isBlockStool(world, x, y, z - 1)
				|| !isBlockStool(world, x + 1, y, z) && !isBlockStool(world, x, y, z + 1)
				|| !isBlockStool(world, x - 1, y, z) && !isBlockStool(world, x, y, z + 1);
		
		setBlockBounds(x0, hasLeg ? 0f : 0.4f, z0, x1, 0.5f, z1);
	}

	@Override
	public void addCollisionBoxesToList(World world, int x, int y, int z, AxisAlignedBB aabb, List list, Entity entity)
	{
		setBlockBounds(0.2f, 0.4f, 0.2f, 0.8f, 0.5f, 0.8f);
		super.addCollisionBoxesToList(world, x, y, z, aabb, list, entity);
		
		// Extensions
		if (isBlockStool(world, x - 1, y, z))
		{
			setBlockBounds(0f, 0.4f, 0.2f, 0.2f, 0.5f, 0.8f);
			super.addCollisionBoxesToList(world, x, y, z, aabb, list, entity);
		}
		if (isBlockStool(world, x + 1, y, z))
		{
			setBlockBounds(0.8f, 0.4f, 0.2f, 1f, 0.5f, 0.8f);
			super.addCollisionBoxesToList(world, x, y, z, aabb, list, entity);
		}
		if (isBlockStool(world, x, y, z - 1))
		{
			setBlockBounds(0.2f, 0.4f, 0f, 0.8f, 0.5f, 0.2f);
			super.addCollisionBoxesToList(world, x, y, z, aabb, list, entity);
		}
		if (isBlockStool(world, x, y, z + 1))
		{
			setBlockBounds(0.2f, 0.4f, 0.8f, 0.8f, 0.5f, 1f);
			super.addCollisionBoxesToList(world, x, y, z, aabb, list, entity);
		}
		
		// Legs
		if (!isBlockStool(world, x - 1, y, z) && !isBlockStool(world, x, y, z - 1))
		{
			setBlockBounds(0.2f, 0f, 0.2f, 0.3f, 0.4f, 0.3f);
			super.addCollisionBoxesToList(world, x, y, z, aabb, list, entity);
		}
		if (!isBlockStool(world, x + 1, y, z) && !isBlockStool(world, x, y, z - 1))
		{
			setBlockBounds(0.7f, 0f, 0.2f, 0.8f, 0.4f, 0.3f);
			super.addCollisionBoxesToList(world, x, y, z, aabb, list, entity);
		}
		
		if (!isBlockStool(world, x + 1, y, z) && !isBlockStool(world, x, y, z + 1))
		{
			setBlockBounds(0.7f, 0f, 0.7f, 0.8f, 0.4f, 0.8f);
			super.addCollisionBoxesToList(world, x, y, z, aabb, list, entity);
		}
		
		if (!isBlockStool(world, x - 1, y, z) && !isBlockStool(world, x, y, z + 1))
		{
			setBlockBounds(0.2f, 0f, 0.7f, 0.3f, 0.4f, 0.8f);
			super.addCollisionBoxesToList(world, x, y, z, aabb, list, entity);
		}
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	@Override
	public int getRenderType() {
		return MoreDeco.proxy.stoolRendererId;
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public int damageDropped(int metadata)
	{
		return metadata;
	}

	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list)
	{
		if (suffixes.length > 0)
		{
			for (int i = 0; i < suffixes.length; i++)
				list.add(new ItemStack(item, 1, i));
		}
		else
			list.add(new ItemStack(item, 1, 0));
	}

	@Override
	public boolean canCreatureSpawn(EnumCreatureType type, IBlockAccess world, int x, int y, int z)
	{
		return false;
	}

	@Override
	public boolean canPlaceTorchOnTop(World world, int x, int y, int z)
	{
		return false;
	}

	@Override
	public String getUnlocalizedName(int metadata)
	{
		if (suffixes.length == 0)
			return getUnlocalizedName();
		
		if (metadata < 0 || metadata > suffixes.length)
			metadata = 0;
		
		return getUnlocalizedName() + "." + suffixes[metadata];
	}
	
	@Override
	public int getSubTypesCount() {
		return suffixes.length;
	}
	
	public static boolean isBlockStool(Block block)
	{
		return block instanceof BlockStool; 
	}
	
	public static boolean isBlockStool(IBlockAccess world, int x, int y, int z)
	{
		return isBlockStool(world.getBlock(x, y, z));
	}
}
