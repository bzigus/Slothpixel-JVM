package zone.nora.slothpixel.player.stats.quake.settings.messages

import com.google.gson.annotations.SerializedName

class Messages {
    @SerializedName("your_kills")
    val yourKills = false

    @SerializedName("your_deaths")
    val yourDeaths = false

    @SerializedName("others_kills_deaths")
    val othersKillsDeaths = false

    @SerializedName("coins")
    val coins = false

    @SerializedName("killstreaks")
    val killstreaks = false

    @SerializedName("multikills")
    val multikills = false

    @SerializedName("powerups")
    val powerups = false

}