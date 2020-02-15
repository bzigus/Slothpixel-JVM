package zone.nora.slothpixel.player.rewards

import com.google.gson.annotations.SerializedName
import lombok.Getter

@Getter
class Rewards {
    @SerializedName("streak_current")
    val streakCurrent = 0

    @SerializedName("streak_best")
    val streakBest = 0

    @SerializedName("claimed")
    val claimed = 0

    @SerializedName("claimed_daily")
    val claimedDaily = 0

    @SerializedName("tokens")
    val tokens = 0
}