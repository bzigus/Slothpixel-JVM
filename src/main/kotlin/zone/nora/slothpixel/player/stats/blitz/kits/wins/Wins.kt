package zone.nora.slothpixel.player.stats.blitz.kits.wins

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.blitz.kits.Kits

class Wins {
    @SerializedName("solo")
    val solo = Kits()

    @SerializedName("teams")
    val teams = Kits()
}