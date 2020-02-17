package zone.nora.slothpixel.example.java;

import zone.nora.slothpixel.Slothpixel;
import zone.nora.slothpixel.health.Service;

public class GetHealthExampleJava {
    public static void main(String[] args) {
        // Make an instance of the Slothpixel API.
        Slothpixel slothpixel = new Slothpixel();
        // Save a request as a local variable
        Service mongoUsage = slothpixel.getHealth().getMongoUsage();

        System.out.println("============================");
        System.out.println("Mongo Usage");
        System.out.println("Metric: " + mongoUsage.getMetric());
        System.out.println("Threshold: " + mongoUsage.getThreshold());
        System.out.println("============================");
    }
}
