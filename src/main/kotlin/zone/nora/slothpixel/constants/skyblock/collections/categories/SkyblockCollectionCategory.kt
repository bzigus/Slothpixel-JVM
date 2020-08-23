package zone.nora.slothpixel.constants.skyblock.collections.categories

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.constants.skyblock.collections.impl.SkyblockCollection

class SkyblockCollectionCategory {
    @SerializedName("name")
    val name = ""

    @SerializedName("items")
    val items = HashMap<String, SkyblockCollection>()
}