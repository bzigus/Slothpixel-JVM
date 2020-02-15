package zone.nora.slothpixel.player.stats.games.arena

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.games.arena.combatlevels.CombatLevels
import zone.nora.slothpixel.player.stats.games.arena.gamemodes.Gamemodes
import zone.nora.slothpixel.player.stats.games.arena.runelevels.RuneLevels
import zone.nora.slothpixel.player.stats.games.arena.skills.Skills

class Arena {
    @SerializedName("coins")
    val coins = 0

    @SerializedName("coins_spent")
    val coinsSpent = 0

    @SerializedName("penalty")
    val penalty = 0

    @SerializedName("magical_chest")
    val magicalChest = 0

    @SerializedName("keys")
    val keys = 0

    @SerializedName("combat_tracker")
    val combatTracker = 0

    @SerializedName("skills")
    val skills: Skills = Skills()

    @SerializedName("combat_levels")
    val combatLevels: CombatLevels = CombatLevels()

    @SerializedName("rune_levels")
    val runeLevels: RuneLevels = RuneLevels()

    @SerializedName("gamemodes")
    val gamemodes: Gamemodes = Gamemodes()
}