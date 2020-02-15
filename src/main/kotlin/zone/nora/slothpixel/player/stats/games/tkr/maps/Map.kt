package zone.nora.slothpixel.player.stats.games.tkr.maps

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.games.tkr.trophies.Trophies

class Map {
    @SerializedName("games")
    val games = 0

    @SerializedName("win_ratio")
    val winRatio = 0

    @SerializedName("trophies")
    val trophies: Trophies = Trophies()
}