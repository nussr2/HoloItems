package xyz.holocons.mc.holoitemsrevamp.ability;

import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.inventory.ItemStack;

public interface ProjectileLaunch{

    public void run(ProjectileLaunchEvent event, ItemStack itemStack);
}
