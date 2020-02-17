package zone.nora.slothpixel.skyblock.profiles

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.skyblock.players.SkyblockPlayer

class SkyblockProfile {
    @SerializedName("profile_id")
    val profileId = ""

    @SerializedName("members")
    val members = HashMap<String, SkyblockPlayer>()
        //Gson().fromJson(JsonUtil.convertToJsonArray(JsonObject(), false), Array<SkyblockPlayer>::class.java)!!

    //fun aoeu() {
    //    for (member in members) {
    //        println(member.asString)
    //    }
    //}
}