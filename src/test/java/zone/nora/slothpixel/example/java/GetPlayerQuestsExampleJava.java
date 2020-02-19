package zone.nora.slothpixel.example.java;

import zone.nora.slothpixel.Slothpixel;
import zone.nora.slothpixel.player.quests.Quests;

public class GetPlayerQuestsExampleJava {
    public static void main(String[] args) {
        // Make an instance of the Slothpixel API.
        Slothpixel slothpixel = new Slothpixel();
        // Save a request as a local variable.
        Quests quests = slothpixel.getPlayerQuests("x_x");

        System.out.println("Quests Completed: " + quests.getQuestsCompleted());
        System.out.println("Challenges Completed: " + quests.getChallengesCompleted());
    }
}
