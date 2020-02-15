package zone.nora.slothpixel.player.stats.games.blitz.kits.wins

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.games.blitz.kits.Kits

class Wins {
    @SerializedName("solo")
    val solo = Kits()

    @SerializedName("teams")
    val teams = Kits()
}