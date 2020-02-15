package zone.nora.slothpixel.player.stats

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.games.arcade.Arcade
import zone.nora.slothpixel.player.stats.games.arena.Arena
import zone.nora.slothpixel.player.stats.games.blitz.Blitz
import zone.nora.slothpixel.player.stats.games.buildbattle.BuildBattle
import zone.nora.slothpixel.player.stats.games.crazywalls.CrazyWalls
import zone.nora.slothpixel.player.stats.games.cvc.CvC
import zone.nora.slothpixel.player.stats.games.duels.Duels
import zone.nora.slothpixel.player.stats.games.murdermystery.MurderMystery
import zone.nora.slothpixel.player.stats.games.paintball.Paintball
import zone.nora.slothpixel.player.stats.games.skywars.SkyWars
import zone.nora.slothpixel.player.stats.games.smash.Smash
import zone.nora.slothpixel.player.stats.games.tkr.TKR
import zone.nora.slothpixel.player.stats.games.tnt.TNT
import zone.nora.slothpixel.player.stats.games.uhc.UHC
import zone.nora.slothpixel.player.stats.games.warlords.Warlords

class Stats {
    @SerializedName("Arcade")
    val arcade = Arcade()

    @SerializedName("Arena")
    val arena = Arena()

    @SerializedName("Warlords")
    val warlords = Warlords()

    // TODO Bedwars

    @SerializedName("BuildBattle")
    val buildBattle = BuildBattle()

    @SerializedName("Duels")
    val duels = Duels()

    @SerializedName("TKR")
    val tkr = TKR()

    @SerializedName("Blitz")
    val blitz = Blitz()

    @SerializedName("CvC")
    val cvC = CvC()

    @SerializedName("MurderMystery")
    val murderMystery = MurderMystery()

    @SerializedName("Paintball")
    val paintball = Paintball()

    // TODO Pit

    @SerializedName("SkyClash")
    val skyClash = SkyWars()

    @SerializedName("SkyWars")
    val skyWars = SkyWars()

    // TODO SkyBlock

    // TODO SpeedUHC

    @SerializedName("Smash")
    val smash = Smash()

    @SerializedName("TNT")
    val tnt = TNT()

    @SerializedName("CrazyWalls")
    val crazyWalls = CrazyWalls()

    @SerializedName("UHC")
    val uhc = UHC()
}