package zone.nora.slothpixel.player.stats.blitz.kits

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.blitz.kits.misc.BlitzKitsMiscStats
import zone.nora.slothpixel.player.stats.blitz.kits.wins.BlitzKitsWins

class BlitzKitsStats {
    @SerializedName("wins")
    val wins = BlitzKitsWins()

    @SerializedName("kills")
    val kills = BlitzKits()

    @SerializedName("games_played")
    val gamesPlayed = BlitzKits()

    @SerializedName("time_played")
    val timePlayed = BlitzKits()

    @SerializedName("chests_opened")
    val chestsOpened = BlitzKits()

    @SerializedName("mobs_spawned")
    val mobsSpawned = BlitzKits()

    @SerializedName("damage_taken")
    val damageTaken = BlitzKits()

    @SerializedName("fall_damage")
    val fallDamage = BlitzKits()

    @SerializedName("arrows_fired")
    val arrowsFired = BlitzKits()

    @SerializedName("arrows_hit")
    val arrowsHit = BlitzKits()

    @SerializedName("bottles_thrown")
    val bottlesThrown = BlitzKits()

    @SerializedName("potions_drunk")
    val potionsDrunk = BlitzKits()

    @SerializedName("potions_thrown")
    val potionsThrown = BlitzKits()

    @SerializedName("taunt_kills")
    val tauntKills = BlitzKits()

    @SerializedName("misc")
    val misc = BlitzKitsMiscStats()
}