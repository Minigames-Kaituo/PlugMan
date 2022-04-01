package com.rylinaux.plugman.event;

import org.bukkit.event.HandlerList;
import org.bukkit.event.server.PluginEvent;
import org.bukkit.plugin.Plugin;

public class PluginLoadEvent extends PluginEvent {
    private String fileName;
    private static final HandlerList handlers = new HandlerList();

    public PluginLoadEvent(final Plugin plugin, String fileName) {
        super(plugin);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}