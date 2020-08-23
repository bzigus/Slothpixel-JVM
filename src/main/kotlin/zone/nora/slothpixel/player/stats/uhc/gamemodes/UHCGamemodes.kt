package zone.nora.slothpixel.player.stats.uhc.gamemodes

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.uhc.gamemodes.redvblue.UHCRedVBlue
import zone.nora.slothpixel.player.stats.uhc.gamemodes.solo.UHCSolo

class UHCGamemodes {
    @SerializedName("solo")
    val solo = UHCSolo()

    @SerializedName("red_v_blue")
    val redVBlue = UHCRedVBlue()
}