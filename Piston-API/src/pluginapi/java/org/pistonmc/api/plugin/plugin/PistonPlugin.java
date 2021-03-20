package org.pistonmc.api.plugin.plugin;

public abstract class PistonPlugin {
    private PluginManager pluginManager;

    public void onLoad() {}

    public void onEnable() {}

    public void onDisable() {}

    protected PluginManager getPluginManager() {
        return pluginManager;
    }
}