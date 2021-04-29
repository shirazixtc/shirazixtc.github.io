package de.sandmc.bedwars.Utils;

import org.bukkit.configuration.file.YamlConfiguration;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class FileUtils {

    public static File folder = new File("plugins/Bedwars/");
    public static File file = new File("plugins/Bedwars/config.yml");
    public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);


    public static void safeFiles() {
        try {
            cfg.save(file);
        } catch (IOException e) {
        }
    }

    public static void setupFiles() {
        if (!(folder.exists()))
            folder.mkdir();

        if (!(file.exists())) {
            try {
                file.createNewFile();
            } catch (IOException e) {
            }
        }

        cfg.addDefault("Messages.Prefix", "&8[&bBedWars&8] &7");
        cfg.options().copyDefaults(true);
        safeFiles();
    }

    public static String getConfigString(String path) {
        return cfg.getString(path).replace("&", "§");
    }
}
