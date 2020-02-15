package zone.nora.slothpixel

import com.google.gson.Gson
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import zone.nora.slothpixel.player.Player
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.URL
import java.net.URLConnection
import java.util.*

/*
 * Created by Nora Cos on 14/02/20.
 * Last modified 15/02/20.
 */
class Slothpixel {
    private val url = "https://api.slothpixel.me/api"

    fun getPlayer(nameOrUUID: String): Player {
        val name = nameOrUUID.replace("-", "")
        val gson = Gson()
        val url = "$url/players/$name"
        val json: JsonObject = readJsonUrl(url)
        //if (!json["success"].asBoolean) throw APIException(json["cause"].asString)
        //if (player.isJsonNull) throw InvalidPlayerException()
        return gson.fromJson<Player>(json, Player::class.java)
    }

    fun getPlayer(uuid: UUID): Player {
        return getPlayer(uuid.toString())
    }

    @Throws(IOException::class)
    private fun readJsonUrl(url: String): JsonObject {
        val jElement: JsonElement = JsonParser().parse(getPage(url))
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
}