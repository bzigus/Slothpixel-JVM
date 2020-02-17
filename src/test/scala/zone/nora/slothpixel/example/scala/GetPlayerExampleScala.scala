package zone.nora.slothpixel.example.scala

import zone.nora.slothpixel.Slothpixel

object GetPlayerExampleScala {
  def main(args: Array[String]): Unit = {
    // Make an instance of the Slothpixel API.
    val slothpixel = new Slothpixel
    // Save a request as a local variable.
    val player = slothpixel.getPlayer("e2db3b87ae5c4b91a04f7d6f5ef51e27")

    println(s"Username: ${player.getUsername}")
    println(s"Karma: ${player.getKarma}")
    println(s"Discord: ${player.getLinks.getDiscord}")

    // Save a specific game's stats.
    val arcade = player.getStats.getArcade

    println(s"Coins: ${arcade.getCoins}")
    println(s"Mini Walls Kills: ${arcade.getModes.getMiniWalls.getKills}")
    println(s"Party Games 2 Wins: ${arcade.getModes.getPartyGames.getWins_2}")
  }
}