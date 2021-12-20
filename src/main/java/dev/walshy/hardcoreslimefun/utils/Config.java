package dev.walshy.hardcoreslimefun.utils;

import lombok.Getter;
import org.bukkit.configuration.file.FileConfiguration;

import javax.annotation.Nonnull;

@Getter
public class Config {

    public static final Config INSTANCE = new Config();

    // on-death.reset-random-research
    private boolean resetResearchOnDeath;
    // on-death.chance-to-reset-all-researches
    private double resetAllResearchesOnDeath;

    // on-research.chance-of-failure
    private double researchFailChance;

    // android.chance-to-malfunction
    private double malfunctionChance;
    // android.malfunction-duration
    private long malfunctionDuration;

    ////////////////////////
    // Messages
    ////////////////////////
    // lost-random-research
    private String lostRandomResearch;
    // lost-all-research
    private String lostAllResearch;
    // research-failed
    private String researchFailed;
    // android-malfunctioned
    private String androidMalfunctioned;

    public void load(@Nonnull FileConfiguration config) {
        resetResearchOnDeath = config.getBoolean("on-death.reset-random-research", true);
        resetAllResearchesOnDeath = getPercent(config, "on-death.chance-to-reset-all-researches", 5);

        researchFailChance = getPercent(config, "on-research.chance-of-failure", 10);

        malfunctionChance = getPercent(config, "android.chance-to-malfunction", 10);
        malfunctionDuration = config.getLong("android.malfunction-duration", 30);

        ////////////////////////
        // Messages
        ////////////////////////
        lostRandomResearch = config.getString("messages.lost-random-research", "&c你丢失了一个已解锁的研究!");
        lostAllResearch = config.getString("messages.lost-all-research", "&c你丢失了所有研究!");
        researchFailed = config.getString("messages.research-failed", "&c研究失败!");
        androidMalfunctioned = config.getString("messages.android-malfunctioned",
            "&c你的机器人出了点故障! 它将在一段时间后恢复工作.");
    }

    private double getPercent(@Nonnull FileConfiguration config, @Nonnull String path, double defaultValue) {
        final double d = config.getDouble(path, defaultValue);
        if (d > 100) {
            return 100;
        } else if (d < 0) {
            return 0;
        } else {
            return d;
        }
    }
}
