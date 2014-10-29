package com.fibonacci.FNAF.common;

import com.fibonacci.FNAF.block.InvisibleBlock;
import com.fibonacci.FNAF.mob.entity.EntityBonnie;
import com.fibonacci.FNAF.mob.entity.EntityChica;
import com.fibonacci.FNAF.mob.entity.EntityFoxie;
import com.fibonacci.FNAF.mob.entity.EntityFreddy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.util.EnumHelper;

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

    public static Item.ToolMaterial mic = EnumHelper.addToolMaterial("Microphone", 2, 1000, 5, 20, 20);

    public static Block InvisibleBlock = new InvisibleBlock(Material.rock).setBlockName("InvisibleBlock");
    public static Item Microphone = new com.fibonacci.FNAF.item.Microphone(mic).setCreativeTab(CreativeTabs.tabCombat).setUnlocalizedName("Microphone").setTextureName("FNAF:Microphone");

    public FNAF(){
        GameRegistry.registerBlock(InvisibleBlock, "InvisibleBlock");
        GameRegistry.registerItem(Microphone, "Microphone");
        //Freddy
        EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(EntityFreddy.class, "Freddy", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.addSpawn(EntityFreddy.class, 20, 5, 15, EnumCreatureType.creature,BiomeGenBase.plains);
        EntityRegistry.findGlobalUniqueEntityId();
        registerEntityEgg(EntityFreddy.class, 0x9900FF, 0xFFFFFF);
        //Foxie
        EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(EntityFoxie.class, "Foxie", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.addSpawn(EntityFoxie.class, 20, 5, 15, EnumCreatureType.creature,BiomeGenBase.plains);
        EntityRegistry.findGlobalUniqueEntityId();
        registerEntityEgg(EntityFoxie.class, 0x9900FF, 0xFFFFFF);
        //Bonnie
        EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(EntityBonnie.class, "Bonnie", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.addSpawn(EntityBonnie.class, 20, 5, 15, EnumCreatureType.creature,BiomeGenBase.plains);
        EntityRegistry.findGlobalUniqueEntityId();
        registerEntityEgg(EntityBonnie.class, 0x9900FF, 0xFFFFFF);
        //Chica
        EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(EntityChica.class, "Chica", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.addSpawn(EntityChica.class, 20, 5, 15, EnumCreatureType.creature,BiomeGenBase.plains);
        EntityRegistry.findGlobalUniqueEntityId();
        registerEntityEgg(EntityChica.class, 0x9900FF, 0xFFFFFF);


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
