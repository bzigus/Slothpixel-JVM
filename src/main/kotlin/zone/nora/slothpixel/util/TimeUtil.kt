package zone.nora.slothpixel.util

object TimeUtil {
    fun now() = System.currentTimeMillis()

    fun yesterday() = System.currentTimeMillis() - 24*60*60*1000
}