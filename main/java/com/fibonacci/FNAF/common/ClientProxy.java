package com.fibonacci.FNAF.common;

import com.fibonacci.FNAF.mob.Bonnie;
import com.fibonacci.FNAF.mob.Chica;
import com.fibonacci.FNAF.mob.Foxie;
import com.fibonacci.FNAF.mob.Freddy;
import com.fibonacci.FNAF.mob.entity.EntityBonnie;
import com.fibonacci.FNAF.mob.entity.EntityChica;
import com.fibonacci.FNAF.mob.entity.EntityFoxie;
import com.fibonacci.FNAF.mob.entity.EntityFreddy;
import com.fibonacci.FNAF.mob.render.RenderBonnie;
import com.fibonacci.FNAF.mob.render.RenderChica;
import com.fibonacci.FNAF.mob.render.RenderFoxie;
import com.fibonacci.FNAF.mob.render.RenderFreddy;
import cpw.mods.fml.client.registry.RenderingRegistry;

/**
 * Created by Fibonacci on 10/27/14.
 */
public class ClientProxy extends CommonProxy{
    public void RenderInformation() {
        RenderingRegistry.registerEntityRenderingHandler(EntityFreddy.class, new RenderFreddy(new Freddy(), 0.3f));
        RenderingRegistry.registerEntityRenderingHandler(EntityBonnie.class, new RenderBonnie(new Bonnie(), 0.3f));
        RenderingRegistry.registerEntityRenderingHandler(EntityChica.class, new RenderChica(new Chica(), 0.3f));
        RenderingRegistry.registerEntityRenderingHandler(EntityFoxie.class, new RenderFoxie(new Foxie(), 0.3f));
    }
}
