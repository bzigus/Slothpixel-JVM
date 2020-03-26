package zone.nora.slothpixel.skyblock.profiles.banking.transactions

import com.google.gson.annotations.SerializedName

class Transaction {
    @SerializedName("amount")
    val amount = 0.0

    @SerializedName("timestamp")
    val timestamp: Long = 0

    @SerializedName("action")
    val action = ""

    @SerializedName("initiator_name")
    val initiatorName = ""
}