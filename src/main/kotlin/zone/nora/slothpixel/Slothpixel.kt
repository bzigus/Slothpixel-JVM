/*
 * BSD 3-Clause License
 *
 * Copyright (c) 2020, Nora Cos <https://github.com/mew>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * 3. Neither the name of the copyright holder nor the names of its
 *    contributors may be used to endorse or promote products derived from
 *    this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/* The above notice applies to all files in this repository. */
package zone.nora.slothpixel

import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import com.google.gson.reflect.TypeToken
import zone.nora.slothpixel.bans.Bans
import zone.nora.slothpixel.boosters.Booster
import zone.nora.slothpixel.boosters.Boosters
import zone.nora.slothpixel.constants.achievements.AchievementsConstant
import zone.nora.slothpixel.constants.achievements.guild.GuildAchievementsConstant
import zone.nora.slothpixel.constants.gametype.GameType
import zone.nora.slothpixel.constants.languages.LanguagesConstant
import zone.nora.slothpixel.guild.Guild
import zone.nora.slothpixel.health.Health
import zone.nora.slothpixel.player.Player
import zone.nora.slothpixel.player.achievements.Achievements
import zone.nora.slothpixel.player.quests.Quests
import zone.nora.slothpixel.player.recentgames.RecentGame
import zone.nora.slothpixel.player.simpleprofile.SimpleProfile
import zone.nora.slothpixel.skyblock.auctions.PastSkyblockAuctions
import zone.nora.slothpixel.skyblock.auctions.SkyblockAuction
import zone.nora.slothpixel.skyblock.bazaar.SkyblockBazaar
import zone.nora.slothpixel.skyblock.profiles.SimpleSkyblockProfile
import zone.nora.slothpixel.skyblock.profiles.SkyblockProfile
import zone.nora.slothpixel.util.TimeUtil
import zone.nora.slothpixel.util.exceptions.SlothpixelApiException
import zone.nora.slothpixel.util.exceptions.impl.*
import java.io.*
import java.net.URL
import java.net.URLConnection
import java.util.*
import kotlin.collections.HashMap

/*
 * Created by Nora Cos on 14/02/20.
 */
class Slothpixel(private val url: String = "https://api.slothpixel.me/api") {

    /**
     * Return a player object of the specified name or UUID.
     * https://docs.slothpixel.me/#tag/player/
     *
     * @param nameOrUUID Username or UUID of a player.
     * @return Player object of the specified name or UUID.
     */
    fun getPlayer(nameOrUUID: String): Player {
        val name = nameOrUUID.replace("-", "")
        val gson = Gson()
        val jsonUrl = "$url/players/$name"
        val json = getFromUrl(jsonUrl)
        return gson.fromJson(json, Player::class.java)
    }

    /**
     * @see getPlayer(nameOrUUID)
     */
    fun getPlayer(uuid: UUID): Player = getPlayer(uuid.toString())

    /**
     * Return an achievements object of the specified name or UUID.
     * https://docs.slothpixel.me/#tag/player/paths/~1players~1{playerName}~1achievements/get
     *
     * @param nameOrUUID Username or UUID of a player.
     * @return Achievements object of the specified name or UUID.
     */
    fun getPlayerAchievements(nameOrUUID: String): Achievements {
        val name = nameOrUUID.replace("-", "")
        val gson = Gson()
        val jsonUrl = "$url/players/$name/achievements"
        val json = getFromUrl(jsonUrl)
        return gson.fromJson(json, Achievements::class.java)
    }

    /**
     * Return a quests object of the specified name or UUID.
     * https://docs.slothpixel.me/#tag/player/paths/~1players~1{playerName}~1quests/get
     *
     * @param nameOrUUID Username or UUID of a player.
     * @return Quests object of the specified name or UUID.
     */
    fun getPlayerQuests(nameOrUUID: String): Quests {
        val name = nameOrUUID.replace("-", "")
        val gson = Gson()
        val jsonUrl = "$url/players/$name/quests"
        val json = getFromUrl(jsonUrl)
        return gson.fromJson(json, Quests::class.java)
    }

