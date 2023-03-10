package fr.flashblock.flashmod.init;

import fr.flashblock.flashmod.FlashMod;
import fr.flashblock.flashmod.entity.EntityCastleMonster;
import fr.flashblock.flashmod.renderer.entity.RenderCastleMonster;
import fr.flashblock.flashmod.utils.References;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntities {

    private static int modID = 0;

    public static void registerEntities() {
        registerEntity("castlemonster", EntityCastleMonster.class, modID++, 50, 11437146, 000000);
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
        EntityRegistry.registerModEntity(new ResourceLocation(References.MOD_ID + ":" + name), entity, name, id, FlashMod.instance, range, 1, true, color1, color2);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityCastleMonster.class, new IRenderFactory<EntityCastleMonster>() {
            @Override
            public Render<? super EntityCastleMonster> createRenderFor(RenderManager manager) {
                return new RenderCastleMonster<EntityCastleMonster>(manager);
            }
        });
    }

}