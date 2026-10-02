package com.julflips.nerv_printer.utils;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.tags.ItemTags;

import java.util.Set;

public final class ToolUtils {

    public static ItemStack getBestTool(Set<ItemStack> tools, BlockState targetBlock) {
        // 1 is the default mining multiplier
        float bestScore = 1;
        ItemStack bestStack = null;
        for (ItemStack tool : tools) {
            if (tool.getDestroySpeed(targetBlock) > bestScore) {
                bestScore = tool.getDestroySpeed(targetBlock);
                bestStack = tool;
            }
        }
        // Default to Pickaxe if no tool increases the mining speed
        if (bestStack == null) {
            for (ItemStack tool : tools) {
                if (tool.is(h -> h.is(ItemTags.PICKAXES))) {
                    return tool;
                }
            }
        }
        return bestStack;
    }

    public static boolean isTool(ItemStack itemStack) {
        if (itemStack.is(h -> h.is(ItemTags.PICKAXES))
            || itemStack.is(h -> h.is(ItemTags.AXES))
            || itemStack.is(h -> h.is(ItemTags.SHOVELS))
            || itemStack.is(h -> h.is(ItemTags.HOES))
            || itemStack.getItem() instanceof ShearsItem) {
            return true;
        }
        return false;
    }
}
