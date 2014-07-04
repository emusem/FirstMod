package com.emusem.firstmod.block;

import com.emusem.firstmod.FirstMod;
import com.emusem.firstmod.reference.Names;
import com.emusem.firstmod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockChelsea extends BlockBase
{
    @SideOnly(Side.CLIENT)
    protected IIcon blockIcon;

    public BlockChelsea()
    {
        super(Material.ground);
        setBlockName(Names.BLOCK_CHELSEA);
    }
}
