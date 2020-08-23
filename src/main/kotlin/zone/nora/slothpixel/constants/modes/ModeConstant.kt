package zone.nora.slothpixel.constants.modes

import com.google.gson.annotations.SerializedName

class ModeConstant {
    @SerializedName("key")
    val key = ""

    @SerializedName("name")
    val name = ""

    @SerializedName("modes")
    val modes = ArrayList<ModeConstant>()
}