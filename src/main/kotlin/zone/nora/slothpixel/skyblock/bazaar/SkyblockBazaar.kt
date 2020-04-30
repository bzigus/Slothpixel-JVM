package zone.nora.slothpixel.skyblock.bazaar

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.skyblock.bazaar.status.SkyblockBazaarQuickStatus
import zone.nora.slothpixel.skyblock.bazaar.summary.SkyblockBazaarSummary

class SkyblockBazaar {
    @SerializedName("product_id")
    val productId = ""

    @SerializedName("buy_summary")
    val buySummary = ArrayList<SkyblockBazaarSummary>()

    @SerializedName("sell_summary")
    val sellSummary = ArrayList<SkyblockBazaarSummary>()

    @SerializedName("quick_status")
    val quickStatus = SkyblockBazaarQuickStatus()
}