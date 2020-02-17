package zone.nora.slothpixel.example.scalaor every guild member...

import zone.nora.slothpixel.Slothpixel

object GetSkyblockAuctionExampleScala {
  def main(args: Array[String]): Unit = {
    // Make an instance of the Slothpixel API.
    val slothpixel = new Slothpixel
    // Save a request as a local variable.
    val auctions = slothpixel.getSkyblockAuctions(50, "HOT_POTATO_BOOK")

    // Get data for each auction.
    auctions.foreach(auction => {
      println(s"Item: ${auction.getItem.getName}")
      println(s"Seller: ${auction.getAuctioneer}")
      println("Bids:")
      auction.getBids.forEach(bid => {
        println(s"${bid.getAmount} by ${bid.getBidder}")
      })
    })
  }
}
