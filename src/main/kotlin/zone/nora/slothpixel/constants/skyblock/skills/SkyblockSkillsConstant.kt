package zone.nora.slothpixel.constants.skyblock.skills

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.constants.skyblock.SkyblockConstant
import zone.nora.slothpixel.constants.skyblock.skills.impl.SkyblockSkillImpl

class SkyblockSkillsConstant : SkyblockConstant() {
    @SerializedName("collections")
    val collections = HashMap<String, SkyblockSkillImpl>()
}