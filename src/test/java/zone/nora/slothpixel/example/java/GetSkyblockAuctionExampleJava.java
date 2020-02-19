package zone.nora.slothpixel.example.java;

import zone.nora.slothpixel.Slothpixel;
import zone.nora.slothpixel.skyblock.auctions.SkyblockAuction;
import zone.nora.slothpixel.skyblock.auctions.bids.SkyblockAuctionBid;

public class GetSkyblockAuctionExampleJava {
    public static void main(String[] args) {
        // Make an instance of the Slothpixel API.
        Slothpixel slothpixel = new Slothpixel();
        // Save a request as a local variable.
        SkyblockAuction[] auctions = slothpixel.getSkyblockAuctions();

        // Get data for each auction.
        for (SkyblockAuction auction : auctions) {
            System.out.println("Item: " + auction.getItem().getName());
            System.out.println("Item Lore:");
            // Print each line of item lore.
            for (String lore : auction.getItem().getLore()) System.out.println(lore);
            System.out.println("Highest Bid: " + auction.getHighestBidAmount());
            System.out.println("Bids: ");
            // Print info for each bid on the item.
            for (SkyblockAuctionBid bid : auction.getBids())
                System.out.println(bid.getAmount() + " by " + bid.getBidder());
        }
    }
}
