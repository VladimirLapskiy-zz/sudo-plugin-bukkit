package ru.vladimirlapskiy.sudo;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getLogger().info("Hello!");
        this.getCommand("sudo").setExecutor(new sudoCommand());
    }

    @Override
    public void onDisable()
    {
        getLogger().info("Bye-bye");
    }
}
