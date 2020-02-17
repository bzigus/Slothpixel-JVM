package zone.nora.slothpixel.skyblock.players.stats.auctions

import com.google.gson.annotations.SerializedName

class SkyblockPlayerAuctions {
    @SerializedName("created")
    val created = 0

    @SerializedName("completed")
    val completed = 0

    @SerializedName("no_bids")
    val noBids = 0

    @SerializedName("won")
    val won = 0

    @SerializedName("bids")
    val bids = 0

    @SerializedName("highest_bid")
    val highestBid = 0

    @SerializedName("total_fees")
    val totalFees = 0

    @SerializedName("gold_earned")
    val goldEarned = 0

    @SerializedName("gold_spent")
    val goldSpent = 0

    @SerializedName("sold")
    val sold = SkyblockPlayerAuctionItems()

    @SerializedName("bought")
    val bought = SkyblockPlayerAuctionItems()
}