package zone.nora.slothpixel.example.kotlin

import zone.nora.slothpixel.Slothpixel

fun main() {
    // Make an instance of the Slothpixel API.
    val slothpixel = Slothpixel()

    // Save a request as a local variable.
    val player = slothpixel.getPlayer("ae0adae48cc04fa7bc8e6e7375e6f967")

    println("Username: ${player.username}")
    println("Karma: ${player.karma}")
    println("Discord: ${player.links.discord}")

    // Save a specific game's stats.
    val blitz = player.stats.blitz

    println("Kills: ${blitz.kills}")
    println("Wins: ${blitz.wins}")
    println("Archer Level: ${blitz.kitsLevels.archer}")
}