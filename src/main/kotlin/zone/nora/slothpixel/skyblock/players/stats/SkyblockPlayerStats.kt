package zone.nora.slothpixel.skyblock.players.stats

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.skyblock.players.stats.auctions.SkyblockPlayerAuctions
import zone.nora.slothpixel.skyblock.players.stats.deaths.SkyblockPlayerDeaths
import zone.nora.slothpixel.skyblock.players.stats.itemsfished.SkyblockPlayerItemsFished
import zone.nora.slothpixel.skyblock.players.stats.kills.SkyblockPlayerKills
import zone.nora.slothpixel.skyblock.players.stats.petmilestones.SkyblockPlayerPetMilestones
import zone.nora.slothpixel.skyblock.players.stats.winterrecords.SkyblockPlayerWinterRecords

class SkyblockPlayerStats {
    @SerializedName("total_kills")
    val totalKills = 0

    @SerializedName("total_deaths")
    val totalDeaths = 0

    @SerializedName("kills")
    val kills = SkyblockPlayerKills()

    @SerializedName("deaths")
    val deaths = SkyblockPlayerDeaths()

    @SerializedName("highest_critical_damage")
    val highestCriticalDamage = 0

    @SerializedName("ender_crystals_destroyed")
    val enderCrystalsDestroyed = 0

    @SerializedName("end_race_best_time")
    val endRaceBestTime = 0.0f

    @SerializedName("chicken_race_best_time")
    val chickenRaceBestTime = 0.0f

    @SerializedName("gifts_given")
    val giftsGiven = 0

    @SerializedName("gifts_received")
    val giftsReceived = 0

    @SerializedName("items_fished")
    val itemsFished = SkyblockPlayerItemsFished()

    @SerializedName("auctions")
    val auctions = SkyblockPlayerAuctions()

    @SerializedName("winter_records")
    val winterRecords = SkyblockPlayerWinterRecords()

    @SerializedName("pet_milestones")
    val petMilestones = SkyblockPlayerPetMilestones()
}