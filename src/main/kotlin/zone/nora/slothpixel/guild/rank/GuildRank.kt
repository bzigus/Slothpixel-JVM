package zone.nora.slothpixel.guild.rank

import com.google.gson.annotations.SerializedName

class GuildRank {
    @SerializedName("name")
    val name = ""

    @SerializedName("default")
    val default = false

    @SerializedName("tag")
    val tag = ""

    @SerializedName("created")
    val created: Long = 0

    @SerializedName("priority")
    val priority = 0
}