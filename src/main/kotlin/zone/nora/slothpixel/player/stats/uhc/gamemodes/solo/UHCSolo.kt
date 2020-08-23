package zone.nora.slothpixel.player.stats.uhc.gamemodes.solo

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.uhc.gamemodes.redvblue.UHCRedVBlue

class UHCSolo : UHCRedVBlue() {
    @SerializedName("win_percentage")
    val winPercentage = 0.0

    @SerializedName("monthly_kills")
    val monthlyKills = 0

    @SerializedName("monthly_wins")
    val monthlyWins = 0
}