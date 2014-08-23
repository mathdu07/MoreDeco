package fr.mathdu07.moredeco.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import fr.mathdu07.moredeco.MoreDeco;
import fr.mathdu07.moredeco.block.BlockTable;

public class BlockTableRenderer implements ISimpleBlockRenderingHandler {

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer)
	{
		if (!(block instanceof BlockTable))
			throw new IllegalArgumentException("Can't render table with non-table block !");
		
		BlockTable table = (BlockTable) block;
		
		for (int i = 0; i < 5; i++)
		{
			switch (i)
			{
			case 0:
				renderer.setRenderBounds(0f, 0.9f, 0f, 1f, 1f, 1f);
				break;
			case 1:
				renderer.setRenderBounds(0, 0, 0, 0.1, 0.9, 0.1);
				break;
			case 2:
				renderer.setRenderBounds(0, 0, 0.9, 0.1, 0.9, 1);
				break;
			case 3:
				renderer.setRenderBounds(0.9, 0, 0, 1, 0.9, 0.1);
				break;
			case 4:
				renderer.setRenderBounds(0.9, 0, 0.9, 1, 0.9, 1);
				break;
			}
			
			Tessellator tes = Tessellator.instance;
			GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
			float var7 = 0.0F;
			tes.startDrawingQuads();
			tes.setNormal(0.0F, -1.0F, 0.0F);
			renderer.renderFaceYNeg(block, 0.0D, 0.0D, 0.0D, i == 0 ? block.getIcon(0, metadata) : table.getLegIcon(0, metadata));
			tes.draw();
			tes.startDrawingQuads();
			tes.setNormal(0.0F, 1.0F, 0.0F);
			renderer.renderFaceYPos(block, 0.0D, 0.0D, 0.0D, i == 0 ? block.getIcon(1, metadata) : table.getLegIcon(1, metadata));
			tes.draw();
			tes.startDrawingQuads();
			tes.setNormal(0.0F, 0.0F, -1.0F);
			tes.addTranslation(0.0F, 0.0F, var7);
			renderer.renderFaceZNeg(block, 0.0D, 0.0D, 0.0D, i == 0 ? block.getIcon(2, metadata) : table.getLegIcon(2, metadata));
			tes.addTranslation(0.0F, 0.0F, -var7);
			tes.draw();
			tes.startDrawingQuads();
			tes.setNormal(0.0F, 0.0F, 1.0F);
			tes.addTranslation(0.0F, 0.0F, -var7);
			renderer.renderFaceZPos(block, 0.0D, 0.0D, 0.0D, i == 0 ? block.getIcon(3, metadata) : table.getLegIcon(3, metadata));
			tes.addTranslation(0.0F, 0.0F, var7);
			tes.draw();
			tes.startDrawingQuads();
			tes.setNormal(-1.0F, 0.0F, 0.0F);
			tes.addTranslation(var7, 0.0F, 0.0F);
			renderer.renderFaceXNeg(block, 0.0D, 0.0D, 0.0D, i == 0 ? block.getIcon(4, metadata) : table.getLegIcon(4, metadata));
			tes.addTranslation(-var7, 0.0F, 0.0F);
			tes.draw();
			tes.startDrawingQuads();
			tes.setNormal(1.0F, 0.0F, 0.0F);
			tes.addTranslation(-var7, 0.0F, 0.0F);
			renderer.renderFaceXPos(block, 0.0D, 0.0D, 0.0D, i == 0 ? block.getIcon(5, metadata) : table.getLegIcon(5, metadata));
			tes.addTranslation(var7, 0.0F, 0.0F);
			tes.draw();
			GL11.glTranslatef(0.5F, 0.5F, 0.5F);
		}
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,
			Block block, int modelId, RenderBlocks renderer)
	{
		if (!(block instanceof BlockTable))
			throw new IllegalArgumentException("Can't render table with non-table block !");
		
		BlockTable table = (BlockTable) block;
		
		renderer.setRenderBounds(0f, 0.9, 0f, 1f, 1f, 1f);
		renderer.renderStandardBlock(table, x, y, z);
		
		renderer.setOverrideBlockTexture(table.getLegIcon(2, world.getBlockMetadata(x, y, z)));
		
		if (!table.isBlockTable(world, x - 1, y, z) && !table.isBlockTable(world, x, y, z - 1))
		{
			renderer.setRenderBounds(0f, 0f, 0f, 0.1f, 0.9f, 0.1f);
			renderer.renderStandardBlock(table, x, y, z);
		}
		
		if (!table.isBlockTable(world, x + 1, y, z) && !table.isBlockTable(world, x, y, z - 1))
		{
			renderer.setRenderBounds(0.9f, 0f, 0f, 1f, 0.9f, 0.1f);
			renderer.renderStandardBlock(table, x, y, z);
		}
		
		if (!table.isBlockTable(world, x + 1, y, z) && !table.isBlockTable(world, x, y, z + 1))
		{
			renderer.setRenderBounds(0.9f, 0f, 0.9f, 1f, 0.9f, 1f);
			renderer.renderStandardBlock(table, x, y, z);
		}
		
		if (!table.isBlockTable(world, x - 1, y, z) && !table.isBlockTable(world, x, y, z + 1))
		{
			renderer.setRenderBounds(0f, 0f, 0.9f, 0.1f, 0.9f, 1f);
			renderer.renderStandardBlock(table, x, y, z);
		}
		
		renderer.clearOverrideBlockTexture();
		
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
		return MoreDeco.proxy.tableRendererId;
	}

}
