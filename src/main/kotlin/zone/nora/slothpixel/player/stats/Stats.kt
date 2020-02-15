package zone.nora.slothpixel.player.stats

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import lombok.Getter
import zone.nora.slothpixel.player.stats.modes.Warlords

@Getter
class Stats {
    @SerializedName("Warlords")
    @Expose
    lateinit var warlords: Warlords
}