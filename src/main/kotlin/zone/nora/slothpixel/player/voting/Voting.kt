package zone.nora.slothpixel.player.voting

import com.google.gson.annotations.SerializedName

class Voting {
    @SerializedName("votes_today")
    val votesToday = 0

    @SerializedName("total_votes")
    val totalVotes = 0

    @SerializedName("last_vote")
    val lastVote: Long = 0
}