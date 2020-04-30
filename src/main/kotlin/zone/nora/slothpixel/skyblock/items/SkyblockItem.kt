package zone.nora.slothpixel.skyblock.items

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.skyblock.items.attributes.SkyblockItemAttributes

class SkyblockItem {
    @SerializedName("item_id")
    val itemId = 0

    @SerializedName("count")
    val count = 0

    @SerializedName("name")
    val name = ""

    @SerializedName("lore")
    val lore = ArrayList<String>()

    @SerializedName("attributes")
    val attributes = SkyblockItemAttributes()

    @SerializedName("damage")
    val damage = 0
}