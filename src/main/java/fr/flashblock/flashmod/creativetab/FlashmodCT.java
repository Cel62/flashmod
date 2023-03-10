package fr.flashblock.flashmod.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FlashmodCT extends CreativeTabs {

    public FlashmodCT() {
        super("flashmod");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Blocks.COMMAND_BLOCK);
    }
}
