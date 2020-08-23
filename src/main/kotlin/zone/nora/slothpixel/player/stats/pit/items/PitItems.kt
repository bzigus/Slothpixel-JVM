package zone.nora.slothpixel.player.stats.pit.items

import com.google.gson.annotations.SerializedName

class PitItems {
    @SerializedName("inventory")
    val inventory = ArrayList<Int>()

    @SerializedName("armor")
    val armor = ArrayList<Int>()

    @SerializedName("enderchest")
    val enderchest = ArrayList<Int>()

    @SerializedName("stash")
    val stash = ArrayList<Int>()
}