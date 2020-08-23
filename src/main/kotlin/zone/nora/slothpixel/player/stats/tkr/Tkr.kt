package zone.nora.slothpixel.player.stats.tkr

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.tkr.maps.TkrMaps
import zone.nora.slothpixel.player.stats.tkr.trophies.TkrTrophies

class Tkr {
    @SerializedName("coins")
    val coins = 0

    @SerializedName("coin_pickups")
    val coinPickups = 0

    @SerializedName("laps")
    val laps = 0

    @SerializedName("wins")
    val wins = 0

    @SerializedName("box_pickups")
    val boxPickups = 0

    @SerializedName("bananas_sent")
    val bananasSent = 0

    @SerializedName("bananas_received")
    val bananasReceived = 0

    @SerializedName("banana_ratio")
    val bananaRatio = 0.0

    @SerializedName("trophies")
    val trophies: TkrTrophies = TkrTrophies()

    @SerializedName("maps")
    val maps: TkrMaps = TkrMaps()
}