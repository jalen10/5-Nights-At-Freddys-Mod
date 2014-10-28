package com.fibonacci.FNAF.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Fibonacci on 10/27/14.
 */
@Mod(modid = "Five Nights At Freddies", name = "Five Nights At Freddies", version = "1.2")

public class FNAF {

    @SidedProxy(clientSide = "com.fibonacci.FNAF.common.ClientProxy", serverSide = "com.fibonacci.FNAF.common.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance("MiscCraft")
    public static FNAF instance;



    public FNAF(){





    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {

        proxy.RenderInformation();







    }
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){



    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {





    }

}
