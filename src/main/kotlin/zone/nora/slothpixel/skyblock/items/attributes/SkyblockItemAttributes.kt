package zone.nora.slothpixel.skyblock.items.attributes

import com.google.gson.annotations.SerializedName

class SkyblockItemAttributes {
    @SerializedName("modifier")
    val modifier = ""

    @SerializedName("enchantments")
    val enchantments = HashMap<String, Int>()

    @SerializedName("origin")
    val origin = ""

    @SerializedName("id")
    val id = ""

    @SerializedName("uuid")
    val uuid = ""

    @SerializedName("texture")
    val texture = ""

    @SerializedName("anvil_uses")
    val anvilUses = 0

    @SerializedName("hot_potato_count")
    val hotPotatoCount = 0
}