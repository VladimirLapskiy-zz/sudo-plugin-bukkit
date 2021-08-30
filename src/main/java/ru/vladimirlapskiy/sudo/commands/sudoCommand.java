package ru.vladimirlapskiy.sudo.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class sudoCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length < 1)
            return false;

		String nickname = args[0];
		Player sudoPlayer = Bukkit.getPlayerExact(nickname);

		if (sudoPlayer == null) {
			sendMessage(sender, "Player not is online.");
			return false;
		}

		StringBuilder sudoMsg = new StringBuilder();
		for (int i = 1; i < args.length; i++) {
			sudoMsg.append(args[i]).append(" ");
		}

		sudoPlayer.chat(sudoMsg.toString());

        return true;
    }

	private void sendMessage(CommandSender sender, String message) {
		StringBuilder msg = new StringBuilder("[sudo] ").append(message);
		sender.sendMessage(msg.toString());
	}
}
