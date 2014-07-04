package com.emusem.firstmod.init;

import com.emusem.firstmod.block.BlockBase;
import com.emusem.firstmod.block.BlockChelsea;
import com.emusem.firstmod.block.BlockEbony;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final BlockBase blockChelsea = new BlockChelsea();
    public static final BlockBase blockEbony = new BlockEbony();

    public static void init()
    {
        GameRegistry.registerBlock(blockChelsea, blockChelsea.getUnlocalizedName());
        GameRegistry.registerBlock(blockEbony, blockEbony.getUnlocalizedName());
    }
}
