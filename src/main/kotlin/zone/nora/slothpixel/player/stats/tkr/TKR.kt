package zone.nora.slothpixel.player.stats.tkr

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.tkr.maps.Maps
import zone.nora.slothpixel.player.stats.tkr.trophies.Trophies

class TKR {
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
    val bananaRatio = 0

    @SerializedName("trophies")
    val trophies: Trophies = Trophies()

    @SerializedName("maps")
    val maps: Maps = Maps()
}