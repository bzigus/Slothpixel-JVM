package zone.nora.slothpixel.guild.member.profile

import com.google.gson.annotations.SerializedName

class Profile {
    @SerializedName("uuid")
    val uuid = ""

    @SerializedName("username")
    val username = ""

    @SerializedName("first_login")
    val firstLogin: Long = 0

    @SerializedName("last_login")
    val lastLogin: Long = 0

    @SerializedName("level")
    val level: Double = 0.0

    @SerializedName("achievement_points")
    val achievementPoints = 0

    @SerializedName("karma")
    val karma = 0

    @SerializedName("rank_formatted")
    val rankFormatted = ""
}