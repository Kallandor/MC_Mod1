package com.kallandor.mc_mod1;

import com.kallandor.mc_mod1.Handler.ConfigurationHandler;
import com.kallandor.mc_mod1.init.Moditems;
import com.kallandor.mc_mod1.proxy.IProxy;
import com.kallandor.mc_mod1.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import com.kallandor.mc_mod1.reference.Reference;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by dlwilson on 8/13/2014.
 */
@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version = "1.7.10-1.0", guiFactory = Reference.GUI_FACTORY_CLASS)

public class mc_mod1 {

    @Mod.Instance(Reference.MOD_ID)
    public static mc_mod1 instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization Complete!");

        Moditems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }

}


