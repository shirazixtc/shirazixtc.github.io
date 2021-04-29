package de.sandmc.bedwars;

import de.sandmc.bedwars.Utils.Utils;
import org.bukkit.plugin.java.JavaPlugin;

public final class Bedwars extends JavaPlugin {

    @Override
    public void onEnable() {
       Utils.sendConsole("§Plugin gestartet");

    }

    @Override
    public void onDisable() {
        Utils.sendConsole("§Plugin gestopt");
    }
}
