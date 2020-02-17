package zone.nora.slothpixel.guild.member

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.simpleprofile.SimpleProfile

class GuildMember {
    @SerializedName("rank")
    val rank = ""

    @SerializedName("joined")
    val joined: Long = 0

    @SerializedName("quest_participation")
    val questParticipation = 0

    @SerializedName("exp_history")
    val expHistory = HashMap<String, String>()

    /**
     * This is null sometimes. I don't know why.
     */
    @SerializedName("muted_till")
    val mutedTill: Long? = null

    @SerializedName("profile")
    val profile = SimpleProfile()
}