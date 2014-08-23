package fr.mathdu07.moredeco.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import fr.mathdu07.moredeco.render.BlockTableRenderer;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenderers() {
		super.registerRenderers();
		
		RenderingRegistry.registerBlockHandler(new BlockTableRenderer());
	}

}
