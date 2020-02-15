package zone.nora.slothpixel.player

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.links.Links
import zone.nora.slothpixel.player.rewards.Rewards
import zone.nora.slothpixel.player.stats.Stats

class Player {
    @SerializedName("uuid")
    val uuid = ""

    @SerializedName("username")
    val username = ""

    @SerializedName("online")
    val online = false

    @SerializedName("rank")
    val rank = ""

    @SerializedName("rank_plus_color")
    val rankPlusColor = ""

    @SerializedName("rank_formatted")
    val rankFormatted = ""

    @SerializedName("prefix")
    val prefix = ""

    @SerializedName("karma")
    val karma = 0

    @SerializedName("exp")
    val exp = 0

    @SerializedName("level")
    val level = 0

    @SerializedName("achievement_points")
    val achievementPoints = 0

    @SerializedName("quests_completed")
    val questsCompleted = 0

    @SerializedName("total_kills")
    val totalKills = 0

    @SerializedName("total_wins")
    val totalWins = 0

    @SerializedName("total_coins")
    val totalCoins = 0

    @SerializedName("mc_version")
    val mcVersion = ""

    @SerializedName("first_login")
    val firstLogin = ""

    @SerializedName("last_login")
    val lastLogin = ""

    @SerializedName("last_game")
    val lastGame = ""

    @SerializedName("language")
    val language = ""

    @SerializedName("gifts_sent")
    val giftsSent = 0

    @SerializedName("gifts_received")
    val giftsReceived = 0

    @SerializedName("is_contributor")
    val isContributor = false

    @SerializedName("rewards")
    lateinit var rewards: Rewards

    @SerializedName("links")
    lateinit var links: Links

    @SerializedName("stats")
    lateinit var stats: Stats
}