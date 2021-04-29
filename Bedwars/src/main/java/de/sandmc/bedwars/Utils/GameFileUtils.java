package de.sandmc.bedwars.Utils;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class GameFileUtils {

    public static File folder = new File("plugins/Bedwars/");
    public static File file = new File("plugins/Bedwars/data.yml");
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

        cfg.addDefault("Maps", new ArrayList<>());
        cfg.options().copyDefaults(true);
        safeFiles();
    }

}
