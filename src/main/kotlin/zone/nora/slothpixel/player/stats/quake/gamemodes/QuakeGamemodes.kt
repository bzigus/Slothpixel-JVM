package zone.nora.slothpixel.player.stats.quake.gamemodes

import com.google.gson.annotations.SerializedName

class QuakeGamemodes {
    @SerializedName("solo")
    val solo = QuakeGamemode()

    @SerializedName("teams")
    val teams = QuakeGamemode()
}