package zone.nora.slothpixel.example.scala

import zone.nora.slothpixel.Slothpixel

object GetPlayerAchievementsExampleScala {
  def main(args: Array[String]): Unit = {
    // Make an instance of the Slothpixel API.
    val slothpixel = new Slothpixel
    // Save a request as a local variable.
    val achievements = slothpixel.getPlayerAchievements("anrie")

    println(s"Achievement Points: ${achievements.getAchievementPoints}")
    println(s"Completed Achievements: ${achievements.getCompletedTotal}")
    println(s"Completed Bedwars Achievements: ${achievements.getGames.getBedWars.getCompleted}")
  }
}
