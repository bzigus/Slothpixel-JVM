package zone.nora.slothpixel.player.stats.buildbattle

import com.google.gson.annotations.SerializedName

class BuildBattle {
    @SerializedName("coins")
    val coins = 0

    @SerializedName("score")
    val score = 0

    @SerializedName("wins")
    val wins = 0

    @SerializedName("w_r")
    val wR = 0.0

    @SerializedName("total_votes")
    val totalVotes = 0

    @SerializedName("wins_solo_normal")
    val winsSoloNormal = 0

    @SerializedName("wins_solo_pro")
    val winsSoloPro = 0

    @SerializedName("wins_teams_normal")
    val winsTeamsNormal = 0

    @SerializedName("wins_guess_the_build")
    val winsGuessTheBuild = 0

    @SerializedName("correct_guesses")
    val correctGuesses = 0

    @SerializedName("games_played")
    val gamesPlayed = 0

    @SerializedName("super_votes")
    val superVotes = 0

    @SerializedName("loadout")
    val loadout = ArrayList<String>()

    @SerializedName("selected_hat")
    val selectedHat = ""
    
    @SerializedName("selected_victory_dance")
    val selectedVictoryDance = ""

    @SerializedName("selected_suit")
    val selectedSuit = ""

    @SerializedName("selected_movement_trail")
    val selectedMovementTrail = ""

    @SerializedName("selected_backdrop")
    val selectedBackdrop = ""

    @SerializedName("packages")
    val packages = ArrayList<String>()
}