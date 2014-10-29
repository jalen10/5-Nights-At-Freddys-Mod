package com.fibonacci.FNAF.common;

import com.fibonacci.FNAF.mob.entity.EntityFreddy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

/**
 * Created by Fibonacci on 10/27/14.
 */
@Mod(modid = "Five Nights At Freddies", name = "Five Nights At Freddies", version = "1.2")

public class FNAF {

    @SidedProxy(clientSide = "com.fibonacci.FNAF.common.ClientProxy", serverSide = "com.fibonacci.FNAF.common.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance("MiscCraft")
    public static FNAF instance;

    private static int startEntityId = 300;


    public FNAF(){



        EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(EntityFreddy.class, "Freddy", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.addSpawn(EntityFreddy.class, 20, 5, 15, EnumCreatureType.creature,BiomeGenBase.getBiomeGenArray() );
        EntityRegistry.findGlobalUniqueEntityId();
        registerEntityEgg(EntityFreddy.class, 0x9900FF, 0xFFFFFF);


    }
    private void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor) {
        int id = getUniqueEntityId();
        EntityList.IDtoClassMapping.put(id, entity);
        EntityList.entityEggs.put(id, new EntityList.EntityEggInfo(id, primaryColor, secondaryColor));


    }
    public static int getUniqueEntityId() {
        do {
            startEntityId++;
        }
        while(EntityList.getStringFromID(startEntityId) != null);
        return startEntityId++;
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
