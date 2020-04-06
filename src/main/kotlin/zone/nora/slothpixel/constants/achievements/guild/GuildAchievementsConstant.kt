package zone.nora.slothpixel.constants.achievements.guild

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.constants.HypixelConstant
import zone.nora.slothpixel.constants.achievements.impl.onetime.OneTimeAchievement
import zone.nora.slothpixel.constants.achievements.impl.tiered.TieredAchievement

class GuildAchievementsConstant : HypixelConstant() {
    @SerializedName("one_time")
    val oneTime = HashMap<String, OneTimeAchievement>()

    @SerializedName("tiered")
    val tiered = HashMap<String, TieredAchievement>()
}