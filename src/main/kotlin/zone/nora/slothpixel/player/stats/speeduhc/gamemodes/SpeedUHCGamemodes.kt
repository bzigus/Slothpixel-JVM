package zone.nora.slothpixel.player.stats.speeduhc.gamemodes

import com.google.gson.annotations.SerializedName

class SpeedUHCGamemodes {
    @SerializedName("solo")
    val solo = SpeedUHCGamemode()

    @SerializedName("teams")
    val teams = SpeedUHCGamemode()

    @SerializedName("normal")
    val normal = SpeedUHCGameType()

    @SerializedName("insane")
    val insane = SpeedUHCGameType()
}