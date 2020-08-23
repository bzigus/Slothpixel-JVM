package zone.nora.slothpixel.player.stats.vampirez

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.vampirez.human.HumanStats
import zone.nora.slothpixel.player.stats.vampirez.perks.VampireZPerks
import zone.nora.slothpixel.player.stats.vampirez.vampire.VampireStats
import zone.nora.slothpixel.player.stats.vampirez.votes.VampireZVotes

class VampireZ {
    @SerializedName("coins")
    val coins = 0

    @SerializedName("gold_bought")
    val goldBought = 0

    @SerializedName("zombie_kills")
    val zombieKills = 0
    
    @SerializedName("updated_stats")
    val updatedStats = false

    @SerializedName("human_stats")
    val humanStats = HumanStats()

    @SerializedName("vampire_stats")
    val vampireStats = VampireStats()

    @SerializedName("perks")
    val perks = VampireZPerks()

    @SerializedName("votes")
    val votes = VampireZVotes()

    @SerializedName("packages")
    val packages = ArrayList<String>()
}