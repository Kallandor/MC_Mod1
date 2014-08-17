package com.kallandor.mc_mod1.init;

import com.kallandor.mc_mod1.item.ItemMapleLeaf;
import com.kallandor.mc_mod1.item.ItemsMCM;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by dlwilson on 8/14/2014.
 */
public class Moditems
{
    public static final ItemsMCM mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
