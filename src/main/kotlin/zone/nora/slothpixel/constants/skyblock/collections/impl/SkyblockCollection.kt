package zone.nora.slothpixel.constants.skyblock.collections.impl

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.constants.skyblock.collections.impl.tiers.SkyblockCollectionTier

class SkyblockCollection {
    @SerializedName("name")
    val name = ""

    @SerializedName("maxTiers")
    val maxTiers = 0

    @SerializedName("tiers")
    val tiers = ArrayList<SkyblockCollectionTier>()
}