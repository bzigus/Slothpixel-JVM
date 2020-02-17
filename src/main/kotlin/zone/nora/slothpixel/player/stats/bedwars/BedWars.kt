package zone.nora.slothpixel.player.stats.bedwars

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.bedwars.boxes.Boxes
import zone.nora.slothpixel.player.stats.bedwars.gamemodes.Gamemodes
import zone.nora.slothpixel.player.stats.bedwars.resources.ResourcesCollected

class BedWars {
    @SerializedName("coins")
    val coins = 0

    @SerializedName("exp")
    val exp = 0

    @SerializedName("level")
    val level = 0

    @SerializedName("wins")
    val wins = 0

    @SerializedName("losses")
    val losses = 0

    @SerializedName("games_played")
    val gamesPlayed = 0

    @SerializedName("kills")
    val kills = 0

    @SerializedName("deaths")
    val deaths = 0

    @SerializedName("k_d")
    val kD = 0.0

    @SerializedName("w_l")
    val wL = 0.0

    @SerializedName("beds_broken")
    val bedsBroken = 0

    @SerializedName("beds_lost")
    val bedsLost = 0

    @SerializedName("bed_ratio")
    val bedRatio = 0

    @SerializedName("final_kills")
    val finalKills = 0

    @SerializedName("final_deaths")
    val finalDeaths = 0

    @SerializedName("final_k_d")
    val finalKD = 0.0

    @SerializedName("void_kills")
    val voidKills = 0

    @SerializedName("void_deaths")
    val voidDeaths = 0

    @SerializedName("winstreak")
    val winstreak = 0

    @SerializedName("boxes")
    val boxes = Boxes()

    @SerializedName("resources_collected")
    val resourcesCollected = ResourcesCollected()

    @SerializedName("gamemodes")
    val gamemodes = Gamemodes()

    @SerializedName("packages")
    val packages = ArrayList<String>()
}