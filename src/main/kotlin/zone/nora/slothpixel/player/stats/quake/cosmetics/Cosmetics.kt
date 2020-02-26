package zone.nora.slothpixel.player.stats.quake.cosmetics

import com.google.gson.annotations.SerializedName

class Cosmetics {
    @SerializedName("misc")
    val misc = ArrayList<String>()

    @SerializedName("triggers")
    val triggers = ArrayList<String>()

    @SerializedName("sights")
    val sights = ArrayList<String>()

    @SerializedName("cases")
    val cases = ArrayList<String>()

    @SerializedName("barrels")
    val barrels = ArrayList<String>()

    @SerializedName("muzzles")
    val muzzles = ArrayList<String>()

    @SerializedName("dashpowers")
    val dashPowers = ArrayList<String>()

    @SerializedName("dashcooldowns")
    val dashCooldowns = ArrayList<String>()

    @SerializedName("wins")
    val wins = ArrayList<String>()

    @SerializedName("beams")
    val beams = ArrayList<String>()
}