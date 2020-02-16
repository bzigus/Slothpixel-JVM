package zone.nora.slothpixel.player.stats.blitz.settings

import com.google.gson.annotations.SerializedName

class Settings {
    @SerializedName("default_kit")
    val defaultKit = ""

    @SerializedName("combatTracker")
    val taunt = false

    @SerializedName("autoarmor")
    val autoArmor = false

    @SerializedName("togglekillcounter")
    val toggleKillCounter = 0
}