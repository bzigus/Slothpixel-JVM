package zone.nora.slothpixel.health

import com.google.gson.annotations.SerializedName

class Health {
    @SerializedName("hypixelApi")
    val hypixelApi = Service()

    @SerializedName("redisUsage")
    val redisUsage = Service()

    @SerializedName("mongoUsage")
    val mongoUsage = Service()
}