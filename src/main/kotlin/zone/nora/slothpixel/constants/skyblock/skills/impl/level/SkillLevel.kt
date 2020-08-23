package zone.nora.slothpixel.constants.skyblock.skills.impl.level

import com.google.gson.annotations.SerializedName

class SkillLevel {
    @SerializedName("level")
    val level = 0

    @SerializedName("totalExpRequired")
    val totalExpRequired = 0L

    @SerializedName("unlocks")
    val unlocks = ArrayList<String>()
}