package plugin.services

import org.bukkit.configuration.file.FileConfiguration

class Config {
    private val plugin = Instance.plugin
    private val config: FileConfiguration = plugin.config

    fun load() {
        config.addDefault("database.host", "127.0.0.1")
        config.addDefault("database.user", "root")
        config.addDefault("database.pass", "mypassword")
        config.addDefault("database.name", "databasename")
        save()
    }

    private fun save() {
        config.options().copyDefaults(true)
        plugin.saveConfig()
    }
}