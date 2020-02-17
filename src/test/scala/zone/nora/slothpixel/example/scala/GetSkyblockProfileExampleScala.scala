package zone.nora.slothpixel.example.scala

import zone.nora.slothpixel.Slothpixel

object GetSkyblockProfileExampleScala {
  def main(args: Array[String]): Unit = {
    // Make an instance of the Slothpixel API.
    val slothpixel = new Slothpixel
    val name = "Dungeon"

    // Get the player's profile's ids.
    val profileIds = slothpixel.getPlayer(name).getStats.getSkyBlock.getProfiles.keySet()

    // Get data for each profile id.
    profileIds.forEach(id => {
      val profile = slothpixel.getSkyblockProfile(name, id)

      println(s"Profile id: ${profile.getProfileId}")

      // Get data for each island member.
      profile.getMembers.keySet().forEach(key => {
        val member = profile.getMembers.get(key)
        println(s"Username: ${member.getPlayer.getUsername}")
        println(s"Gold spent on auctions: ${member.getStats.getAuctions.getGoldSpent}")
        println("Armour:")
        member.getArmor.forEach(armorPiece => {
          println(armorPiece.getName)
        })
      })
    })
  }
}
