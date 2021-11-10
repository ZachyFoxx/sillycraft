package com.dumbdogdiner.myawesomekotlinplugin

import org.bukkit.plugin.java.JavaPlugin

@kr.entree.spigradle.annotations.PluginMain
class Plugin : JavaPlugin() {
    override fun onEnable() {
        logger.info("Enabled!")
    }

    override fun onDisable() {
        logger.info("Disabled!")
    }
}
