package zone.nora.slothpixel.skyblock.players.pets

import com.google.gson.annotations.SerializedName

class SkyblockPet {
    @SerializedName("type")
    val type = ""

    @SerializedName("exp")
    val exp = 0.0

    @SerializedName("active")
    val active = false

    @SerializedName("tier")
    val tier = ""

    @SerializedName("heldItem")
    val heldItem: String? = null

    @SerializedName("candyUsed")
    val candyUsed = 0
}