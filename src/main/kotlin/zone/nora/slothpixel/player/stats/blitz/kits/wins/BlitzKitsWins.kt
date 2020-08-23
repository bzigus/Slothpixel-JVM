package zone.nora.slothpixel.player.stats.blitz.kits.wins

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.blitz.kits.BlitzKits

class BlitzKitsWins {
    @SerializedName("solo")
    val solo = BlitzKits()

    @SerializedName("teams")
    val teams = BlitzKits()
}