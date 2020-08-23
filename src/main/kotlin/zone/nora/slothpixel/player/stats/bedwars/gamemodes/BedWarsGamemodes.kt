package zone.nora.slothpixel.player.stats.bedwars.gamemodes

import com.google.gson.annotations.SerializedName

class BedWarsGamemodes {
    @SerializedName("solo")
    val solo = BedWarsGamemode()

    @SerializedName("doubles")
    val doubles = BedWarsGamemode()

    @SerializedName("3v3v3v3")
    val threes = BedWarsGamemode()

    @SerializedName("4v4v4v4")
    val fours = BedWarsGamemode()

    @SerializedName("rush_solo")
    val rushSolo = BedWarsGamemode()

    @SerializedName("rush_doubles")
    val rushDoubles = BedWarsGamemode()

    @SerializedName("rush_4v4v4v4")
    val rush4v4v4v4 = BedWarsGamemode()

    @SerializedName("ultimate_solo")
    val ultimateSolo = BedWarsGamemode()

    @SerializedName("ultimate_doubles")
    val ultimateDoubles = BedWarsGamemode()

    @SerializedName("ultimate_4v4v4v4")
    val ultimate4v4v4v4 = BedWarsGamemode()

    @SerializedName("lucky_doubles")
    val luckyDoubles = BedWarsGamemode()

    @SerializedName("lucky_4v4v4v4")
    val lucky4v4v4v4 = BedWarsGamemode()

    @SerializedName("voidless_doubles")
    val voidlessDoubles = BedWarsGamemode()

    @SerializedName("voidless_4v4v4v4")
    val voidless4v4v4v4 = BedWarsGamemode()

    @SerializedName("armed_doubles")
    val armedDoubles = BedWarsGamemode()

    @SerializedName("armed_4v4v4v4")
    val armed4v4v4v4 = BedWarsGamemode()

    @SerializedName("castle")
    val castle = BedWarsGamemode()

}