package zone.nora.slothpixel.player.stats.uhc

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.uhc.gamemodes.UHCGamemodes
import zone.nora.slothpixel.player.stats.uhc.kits.UHCKits
import zone.nora.slothpixel.player.stats.uhc.perks.UHCPerks
import zone.nora.slothpixel.player.stats.uhc.settings.UHCSettings

class UHC {
    @SerializedName("coins")
    val coins = 0

    @SerializedName("deaths")
    val deaths = 0

    @SerializedName("kills")
    val kills = 0

    @SerializedName("kd")
    val kd = 0.0

    @SerializedName("wins")
    val wins = 0

    @SerializedName("win_loss")
    val winLoss = 0.0

    @SerializedName("win_percentage")
    val winPercentage = 0.0

    @SerializedName("score")
    val score = 0

    @SerializedName("heads_eaten")
    val headsEaten = 0

    @SerializedName("weekly_kills")
    val weeklyKills = 0

    @SerializedName("weekly_wins")
    val weeklyWins = 0

    @SerializedName("monthly_kills")
    val monthlyKills = 0

    @SerializedName("monthly_wins")
    val monthlyWins = 0

    @SerializedName("gamemodes")
    val gamemodes = UHCGamemodes()

    @SerializedName("perks")
    val perks = UHCPerks()

    @SerializedName("kits")
    val kits = UHCKits()

    @SerializedName("settings")
    val settings = UHCSettings()

    @SerializedName("saved_stats")
    val savedStats = false

    @SerializedName("packages")
    val packages = ArrayList<String>()
}