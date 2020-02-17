package zone.nora.slothpixel.util

import com.google.gson.GsonBuilder
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.google.gson.JsonParser

object JsonUtil {
    // this sucks but it works.
    fun convertToJsonArray(json: JsonObject): JsonArray {
        val gson = GsonBuilder().setPrettyPrinting().create()
        val jsonString = gson.toJson(json)
        val lines = jsonString.split("\n").toMutableList()
        lines[0] = "["
        lines[lines.indices.last] = "]"
        for (line in lines) {
            if (line.endsWith("\": {")) lines[lines.indexOf(line)] = "  {"
        }
        var s = ""
        for (line in lines) {
            s = "$s$line"
        }
        return JsonParser().parse(s).asJsonArray
    }
}