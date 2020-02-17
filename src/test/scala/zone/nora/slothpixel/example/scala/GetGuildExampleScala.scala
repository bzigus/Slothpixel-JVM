package zone.nora.slothpixel.example.scala

import zone.nora.slothpixel.Slothpixel

object GetGuildExampleScala {
  def main(args: Array[String]): Unit = {
    // Make an instance of the Slothpixel API.
    val slothpixel = new Slothpixel
    // Save a request as a local variable.
    val guild = slothpixel.getGuild("3d077bf2be3141e5bc43c70df2747b6d")
    println(s"Guild Name: ${guild.getName}")
    println(s"Guild Id: ${guild.getId}")
    println(s"Guild Description: ${guild.getDescription}")

    println("Guild Members:")
    // Get data for every guild member.
    guild.getMembers.forEach(member => {
      println(s"Username: ${member.getProfile.getUsername}")
      println(s"Guild Rank: ${member.getRank}")
    })
  }
}