    /**
     * Return a list of a players most recently played games.
     * Games are stored for 3 days. This can be disabled by the player.
     * https://docs.slothpixel.me/#tag/player/paths/~1players~1{playerName}~1recentGames/get
     *
     * @param nameOrUUID Username of UUID of a player.
     * @return Array of player's recently played games.
     */
    fun getPlayerRecentGames(nameOrUUID: String): Array<RecentGame> {
        val name = nameOrUUID.replace("-", "")
        val gson = Gson()
        val jsonUrl = "$url/players/$name/recentGames"
        val json = JsonParser().parse(getPage(jsonUrl)).asJsonArray
        return gson.fromJson(json, Array<RecentGame>::class.java)
    }

    /**
     * Returns Guild information of a player via their username
     * or UUID.
     * https://docs.slothpixel.me/#tag/guild
     *
     * @param playerNameOrUUID Username or UUID of a player.
     * @return Guild Object of the players guild.
     */
    fun getGuild(playerNameOrUUID: String): Guild {
        val player = playerNameOrUUID.replace("-", "")
        val gson = Gson()
        val jsonUrl = "$url/guilds/$player?populatePlayers=true"
        val json = try { readJsonUrl(jsonUrl) } catch (ex: FileNotFoundException) { throw InvalidPlayerException()
        }
        return gson.fromJson(json, Guild::class.java)
    }

    /**
     * @see getGuild(playerNameOrUUID)
     */
    fun getGuild(playerUUID: UUID): Guild = getGuild(playerUUID.toString())

    /**
     * Return bans object (https://docs.slothpixel.me/#tag/bans)
     *
     * @return Bans object.
     */
    fun getBans(): Bans {
        val gson = Gson()
        val jsonUrl = "$url/bans"
        val json = getFromUrl(jsonUrl)
        return gson.fromJson(json, Bans::class.java)
    }

    /**
     * Return every active booster on Hypixel.
     *
     * @return Every active booster on Hypixel.
     */
    fun getBoosters(): Boosters {
        val jsonUrl = "$url/boosters"
        val json = getFromUrl(jsonUrl)
        return Gson().fromJson(json, Boosters::class.java)
    }

    /**
     * Return a list of active boosters for a specified game.
     *
     * @param game Standard name (https://github.com/slothpixel/core/wiki/Standard-naming) of a game.
     */
    fun getBoostersByGame(game: String = ""): Array<Booster> {
        val jsonUrl = "$url/boosters/$game"
        val json = try {
            JsonParser().parse(getPage(jsonUrl)).asJsonArray
        } catch (ex: IllegalStateException) {
            throw InvalidMinigameException()
        } catch (ex: IOException) {
            throw InvalidMinigameException()
        }
        return Gson().fromJson(json, Array<Booster>::class.java)
    }

    /**
     * Return a list of specified player's Skyblock profiles.
     * Note that these are not the full profiles. For that you need:
     * @see getSkyblockProfile
     * https://docs.slothpixel.me/#tag/skyblock/paths/~1skyblock~1profiles~1{playerName}/get
     *
     * @param playerNameOrUUID Username or UUID of a player.
     * @return Array of player's Skyblock Profiles
     */
    fun getSkyblockProfiles(playerNameOrUUID: String): HashMap<String, SimpleSkyblockProfile> {
        val player = playerNameOrUUID.replace("-", "")
        val jsonUrl = "$url/skyblock/profiles/$player"
        val json = getFromUrl(jsonUrl)
        return Gson().fromJson(json, typeToken<HashMap<String, SimpleSkyblockProfile>>())
    }

    /**
     * Return the full skyblock profile of a specified player.
     * https://docs.slothpixel.me/#tag/skyblock/paths/~1skyblock~1profile~1{playerName}~1{profileId}/get
     *
     * @param playerNameOrUUID Username or UUID of a player.
     * @param profileId Id of Skyblock Profile. This can be in "cute" form or uuid form.
     * @return Full Skyblock profile of specified player.
     */
    @JvmOverloads
    fun getSkyblockProfile(playerNameOrUUID: String, profileId: String = ""): SkyblockProfile {
        val player = playerNameOrUUID.replace("-", "")
        val jsonUrl = "$url/skyblock/profile/$player/$profileId"
        val json = getFromUrl(jsonUrl)
        return Gson().fromJson(json, SkyblockProfile::class.java)
    }

