package fr.mathdu07.moredeco.block;

import java.util.List;

import fr.mathdu07.moredeco.MoreDeco;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockChair extends BlockMountable implements IMultipleBlock
{
	
	private String[] suffixes;
	
	private Block legBlock;
	private int legMetadata;
	
	private int firstMetadata;

	/**
	 * A chair block, with an uniform texture (leg's texture is the same as the rest)
	 * 
	 * @param id - block's id
	 * @param parentBlock - model of the chair, the chair inherits some of it's properties (texture, hardness ...)
	 * @param suffix - if the parent block uses metadata, add all suffix for the unlocalized names, 
	 *         to give a name which changes with metadata
	 */
	public BlockChair(int id, Block parentBlock, String... suffix) {
		super(id, parentBlock);
		this.setResistance(parentBlock.blockResistance / 3.f);
		this.setLightOpacity(0);
		this.setCreativeTab(MoreDeco.tabChairs);
		this.suffixes = suffix;
		
		this.legBlock = null;
		this.legMetadata = -1;
		this.firstMetadata = 0;
	}
	
	/**
	 * A chair block
	 * 
	 * @param id - block's id
	 * @param parentBlock - model of the chair, the chair inherits some of it's properties (texture, hardness ...)
	 * @param leg - the block model for the leg
	 * @param suffix - if the parent block uses metadata, add all suffix for the unlocalized names, 
	 *         to give a name which changes with metadata
	 */
	public BlockChair(int id, Block parentBlock, Block leg, String... suffix)
	{
		this(id, parentBlock, leg, -1, suffix);
	}
	
	/**
	 * A chair block
	 * 
	 * @param id - block's id
	 * @param parentBlock - model of the chair, the chair inherits some of it's properties (texture, hardness ...)
	 * @param leg - the block model for the leg
	 * @param legMetadata - the metadata to use to get leg's icon, if -1, then the metadata of this block is used
	 * @param suffix - if the parent block uses metadata, add all suffix for the unlocalized names, 
	 *         to give a name which changes with metadata
	 */
	public BlockChair(int id, Block parentBlock, Block leg, int legMetadata, String... suffix)
	{
		this(id, parentBlock, leg, legMetadata, 0, suffix);
	}
	
	/**
	 * A chair block
	 * 
	 * @param id - block's id
	 * @param parentBlock - model of the chair, the chair inherits some of it's properties (texture, hardness ...)
	 * @param leg - the block model for the leg
	 * @param legMetadata - the metadata to use to get leg's icon, if -1, then the metadata of this block is used
	 * @param firstMetadata - the metadata to begin with for getting parent block's texture
	 * @param suffix - if the parent block uses metadata, add all suffix for the unlocalized names, 
	 *         to give a name which changes with metadata
	 */
	public BlockChair(int id, Block parentBlock, Block leg, int legMetadata, int firstMetadata, String... suffix)
	{
		this(id, parentBlock, suffix);
		
		this.legBlock = leg;
		this.legMetadata = legMetadata;
		this.firstMetadata = firstMetadata;
	}


	@Override
	public void tryToMount(World world, int x, int y, int z, EntityPlayer player)
	{
		tryToMount(world, x, y, z, player, 0.5f, 0.5f, 0.5f);
	}

	@Override
	public int damageDropped(int metadata)
	{
		return metadata - metadata % 4;
	}

	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z)
	{
		setBlockBounds(0.2f, 0f, 0.2f, 0.8f, 1f, 0.8f);
	}

	@Override
	public void addCollisionBoxesToList(World world, int x, int y, int z, AxisAlignedBB aabb, List list, Entity entity)
	{
		setBlockBounds(0.2f, 0f, 0.2f, 0.8f, 0.5f, 0.8f);
		super.addCollisionBoxesToList(world, x, y, z, aabb, list, entity);
		
		int direction = BlockChair.getDirection(world, x, y, z);
		
		switch (direction)
		{
		case 0:
			setBlockBounds(0.7f, 0.5f, 0.2f, 0.8f, 1f, 0.8f);
			super.addCollisionBoxesToList(world, x, y, z, aabb, list, entity);
			break;
		case 1:
			setBlockBounds(0.2f, 0.5f, 0.2f, 0.3f, 1f, 0.8f);
			super.addCollisionBoxesToList(world, x, y, z, aabb, list, entity);
			break;
		case 2:
			setBlockBounds(0.2f, 0.5f, 0.7f, 0.8f, 1f, 0.8f);
			super.addCollisionBoxesToList(world, x, y, z, aabb, list, entity);
			break;
		case 3:
			setBlockBounds(0.2f, 0.5f, 0.2f, 0.8f, 1f, 0.3f);
			super.addCollisionBoxesToList(world, x, y, z, aabb, list, entity);
			break;
		}
	}

	@Override
	public void getSubBlocks(int id, CreativeTabs tab, List list)
	{
		if (suffixes.length != 0)
		{
			for (int i = 0; i < suffixes.length; i++)
				list.add(new ItemStack(id, 1, i * 4));
		}
		else
			list.add(new ItemStack(Block.blocksList[id]));
	}

	@Override
	public boolean canPlaceTorchOnTop(World world, int x, int y, int z)
	{
		return false;
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	@Override
	public int getRenderType()
	{
		return MoreDeco.proxy.chairRendererId;
	}
	
	@Override
	public Icon getIcon(int side, int data)
	{
		return super.getIcon(side, data / 4 + firstMetadata);
	}

	@Override
	public Icon getBlockTexture(IBlockAccess world, int x, int y, int z, int side)
	{
		return getIcon(side, world.getBlockMetadata(x, y, z));
	}

	public Icon getLegIcon(int face, int metadata)
	{
		if (legBlock != null)
			return legBlock.getIcon(face, legMetadata == -1 ? metadata / 4 : legMetadata);
		else
			return getIcon(face, metadata); 
	}

	@Override
	public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side)
	{
		return true;
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack is) {
		
        int orientation = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
        int metadata = world.getBlockMetadata(x, y, z);

        switch (orientation)
        {
        case 0:
        	world.setBlockMetadataWithNotify(x, y, z, 2 | metadata, 2);
        	break;
        case 1:
        	world.setBlockMetadataWithNotify(x, y, z, 1 | metadata, 2);
        	break;
        case 2:
        	world.setBlockMetadataWithNotify(x, y, z, 3 | metadata, 2);
        	break;
        case 3:
        	world.setBlockMetadataWithNotify(x, y, z, 0 | metadata, 2);
        	break;
        }
	}
	
	@Override
	public String getUnlocalizedName(int metadata)
	{
		if (suffixes.length == 0)
			return getUnlocalizedName();
		
		int type = metadata / 4;
		
		if (type < 0 || type > suffixes.length)
			type = 0;
		
		return getUnlocalizedName() + "." + suffixes[type];
	}

	@Override
	public int getSubTypesCount()
	{
		return suffixes.length;
	}

	public static boolean isBlockChair(IBlockAccess world, int x, int y, int z)
	{
		return isBlockChair(blocksList[world.getBlockId(x, y, z)]);
	}
	
	public static boolean isBlockChair(Block block)
	{
		return block instanceof BlockChair;
	}

	public static int getDirection(IBlockAccess world, int x, int y, int z)
	{
		if (isBlockChair(world, x, y, z))
			return world.getBlockMetadata(x, y, z) % 4;
		else
			return 0;
	}

}
