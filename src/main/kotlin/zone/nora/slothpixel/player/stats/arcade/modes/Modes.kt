package zone.nora.slothpixel.player.stats.arcade.modes

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.arcade.modes.blockingdead.BlockingDead
import zone.nora.slothpixel.player.stats.arcade.modes.bountyhunters.BountyHunters
import zone.nora.slothpixel.player.stats.arcade.modes.creeperattack.CreeperAttack
import zone.nora.slothpixel.player.stats.arcade.modes.dragonwars.DragonWars
import zone.nora.slothpixel.player.stats.arcade.modes.farmhunt.FarmHunt
import zone.nora.slothpixel.player.stats.arcade.modes.football.Football
import zone.nora.slothpixel.player.stats.arcade.modes.galaxywars.GalaxyWars
import zone.nora.slothpixel.player.stats.arcade.modes.holeinthewall.HoleInTheWall
import zone.nora.slothpixel.player.stats.arcade.modes.hypixelsays.HypixelSays
import zone.nora.slothpixel.player.stats.arcade.modes.miniwalls.MiniWalls
import zone.nora.slothpixel.player.stats.arcade.modes.partygames.PartyGames
import zone.nora.slothpixel.player.stats.arcade.modes.zombies.Zombies

class Modes {
    @SerializedName("blocking_dead")
    val blockingDead: BlockingDead = BlockingDead()

    @SerializedName("dragonwars")
    val dragonWars: DragonWars = DragonWars()

    @SerializedName("hypixel_says")
    val hypixelSays: HypixelSays = HypixelSays()

    @SerializedName("santa_says")
    val santaSays: HypixelSays = HypixelSays()

    @SerializedName("miniwalls")
    val miniWalls: MiniWalls = MiniWalls()

    @SerializedName("party_games")
    val partyGames: PartyGames = PartyGames()

    @SerializedName("bounty_hunters")
    val bountyHunters: BountyHunters = BountyHunters()

    @SerializedName("galaxy_wars")
    val galaxyWars: GalaxyWars = GalaxyWars()

    @SerializedName("farm_hunt")
    val farmHunt: FarmHunt = FarmHunt()

    @SerializedName("football")
    val football: Football = Football()

    @SerializedName("creeper_attack")
    val creeperAttack: CreeperAttack = CreeperAttack()

    @SerializedName("hole_in_the_wall")
    val holeInTheWall: HoleInTheWall = HoleInTheWall()

    @SerializedName("zombies")
    val zombies: Zombies = Zombies()
}