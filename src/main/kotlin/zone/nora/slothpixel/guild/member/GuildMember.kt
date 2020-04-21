package zone.nora.slothpixel.guild.member

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.simpleprofile.SimpleProfile

class GuildMember {
    @SerializedName("uuid")
    private val uuid = ""

    @SerializedName("profile")
    private val profile = SimpleProfile()

    @SerializedName("rank")
    val rank = ""

    @SerializedName("joined")
    val joined: Long = 0

    @SerializedName("quest_participation")
    val questParticipation = 0

    @SerializedName("exp_history")
    val expHistory = HashMap<String, String>()

    @SerializedName("muted_till")
    val mutedTill: Long? = null

    fun getUuid(): String = if (uuid == "") profile.uuid else uuid

    /**
     * Guilds requested through the Guild Leaderboard method have a uuid field instead of a profile field.
     * This will return null if the uuid field is present.
     * You can assume this is not null if you requested the guild via the getGuild() method.
     */
    fun getProfile(): SimpleProfile? = if (uuid == "") profile else null
}