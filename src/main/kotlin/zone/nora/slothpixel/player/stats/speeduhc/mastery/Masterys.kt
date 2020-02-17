package zone.nora.slothpixel.player.stats.speeduhc.mastery

import com.google.gson.annotations.SerializedName

class Masterys {
    @SerializedName("active_mastery")
    val activeMastery = ""

    @SerializedName("berserk")
    val berserk = Mastery()

    @SerializedName("fortune")
    val fortune = Mastery()

    @SerializedName("huntsman")
    val huntsman = Mastery()

    @SerializedName("invigorate")
    val invigorate = Mastery()

    @SerializedName("master_baker")
    val masterBaker = Mastery()

    @SerializedName("sniper")
    val sniper = Mastery()

    @SerializedName("wild_specialist")
    val wildSpecialist = Mastery()
}