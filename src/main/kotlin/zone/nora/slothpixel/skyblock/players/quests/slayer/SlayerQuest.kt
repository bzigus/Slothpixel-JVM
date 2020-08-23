package zone.nora.slothpixel.skyblock.players.quests.slayer

import com.google.gson.annotations.SerializedName

class SlayerQuest {
    @SerializedName("type")
    val type = ""

    @SerializedName("tier")
    val tier = 0

    @SerializedName("start_timestamp")
    val startTimestamp = 0L

    @SerializedName("completion_state")
    val completionState = 0

    @SerializedName("combat_xp")
    val combatXP = 0

    @SerializedName("recent_mob_kills")
    val recentMobKills = ArrayList<RecentMobKill>()

    @SerializedName("last_killed_mob_island")
    val lastKilledMobIsland = ""

    @SerializedName("xp_on_last_follower_spawn")
    val xpOnLastFollowerSpawn = 0

    @SerializedName("spawn_timestamp")
    val spawnTimestamp = 0L

    @SerializedName("kill_timestamp")
    val killTimestamp = 0L
}