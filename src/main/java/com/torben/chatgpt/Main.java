package com.torben.chatgpt;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        saveDefaultConfig();
        getCommand("talk").setExecutor(new TalkCommand(this));
        Bukkit.getPluginManager().registerEvents(new TalkCommand(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
