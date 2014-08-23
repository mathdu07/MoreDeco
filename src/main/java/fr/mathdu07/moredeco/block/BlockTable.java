package fr.mathdu07.moredeco.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import fr.mathdu07.moredeco.MoreDeco;

public class BlockTable extends Block implements IMultipleBlock {
	
	private final Block parentBlock;
	private Block legBlock;
	private int legMetadata;
	private String[] suffixes;
	
	/**
	 * A table block, with an uniform texture (leg's texture is the same as top's texture)
	 * 
	 * @param id - block's id
	 * @param parentBlock - model of the table, the table herits some of it's properties (texutre, hardness ...)
	 * @param suffix - if the parent block uses metadata, add all suffix for the unlocalized names, 
	 *         to give a name which changes with metadata
	 */
	public BlockTable(int id, Block parentBlock, String... suffix)
	{
		super(id, parentBlock.blockMaterial);
		this.parentBlock = parentBlock;
		this.setHardness(parentBlock.blockHardness);
		this.setResistance(parentBlock.blockResistance / 3.f);
		this.setLightOpacity(0);
		this.setCreativeTab(MoreDeco.tab);
		this.suffixes = suffix;
		
		this.legBlock = null;
		this.legMetadata = -1;
	}
	
	/**
	 * A table block
	 * 
	 * @param id - block's id
	 * @param parentBlock - model of the table, the table herits some of it's properties (texutre, hardness ...)
	 * @param leg - the block model for the leg
	 * @param suffix - if the parent block uses metadata, add all suffix for the unlocalized names, 
	 *         to give a name which changes with metadata
	 */
	public BlockTable(int id, Block parentBlock, Block leg, String... suffix)
	{
		this(id, parentBlock, leg, -1, suffix);
	}
	
	/**
	 * A table block
	 * 
	 * @param id - block's id
	 * @param parentBlock - model of the table, the table herits some of it's properties (texutre, hardness ...)
	 * @param leg - the block model for the leg
	 * @param legMetadata - the metadata to use to get leg's icon, if -1, then the metadata of this block is used
	 * @param suffix - if the parent block uses metadata, add all suffix for the unlocalized names, 
	 *         to give a name which changes with metadata
	 */
	public BlockTable(int id, Block parentBlock, Block leg, int legMetadata, String... suffix)
	{
		this(id, parentBlock, suffix);
		
		this.legBlock = leg;
		this.legMetadata = legMetadata;
	}
	
	
	
	@Override
	public void addCollisionBoxesToList(World world, int x, int y, int z, AxisAlignedBB aabb, List list, Entity entity)
	{
		setBlockBounds(0f, 0.9f, 0f, 1f, 1f, 1f);
		super.addCollisionBoxesToList(world, x, y, z, aabb,	list, entity);
		
		if (!isBlockTable(world, x - 1, y, z) && !isBlockTable(world, x, y, z - 1))
		{
			setBlockBounds(0f, 0f, 0f, 0.1f, 0.9f, 0.1f);
			super.addCollisionBoxesToList(world, x, y, z, aabb,	list, entity);
		}
		
		if (!isBlockTable(world, x + 1, y, z) && !isBlockTable(world, x, y, z - 1))
		{
			setBlockBounds(0.9f, 0f, 0f, 1f, 0.9f, 0.1f);
			super.addCollisionBoxesToList(world, x, y, z, aabb,	list, entity);
		}
		
		if (!isBlockTable(world, x + 1, y, z) && !isBlockTable(world, x, y, z + 1))
		{
			setBlockBounds(0.9f, 0f, 0.9f, 1f, 0.9f, 1f);
			super.addCollisionBoxesToList(world, x, y, z, aabb,	list, entity);
		}
		
		if (!isBlockTable(world, x - 1, y, z) && !isBlockTable(world, x, y, z + 1))
		{
			setBlockBounds(0f, 0f, 0.9f, 0.1f, 0.9f, 1f);
			super.addCollisionBoxesToList(world, x, y, z, aabb,	list, entity);
		}
		
	}

	public Icon getLegIcon(int face, int metadata)
	{
		if (legBlock != null)
			return legBlock.getIcon(face, legMetadata == -1 ? metadata : legMetadata);
		else
			return getIcon(face, metadata); 
	}
	
	@Override
	public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side) {
		return true;
	}
	
	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z) {
		
		boolean hasFoot = (!isBlockTable(world, x - 1, y, z) && !isBlockTable(world, x, y, z - 1))
				|| !isBlockTable(world, x + 1, y, z) && !isBlockTable(world, x, y, z - 1)
				|| !isBlockTable(world, x + 1, y, z) && !isBlockTable(world, x, y, z + 1)
				|| !isBlockTable(world, x - 1, y, z) && !isBlockTable(world, x, y, z + 1);
		
		if (hasFoot)
			setBlockBounds(0, 0, 0, 1, 1, 1);
		else
			setBlockBounds(0, 0.9f, 0, 1, 1, 1);
	}



	public boolean isBlockTable(IBlockAccess world, int x, int y, int z)
	{
		return Block.blocksList[world.getBlockId(x, y, z)] instanceof BlockTable;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public int getRenderType() {
		return MoreDeco.proxy.tableRendererId;
	}

	@Override
	public boolean getTickRandomly() {
		return parentBlock.getTickRandomly();
	}

	@Override
	public Icon getIcon(int side, int data) {
		return parentBlock.getIcon(side, data);
	}

	@Override
	public Icon getBlockTexture(IBlockAccess par1iBlockAccess, int par2,
			int par3, int par4, int par5) {
		return parentBlock.getBlockTexture(par1iBlockAccess, par2, par3, par4, par5);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public int damageDropped(int metadata) {
		return metadata;
	}

	@Override
	public int getRenderBlockPass() {
		return parentBlock.getRenderBlockPass();
	}

	@Override
	public void getSubBlocks(int id, CreativeTabs tab, List list) {
		if (suffixes.length > 0)
		{
			for (int i = 0; i < suffixes.length; i++)
				list.add(new ItemStack(id, 1, i));
		}
		else
			list.add(new ItemStack(id, 1, 0));
	}

	@Override
	public boolean canDropFromExplosion(Explosion par1Explosion) {
		return parentBlock.canDropFromExplosion(par1Explosion);
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		
	}

	@Override
	public boolean canHarvestBlock(EntityPlayer player, int meta) {
		return parentBlock.canHarvestBlock(player, meta);
	}

	@Override
	public int getFlammability(IBlockAccess world, int x, int y, int z, int metadata, ForgeDirection face) {
		return parentBlock.getFlammability(world, x, y, z, metadata, face);
	}

	@Override
	public int getFireSpreadSpeed(World world, int x, int y, int z, int metadata, ForgeDirection face) {
		return parentBlock.getFireSpreadSpeed(world, x, y, z, metadata, face);
	}

	@Override
	public boolean canSilkHarvest(World world, EntityPlayer player, int x, int y, int z, int metadata) {
		return parentBlock.canSilkHarvest(world, player, x, y, z, metadata);
	}

	@Override
	public boolean canCreatureSpawn(EnumCreatureType type, World world, int x, int y, int z) {
		return false;
	}

	@Override
	public boolean canPlaceTorchOnTop(World world, int x, int y, int z) {
		return true;
	}

	@Override
	public String getUnlocalizedName(int metadata) {
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
	
	

}