    /**
     * Return an array of ongoing Skyblock auctions.
     * https://docs.slothpixel.me/#tag/skyblock/paths/~1skyblock~1auctions/get
     *
     * @param limit How many auctions you want to be returned. This caps at 1000.
     * @param page Pages allow you to split the data using the limit param... read: https://docs.slothpixel.me/#operation/getSkyblockAuctions
     * @param id Item id for filtering items. These can be found here: https://api.slothpixel.me/api/skyblock/items
     * @param sortBy Field to sort the auctions by.
     * @param ascendingOrder Set this to true if you want the order to be reversed (ie lowest value first).
     * @param auctionUUID UUID of a specific auction.
     * @param itemUUID UUID of a specific item.
     */
    @JvmOverloads
    fun getSkyblockAuctions(limit: Int = 100, page: Int = 0, id: String = "", sortBy: String = "", ascendingOrder: Boolean = false, auctionUUID: String = "", itemUUID: String = ""): Array<SkyblockAuction> {
        // dear god i hope nobody is using this with plain java
        var jsonUrl = "$url/skyblock/auctions?limit=$limit&page=$page"
        if (id != "") jsonUrl += "&id=$id"
        if (auctionUUID != "") jsonUrl += "&auctionUUID=$auctionUUID"
        if (itemUUID != "") jsonUrl += "&itemUUID=$itemUUID"
        if (sortBy != "") jsonUrl += "&sortBy=$sortBy"
        if (ascendingOrder) jsonUrl += "&sortOrder=asc"
        val json = JsonParser().parse(getPage(jsonUrl)).asJsonArray
        return Gson().fromJson(json, Array<SkyblockAuction>::class.java)
    }

    /**
     * Return historical Skyblock auction data of a specified item.
     * https://docs.slothpixel.me/#tag/skyblock/paths/~1skyblock~1auctions~1{itemId}/get
     *
     * @param itemId Item id. These can be found here: https://api.slothpixel.me/api/skyblock/items
     * @param from Start time of your query as a Unix timestamp
     * @param to End time of your query as a Unix timestamp
     */
    @JvmOverloads
    fun getPastSkyblockAuctions(itemId: String, from: Long = TimeUtil.yesterday(), to: Long = TimeUtil.now()): PastSkyblockAuctions {
        val jsonUrl = "$url/skyblock/auctions/$itemId?from=$from&to=$to"
        val json = getFromUrl(jsonUrl)
        return Gson().fromJson(json, PastSkyblockAuctions::class.java)
    }

    /**
     * Returns Skyblock Bazaar data about a specified item.
     * https://docs.slothpixel.me/#tag/skyblock/paths/~1skyblock~1bazaar~1{itemId}/get
     *
     * @param itemId Item id. These can be found here: https://api.slothpixel.me/api/skyblock/items
     */
    fun getSkyblockBazaar(itemId: String): SkyblockBazaar {
        val jsonUrl = "$url/skyblock/bazaar/$itemId"
        val json = getFromUrl(jsonUrl)
        return Gson().fromJson(json, SkyblockBazaar::class.java)
    }

    /**
     * https://docs.slothpixel.me/#tag/health
     *
     * @return Health object.
     */
    fun getHealth(): Health {
        val gson = Gson()
        val jsonUrl = "$url/health"
        val json = getFromUrl(jsonUrl)
        return gson.fromJson(json, Health::class.java)
    }

    /**
     * Return an array of Simple Player Profiles ordered by a specified stat.
     * This usually throws an exception due to how Slothpixel/MongoDB handles stuff. I don't really know why this happens but it does.
     *
     * @see SimpleProfile
     * @param stat The stat in question. Requires the full path when used with nested objects like stats.Arcade.wins
     * @param limit How many objects you want in the array.
     * @param ascendingOrder Set this to true if you want the order to be reversed (ie lowest stats first).
     * @param showAdmins Hypixel Admins can manipulate their stats at will, so it usually doesn't make sense to include them in leaderboards. If you would like them to show up, set this it true.
     * @return Array of Simple Player Profiles ordered by a specified stat.
     */
    @JvmOverloads
    @Throws(QueryFailedException::class)
    fun getPlayerLeaderboard(stat: String, limit: Int = 100, ascendingOrder: Boolean = false, showAdmins: Boolean = false): Array<SimpleProfile> {
        val json = getLeaderboard("players", stat = stat, limit = limit, ascendingOrder = ascendingOrder, showAdmins = showAdmins)
        return Gson().fromJson(json, Array<SimpleProfile>::class.java)
    }

