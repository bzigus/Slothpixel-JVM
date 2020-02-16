package zone.nora.slothpixel.player.stats.arcade

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.arcade.modes.Modes

class Arcade {
    @SerializedName("coins")
    val coins = 0

    @SerializedName("wins")
    val wins = 0

    @SerializedName("kills")
    val kills = 0

    @SerializedName("modes")
    val modes: Modes = Modes()
}