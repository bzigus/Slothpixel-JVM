package zone.nora.slothpixel.guild

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.guild.member.GuildMember
import zone.nora.slothpixel.guild.rank.GuildRank

class Guild {
    @SerializedName("name")
    val name = ""

    @SerializedName("id")
    val id = ""

    @SerializedName("created")
    val created: Long = 0

    @SerializedName("joinable")
    val joinable = false

    @SerializedName("public")
    val public = false

    @SerializedName("tag")
    val tag = ""

    @SerializedName("tag_color")
    val tagColor = ""

    @SerializedName("legacy_ranking")
    val legacyRanking = 0

    @SerializedName("exp")
    val exp = 0

    @SerializedName("level")
    val level: Double = 0.0

    @SerializedName("exp_history")
    val expHistory = HashMap<String, String>()

    @SerializedName("description")
    val description = ""

    @SerializedName("preferred_games")
    val preferredGames = ArrayList<String>()

    @SerializedName("ranks")
    val ranks = ArrayList<GuildRank>()

    @SerializedName("members")
    val members = ArrayList<GuildMember>()

    fun getFormattedTag(): String = "$tagColor[$tag]"
}