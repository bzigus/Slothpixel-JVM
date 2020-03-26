package zone.nora.slothpixel.skyblock.profiles.banking

import com.google.gson.annotations.SerializedName
import zone.nora.slothpixel.skyblock.profiles.banking.transactions.Transaction

class Banking {
    @SerializedName("balance")
    val balance = 0.0

    @SerializedName("transactions")
    val transactions = ArrayList<Transaction>()
}