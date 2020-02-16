package zone.nora.slothpixel.player.stats

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.arcade.Arcade
import zone.nora.slothpixel.player.stats.arena.Arena
import zone.nora.slothpixel.player.stats.blitz.Blitz
import zone.nora.slothpixel.player.stats.buildbattle.BuildBattle
import zone.nora.slothpixel.player.stats.crazywalls.CrazyWalls
import zone.nora.slothpixel.player.stats.cvc.CvC
import zone.nora.slothpixel.player.stats.duels.Duels
import zone.nora.slothpixel.player.stats.murdermystery.MurderMystery
import zone.nora.slothpixel.player.stats.paintball.Paintball
import zone.nora.slothpixel.player.stats.skywars.SkyWars
import zone.nora.slothpixel.player.stats.smash.Smash
import zone.nora.slothpixel.player.stats.tkr.TKR
import zone.nora.slothpixel.player.stats.tnt.TNT
import zone.nora.slothpixel.player.stats.uhc.UHC
import zone.nora.slothpixel.player.stats.vampirez.VampireZ
import zone.nora.slothpixel.player.stats.walls.Walls
import zone.nora.slothpixel.player.stats.warlords.Warlords

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

    @SerializedName("VampireZ")
    val vampireZ = VampireZ()

    @SerializedName("Walls")
    val walls = Walls()
}