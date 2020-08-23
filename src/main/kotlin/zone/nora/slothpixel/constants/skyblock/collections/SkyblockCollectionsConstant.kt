package zone.nora.slothpixel.constants.skyblock.collections

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.constants.skyblock.SkyblockConstant
import zone.nora.slothpixel.constants.skyblock.collections.categories.SkyblockCollectionCategory

class SkyblockCollectionsConstant : SkyblockConstant() {
    @SerializedName("collections")
    val collections = HashMap<String, SkyblockCollectionCategory>()
}