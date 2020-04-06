package zone.nora.slothpixel.constants.languages.name

import com.google.gson.annotations.SerializedName

class LanguageName {
    @SerializedName("common")
    val common = ""

    /**
     * this can contain unicode characters like in 日本語
     */
    @SerializedName("native")
    val native = ""
}
