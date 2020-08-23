package zone.nora.slothpixel.bans

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.bans.staff.StaffBans
import zone.nora.slothpixel.bans.watchdog.WatchdogBans

class Bans {
    @SerializedName("watchdog")
    val watchdog = WatchdogBans()

    @SerializedName("staff")
    val staff = StaffBans()
}