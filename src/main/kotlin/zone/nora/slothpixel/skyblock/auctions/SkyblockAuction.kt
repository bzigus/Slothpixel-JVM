package zone.nora.slothpixel.skyblock.auctions

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.skyblock.auctions.bids.SkyblockAuctionBid
import zone.nora.slothpixel.skyblock.items.SkyblockItem

class SkyblockAuction {
    @SerializedName("item")
    val item = SkyblockItem()

    @SerializedName("uuid")
    val uuid = ""

    @SerializedName("auctioneer")
    val auctioneer = ""

    @SerializedName("bids")
    val bids = ArrayList<SkyblockAuctionBid>()

    @SerializedName("end")
    val end: Long = 0

    @SerializedName("extra")
    val extra = ""

    @SerializedName("highest_bid_amount")
    val highestBidAmount = 0

    @SerializedName("item_lore")
    val itemLore = ""

    @SerializedName("item_name")
    val itemName = ""

    @SerializedName("profile_id")
    val profileId = ""

    @SerializedName("start")
    val start: Long = 0

    @SerializedName("starting_bid")
    val startingBid = 0

    @SerializedName("tier")
    val tier = ""
}