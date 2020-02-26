package zone.nora.slothpixel.player.stats.quake.settings

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.quake.settings.messages.Messages

class QuakeSettings {
    @SerializedName("instant_respawn")
    val instantRespawn = false

    @SerializedName("show_kill_prefix")
    val showKillPrefix = false

    @SerializedName("compass_selected")
    val compassSelected = false

    @SerializedName("enable_sound")
    val enableSound = false

    @SerializedName("show_dash_cooldown")
    val showDashCooldown = false

    @SerializedName("messages")
    val messages = Messages()
}