package fr.mathdu07.moredeco.block;

import java.util.List;

import fr.mathdu07.moredeco.MoreDecoUtil;
import net.minecraft.block.Block;
import net.minecraft.block.MoreDecoBlockUtil;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockChildren extends Block {
	
	public final Block parentBlock;
	
	/**
	 * A block that inherits properties from his parent blocks
	 * 
	 * @param parentBlock
	 */
	public BlockChildren(Block parentBlock)
	{
		super(parentBlock.getMaterial());
		this.parentBlock = parentBlock;
		
		this.setHardness(MoreDecoBlockUtil.getHardness(parentBlock));
		this.setResistance(MoreDecoBlockUtil.getResistance(parentBlock));
		this.setStepSound(parentBlock.stepSound);
	}
	
	@Override
	public boolean getTickRandomly() {
		return parentBlock.getTickRandomly();
	}

	@Override
	public IIcon getIcon(int side, int data) {
		return parentBlock.getIcon(side, data);
	}

	@Override
	public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side) {
		return parentBlock.getIcon(world, x, y, z, side);
	}

	@Override
	public int damageDropped(int metadata) {
		return parentBlock.damageDropped(metadata);
	}

	@Override
	public int getRenderBlockPass() {
		return parentBlock.getRenderBlockPass();
	}

	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		parentBlock.getSubBlocks(item, tab, list);
	}

	@Override
	public boolean canDropFromExplosion(Explosion par1Explosion) {
		return parentBlock.canDropFromExplosion(par1Explosion);
	}

	@Override
	public void registerBlockIcons(IIconRegister par1IconRegister) {
		
	}

	@Override
	public boolean canHarvestBlock(EntityPlayer player, int meta) {
		return parentBlock.canHarvestBlock(player, meta);
	}

	@Override
	public int getFlammability(IBlockAccess world, int x, int y, int z, ForgeDirection face) {
		return parentBlock.getFlammability(world, x, y, z, face);
	}

	@Override
	public int getFireSpreadSpeed(IBlockAccess world, int x, int y, int z, ForgeDirection face) {
		return parentBlock.getFireSpreadSpeed(world, x, y, z, face);
	}

	@Override
	public boolean canSilkHarvest(World world, EntityPlayer player, int x, int y, int z, int metadata) {
		return parentBlock.canSilkHarvest(world, player, x, y, z, metadata);
	}

	@Override
	public boolean canCreatureSpawn(EnumCreatureType type, IBlockAccess world, int x, int y, int z) {
		return parentBlock.canCreatureSpawn(type, world, x, y, z);
	}

	@Override
	public boolean canPlaceTorchOnTop(World world, int x, int y, int z) {
		return parentBlock.canPlaceTorchOnTop(world, x, y, z);
	}
	
	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
	{
		parentBlock.onEntityCollidedWithBlock(world, x, y, z, entity);
	}

}
