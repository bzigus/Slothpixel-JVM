package zone.nora.slothpixel.constants.achievements.modes

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.constants.achievements.impl.onetime.OneTimeAchievement

class Mode {
    @SerializedName("one_time")
    val oneTime = HashMap<String, OneTimeAchievement>()

    @SerializedName("tiered")
    val tiered = HashMap<String, OneTimeAchievement>()

    @SerializedName("total_points")
    val totalPoints = 0

    @SerializedName("total_legacy_points")
    val totalLegacyPoints = 0

    @SerializedName("total_one_time")
    val totalOneTime = 0

    @SerializedName("total_tiered")
    val totalTiered = 0

    @SerializedName("total")
    val total = 0

    @SerializedName("total_points_one_time")
    val totalPointsOneTime = 0

    @SerializedName("total_points_tiered")
    val totalPointsTiered = 0
}