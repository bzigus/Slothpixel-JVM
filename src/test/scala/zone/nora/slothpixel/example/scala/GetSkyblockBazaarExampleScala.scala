package zone.nora.slothpixel.example.scala

import zone.nora.slothpixel.Slothpixel

object GetSkyblockBazaarExampleScala {
  def main(args: Array[String]): Unit = {
    // Make an instance of the Slothpixel API.
    val slothpixel = new Slothpixel
    // Save a request as a local variable.
    val bazaar = slothpixel.getSkyblockBazaar("HOT_POTATO_BOOK").getQuickStatus

    // TODO better example of this..
    println(s"Buy Price: ${bazaar.getBuyPrice}")
    println(s"Sell Price: ${bazaar.getSellPrice}")
  }
}