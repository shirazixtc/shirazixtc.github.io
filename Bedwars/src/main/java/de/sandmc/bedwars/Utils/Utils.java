package de.sandmc.bedwars.Utils;

import org.bukkit.Bukkit;

public class Utils {

    public static String prefix;

    public static void sendConsole(String msg) {
        Bukkit.getConsoleSender().sendMessage(prefix + msg);
    }
}
