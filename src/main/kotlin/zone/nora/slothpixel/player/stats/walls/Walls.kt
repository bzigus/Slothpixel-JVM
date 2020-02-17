package zone.nora.slothpixel.player.stats.walls

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.walls.perks.Perks
import zone.nora.slothpixel.player.stats.walls.starters.AdvancedStarters
import zone.nora.slothpixel.player.stats.walls.starters.BasicStarters

class Walls {
    @SerializedName("assists")
    val assists = 0

    @SerializedName("coins")
    val coins = 0

    @SerializedName("deaths")
    val deaths = 0

    @SerializedName("kills")
    val kills = 0

    @SerializedName("losses")
    val losses = 0

    @SerializedName("wins")
    val wins = 0

    @SerializedName("kd")
    val kd = 0.0

    @SerializedName("win_loss")
    val winLoss = 0.0

    @SerializedName("win_percentage")
    val winPercentage = 0.0

    @SerializedName("monthly_assists")
    val monthlyAssists = 0

    @SerializedName("monthly_kills")
    val monthlyKills = 0

    @SerializedName("monthly_wins")
    val monthlyWins = 0

    @SerializedName("weekly_assists")
    val weeklyAssists = 0

    @SerializedName("weekly_kills")
    val weeklyKills = 0

    @SerializedName("weekly_wins")
    val weeklyWins = 0

    @SerializedName("basic_starters")
    val basicStarters = BasicStarters()

    @SerializedName("advanced_starters")
    val advancedStarters = AdvancedStarters()

    @SerializedName("perks")
    val perks = Perks()
}