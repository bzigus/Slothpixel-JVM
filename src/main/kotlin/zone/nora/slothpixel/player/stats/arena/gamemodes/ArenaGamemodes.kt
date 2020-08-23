package zone.nora.slothpixel.player.stats.arena.gamemodes

import com.google.gson.annotations.SerializedName

class ArenaGamemodes {
    @SerializedName("four_v_four")
    val fourVFour: ArenaGamemode = ArenaGamemode()

    @SerializedName("one_v_one")
    val oneVOne: ArenaGamemode = ArenaGamemode()

    @SerializedName("two_v_two")
    val twoVTwo: ArenaGamemode = ArenaGamemode()
}