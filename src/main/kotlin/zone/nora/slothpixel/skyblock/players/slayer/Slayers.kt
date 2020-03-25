package zone.nora.slothpixel.skyblock.players.slayer

import com.google.gson.annotations.SerializedName

class Slayers {
    @SerializedName("zombie")
    val zombie = Slayer()

    @SerializedName("spider")
    val spider = Slayer()

    @SerializedName("wolf")
    val wolf = Slayer()
}