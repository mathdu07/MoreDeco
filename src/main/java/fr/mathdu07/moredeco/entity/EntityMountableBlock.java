package fr.mathdu07.moredeco.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityEnderEye;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityMountableBlock extends Entity
{
	public int blockX, blockY, blockZ;
	public Block block;
	private EntityPlayer player;
	
	public EntityMountableBlock(World world)
	{
		super(world);
		
		setSize(0f, 0f);
	}
	
	public EntityMountableBlock(World world, EntityPlayer player, int x, int y, int z, 
			float xOffset, float yOffset, float zOffset) {
		super(world);
		
		this.blockX = x;
		this.blockY = y;
		this.blockZ = z;
		this.player = player;
		this.block = world.getBlock(x, y, z);
		
		this.noClip = true;
		this.preventEntitySpawning = true;
		setSize(0f, 0f);
		setPosition(x + xOffset, y + yOffset, z + zOffset);
	}

	@Override
	protected void entityInit()
	{
		
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound)
	{
		
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound)
	{
		
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
		
		if (riddenByEntity == null || riddenByEntity.isDead	|| worldObj.getBlock(blockX, blockY, blockZ) != block)
		{
			if (player != null)
				player.mountEntity(null);
			
			setDead();
		}
	}

}
