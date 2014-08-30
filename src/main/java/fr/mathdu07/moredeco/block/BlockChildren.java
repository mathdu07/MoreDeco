package fr.mathdu07.moredeco.block;

import java.util.List;

import fr.mathdu07.moredeco.MoreDeco;
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

public class BlockChildren extends Block {
	
	public final Block parentBlock;
	
	/**
	 * A block that inherits properties from his parent blocks
	 * 
	 * @param id
	 * @param parentBlock
	 */
	public BlockChildren(int id, Block parentBlock)
	{
		super(id, parentBlock.blockMaterial);
		this.parentBlock = parentBlock;
		
		this.setHardness(parentBlock.blockHardness);
		this.setResistance(parentBlock.blockResistance);
		this.setStepSound(parentBlock.stepSound);
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
	public int damageDropped(int metadata) {
		return parentBlock.damageDropped(metadata);
	}

	@Override
	public int getRenderBlockPass() {
		return parentBlock.getRenderBlockPass();
	}

	@Override
	public void getSubBlocks(int id, CreativeTabs tab, List list) {
		parentBlock.getSubBlocks(id, tab, list);
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
