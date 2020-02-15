package zone.nora.slothpixel.player.stats.games.uhc.perks

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.games.uhc.perks.alchemy.Alchemy
import zone.nora.slothpixel.player.stats.games.uhc.perks.apprentice.Apprentice
import zone.nora.slothpixel.player.stats.games.uhc.perks.armorsmith.Armorsmith
import zone.nora.slothpixel.player.stats.games.uhc.perks.bloodcraft.Bloodcraft
import zone.nora.slothpixel.player.stats.games.uhc.perks.cooking.Cooking
import zone.nora.slothpixel.player.stats.games.uhc.perks.enchanting.Enchanting
import zone.nora.slothpixel.player.stats.games.uhc.perks.engineering.Engineering
import zone.nora.slothpixel.player.stats.games.uhc.perks.hunter.Hunter
import zone.nora.slothpixel.player.stats.games.uhc.perks.survivalism.Survivalism
import zone.nora.slothpixel.player.stats.games.uhc.perks.toolsmithing.Toolsmithing
import zone.nora.slothpixel.player.stats.games.uhc.perks.weaponsmith.Weaponsmith

class Perks {
    @SerializedName("alchemy")
    val alchemy = Alchemy()

    @SerializedName("apprentice")
    val apprentice = Apprentice()

    @SerializedName("armorsmith")
    val armorsmith = Armorsmith()

    @SerializedName("bloodcraft")
    val bloodcraft = Bloodcraft()

    @SerializedName("cooking")
    val cooking = Cooking()

    @SerializedName("enchanting")
    val enchanting = Enchanting()

    @SerializedName("engineering")
    val engineering = Engineering()

    @SerializedName("hunter")
    val hunter = Hunter()

    @SerializedName("survivalism")
    val survivalism = Survivalism()

    @SerializedName("toolsmithing")
    val toolsmithing = Toolsmithing()

    @SerializedName("weaponsmith")
    val weaponsmith = Weaponsmith()
}
