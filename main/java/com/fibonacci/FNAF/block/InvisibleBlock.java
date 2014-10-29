package com.fibonacci.FNAF.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Fibonacci on 10/28/14.
 */
public class InvisibleBlock extends Block{
    public InvisibleBlock(Material m) {
        super(m);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    public boolean isOpaqueCube()
    {
        return false;
    }
    public int getRenderType()
    {
        return -1;
    }
}
