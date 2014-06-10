package net.oc74ne.refinerycraft.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.oc74ne.refinerycraft.main.RefineryCraft;

/**
 * Created by Chris from 10/06/2014.
 */
public class RCBlock extends Block {

    public RCBlock(Material material) {
        super(material);

        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(3F);
        this.setResistance(5F);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 2);

    }


    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(RefineryCraft.modid + ":" + this.getUnlocalizedName().substring(5));
    }

}
