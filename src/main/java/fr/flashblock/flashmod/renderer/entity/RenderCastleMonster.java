package fr.flashblock.flashmod.renderer.entity;

import fr.flashblock.flashmod.entity.EntityCastleMonster;
import fr.flashblock.flashmod.entity.model.ModelCastleMonster;
import fr.flashblock.flashmod.utils.References;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderCastleMonster<T extends EntityCastleMonster> extends RenderLiving<EntityCastleMonster> {

    private static final ResourceLocation MONSTER_CASTLE_TEXTURE = new ResourceLocation(References.MOD_ID,"textures/entity/monster_castle.png");

    public RenderCastleMonster(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelCastleMonster(), 1.0f);
    }

    @Override
    protected float getDeathMaxRotation(EntityCastleMonster entityLivingBaseIn) {
        return 90.0F;
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityCastleMonster entity) {
        return MONSTER_CASTLE_TEXTURE;
    }

}
