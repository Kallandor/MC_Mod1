package com.kallandor.mc_mod1.block;

import com.kallandor.mc_mod1.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;


/**
 * Created by dlwilson on 8/15/2014.
 *
 * blah blah blah
 */
public class blockMCM extends Block

{
    public blockMCM(Material material)
    {
        super(material);
    }

    public blockMCM()
    {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)

        public void registerBlockIcons(IIconRegister iconRegister)
        {
            blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
        }

        protected String getUnwrappedUnlocalizedName(String unlocalizedName)
        {
                return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
}
    }

