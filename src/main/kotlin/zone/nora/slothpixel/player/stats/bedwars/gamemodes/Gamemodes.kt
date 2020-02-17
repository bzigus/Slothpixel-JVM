package zone.nora.slothpixel.player.stats.bedwars.gamemodes

import com.google.gson.annotations.SerializedName

class Gamemodes {
    @SerializedName("solo")
    val solo = Gamemode()

    @SerializedName("doubles")
    val doubles = Gamemode()

    @SerializedName("3v3v3v3")
    val threes = Gamemode()

    @SerializedName("4v4v4v4")
    val fours = Gamemode()

    @SerializedName("rush_solo")
    val rushSolo = Gamemode()

    @SerializedName("rush_doubles")
    val rushDoubles = Gamemode()

    @SerializedName("rush_4v4v4v4")
    val rush4v4v4v4 = Gamemode()

    @SerializedName("ultimate_solo")
    val ultimateSolo = Gamemode()

    @SerializedName("ultimate_doubles")
    val ultimateDoubles = Gamemode()

    @SerializedName("ultimate_4v4v4v4")
    val ultimate4v4v4v4 = Gamemode()

    @SerializedName("lucky_doubles")
    val luckyDoubles = Gamemode()

    @SerializedName("lucky_4v4v4v4")
    val lucky4v4v4v4 = Gamemode()

    @SerializedName("voidless_doubles")
    val voidlessDoubles = Gamemode()

    @SerializedName("voidless_4v4v4v4")
    val voidless4v4v4v4 = Gamemode()

    @SerializedName("armed_doubles")
    val armedDoubles = Gamemode()

    @SerializedName("armed_4v4v4v4")
    val armed4v4v4v4 = Gamemode()

    @SerializedName("castle")
    val castle = Gamemode()

}