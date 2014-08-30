package fr.mathdu07.moredeco;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import fr.mathdu07.moredeco.entity.EntityMountableBlock;
import fr.mathdu07.moredeco.proxy.CommonProxy;
import fr.mathdu07.moredeco.tabs.MoreDecoChairTab;
import fr.mathdu07.moredeco.tabs.MoreDecoTableTab;

@Mod(modid = MoreDeco.MODID, version = MoreDeco.VERSION, useMetadata = true, acceptedMinecraftVersions = "[1.6.2,1.6.4]")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MoreDeco
{
    public static final String MODID = "moredeco";
    public static final String NAME = "More Deco";
    public static final String VERSION = "0.2-SNAPSHOT";
    
    @Instance(MoreDeco.MODID)
    private static MoreDeco instance;
    
    @SidedProxy(clientSide = "fr.mathdu07.moredeco.proxy.ClientProxy", 
    		serverSide = "fr.mathdu07.moredeco.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    public static final CreativeTabs tabTables, tabChairs;
    public static final MoreDecoBlocks blocks;
    public static final MoreDecoRecipes recipes;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	proxy.registerRenderers();
    	
    	blocks.init();
    	
    	EntityRegistry.registerModEntity(EntityMountableBlock.class, "entity_mountable_block", 1, this, 5, 3, false);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("Initializing " + NAME + " version : " + VERSION);
        recipes.init();
    }
 
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
 
    }
    
    public static MoreDeco getInstance()
    {
    	return instance;
    }
    
    static
    {
    	tabTables = new MoreDecoTableTab();
    	tabChairs = new MoreDecoChairTab();
    	blocks = new MoreDecoBlocks();
    	recipes = new MoreDecoRecipes();
    }
}
