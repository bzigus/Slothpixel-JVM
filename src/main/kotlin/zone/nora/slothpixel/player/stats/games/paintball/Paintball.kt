package zone.nora.slothpixel.player.stats.games.paintball

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.games.cvc.perks.Perks
import zone.nora.slothpixel.player.stats.games.paintball.votes.Votes

class Paintball {
    @SerializedName("coins")
    val coins = 0

    @SerializedName("kills")
    val kills = 0

    @SerializedName("deaths")
    val deaths = 0

    @SerializedName("kd")
    val kd = 0

    @SerializedName("wins")
    val wins = 0

    @SerializedName("weekly_kills")
    val weeklyKills = 0

    @SerializedName("monthly_kills")
    val monthlyKills = 0

    @SerializedName("killstreaks")
    val killstreaks = 0

    @SerializedName("shots_fired")
    val shotsFired = 0

    @SerializedName("force_field_time")
    val forceFieldTime = 0

    @SerializedName("perks")
    val perks = Perks()

    @SerializedName("votes")
    val votes = Votes()
}