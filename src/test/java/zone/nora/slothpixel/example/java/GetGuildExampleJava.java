package zone.nora.slothpixel.example.java;

import zone.nora.slothpixel.Slothpixel;
import zone.nora.slothpixel.guild.Guild;
import zone.nora.slothpixel.guild.member.GuildMember;

public class GetGuildExampleJava {
    public static void main(String[] args) {
        // Make an instance of the Slothpixel API.
        Slothpixel slothpixel = new Slothpixel();
        // Save a request as a local variable.
        Guild guild = slothpixel.getGuild("Gogeta");

        System.out.println("Guild Name: " + guild.getName());
        System.out.println("Public: " + (guild.getPublic() ? "yes" : "no"));
        System.out.println("Tag: " + guild.getTag());

        System.out.println("Guild Members:");
        // Get data for every Guild Member.
        for (GuildMember member : guild.getMembers()) {
            System.out.println("UUID: " + member.getProfile().getUuid());
            System.out.println("Rank: " + member.getRank());
        }
    }
}
