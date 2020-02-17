package zone.nora.slothpixel.quests

import com.google.gson.annotations.SerializedName

class Quests {
    @SerializedName("quests_completed")
    val questsCompleted = 0

    @SerializedName("challenges_completed")
    val challengesCompleted = 0

    @SerializedName("completions")
    val completions = HashMap<String, Long>()
}