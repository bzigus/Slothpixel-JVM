package zone.nora.slothpixel.example.java;

import zone.nora.slothpixel.Slothpixel;
import zone.nora.slothpixel.guild.member.GuildMember;

import java.util.ArrayList;

public class GetGuildExampleJava {
    public static void main(String[] args) {
        ArrayList<GuildMember> guildMembers = new Slothpixel().getGuild("Embry").getMembers();
    }
}
