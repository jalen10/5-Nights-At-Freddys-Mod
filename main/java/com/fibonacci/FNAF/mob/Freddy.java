package com.fibonacci.FNAF.mob;

/**
 * Created by Fibonacci on 10/28/14.
 */

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import com.fibonacci.FNAF.mob.entity.EntityFreddy;


public class Freddy extends ModelBase
{
    //fields
    ModelRenderer armR;
    ModelRenderer earR;
    ModelRenderer earL;
    ModelRenderer head;
    ModelRenderer hatTop;
    ModelRenderer hatBottom;
    ModelRenderer sholderR;
    ModelRenderer sholderL;
    ModelRenderer armL;
    ModelRenderer body;
    ModelRenderer rightleg;
    ModelRenderer leftleg;

    public Freddy()
    {
        textureWidth = 128;
        textureHeight = 128;

        armR = new ModelRenderer(this, 0, 0);
        armR.addBox(0F, 0F, 0F, 3, 9, 3);
        armR.setRotationPoint(5F, 3F, -2F);
        armR.setTextureSize(128, 128);
        armR.mirror = true;
        setRotation(armR, 0F, 0F, 0F);
        earR = new ModelRenderer(this, 0, 0);
        earR.addBox(0F, 0F, 0F, 3, 3, 1);
        earR.setRotationPoint(5F, -7F, -1F);
        earR.setTextureSize(128, 128);
        earR.mirror = true;
        setRotation(earR, 0F, 0F, 0.7679449F);
        earL = new ModelRenderer(this, 0, 0);
        earL.addBox(0F, 0F, 0F, 3, 3, 1);
        earL.setRotationPoint(-7F, -5F, -1F);
        earL.setTextureSize(128, 128);
        earL.mirror = true;
        setRotation(earL, 0F, 0F, -0.7679449F);
        head = new ModelRenderer(this, 0, 0);
        head.addBox(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0F, 0F, 0F);
        head.setTextureSize(128, 128);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        hatTop = new ModelRenderer(this, 0, 0);
        hatTop.addBox(0F, 0F, 0F, 2, 3, 2);
        hatTop.setRotationPoint(-1F, -12F, -1F);
        hatTop.setTextureSize(128, 128);
        hatTop.mirror = true;
        setRotation(hatTop, 0F, 0F, 0F);
        hatBottom = new ModelRenderer(this, 0, 0);
        hatBottom.addBox(0F, 0F, 0F, 4, 1, 4);
        hatBottom.setRotationPoint(-2F, -9F, -2F);
        hatBottom.setTextureSize(128, 128);
        hatBottom.mirror = true;
        setRotation(hatBottom, 0F, 0F, 0F);
        sholderR = new ModelRenderer(this, 0, 0);
        sholderR.addBox(0F, 0F, 0F, 3, 2, 2);
        sholderR.setRotationPoint(4F, 1F, -1F);
        sholderR.setTextureSize(128, 128);
        sholderR.mirror = true;
        setRotation(sholderR, 0F, 0F, 0F);
        sholderL = new ModelRenderer(this, 0, 0);
        sholderL.addBox(0F, 0F, 0F, 3, 2, 2);
        sholderL.setRotationPoint(-7F, 1F, -1F);
        sholderL.setTextureSize(128, 128);
        sholderL.mirror = true;
        setRotation(sholderL, 0F, 0F, 0F);
        armL = new ModelRenderer(this, 0, 0);
        armL.addBox(0F, 0F, 0F, 3, 9, 3);
        armL.setRotationPoint(-8F, 3F, -2F);
        armL.setTextureSize(128, 128);
        armL.mirror = true;
        setRotation(armL, 0F, 0F, 0F);
        body = new ModelRenderer(this, 16, 16);
        body.addBox(-4F, 0F, -2F, 8, 12, 4);
        body.setRotationPoint(0F, 0F, 0F);
        body.setTextureSize(128, 128);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
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
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        armR.render(f5);
        earR.render(f5);
        earL.render(f5);
        head.render(f5);
        hatTop.render(f5);
        hatBottom.render(f5);
        sholderR.render(f5);
        sholderL.render(f5);
        armL.render(f5);
        body.render(f5);
        rightleg.render(f5);
        leftleg.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, EntityFreddy entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}

