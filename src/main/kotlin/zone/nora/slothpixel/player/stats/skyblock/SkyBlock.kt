package zone.nora.slothpixel.player.stats.skyblock

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.skyblock.profiles.PlayerSkyblockProfile

class SkyBlock {
    @SerializedName("profiles")
    val profiles = HashMap<String, PlayerSkyblockProfile>()
}