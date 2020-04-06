package zone.nora.slothpixel.constants.achievements.impl.onetime

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.constants.achievements.impl.Achievement

class OneTimeAchievement : Achievement() {
    @SerializedName("points")
    val point = 5
}