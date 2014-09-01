package fr.mathdu07.moredeco.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import fr.mathdu07.moredeco.entity.EntityMountableBlock;
import fr.mathdu07.moredeco.render.BlockChairRenderer;
import fr.mathdu07.moredeco.render.BlockStoolRenderer;
import fr.mathdu07.moredeco.render.BlockTableRenderer;
import fr.mathdu07.moredeco.render.RenderMountableBlock;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenderers() {
		super.registerRenderers();
		
		RenderingRegistry.registerBlockHandler(new BlockTableRenderer());
		RenderingRegistry.registerBlockHandler(new BlockChairRenderer());
		RenderingRegistry.registerBlockHandler(new BlockStoolRenderer());
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMountableBlock.class, new RenderMountableBlock());
	}

}
