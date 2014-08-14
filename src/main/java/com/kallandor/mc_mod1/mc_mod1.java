package com.kallandor.mc_mod1;

import com.kallandor.mc_mod1.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by dlwilson on 8/13/2014.
 */
@Mod(modid="Reference.MOD_ID", name="Reference.MOD_NAME", version="Reference.VERSION")


public class mc_mod1 {

    @Mod.Instance("Reference.MOD_ID")
    public static mc_mod1 instance;

    @SidedProxy(clientSide = "com.kallandor.mc_mod1.proxy.ClientProxy", serverSide = "com.kallandor.mc_mod1.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

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


