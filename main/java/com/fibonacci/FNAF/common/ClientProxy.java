package com.fibonacci.FNAF.common;

import com.fibonacci.FNAF.mob.Freddy;
import com.fibonacci.FNAF.mob.entity.EntityFreddy;
import com.fibonacci.FNAF.mob.render.RenderFreddy;
import cpw.mods.fml.client.registry.RenderingRegistry;

/**
 * Created by Fibonacci on 10/27/14.
 */
public class ClientProxy extends CommonProxy{
    public void RenderInformation() {
        RenderingRegistry.registerEntityRenderingHandler(EntityFreddy.class, new RenderFreddy(new Freddy(), 0.3f));
    }
}
