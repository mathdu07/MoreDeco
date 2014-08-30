package fr.mathdu07.moredeco.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import fr.mathdu07.moredeco.MoreDeco;
import fr.mathdu07.moredeco.block.BlockChair;

public class BlockChairRenderer implements ISimpleBlockRenderingHandler
{

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer)
	{
		
		if (!BlockChair.isBlockChair(block))
			throw new IllegalArgumentException("Can't render chair with non-chair block !");
		
		BlockChair chair = (BlockChair) block;
		
		for (int i = 0; i < 6; i++)
		{
			switch (i)
			{
			case 0:
			case 1:
			case 2:
			case 3:
				renderer.setRenderBounds(i % 2 == 0 ? 0.2f : 0.7f, 0f, i / 2 == 0 ? 0.2f : 0.7f,
						i % 2 == 0 ? 0.3f : 0.8f, 0.4f, i / 2 == 0 ? 0.3f : 0.8f);
				break;
			case 4:
				renderer.setRenderBounds(0.2f, 0.4f, 0.2f, 0.8f, 0.5f, 0.8f);
				break;
			case 5:
				renderer.setRenderBounds(0.2f, 0.5f, 0.2f, 0.8f, 1f, 0.3f);
				break;
			}
			
			Tessellator tes = Tessellator.instance;
			GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
			float var7 = 0.0F;
			tes.startDrawingQuads();
			tes.setNormal(0.0F, -1.0F, 0.0F);
			renderer.renderFaceYNeg(block, 0.0D, 0.0D, 0.0D, i >= 4 ? block.getIcon(0, metadata) : chair.getLegIcon(0, metadata));
			tes.draw();
			tes.startDrawingQuads();
			tes.setNormal(0.0F, 1.0F, 0.0F);
			renderer.renderFaceYPos(block, 0.0D, 0.0D, 0.0D, i >= 4 ? block.getIcon(1, metadata) : chair.getLegIcon(1, metadata));
			tes.draw();
			tes.startDrawingQuads();
			tes.setNormal(0.0F, 0.0F, -1.0F);
			tes.addTranslation(0.0F, 0.0F, var7);
			renderer.renderFaceZNeg(block, 0.0D, 0.0D, 0.0D, i >= 4 ? block.getIcon(2, metadata) : chair.getLegIcon(2, metadata));
			tes.addTranslation(0.0F, 0.0F, -var7);
			tes.draw();
			tes.startDrawingQuads();
			tes.setNormal(0.0F, 0.0F, 1.0F);
			tes.addTranslation(0.0F, 0.0F, -var7);
			renderer.renderFaceZPos(block, 0.0D, 0.0D, 0.0D, i >= 4 ? block.getIcon(3, metadata) : chair.getLegIcon(3, metadata));
			tes.addTranslation(0.0F, 0.0F, var7);
			tes.draw();
			tes.startDrawingQuads();
			tes.setNormal(-1.0F, 0.0F, 0.0F);
			tes.addTranslation(var7, 0.0F, 0.0F);
			renderer.renderFaceXNeg(block, 0.0D, 0.0D, 0.0D, i >= 4 ? block.getIcon(4, metadata) : chair.getLegIcon(4, metadata));
			tes.addTranslation(-var7, 0.0F, 0.0F);
			tes.draw();
			tes.startDrawingQuads();
			tes.setNormal(1.0F, 0.0F, 0.0F);
			tes.addTranslation(-var7, 0.0F, 0.0F);
			renderer.renderFaceXPos(block, 0.0D, 0.0D, 0.0D, i >= 4 ? block.getIcon(5, metadata) : chair.getLegIcon(5, metadata));
			tes.addTranslation(var7, 0.0F, 0.0F);
			tes.draw();
			GL11.glTranslatef(0.5F, 0.5F, 0.5F);
		}

	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,
			Block block, int modelId, RenderBlocks renderer)
	{
		if (!BlockChair.isBlockChair(block))
			throw new IllegalArgumentException("Can't render chair with non-chair block !");
		
		BlockChair chair = (BlockChair) block;
		
		renderer.setOverrideBlockTexture(chair.getLegIcon(2, world.getBlockMetadata(x, y, z)));
		for (int i = 0; i < 4; i++)
		{
			renderer.setRenderBounds(i % 2 == 0 ? 0.2f : 0.7f, 0f, i / 2 == 0 ? 0.2f : 0.7f,
					i % 2 == 0 ? 0.3f : 0.8f, 0.4f, i / 2 == 0 ? 0.3f : 0.8f);
			renderer.renderStandardBlock(block, x, y, z);
		}
		renderer.clearOverrideBlockTexture();
		
		renderer.setRenderBounds(0.2f, 0.4f, 0.2f, 0.8f, 0.5f, 0.8f);
		renderer.renderStandardBlock(block, x, y, z);
		
		int direction = BlockChair.getDirection(world, x, y, z);
		
		switch (direction)
		{
		case 0:
			renderer.setRenderBounds(0.7f, 0.5f, 0.2f, 0.8f, 1f, 0.8f);
			renderer.renderStandardBlock(block, x, y, z);
			break;
		case 1:
			renderer.setRenderBounds(0.2f, 0.5f, 0.2f, 0.3f, 1f, 0.8f);
			renderer.renderStandardBlock(block, x, y, z);
			break;
		case 2:
			renderer.setRenderBounds(0.2f, 0.5f, 0.7f, 0.8f, 1f, 0.8f);
			renderer.renderStandardBlock(block, x, y, z);
			break;
		case 3:
			renderer.setRenderBounds(0.2f, 0.5f, 0.2f, 0.8f, 1f, 0.3f);
			renderer.renderStandardBlock(block, x, y, z);
			break;
			
		}
		
		return true;
	}

	@Override
	public boolean shouldRender3DInInventory()
	{
		return true;
	}

	@Override
	public int getRenderId()
	{
		return MoreDeco.proxy.chairRendererId;
	}

}
