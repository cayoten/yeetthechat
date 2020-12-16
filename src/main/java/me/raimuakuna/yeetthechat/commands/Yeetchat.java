package me.raimuakuna.yeetthechat.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.TextComponent;
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
            if (!player.hasPermission("yeetchat.bypass")) {
                for (int i = 0; i < 101; i++) {
                    player.sendMessage(" ");
                }

                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&6Server&8] &cThe chat has been obliterated by " + sender.getName() + "&c. What was said is no more!\n"));

            }

            if (player.hasPermission("yeetchat.notify")) {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&aThe chat was cleared by " + sender.getName() + "."));
            }
        }

        return true;
    }
}
