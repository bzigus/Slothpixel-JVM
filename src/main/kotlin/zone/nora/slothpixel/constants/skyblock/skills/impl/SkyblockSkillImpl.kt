package zone.nora.slothpixel.constants.skyblock.skills.impl

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.constants.skyblock.skills.impl.level.SkillLevel

class SkyblockSkillImpl {
    @SerializedName("name")
    val name = ""

    @SerializedName("description")
    val description = ""

    @SerializedName("maxLevel")
    val maxLevel = 0

    @SerializedName("levels")
    val levels = ArrayList<SkillLevel>()
}