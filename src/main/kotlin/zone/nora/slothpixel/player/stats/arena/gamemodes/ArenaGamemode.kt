package zone.nora.slothpixel.player.stats.arena.gamemodes

import com.google.gson.annotations.SerializedName

class ArenaGamemode {
    @SerializedName("damage")
    val damage = 0

    @SerializedName("kills")
    val kills = 0

    @SerializedName("deaths")
    val deaths = 0

    @SerializedName("losses")
    val losses = 0

    @SerializedName("wins")
    val wins = 0

    @SerializedName("win_streaks")
    val winStreaks = 0

    @SerializedName("games")
    val games = 0

    @SerializedName("healed")
    val healed = 0

    @SerializedName("kd")
    val kd = 0.0

    @SerializedName("win_loss")
    val winLoss = 0.0

    @SerializedName("win_percentage")
    val winPercentage = 0.0
}