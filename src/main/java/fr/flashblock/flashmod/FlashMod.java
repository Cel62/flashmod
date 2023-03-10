package fr.flashblock.flashmod;

import fr.flashblock.flashmod.creativetab.FlashmodCT;
import fr.flashblock.flashmod.proxy.CommonProxy;
import fr.flashblock.flashmod.utils.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = References.MOD_ID, name = References.NAME, version = References.VERSION, acceptedMinecraftVersions = "[1.12.2]")
public class FlashMod {

    @Mod.Instance(References.MOD_ID)
    public static FlashMod instance;

    @SidedProxy(clientSide = References.ClientProxy, serverSide = References.ServerProxy)
    public static CommonProxy proxy;

    public static final CreativeTabs modTab = new FlashmodCT();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }


    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }

}