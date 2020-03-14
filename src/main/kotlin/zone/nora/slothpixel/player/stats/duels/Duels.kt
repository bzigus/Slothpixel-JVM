package zone.nora.slothpixel.player.stats.duels

import com.google.gson.annotations.SerializedName

/**
 * This class will be incomplete until Duels stats are made more stable in slothpixel/core.
 * Due to a shitty PR, a lot of stats would return inconsistent values (ie string array sometimes, integer other times).
 * Sorry for the inconvenience. If you absolutely need Duels stats you can use commit bf5a4fe6e0 from Jitpack.
 */
class Duels {
    @SerializedName("packages")
    val packages = ArrayList<String>()

    @SerializedName("amount_healed")
    val amountHealed = 0

    @SerializedName("best_overall_winstreak")
    val bestOverallWinstreak = 0

    @SerializedName("bow_hits")
    val bowHits = 0

    @SerializedName("bow_shots")
    val bowShots = 0

    @SerializedName("coins")
    val coins = 0

    @SerializedName("current_winstreak")
    val currentWinstreak = 0

    @SerializedName("damage_dealt")
    val damageDealt = 0

    @SerializedName("deaths")
    val deaths = 0

    @SerializedName("losses")
    val losses = 0

    @SerializedName("wins")
    val wins = 0
}