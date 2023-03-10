package fr.flashblock.flashmod.proxy;

import fr.flashblock.flashmod.init.ModEntities;

public class CommonProxy {

    public void preInit() {
        ModEntities.registerEntities();
    }

    public void init() {

    }

    public void postInit() {

    }

}