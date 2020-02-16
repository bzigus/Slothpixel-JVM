package zone.nora.slothpixel.player.stats.uhc.gamemodes

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.uhc.gamemodes.redvblue.RedVBlue
import zone.nora.slothpixel.player.stats.uhc.gamemodes.solo.Solo

class Gamemodes {
    @SerializedName("solo")
    val solo = Solo()

    @SerializedName("red_v_blue")
    val redVBlue = RedVBlue()
}