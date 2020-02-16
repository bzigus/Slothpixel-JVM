package zone.nora.slothpixel.bans

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.bans.staff.Staff
import zone.nora.slothpixel.bans.watchdog.Watchdog

class Bans {
    @SerializedName("watchdog")
    val watchdog = Watchdog()

    @SerializedName("staff")
    val staff = Staff()
}