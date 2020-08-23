package zone.nora.slothpixel.player.stats.arena

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.arena.combatlevels.CombatLevels
import zone.nora.slothpixel.player.stats.arena.gamemodes.ArenaGamemodes
import zone.nora.slothpixel.player.stats.arena.runelevels.RuneLevels
import zone.nora.slothpixel.player.stats.arena.skills.ArenaSkills

class Arena {
    @SerializedName("coins")
    val coins = 0

    @SerializedName("coins_spent")
    val coinsSpent = 0

    @SerializedName("penalty")
    val penalty = 0

    @SerializedName("magical_chest")
    val magicalChest = 0

    @SerializedName("selected_sword")
    val selectedSword = ""

    @SerializedName("active_rune")
    val activeRune = ""

    @SerializedName("keys")
    val keys = 0

    @SerializedName("combat_tracker")
    val combatTracker = 0

    @SerializedName("skills")
    val skills: ArenaSkills = ArenaSkills()

    @SerializedName("combat_levels")
    val combatLevels: CombatLevels = CombatLevels()

    @SerializedName("rune_levels")
    val runeLevels: RuneLevels = RuneLevels()

    @SerializedName("gamemodes")
    val gamemodes: ArenaGamemodes = ArenaGamemodes()

    @SerializedName("packages")
    val packages = ArrayList<String>()
}