package zone.nora.slothpixel.constants.skyblock.collections.impl.tiers

import com.google.gson.annotations.SerializedName

class SkyblockCollectionTier {
    @SerializedName("tier")
    val tier = 0

    @SerializedName("amountRequired")
    val amountRequired = 0

    @SerializedName("unlocks")
    val unlocks = ArrayList<String>()
}