package zone.nora.slothpixel.skyblock.players.bonuses

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.skyblock.players.attributes.SkyblockPlayerAttributes

class SkyblockPlayerBonus {
    @SerializedName("type")
    val type = ""

    @SerializedName("bonus")
    val bonus = SkyblockPlayerAttributes()
}