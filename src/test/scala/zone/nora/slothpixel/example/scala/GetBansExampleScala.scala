package zone.nora.slothpixel.example.scala

import zone.nora.slothpixel.Slothpixel

object GetBansExampleScala {
  def main(args: Array[String]): Unit = {
    // Make an instance of the Slothpixel API.
    val slothpixel = new Slothpixel
    // Save a request as a local variable.
    val staffBans = slothpixel.getBans.getStaff

    println(s"Staff bans (today): ${staffBans.getDaily}")
    println(s"Staff bans (total): ${staffBans.getTotal}")
  }
}
