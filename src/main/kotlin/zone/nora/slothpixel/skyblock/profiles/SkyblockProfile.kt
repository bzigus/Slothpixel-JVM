package zone.nora.slothpixel.skyblock.profiles

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.skyblock.players.SkyblockPlayer
import zone.nora.slothpixel.skyblock.profiles.banking.Banking

class SkyblockProfile {
    @SerializedName("profile_id")
    val profileId = ""

    @SerializedName("members")
    val members = HashMap<String, SkyblockPlayer>()

    @SerializedName("banking")
    val banking = Banking()

    @SerializedName("unlocked_minions")
    val unlockedMinions = HashMap<String, Int>()
}