    /**
     * Return an array of Guild Objects ordered by a specific guild stat.
     * This also may throw an exception, but has a much higher success rate than the player leaderboard endpoint in my personal experience.
     * Guild member objects in Guild objects retrieved from this method **WILL NOT** have the profile field!! It will return null!!
     *
     * @param stat The guild stat in question. Requires the full path when used with nested objects like exp_by_game.UHC
     * @param limit How many objects you want in the array.
     * @param sortOrder Set this to true if you want the order to be reversed (ie lowest stats first).
     * @param showAdmins Hypixel Admins can manipulate their stats at will, so it usually doesn't make sense to include them in leaderboards. If you would like them to show up, set this it true.
     * @return Array of Simple Player Profiles ordered by a specified stat.
     */
    @JvmOverloads
    @Throws(QueryFailedException::class)
    fun getGuildLeaderboard(stat: String, limit: Int = 100, ascendingOrder: Boolean = false, showAdmins: Boolean = false): Array<Guild> {
        val json = getLeaderboard("guilds", stat = stat, limit = limit, ascendingOrder = ascendingOrder, showAdmins = showAdmins)
        return Gson().fromJson(json, Array<Guild>::class.java)
    }

    fun getAchievementsConstant(): AchievementsConstant =
        Gson().fromJson(getFromUrl("$url/constants/achievements_extended"), AchievementsConstant::class.java)

    fun getGameTypesConstant(): Array<GameType> {
        val json = JsonParser().parse(getPage("$url/constants/game_types")).asJsonArray
        return Gson().fromJson(json, Array<GameType>::class.java)
    }

    fun getGuildAchievementsConstant(): GuildAchievementsConstant =
        Gson().fromJson(getFromUrl("$url/constants/guild_achievements"), GuildAchievementsConstant::class.java)

    fun getLanguagesConstant(): LanguagesConstant =
        Gson().fromJson(getFromUrl("$url/constants/languages"), LanguagesConstant::class.java)

    private fun getLeaderboard(type: String, stat: String, limit: Int = 100, ascendingOrder: Boolean = false, showAdmins: Boolean = false): JsonArray {
        var jsonUrl = "$url/leaderboards?type=$type&sortBy=$stat"
        if (limit in 1..1000 && limit != 100) jsonUrl += "&limit=$limit"
        if (ascendingOrder) jsonUrl += "&sortOrder=asc"
        if (showAdmins) jsonUrl += "&significant=${!showAdmins}"
        return JsonParser().parse(getPage(jsonUrl)).asJsonArray
    }

    // Parses errors
    private fun getFromUrl(url: String): JsonObject {
        val json = readJsonUrl(url)
        if (json.has("error")) {
            when (json["error"].asString) {
                "Failed to get player uuid" -> throw InvalidPlayerException()
                "Profile not found!" -> throw ProfileNotFoundException()
                "Invalid minigame name!" -> throw InvalidMinigameException()
                "Invalid itemId" -> throw InvalidItemIdException()
                "Query failed" -> throw QueryFailedException()
                else -> throw SlothpixelApiException(json["error"].asString)
            }
        }
        return json
    }

    @Throws(IOException::class)
    private fun readJsonUrl(url: String): JsonObject {
        val jElement = JsonParser().parse(getPage(url))
        return jElement.asJsonObject
    }

    @Throws(IOException::class)
    private fun getPage(url: String): String {
        val url1 = URL(url)
        val conn: URLConnection = url1.openConnection()
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 5.1; rv:19.0) Gecko/20100101 Firefox/19.0")
        conn.connect()
        val serverResponse = BufferedReader(InputStreamReader(conn.getInputStream()))
        val response = serverResponse.readLine()
        serverResponse.close()
        return response
    }

    private inline fun <reified T> typeToken() = object: TypeToken<T>() {}.type
}