package zone.nora.slothpixel.player.stats.blitz.kits.misc

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.blitz.kits.BlitzKits

class BlitzKitsMiscStats {
    @SerializedName("tim_items_enchanted")
    val timItemsEnchanted = 0

    @SerializedName("creepertamer_explosive_kills")
    val creepertamerExplosiveKills = 0

    @SerializedName("creepertamer_tnt_placed")
    val creepertamerTntPlaced = 0

    @SerializedName("snowman_snowballs_thrown")
    val snowmanSnowballsThrown = 0

    @SerializedName("farmer_eggs_collected")
    val farmerEggsCollected = 0

    @SerializedName("farmer_eggs_thrown")
    val farmerEggsThrown = 0

    @SerializedName("hype_train_rails_placed")
    val hypeTrainRailsPlaced = 0

    @SerializedName("blocks_traveled")
    val blocksTraveled = BlitzKits()
}