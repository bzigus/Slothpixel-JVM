package zone.nora.slothpixel.skyblock.players

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.simpleprofile.SimpleProfile
import zone.nora.slothpixel.skyblock.items.SkyblockItem
import zone.nora.slothpixel.skyblock.players.attributes.SkyblockPlayerAttributes
import zone.nora.slothpixel.skyblock.players.bonuses.SkyblockPlayerBonus
import zone.nora.slothpixel.skyblock.players.objectives.SkyblockObjective
import zone.nora.slothpixel.skyblock.players.pets.SkyblockPet
import zone.nora.slothpixel.skyblock.players.quests.SkyblockQuest
import zone.nora.slothpixel.skyblock.players.quests.slayer.SlayerQuest
import zone.nora.slothpixel.skyblock.players.skills.SkyblockSkills
import zone.nora.slothpixel.skyblock.players.stats.SkyblockPlayerStats
import zone.nora.slothpixel.skyblock.players.slayer.Slayers

class SkyblockPlayer {
    @SerializedName("uuid")
    val uuid = ""

    @SerializedName("attributes")
    val attributes = SkyblockPlayerAttributes()

    @SerializedName("first_join_hub")
    val firstJoinHub = 0L

    @SerializedName("objectives")
    val objectives = HashMap<String, SkyblockObjective>()

    @SerializedName("tutorial")
    val tutorial = ArrayList<String>()

    @SerializedName("quests")
    val quests = HashMap<String, SkyblockQuest>()

    @SerializedName("last_death")
    val lastDeath = 0L

    @SerializedName("visited_zones")
    val visitedZones = ArrayList<String>()

    @SerializedName("fishing_treasure_caught")
    val fishingTreasureCaught = 0

    @SerializedName("death_count")
    val deathCount = 0

    @SerializedName("achievement_spawned_island_types")
    val achievementSpawnedIslandTypes = ArrayList<String>()

    @SerializedName("slayer_quest")
    val slayerQuest = SlayerQuest()

    @SerializedName("wardrobe_equipped_slot")
    val wardrobeEquippedSlot = 0

    @SerializedName("sacks_counts")
    val sacksCounts = HashMap<String, Int>()

    @SerializedName("stats")
    val stats = SkyblockPlayerStats()

    @SerializedName("inventory")
    val inventory = ArrayList<SkyblockItem>()

    @SerializedName("armor")
    val armor = ArrayList<SkyblockItem>()

    @SerializedName("fishing_bag")
    val fishingBag = ArrayList<SkyblockItem>()

    @SerializedName("potion_bag")
    val potionBag = ArrayList<SkyblockItem>()

    @SerializedName("quiver")
    val quiver = ArrayList<SkyblockItem>()

    @SerializedName("ender_chest")
    val enderChest = ArrayList<SkyblockItem>()

    @SerializedName("candy_bag")
    val candyBag = ArrayList<SkyblockItem>()

    @SerializedName("wardrobe")
    val wardrobe = ArrayList<SkyblockItem>()

    @SerializedName("last_save")
    val lastSave = 0L

    @SerializedName("first_join")
    val firstJoin = 0L

    @SerializedName("coin_purse")
    val coinPurse = 0L

    @SerializedName("fairy_souls_collected")
    val fairySoulsCollected = 0

    @SerializedName("fairy_souls")
    val fairySouls = 4

    @SerializedName("fairy_exchanges")
    val fairyExchanges = 0

    @SerializedName("pets")
    val pets = ArrayList<SkyblockPet>()

    @SerializedName("skills")
    val skills = SkyblockSkills()

    @SerializedName("collection")
    val collection = HashMap<String, Int>()

    @SerializedName("collection_tiers")
    val collectionTiers = HashMap<String, Int>()

    @SerializedName("minions")
    val minions = HashMap<String, Int>()

    @SerializedName("slayer")
    val slayer = Slayers()

    @SerializedName("pet_score")
    val petScore = 0

    @SerializedName("active_accessories")
    val activeAccessories = ArrayList<SkyblockItem>()

    @SerializedName("bonuses")
    val bonuses = ArrayList<SkyblockPlayerBonus>()

    @SerializedName("player")
    val player = SimpleProfile()
}