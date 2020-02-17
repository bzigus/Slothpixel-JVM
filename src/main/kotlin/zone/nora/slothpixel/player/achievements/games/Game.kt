package zone.nora.slothpixel.player.achievements.games

import com.google.gson.annotations.SerializedName

class Game {
    @SerializedName("one_time")
    val oneTime = ArrayList<String>()

    @SerializedName("tiered")
    val tiered = HashMap<String, Int>()

    @SerializedName("completed")
    val completed = 0

    @SerializedName("completed_tiered")
    val completedTiered = 0

    @SerializedName("completed_one_time")
    val completedOneTime = 0

    @SerializedName("points_total")
    val pointsTotal = 0

    @SerializedName("points_tiered")
    val pointsTiered = 0

    @SerializedName("points_one_time")
    val pointsOneTime = 0
}