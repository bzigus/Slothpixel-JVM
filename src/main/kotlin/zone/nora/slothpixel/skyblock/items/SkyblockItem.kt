package zone.nora.slothpixel.skyblock.items

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.skyblock.items.attributes.SkyblockItemAttributes
import zone.nora.slothpixel.skyblock.items.stats.SkyblockItemStats

class SkyblockItem {
    @SerializedName("active")
    val active = false

    @SerializedName("name")
    val name = ""

    @SerializedName("rarity")
    val rarity = ""

    @SerializedName("type")
    val type = ""

    @SerializedName("stats")
    val stats = SkyblockItemStats()

    @SerializedName("damage")
    val damage = 0

    @SerializedName("lore")
    val lore = ArrayList<String>()

    @SerializedName("attributes")
    val attributes = SkyblockItemAttributes()

    @SerializedName("item_id")
    val itemId = 0

    @SerializedName("count")
    val count = 0
}