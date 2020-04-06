package zone.nora.slothpixel.constants.achievements.impl.tiered

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.constants.achievements.impl.Achievement
import zone.nora.slothpixel.constants.achievements.impl.tiered.tiers.AchievementTier

class TieredAchievement : Achievement() {
    @SerializedName("tiers")
    val tiers = ArrayList<AchievementTier>()
}