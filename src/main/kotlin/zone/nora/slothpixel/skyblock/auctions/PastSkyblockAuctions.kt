package zone.nora.slothpixel.skyblock.auctions

import com.google.gson.annotations.SerializedName

class PastSkyblockAuctions {
    @SerializedName("average_price")
    val averagePrice = 0

    @SerializedName("median_price")
    val medianPrice = 0

    @SerializedName("standard_deviation")
    val standardDeviation = 0

    @SerializedName("min_price")
    val minPrice = 0

    @SerializedName("max_price")
    val maxPrice = 0

    @SerializedName("sold")
    val sold = 0

    @SerializedName("auctions")
    val auctions = HashMap<String, SkyblockAuction>()
}