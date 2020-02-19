package zone.nora.slothpixel.example.java;

import zone.nora.slothpixel.Slothpixel;
import zone.nora.slothpixel.boosters.Booster;
import zone.nora.slothpixel.boosters.Boosters;

public class GetBoostersExampleJava {
    public static void main(String[] args) {
        // Make an instance of the Slothpixel API.
        Slothpixel slothpixel = new Slothpixel();
        // Save a request as a local variable.
        Boosters boosters = slothpixel.getBoosters();

        System.out.println("Arcade Boosters:");
        // Try to get data for each queued active booster.
        // This throws an exception if none are queued.
        try {
            for (Booster booster : boosters.getArcade()) {
                System.out.println("User: " + booster.getUuid());
                System.out.println("Activated: " + booster.getActivated());
            }
        } catch (Exception ex) {
            System.out.println("No Arcade Boosters are currently queued.");
        }
    }
}
