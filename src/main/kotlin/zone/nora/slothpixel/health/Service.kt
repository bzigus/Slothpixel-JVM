package zone.nora.slothpixel.health

import com.google.gson.annotations.SerializedName

class Service {
    @SerializedName("metric")
    val metric: Long = 0

    @SerializedName("threshold")
    val threshold: Long = 0

    @SerializedName("timestamp")
    val timestamp: Long = 0
}