package com.julflips.nerv_printer.interfaces;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerInput;

public interface IClientPlayerInteractionManager {
    void setBlockBreakingCooldown(int TickThrottler);

    float getCurrentBreakingProgress();
    void handleContainerInput(int containerId, int slotId, int button, ContainerInput actionType, Player player);
}
