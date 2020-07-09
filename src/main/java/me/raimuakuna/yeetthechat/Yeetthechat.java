package me.raimuakuna.yeetthechat;

import org.bukkit.plugin.java.JavaPlugin;
import me.raimuakuna.yeetthechat.commands.Yeetchat;


import java.util.Objects;

public final class Yeetthechat extends JavaPlugin {

    @Override
    public void onEnable() {
        Objects.requireNonNull(getCommand("yeetchat")).setExecutor(new Yeetchat());
    }

    @Override
    public void onDisable() {
    }
}
