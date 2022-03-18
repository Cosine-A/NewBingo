package kr.cosinea.bingo;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;
import java.io.File;

public final class Bingo extends JavaPlugin {

    private FileConfiguration config;
    private File file = new File("plugins/Bingo/config.yml");

    @Override
    public void onEnable() {
        getLogger().info("섬 빙고 플러그인 활성화");
        getCommand("빙고").setExecutor(new Command());
        getServer().getPluginManager().registerEvents(new Event(), this);
        loadConfig();
    }

    @Override
    public void onDisable() {
        getLogger().info("섬 빙고 플러그인 비활성화");
    }
    private void loadConfig() {
        config = YamlConfiguration.loadConfiguration(file);
        try {
            if (!file.exists()) {
                config.set("단어수", 0);
                config.set("문제." + 0, "타자 칠 단어");
                config.save(file);
            }
            config.load(file);
        } catch (Exception localException) {
            localException.printStackTrace();
        }
    }
    private static @Nonnull
    Bingo instance;

    public void onLoad() {
        instance = this;
    }

    public static Bingo getInstance() {
        return instance;
    }
}
