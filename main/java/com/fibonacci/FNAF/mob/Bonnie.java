// Date: 10/29/2014 3:53:06 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.fibonacci.FNAF.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Bonnie extends ModelBase
{
    //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer ear1L;
    ModelRenderer ear1R;
    ModelRenderer ear2L;
    ModelRenderer ear2R;

    public Bonnie()
    {
        textureWidth = 128;
        textureHeight = 128;

        head = new ModelRenderer(this, 0, 0);
        head.addBox(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0F, 0F, 0F);
        head.setTextureSize(128, 128);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        body = new ModelRenderer(this, 16, 16);
        body.addBox(-4F, 0F, -2F, 8, 12, 4);
        body.setRotationPoint(0F, 0F, 0F);
        body.setTextureSize(128, 128);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        rightarm = new ModelRenderer(this, 40, 16);
        rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
        rightarm.setRotationPoint(-5F, 2F, 0F);
        rightarm.setTextureSize(128, 128);
        rightarm.mirror = true;
        setRotation(rightarm, 0F, 0F, 0F);
        leftarm = new ModelRenderer(this, 40, 16);
        leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
        leftarm.setRotationPoint(5F, 2F, 0F);
        leftarm.setTextureSize(128, 128);
        leftarm.mirror = true;
        setRotation(leftarm, 0F, 0F, 0F);
        rightleg = new ModelRenderer(this, 0, 16);
        rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        rightleg.setRotationPoint(-2F, 12F, 0F);
        rightleg.setTextureSize(128, 128);
        rightleg.mirror = true;
        setRotation(rightleg, 0F, 0F, 0F);
        leftleg = new ModelRenderer(this, 0, 16);
        leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        leftleg.setRotationPoint(2F, 12F, 0F);
        leftleg.setTextureSize(128, 128);
        leftleg.mirror = true;
        setRotation(leftleg, 0F, 0F, 0F);
        ear1L = new ModelRenderer(this, 0, 0);
        ear1L.addBox(0F, 0F, 0F, 2, 5, 2);
        ear1L.setRotationPoint(-3F, -13F, 0F);
        ear1L.setTextureSize(128, 128);
        ear1L.mirror = true;
        setRotation(ear1L, 0F, 0F, 0F);
        ear1R = new ModelRenderer(this, 0, 0);
        ear1R.addBox(0F, 0F, 0F, 2, 5, 2);
        ear1R.setRotationPoint(1F, -13F, 0F);
        ear1R.setTextureSize(128, 128);
        ear1R.mirror = true;
        setRotation(ear1R, 0F, 0F, 0F);
        ear2L = new ModelRenderer(this, 0, 0);
        ear2L.addBox(0F, 0F, 0F, 2, 5, 2);
        ear2L.setRotationPoint(-3F, -17F, -2F);
        ear2L.setTextureSize(128, 128);
        ear2L.mirror = true;
        setRotation(ear2L, 0.4461433F, 0F, 0F);
        ear2R = new ModelRenderer(this, 0, 0);
        ear2R.addBox(0F, 0F, 0F, 2, 5, 2);
        ear2R.setRotationPoint(1F, -17F, -2F);
        ear2R.setTextureSize(128, 128);
        ear2R.mirror = true;
        setRotation(ear2R, 0.4461433F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5);
        head.render(f5);
        body.render(f5);
        rightarm.render(f5);
        leftarm.render(f5);
        rightleg.render(f5);
        leftleg.render(f5);
        ear1L.render(f5);
        ear1R.render(f5);
        ear2L.render(f5);
        ear2R.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float par1, float par2, float f2, float f3, float f4, float f5)
    {
        this.rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
        this.leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
        this.rightleg.rotateAngleY = 0.0F;
        this.leftleg.rotateAngleY = 0.0F;
    }

}
