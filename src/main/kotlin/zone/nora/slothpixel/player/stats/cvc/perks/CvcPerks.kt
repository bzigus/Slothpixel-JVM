package zone.nora.slothpixel.player.stats.cvc.perks

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.cvc.perks.player.CvcPlayerPerks
import zone.nora.slothpixel.player.stats.cvc.perks.weapons.CvcBetterGun
import zone.nora.slothpixel.player.stats.cvc.perks.weapons.CvcGun
import zone.nora.slothpixel.player.stats.cvc.perks.weapons.CvcKnife
import zone.nora.slothpixel.player.stats.cvc.perks.weapons.CvcSniper

class CvcPerks {
    @SerializedName("player")
    val player = CvcPlayerPerks()

    @SerializedName("carbine")
    val carbine = CvcBetterGun()

    @SerializedName("knife")
    val knife = CvcKnife()

    @SerializedName("magnum")
    val magnum = CvcBetterGun()

    @SerializedName("pistol")
    val pistol = CvcGun()

    @SerializedName("rifle")
    val rifle = CvcBetterGun()

    @SerializedName("shotgun")
    val shotgun = CvcBetterGun()

    @SerializedName("smg")
    val smg = CvcBetterGun()

    @SerializedName("sniper")
    val sniper = CvcSniper()
}