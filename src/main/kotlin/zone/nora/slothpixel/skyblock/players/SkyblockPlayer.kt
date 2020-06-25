package zone.nora.slothpixel.skyblock.players

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.player.simpleprofile.SimpleProfile
import zone.nora.slothpixel.skyblock.items.SkyblockItem
import zone.nora.slothpixel.skyblock.players.collection.SkyblockCollection
import zone.nora.slothpixel.skyblock.players.minions.SkyblockMinions
import zone.nora.slothpixel.skyblock.players.pets.SkyblockPet
import zone.nora.slothpixel.skyblock.players.skills.SkyblockSkills
import zone.nora.slothpixel.skyblock.players.stats.SkyblockPlayerStats
import zone.nora.slothpixel.skyblock.players.slayer.Slayers

class SkyblockPlayer {
    @SerializedName("player")
    val player = SimpleProfile()

    @SerializedName("last_save")
    val lastSave: Long = 0

    @SerializedName("first_join")
    val firstJoin: Long = 0

    @SerializedName("coin_purse")
    val coinPurse = 0

    @SerializedName("collections_unlocked")
    val collectionsUnlocked = 0

    @SerializedName("inventory")
    val inventory = ArrayList<SkyblockItem>()

    @SerializedName("armor")
    val armor = ArrayList<SkyblockItem>()

    @SerializedName("wardrobe")
    val wardrobe = ArrayList<SkyblockItem>()

    @SerializedName("ender_chest")
    val enderChest = ArrayList<SkyblockItem>()

    @SerializedName("fishing_bag")
    val fishingBag = ArrayList<SkyblockItem>()

    @SerializedName("potion_bag")
    val potionBag = ArrayList<SkyblockItem>()

    @SerializedName("talisman_bag")
    val talismanBag = ArrayList<SkyblockItem>()

    @SerializedName("quiver")
    val quiver = ArrayList<SkyblockItem>()

    @SerializedName("fairy_souls_collected")
    val fairySoulsCollected = 0

    @SerializedName("fairy_souls")
    val fairySouls = 0

    @SerializedName("fairy_exchanges")
    val fairyExchanges = 0

    @SerializedName("pets")
    val pets = ArrayList<SkyblockPet>()

    @SerializedName("skills")
    val skills = SkyblockSkills()

    @SerializedName("collection")
    val collection = SkyblockCollection()

    @SerializedName("collection_tiers")
    val collectionTiers = SkyblockCollection()

    @SerializedName("minions")
    val minions = SkyblockMinions()

    @SerializedName("stats")
    val stats = SkyblockPlayerStats()

    @SerializedName("slayer")
    val slayer = Slayers()
}