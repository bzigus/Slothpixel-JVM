package zone.nora.slothpixel.constants.languages

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.constants.languages.name.LanguageName

class Language {
    @SerializedName("name")
    val name = LanguageName()

    @SerializedName("code")
    val code = ""
}