package zone.nora.slothpixel.player.recentgames

import com.google.gson.annotations.SerializedName

class RecentGame {
    @SerializedName("date")
    val date: Long = 0

    @SerializedName("gameType")
    val gameType = ""

    @SerializedName("mode")
    val mode = ""

    @SerializedName("map")
    val map = ""
}