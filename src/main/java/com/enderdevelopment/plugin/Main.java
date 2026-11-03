package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("spawnbear").setExecutor(new BearCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}