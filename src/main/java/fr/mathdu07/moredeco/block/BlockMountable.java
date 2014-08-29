package fr.mathdu07.moredeco.block;

import java.util.Iterator;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import fr.mathdu07.moredeco.entity.EntityMountableBlock;

public abstract class BlockMountable extends BlockChildren
{

	public BlockMountable(int id, Block parentBlock) {
		super(id, parentBlock);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int face, float par7, float par8, float par9)
	{
		tryToMount(world, x, y, z, player);
		
		return true;
	}
	
	public abstract void tryToMount(World world, int x, int y, int z, EntityPlayer player);
	
	public void tryToMount(World world, int x, int y, int z, EntityPlayer player, float xOffset, float yOffset, float zOffset)
	{
		if (!world.isRemote)
		{
			List list = world.getEntitiesWithinAABB(EntityMountableBlock.class, AxisAlignedBB.getAABBPool().getAABB(x, y, z, x + 1D, y + 1D, z + 1D));
			Iterator<EntityMountableBlock> iterator = list.iterator();
			
			while (iterator.hasNext())
			{
				EntityMountableBlock entitymountableblock = iterator.next();				
				entitymountableblock.setDead();
	        }

	        EntityMountableBlock entitymountableblock = new EntityMountableBlock(world, player, x, y, z, xOffset, yOffset, zOffset);
	        world.spawnEntityInWorld(entitymountableblock);
	        player.mountEntity(entitymountableblock);
	    }
	}


}
