package zone.nora.slothpixel.skyblock.profiles

import com.google.gson.annotations.SerializedName

class SimpleSkyblockProfile {
    @SerializedName("profile_id")
    val profileId = ""

    @SerializedName("cute_name")
    val cuteName = ""

    @SerializedName("first_join")
    val firstJoin: Long = 0

    @SerializedName("last_save")
    val lastSave: Long = 0

    @SerializedName("collections_unlocked")
    val collectionsUnlocked = 0

    @SerializedName("members")
    val members = ArrayList<String>()
}