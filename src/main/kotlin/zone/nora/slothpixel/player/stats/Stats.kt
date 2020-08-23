package zone.nora.slothpixel.player.stats

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.arcade.Arcade
import zone.nora.slothpixel.player.stats.arena.Arena
import zone.nora.slothpixel.player.stats.bedwars.BedWars
import zone.nora.slothpixel.player.stats.blitz.Blitz
import zone.nora.slothpixel.player.stats.buildbattle.BuildBattle
import zone.nora.slothpixel.player.stats.crazywalls.CrazyWalls
import zone.nora.slothpixel.player.stats.cvc.CvC
import zone.nora.slothpixel.player.stats.duels.Duels
import zone.nora.slothpixel.player.stats.megawalls.MegaWalls
import zone.nora.slothpixel.player.stats.murdermystery.MurderMystery
import zone.nora.slothpixel.player.stats.paintball.Paintball
import zone.nora.slothpixel.player.stats.pit.Pit
import zone.nora.slothpixel.player.stats.quake.Quake
import zone.nora.slothpixel.player.stats.skyblock.SkyBlock
import zone.nora.slothpixel.player.stats.skyclash.SkyClash
import zone.nora.slothpixel.player.stats.skywars.SkyWars
import zone.nora.slothpixel.player.stats.smash.Smash
import zone.nora.slothpixel.player.stats.speeduhc.SpeedUHC
import zone.nora.slothpixel.player.stats.tkr.Tkr
import zone.nora.slothpixel.player.stats.tnt.Tnt
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

    @SerializedName("BedWars")
    val bedWars = BedWars()

    @SerializedName("BuildBattle")
    val buildBattle = BuildBattle()

    @SerializedName("Duels")
    val duels = Duels()

    @SerializedName("TKR")
    val tkr = Tkr()

    @SerializedName("Blitz")
    val blitz = Blitz()

    @SerializedName("CvC")
    val cvC = CvC()

    @SerializedName("MurderMystery")
    val murderMystery = MurderMystery()

    @SerializedName("Paintball")
    val paintball = Paintball()

    @SerializedName("Pit")
    val pit = Pit()

    @SerializedName("SkyClash")
    val skyClash = SkyClash()

    @SerializedName("SkyWars")
    val skyWars = SkyWars()

    @SerializedName("SkyBlock")
    val skyBlock = SkyBlock()

    @SerializedName("SpeedUHC")
    val speedUHC = SpeedUHC()

    @SerializedName("Smash")
    val smash = Smash()

    @SerializedName("TNT")
    val tnt = Tnt()

    @SerializedName("CrazyWalls")
    val crazyWalls = CrazyWalls()

    @SerializedName("UHC")
    val uhc = UHC()

    @SerializedName("VampireZ")
    val vampireZ = VampireZ()

    @SerializedName("Walls")
    val walls = Walls()

    @SerializedName("Quake")
    val quake = Quake()

    @SerializedName("MegaWalls")
    val megaWalls = MegaWalls()
}