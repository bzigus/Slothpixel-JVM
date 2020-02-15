package zone.nora.slothpixel.example.java;

import zone.nora.slothpixel.Slothpixel;
import zone.nora.slothpixel.player.Player;

public class GetPlayerExampleJava {
    public static void main(String[] args) {
        Slothpixel slothpixel = new Slothpixel();
        Player player = slothpixel.getPlayer("bspwm");

        System.out.println(player.getStats().getTkr().getMaps());
    }
}
