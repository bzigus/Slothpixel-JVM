package zone.nora.slothpixel.player.stats.arena.gamemodes

import com.google.gson.annotations.SerializedName

class Gamemodes {
    @SerializedName("four_v_four")
    val fourVFour: Gamemode = Gamemode()

    @SerializedName("one_v_one")
    val oneVOne: Gamemode = Gamemode()

    @SerializedName("two_v_two")
    val twoVTwo: Gamemode = Gamemode()
}