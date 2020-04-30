package zone.nora.slothpixel.player.achievements

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.achievements.games.Games

class Achievements {
    @SerializedName("achievement_points")
    val achievementPoints = 0

    @SerializedName("completed_tiered")
    val completedTiered = 0

    @SerializedName("completed_one_time")
    val completedOneTime = 0

    @SerializedName("completed_total")
    val completedTotal = 0

    @SerializedName("games")
    val games = Games()

    @SerializedName("tracked")
    val tracked = ArrayList<String>()

    @SerializedName("rewards")
    val rewards = HashMap<String, Long>()
}