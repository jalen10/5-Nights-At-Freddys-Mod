package com.fibonacci.FNAF.mob.render;

import com.fibonacci.FNAF.mob.Foxie;
import com.fibonacci.FNAF.mob.entity.EntityFoxie;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Fibonacci on 10/29/14.
 */
public class RenderFoxie extends RenderLiving {

    private static ResourceLocation EntityTexture = new ResourceLocation("FNAF:textures/mobs/Foxie.png");
    protected Foxie  model;
    public RenderFoxie (ModelBase modelBase, float f) {
        super(modelBase, f);
        model = ((Foxie)mainModel);
    }

    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return EntityTexture;
    }
    public void renderMob(EntityFoxie  entity, double par2, double par4, double par6, float par8, float par9) {
        super.doRender(entity, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
        renderMob((EntityFoxie)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    public void doRender(Entity par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
        renderMob((EntityFoxie)par1EntityLiving, par2, par4, par6, par8, par9);
    }
}

