package com.fussionlabs.minecraft;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = SwordMod.MODID, name = SwordMod.NAME, version = SwordMod.VERSION)
public class SwordMod
{
    public static final String MODID = "sword";
    public static final String NAME = "Daniel's Custom Sword";
    public static final String VERSION = "1.0";

    private static Logger logger;

    // Mod variables
    public static ToolMaterial toolMaterial;
    public static Item sword;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();

        toolMaterial = EnumHelper.addToolMaterial("MATERIAL_NAME", 4, 10, 20.0F, 100.0F, 30);


    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
