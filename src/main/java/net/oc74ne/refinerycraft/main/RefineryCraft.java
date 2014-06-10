package net.oc74ne.refinerycraft.main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

import net.oc74ne.refinerycraft.block.RCBlock;

import static net.minecraft.block.material.Material.*;

/**
 * Created by Chris from 10/06/2014.
 */

@Mod(modid = RefineryCraft.modid, version = RefineryCraft.version, name = "Refinery Craft")

public class RefineryCraft {

    public static final String modid = "refinerycraft";
    public static final String version = "0.0.1";

    public static Block copper_ore;
    public static Block tin_ore;
    public static Block lead_ore;
    public static Block silver_ore;
    public static Block aluminium_ore;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preEvent){

        copper_ore =  new RCBlock(rock).setBlockName("copper_ore");
        tin_ore = new RCBlock(rock).setBlockName("tin_ore");
        lead_ore = new RCBlock(rock).setBlockName("lead_ore");
        silver_ore = new RCBlock(rock).setBlockName("silver_ore");
        aluminium_ore = new RCBlock(rock).setBlockName("aluminium_ore");


        GameRegistry.registerBlock(copper_ore, "Copper Ore");
        GameRegistry.registerBlock(tin_ore, "Tin Ore");
        GameRegistry.registerBlock(lead_ore, "Lead Ore");
        GameRegistry.registerBlock(silver_ore, "Silver Ore");
        GameRegistry.registerBlock(aluminium_ore, "Aluminium Ore");


    }


    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postEvent){

    }


}
