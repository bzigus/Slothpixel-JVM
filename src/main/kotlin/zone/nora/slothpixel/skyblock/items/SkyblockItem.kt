package zone.nora.slothpixel.skyblock.items

import com.google.gson.annotations.SerializedName

class SkyblockItem {
    @SerializedName("item_id")
    val itemId = 0

    @SerializedName("count")
    val count = 0

    @SerializedName("name")
    val name = ""

    @SerializedName("lore")
    val lore = ArrayList<String>()
}