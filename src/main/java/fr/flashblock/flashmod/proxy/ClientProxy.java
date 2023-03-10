package fr.flashblock.flashmod.proxy;

import fr.flashblock.flashmod.init.ModEntities;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit() {
        super.preInit();
        ModEntities.registerRenders();
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void postInit() {
        super.postInit();
    }

}
