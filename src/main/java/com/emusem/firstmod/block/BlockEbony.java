package com.emusem.firstmod.block;

import com.emusem.firstmod.reference.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

public class BlockEbony extends BlockBase
{
    @SideOnly(Side.CLIENT)
    protected IIcon blockIcon;

    public BlockEbony()
    {
        super(Material.ground);
        setBlockName(Names.BLOCK_EBONY);
    }
}
