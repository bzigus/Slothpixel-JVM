package zone.nora.slothpixel.player.stats.cvc.perks

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.cvc.perks.player.Player
import zone.nora.slothpixel.player.stats.cvc.perks.weapons.BetterGun
import zone.nora.slothpixel.player.stats.cvc.perks.weapons.Gun
import zone.nora.slothpixel.player.stats.cvc.perks.weapons.Knife
import zone.nora.slothpixel.player.stats.cvc.perks.weapons.Sniper

class Perks {
    @SerializedName("player")
    val player = Player()

    @SerializedName("carbine")
    val carbine = BetterGun()

    @SerializedName("knife")
    val knife = Knife()

    @SerializedName("magnum")
    val magnum = BetterGun()

    @SerializedName("pistol")
    val pistol = Gun()

    @SerializedName("rifle")
    val rifle = BetterGun()

    @SerializedName("shotgun")
    val shotgun = BetterGun()

    @SerializedName("smg")
    val smg = BetterGun()

    @SerializedName("sniper")
    val sniper = Sniper()
}