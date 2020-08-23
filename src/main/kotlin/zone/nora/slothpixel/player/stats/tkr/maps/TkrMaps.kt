package zone.nora.slothpixel.player.stats.tkr.maps

import com.google.gson.annotations.SerializedName

class TkrMaps {
    @SerializedName("retro")
    val retro: TkrMap = TkrMap()

    @SerializedName("hypixelgp")
    val hypixelgp: TkrMap = TkrMap()

    @SerializedName("junglerush")
    val junglerush: TkrMap = TkrMap()

    @SerializedName("olympus")
    val olympus: TkrMap = TkrMap()

    @SerializedName("canyon")
    val canyon: TkrMap = TkrMap()

    fun asList(): List<TkrMap> {
        return listOf(canyon, olympus, junglerush, hypixelgp, retro)
    }
}