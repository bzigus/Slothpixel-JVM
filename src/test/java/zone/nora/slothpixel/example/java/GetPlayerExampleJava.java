package zone.nora.slothpixel.example.java;

import zone.nora.slothpixel.Slothpixel;
import zone.nora.slothpixel.player.Player;
import zone.nora.slothpixel.player.stats.tkr.Tkr;

public class GetPlayerExampleJava {
    public static void main(String[] args) {
        // Make an instance of the Slothpixel API.
        Slothpixel slothpixel = new Slothpixel();
        // Save a request as a local variable.
        Player player = slothpixel.getPlayer("Aerondight");

        System.out.println("UUID: " + player.getUuid());
        System.out.println("Karma: " + player.getKarma());
        System.out.println("Discord: " + player.getLinks().getDiscord());

        // Save a specific game's stats.
        Tkr tkr = player.getStats().getTkr();

        System.out.println("Coins: " + tkr.getCoins());
        System.out.println("Gold Trophies: " + tkr.getTrophies().getGold());
    }
}
