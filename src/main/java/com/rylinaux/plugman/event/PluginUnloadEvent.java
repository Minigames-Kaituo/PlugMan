package com.rylinaux.plugman.event;


import org.bukkit.event.HandlerList;
import org.bukkit.event.server.PluginEvent;
import org.bukkit.plugin.Plugin;

public class PluginUnloadEvent extends PluginEvent {
    private static final HandlerList handlers = new HandlerList();

    public PluginUnloadEvent(final Plugin plugin) {
        super(plugin);
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}