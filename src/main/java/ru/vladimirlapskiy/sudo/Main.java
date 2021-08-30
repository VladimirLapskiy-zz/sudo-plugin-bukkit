package ru.vladimirlapskiy.sudo;

import org.bukkit.plugin.java.JavaPlugin;

import ru.vladimirlapskiy.sudo.commands.sudoCommand;

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
