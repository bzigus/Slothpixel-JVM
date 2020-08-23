package zone.nora.slothpixel.player.stats.speeduhc.mastery

import com.google.gson.annotations.SerializedName

class SpeedUHCMasteries {
    @SerializedName("active_mastery")
    val activeMastery = ""

    @SerializedName("berserk")
    val berserk = SpeedUHCMastery()

    @SerializedName("fortune")
    val fortune = SpeedUHCMastery()

    @SerializedName("huntsman")
    val huntsman = SpeedUHCMastery()

    @SerializedName("invigorate")
    val invigorate = SpeedUHCMastery()

    @SerializedName("master_baker")
    val masterBaker = SpeedUHCMastery()

    @SerializedName("sniper")
    val sniper = SpeedUHCMastery()

    @SerializedName("wild_specialist")
    val wildSpecialist = SpeedUHCMastery()
}