package zone.nora.slothpixel.boosters

import com.google.gson.annotations.SerializedName

class Booster {
    @SerializedName("uuid")
    val uuid = ""

    @SerializedName("multiplier")
    val multiplier = 0.0

    @SerializedName("activated")
    val activated: Long = 0

    @SerializedName("original_length")
    val originalLength = 0

    @SerializedName("length")
    val length = 0

    @SerializedName("active")
    val active = false

    @SerializedName("stacked")
    val stacked = ArrayList<String>()
}