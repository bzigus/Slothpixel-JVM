package zone.nora.slothpixel.example.java;

import zone.nora.slothpixel.Slothpixel;
import zone.nora.slothpixel.bans.watchdog.Watchdog;

public class GetBansExampleJava {
    public static void main(String[] args) {
        // Make an instance of the Slothpixel API.
        Slothpixel slothpixel = new Slothpixel();
        // Save a request as a local variable.
        Watchdog watchdog = slothpixel.getBans().getWatchdog();

        System.out.println("Last minute: " + watchdog.getLastMinute());
        System.out.println("Last Day: " + watchdog.getDaily());
        System.out.println("Total: " + watchdog.getTotal());
    }
}
