package zone.nora.slothpixel.skyblock.players.skills

import com.google.gson.annotations.SerializedName

class SkyblockSkills {
    @SerializedName("combat")
    val combat = SkyblockSkill()

    @SerializedName("mining")
    val mining = SkyblockSkill()

    @SerializedName("alchemy")
    val alchemy = SkyblockSkill()

    @SerializedName("farming")
    val farming = SkyblockSkill()

    @SerializedName("enchanting")
    val enchanting = SkyblockSkill()

    @SerializedName("fishing")
    val fishing = SkyblockSkill()

    @SerializedName("foraging")
    val foraging = SkyblockSkill()

    @SerializedName("carpentry")
    val carpentry = SkyblockSkill()

    @SerializedName("runecrafting")
    val runecrafting = SkyblockSkill()

    @SerializedName("taming")
    val taming = SkyblockSkill()
}