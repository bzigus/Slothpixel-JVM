package zone.nora.slothpixel.skyblock.items.attributes

import com.google.gson.annotations.SerializedName

class SkyblockItemAttributes {
    @SerializedName("modifier")
    val modifier = ""

    @SerializedName("enchantments")
    val enchantments = HashMap<String, Int>()

    @SerializedName("anvil_uses")
    val anvilUses = 0

    @SerializedName("hot_potato_count")
    val hotPotatoCount = 0

    @SerializedName("origin")
    val origin = ""

    @SerializedName("id")
    val id = ""

    @SerializedName("uuid")
    val uuid = ""

    @SerializedName("timestamp")
    val timestamp = 0L

    @SerializedName("texture")
    val texture: String? = null

    @SerializedName("rarity_upgrades")
    val rarityUpgrades = 0

    @SerializedName("baseStatBoostPercentage")
    val baseStatBoostPercentage: Int? = null

    @SerializedName("dungeon_floor")
    val dungeonFloor: Int? = null

    @SerializedName("cake_year")
    val cakeYear: Int? = null
}