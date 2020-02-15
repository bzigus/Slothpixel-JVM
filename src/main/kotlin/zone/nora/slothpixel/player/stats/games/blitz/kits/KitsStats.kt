package zone.nora.slothpixel.player.stats.games.blitz.kits

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.games.blitz.kits.misc.Misc
import zone.nora.slothpixel.player.stats.games.blitz.kits.wins.Wins

class KitsStats {
    @SerializedName("wins")
    val wins = Wins()

    @SerializedName("kills")
    val kills = Kits()

    @SerializedName("games_played")
    val gamesPlayed = Kits()

    @SerializedName("time_played")
    val timePlayed = Kits()

    @SerializedName("chests_opened")
    val chestsOpened = Kits()

    @SerializedName("mobs_spawned")
    val mobsSpawned = Kits()

    @SerializedName("damage_taken")
    val damageTaken = Kits()

    @SerializedName("fall_damage")
    val fallDamage = Kits()

    @SerializedName("arrows_fired")
    val arrowsFired = Kits()

    @SerializedName("arrows_hit")
    val arrowsHit = Kits()

    @SerializedName("bottles_thrown")
    val bottlesThrown = Kits()

    @SerializedName("potions_drunk")
    val potionsDrunk = Kits()

    @SerializedName("potions_thrown")
    val potionsThrown = Kits()

    @SerializedName("taunt_kills")
    val tauntKills = Kits()

    @SerializedName("misc")
    val misc = Misc()
}