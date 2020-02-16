package zone.nora.slothpixel.player.stats.vampirez.vampire

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.vampirez.human.HumanStats

class VampireStats : HumanStats() {
    @SerializedName("most_kills")
    val mostKills = 0

    @SerializedName("most_kills_new")
    val mostKillsNew = 0
}