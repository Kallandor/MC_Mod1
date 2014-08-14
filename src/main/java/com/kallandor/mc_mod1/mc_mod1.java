package com.kallandor.mc_mod1;

import com.kallandor.mc_mod1.configuration.ConfigurationHandler;
import com.kallandor.mc_mod1.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import com.kallandor.mc_mod1.reference.Reference;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by dlwilson on 8/13/2014.
 */
@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version = Reference.VERSION)


public class mc_mod1 {

    @Mod.Instance("mc_mod1")
    public static mc_mod1 instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLPostInitializationEvent event)
    {

    }

}


