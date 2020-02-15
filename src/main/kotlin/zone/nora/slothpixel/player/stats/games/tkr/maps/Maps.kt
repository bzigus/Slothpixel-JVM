package zone.nora.slothpixel.player.stats.games.tkr.maps

import com.google.gson.annotations.SerializedName

class Maps {
    @SerializedName("retro")
    val retro: Map = Map()

    @SerializedName("hypixelgp")
    val hypixelgp: Map = Map()

    @SerializedName("junglerush")
    val junglerush: Map = Map()

    @SerializedName("olympus")
    val olympus: Map = Map()

    @SerializedName("canyon")
    val canyon: Map = Map()

    fun asList(): List<Map> {
        return listOf(canyon, olympus, junglerush, hypixelgp, retro)
    }
}