package zone.nora.slothpixel.constants.gametype

import com.google.gson.annotations.SerializedName

class GameType {
    @SerializedName("id")
    val id = 0

    @SerializedName("type_name")
    val typeName = ""

    @SerializedName("database_name")
    val databaseName = ""

    @SerializedName("clean_name")
    val cleanName = ""

    @SerializedName("standard_name")
    val standardName = ""

    @SerializedName("legacy")
    val legacy = false

    @SerializedName("lobby_name")
    val lobbyName = ""
}