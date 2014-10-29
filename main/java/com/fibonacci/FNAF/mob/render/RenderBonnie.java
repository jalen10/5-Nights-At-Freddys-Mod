package com.fibonacci.FNAF.mob.render;

import com.fibonacci.FNAF.mob.Bonnie;
import com.fibonacci.FNAF.mob.entity.EntityBonnie;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Fibonacci on 10/29/14.
 */
public class RenderBonnie extends RenderLiving {

    private static ResourceLocation EntityTexture = new ResourceLocation("FNAF:textures/mobs/Bonnie.png");
    protected Bonnie model;
    public RenderBonnie(ModelBase modelBase, float f) {
        super(modelBase, f);
        model = ((Bonnie)mainModel);
    }

    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return EntityTexture;
    }
    public void renderMob(EntityBonnie entity, double par2, double par4, double par6, float par8, float par9) {
        super.doRender(entity, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
        renderMob((EntityBonnie)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    public void doRender(Entity par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
        renderMob((EntityBonnie)par1EntityLiving, par2, par4, par6, par8, par9);
    }
}

