package zone.nora.slothpixel.player.quests

import com.google.gson.annotations.SerializedName

class PlayerQuests {
    @SerializedName("quests_completed")
    val questsCompleted = 0

    @SerializedName("challenges_completed")
    val challengesCompleted = 0

    @SerializedName("completions")
    val completions = HashMap<String, ArrayList<Long>>()
}