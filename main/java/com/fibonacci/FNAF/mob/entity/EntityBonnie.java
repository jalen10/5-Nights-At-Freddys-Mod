package com.fibonacci.FNAF.mob.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

/**
 * Created by Fibonacci on 10/28/14.
 */
public class EntityBonnie extends EntityMob{
    public EntityBonnie(World world) {
        super(world);
        this.setSize(.5F, 2.1F);
    }
    protected String getLivingSound() {
        return "mob.ghast.moan";
    }

    protected String getDeathSound() {
        return "mob.ghast.moan";
    }
    protected String getHurtSound() {
        return "mob.ghast.moan";
    }
    protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_)
    {
        this.playSound("mob.ghast.moan", 0.15f, 1.0f);
    }



    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.63000000417232513D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7.0D);

    }





//    protected Item getDropItem()
//    {
//        return FNAF.Microphone;
//    }
//    protected void addRandomArmor()
//    {
////        this.setCurrentItemOrArmor(0, new ItemStack(MiscCraft.RubySword));
////        this.setCurrentItemOrArmor(0, new ItemStack(MiscCraft.RubyChestplate));
//
//    }
//    protected void dropRareDrop(int par1)
//    {
//        this.dropItem(FNAF.Microphone, 1);
//    }
}

