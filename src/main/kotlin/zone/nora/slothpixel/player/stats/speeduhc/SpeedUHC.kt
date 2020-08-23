package zone.nora.slothpixel.player.stats.speeduhc

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.speeduhc.drops.SpeedUHCDrops
import zone.nora.slothpixel.player.stats.speeduhc.gamemodes.SpeedUHCGamemodes
import zone.nora.slothpixel.player.stats.speeduhc.mastery.SpeedUHCMasteries
import zone.nora.slothpixel.player.stats.speeduhc.votes.SpeedUHCVotes

class SpeedUHC {
    @SerializedName("arrows_hit")
    val arrowsHit = 0

    @SerializedName("arrows_shot")
    val arrowsShot = 0

    @SerializedName("assists")
    val assists = 0

    @SerializedName("blocks_broken")
    val blocksBroken = 0

    @SerializedName("blocks_placed")
    val blocksPlaced = 0

    @SerializedName("coins")
    val coins = 0

    @SerializedName("deaths")
    val deaths = 0

    @SerializedName("games")
    val games = 0

    @SerializedName("items_enchanted")
    val itemsEnchanted = 0

    @SerializedName("kills")
    val kills = 0

    @SerializedName("kd")
    val kd = 0.0

    @SerializedName("weekly_kills")
    val weeklyKills = 0

    @SerializedName("monthly_kills")
    val monthlyKills = 0

    @SerializedName("killstreak")
    val killstreak = 0

    @SerializedName("losses")
    val losses = 0

    @SerializedName("win_loss")
    val winLoss = 0

    @SerializedName("win_percentage")
    val winPercentage = 0.0

    @SerializedName("quits")
    val quits = 0

    @SerializedName("salt")
    val salt = 0

    @SerializedName("tears")
    val tears = 0

    @SerializedName("tears_gathered")
    val tearsGathered = 0

    @SerializedName("tear_well_uses")
    val tearWellUses = 0

    @SerializedName("wins")
    val wins = 0

    @SerializedName("winstreak")
    val winstreak = 0

    @SerializedName("survived_players")
    val survivedPlayers = 0

    @SerializedName("enderpearls_thrown")
    val enderpearlsThrown = 0

    @SerializedName("extra_wheels")
    val extraWheels = 0

    @SerializedName("rares_found")
    val raresFound = 0

    @SerializedName("commons_found")
    val commonsFound = 0

    @SerializedName("legendaries_found")
    val legendariesFound = 0

    @SerializedName("highest_killstreak")
    val highestKillstreak = 0

    @SerializedName("highest_winstreak")
    val highestWinstreak = 0

    @SerializedName("mastery")
    val mastery = SpeedUHCMasteries()

    @SerializedName("gamemodes")
    val gamemodes = SpeedUHCGamemodes()

    @SerializedName("drops")
    val drops = SpeedUHCDrops()

    @SerializedName("votes")
    val votes = SpeedUHCVotes()

    @SerializedName("packages")
    val packages = ArrayList<String>()
}