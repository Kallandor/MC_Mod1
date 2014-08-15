package com.kallandor.mc_mod1.init;

import com.kallandor.mc_mod1.block.BlockFlag;
import com.kallandor.mc_mod1.block.blockMCM;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by dlwilson on 8/15/2014.
 */
public class ModBlocks
{
    public static final blockMCM flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
