// Date: 10/29/2014 4:15:22 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.fibonacci.FNAF.mob;

import com.fibonacci.FNAF.mob.entity.EntityFoxie;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Foxie extends ModelBase
{
    //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer earPartL;
    ModelRenderer earPartR;
    ModelRenderer earL;
    ModelRenderer earR;

    public Foxie()
    {
        textureWidth = 128;
        textureHeight = 64;

        head = new ModelRenderer(this, 0, 0);
        head.addBox(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0F, 0F, 0F);
        head.setTextureSize(128, 64);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        body = new ModelRenderer(this, 16, 16);
        body.addBox(-4F, 0F, -2F, 8, 12, 4);
        body.setRotationPoint(0F, 0F, 0F);
        body.setTextureSize(128, 64);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        rightarm = new ModelRenderer(this, 40, 16);
        rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
        rightarm.setRotationPoint(-5F, 2F, 0F);
        rightarm.setTextureSize(128, 64);
        rightarm.mirror = true;
        setRotation(rightarm, 0F, 0F, 0F);
        leftarm = new ModelRenderer(this, 40, 16);
        leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
        leftarm.setRotationPoint(5F, 2F, 0F);
        leftarm.setTextureSize(128, 64);
        leftarm.mirror = true;
        setRotation(leftarm, 0F, 0F, 0F);
        rightleg = new ModelRenderer(this, 0, 16);
        rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        rightleg.setRotationPoint(-2F, 12F, 0F);
        rightleg.setTextureSize(128, 64);
        rightleg.mirror = true;
        setRotation(rightleg, 0F, 0F, 0F);
        leftleg = new ModelRenderer(this, 0, 16);
        leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        leftleg.setRotationPoint(2F, 12F, 0F);
        leftleg.setTextureSize(128, 64);
        leftleg.mirror = true;
        setRotation(leftleg, 0F, 0F, 0F);
        earPartL = new ModelRenderer(this, 0, 0);
        earPartL.addBox(0F, 0F, 0F, 2, 1, 1);
        earPartL.setRotationPoint(-5F, -7F, 0F);
        earPartL.setTextureSize(128, 64);
        earPartL.mirror = true;
        setRotation(earPartL, 0F, 0F, 0.6320364F);
        earPartR = new ModelRenderer(this, 0, 0);
        earPartR.addBox(0F, 0F, 0F, 2, 1, 1);
        earPartR.setRotationPoint(3F, -6F, 0F);
        earPartR.setTextureSize(128, 64);
        earPartR.mirror = true;
        setRotation(earPartR, 0F, 0F, -0.6320361F);
        earL = new ModelRenderer(this, 0, 0);
        earL.addBox(0F, 0F, 0F, 3, 5, 1);
        earL.setRotationPoint(-8F, -10F, 0F);
        earL.setTextureSize(128, 64);
        earL.mirror = true;
        setRotation(earL, 0F, 0F, -0.4089647F);
        earR = new ModelRenderer(this, 0, 0);
        earR.addBox(0F, 0F, 0F, 3, 5, 1);
        earR.setRotationPoint(5F, -11F, 0F);
        earR.setTextureSize(128, 64);
        earR.mirror = true;
        setRotation(earR, 0F, 0F, 0.4089656F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        head.render(f5);
        body.render(f5);
        rightarm.render(f5);
        leftarm.render(f5);
        rightleg.render(f5);
        leftleg.render(f5);
        earPartL.render(f5);
        earPartR.render(f5);
        earL.render(f5);
        earR.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, EntityFoxie entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}

