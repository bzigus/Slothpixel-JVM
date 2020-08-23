package zone.nora.slothpixel.boosters

import com.google.gson.annotations.SerializedName

class Boosters {
    @SerializedName("Classic")
    val classic: ArrayList<Booster> = ArrayList()

    @SerializedName("Blitz")
    val blitz: ArrayList<Booster> = ArrayList()

    @SerializedName("TNT")
    val tnt: ArrayList<Booster> = ArrayList()

    @SerializedName("MegaWalls")
    val megaWalls: ArrayList<Booster> = ArrayList()

    @SerializedName("Arcade")
    val arcade: ArrayList<Booster> = ArrayList()

    @SerializedName("UHC")
    val uhc: ArrayList<Booster> = ArrayList()

    @SerializedName("CvC")
    val cvc: ArrayList<Booster> = ArrayList()

    @SerializedName("Warlords")
    val warlords: ArrayList<Booster> = ArrayList()

    @SerializedName("Smash")
    val smash: ArrayList<Booster> = ArrayList()

    @SerializedName("SkyWars")
    val skyWars: ArrayList<Booster> = ArrayList()

    @SerializedName("CrazyWalls")
    val crazyWalls: ArrayList<Booster> = ArrayList()

    @SerializedName("SpeedUHC")
    val speedUHC: ArrayList<Booster> = ArrayList()
}