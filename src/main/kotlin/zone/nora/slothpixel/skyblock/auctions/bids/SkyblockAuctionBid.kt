package zone.nora.slothpixel.skyblock.auctions.bids

import com.google.gson.annotations.SerializedName

class SkyblockAuctionBid {
    @SerializedName("bidder")
    val bidder = ""

    @SerializedName("profile_id")
    val profileId = ""

    @SerializedName("amount")
    val amount = 0

    @SerializedName("timestamp")
    val timestamp: Long = 0
}