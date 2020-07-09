package me.raimuakuna.yeetthechat.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Yeetchat implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("yeetchat.clear")){
            sender.sendMessage("You can't run this command!");
            return true;
        }

        for (Player player: Bukkit.getOnlinePlayers()) {
            for (int i = 0; i < 101; i++) {
                player.sendMessage(" ");
            }
            player.sendMessage("The chat has been obliterated by " + sender.getName() + ". What was said is no more!");
        }

        return true;
    }
}
