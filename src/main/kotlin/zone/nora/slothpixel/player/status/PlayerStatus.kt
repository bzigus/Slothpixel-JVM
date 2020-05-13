package zone.nora.slothpixel.player.status

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.status.game.PlayerStatusGame

class PlayerStatus {
    @SerializedName("online")
    val online = false

    @SerializedName("game")
    val game = PlayerStatusGame()
}