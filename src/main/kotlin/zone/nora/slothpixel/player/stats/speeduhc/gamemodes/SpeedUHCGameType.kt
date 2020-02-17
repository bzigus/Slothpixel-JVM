package zone.nora.slothpixel.player.stats.speeduhc.gamemodes

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.speeduhc.gamemodes.perks.SpeedUHCPerks

class SpeedUHCGameType : SpeedUHCGamemode() {
    @SerializedName("active_kit")
    val activeKit = ""

    @SerializedName("solo")
    val solo = SpeedUHCGameTypeMode()

    @SerializedName("teams")
    val teams = SpeedUHCGameTypeMode()

    @SerializedName("perks")
    val perks = SpeedUHCPerks()
}