package zone.nora.slothpixel.player.stats.blitz

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.blitz.equipped.BlitzEquipped
import zone.nora.slothpixel.player.stats.blitz.kits.BlitzKits
import zone.nora.slothpixel.player.stats.blitz.kits.BlitzKitsStats
import zone.nora.slothpixel.player.stats.blitz.settings.BlitzSettings
import zone.nora.slothpixel.player.stats.blitz.votes.BlitzVotes

class Blitz {
    @SerializedName("coins")
    val coins = 0

    @SerializedName("deaths")
    val deaths = 0

    @SerializedName("kills")
    val kills = 0

    @SerializedName("k_d")
    val kD = 0.0

    @SerializedName("wins")
    val wins = 0

    @SerializedName("team_wins")
    val teamWins = 0

    @SerializedName("win_loss")
    val winLoss = 0.0

    @SerializedName("win_percentage")
    val winPercentage = 0.0

    @SerializedName("weekly_kills")
    val weeklyKills = 0

    @SerializedName("monthly_kills")
    val monthlyKills = 0

    @SerializedName("rambo_wins")
    val ramboWins = 0

    @SerializedName("random_wins")
    val randomWins = 0

    @SerializedName("damage_taken")
    val damageTaken = 0

    @SerializedName("taunt_kills")
    val tauntKills = 0

    @SerializedName("potions_drunk")
    val potionsDrunk = 0

    @SerializedName("damage")
    val damage = 0

    @SerializedName("mobs_spawned")
    val mobsSpawned = 0

    @SerializedName("time_played")
    val timePlayed = 0

    @SerializedName("arrows_hit")
    val arrowsHit = 0

    @SerializedName("games_played")
    val gamesPlayed = 0

    @SerializedName("potions_thrown")
    val potionsThrown = 0

    @SerializedName("arrows_fired")
    val arrowsFired = 0

    @SerializedName("blitz_uses")
    val blitzUses = 0

    @SerializedName("chests_opened")
    val chestsOpened = 0

    @SerializedName("kits_levels")
    val kitsLevels = BlitzKits()

    @SerializedName("kits_stats")
    val kitsStats = BlitzKitsStats()

    @SerializedName("equipped")
    val equipped = BlitzEquipped()

    @SerializedName("settings")
    val settings = BlitzSettings()

    @SerializedName("votes")
    val votes = BlitzVotes()

    @SerializedName("inventories")
    val inventories = HashMap<String, ArrayList<String>>()

    @SerializedName("packages")
    val packages = ArrayList<String>()
}