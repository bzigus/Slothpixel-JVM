package zone.nora.slothpixel.bans.watchdog

import com.google.gson.annotations.SerializedName

class Watchdog {
    @SerializedName("last_minute")
    val lastMinute = 0

    @SerializedName("daily")
    val daily = 0

    @SerializedName("total")
    val total = 0
}