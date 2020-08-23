package zone.nora.slothpixel.skyblock.players.slayer

import com.google.gson.annotations.SerializedName

class Slayer {
    @SerializedName("claimed_levels")
    val claimedLevels = 0

    @SerializedName("xp")
    val xp = 0

    @SerializedName("xp_for_next")
    val xpForNext = 0

    @SerializedName("kills_tier")
    val killsTier = HashMap<String, Int>()
}