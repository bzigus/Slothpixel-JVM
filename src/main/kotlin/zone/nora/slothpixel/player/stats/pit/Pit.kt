package zone.nora.slothpixel.player.stats.pit

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.stats.pit.damage.PitDamage
import zone.nora.slothpixel.player.stats.pit.items.PitItems
import zone.nora.slothpixel.player.stats.pit.kingquest.KingQuest
import zone.nora.slothpixel.player.stats.pit.selectedperks.PitSelectedPerks

class Pit {
    @SerializedName("kills")
    val kills = 0

    @SerializedName("assists")
    val assists = 0

    @SerializedName("deaths")
    val deaths = 0

    @SerializedName("kd_ratio")
    val kdRatio = 0.0

    @SerializedName("sword_hits")
    val swordHits = 0

    @SerializedName("arrows_fired")
    val arrowsFired = 0

    @SerializedName("arrow_hits")
    val arrowHits = 0

    @SerializedName("arrow_accuracy")
    val arrowAccuracy = 0

    @SerializedName("chat_messages")
    val chatMessages = 0

    @SerializedName("playtime_minutes")
    val playtimeMinutes = 0

    @SerializedName("enderchest_opened")
    val enderchestOpened = 0

    @SerializedName("gold")
    val gold = 0

    @SerializedName("gold_earned")
    val goldEarned = 0

    @SerializedName("xp")
    val xp = 0

    @SerializedName("prestige")
    val prestige = 0

    @SerializedName("renown")
    val renown = 0

    @SerializedName("left_clicks")
    val leftClicks = 0

    @SerializedName("joins")
    val joins = 0

    @SerializedName("last_save")
    val lastSave = ""

    @SerializedName("contracts_started")
    val contractsStarted = 0

    @SerializedName("contracts_completed")
    val contractsCompleted = 0

    @SerializedName("diamond_items_purchased")
    val diamondItemsPurchased = 0

    @SerializedName("jumped_into_pit")
    val jumpedIntoPit = 0

    @SerializedName("launched_by_launchers")
    val launchedByLaunchers = 0

    @SerializedName("max_streak")
    val maxStreak = 0

    @SerializedName("blocks_placed")
    val blocksPlaced = 0

    @SerializedName("block_broken")
    val blockBroken = 0

    @SerializedName("lava_bucket_emptied")
    val lavaBucketEmptied = 0

    @SerializedName("gapple_eaten")
    val gappleEaten = 0

    @SerializedName("ghead_eaten")
    val gheadEaten = 0

    @SerializedName("fishing_rod_launched")
    val fishingRodLaunched = 0

    @SerializedName("soups_drank")
    val soupsDrank = 0

    @SerializedName("sewer_treasures_found")
    val sewerTreasuresFound = 0

    @SerializedName("night_quests_completed")
    val nightQuestsCompleted = 0

    @SerializedName("wheat_farmed")
    val wheatFarmed = 0

    @SerializedName("dark_pants_created")
    val darkPantsCreated = 0

    @SerializedName("king_quest")
    val kingQuest = KingQuest()

    @SerializedName("selected_perks")
    val selectedPerks = PitSelectedPerks()

    @SerializedName("gold_during_prestige")
    val goldDuringPrestige = HashMap<String, Int>()

    @SerializedName("items")
    val items = PitItems()

    @SerializedName("damage_dealt")
    val damageDealt = PitDamage()

    @SerializedName("damage_taken")
    val damageTaken = PitDamage()
}