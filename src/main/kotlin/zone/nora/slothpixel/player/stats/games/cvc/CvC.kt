package zone.nora.slothpixel.player.stats.games.cvc

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.games.cvc.cosmetics.Cosmetics
import zone.nora.slothpixel.player.stats.games.cvc.mapwins.MapWins
import zone.nora.slothpixel.player.stats.games.cvc.perks.Perks

class CvC {
    @SerializedName("coins")
    val coins = 0

    @SerializedName("deaths")
    val deaths = 0

    @SerializedName("kills")
    val kills = 0

    @SerializedName("kd")
    val kd = 0

    @SerializedName("wins")
    val wins = 0

    @SerializedName("cop_kills")
    val copKills = 0

    @SerializedName("criminal_kills")
    val criminalKills = 0

    @SerializedName("weekly_kills")
    val weeklyKills = 0

    @SerializedName("monthly_kills")
    val monthlyKills = 0

    @SerializedName("bombs_planted")
    val bombsPlanted = 0

    @SerializedName("bombs_defused")
    val bombsDefused = 0

    @SerializedName("grenade_kills")
    val grenadeKills = 0

    @SerializedName("headshot_kills")
    val headshotKills = 0

    @SerializedName("round_wins")
    val roundWins = 0

    @SerializedName("shots_fired")
    val shotsFired = 0

    @SerializedName("map_wins")
    val mapWins = MapWins()

    @SerializedName("perks")
    val perks = Perks()

    @SerializedName("selected_cosmetics")
    val selectedCosmetics = Cosmetics()
}