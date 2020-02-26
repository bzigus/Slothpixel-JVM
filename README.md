# Slothpixel-JVM
[![](https://jitpack.io/v/mew/slothpixel-jvm.svg)](https://jitpack.io/#mew/slothpixel-jvm)
[![License](https://img.shields.io/badge/License-BSD%203--Clause-blue.svg)](https://opensource.org/licenses/BSD-3-Clause)  

API Wrapper for the [Slothpixel API](https://docs.slothpixel.me) for the Java Virtual Machine.

Currently with this library you can:
 * Get individual player stats, quests and achievements.
 * Get stats for a guild and its members.
 * Get booster data.
 * Get SkyBlock profile and auction data.
 * Get staff and Watchdog ban data.
 * Get Slothpixel service status/health data.  

And it does all of this without the need of a Hypixel API Key!
## Usage
I *highly* recommend you read through the [Slothpixel Docs](https://docs.slothpixel.me/) before or as you use this library because this library is not well or fully documented.  

Here is a simple Java example of the library in action:
```java
public static void main(String[] args) {
    // Make an instance of the Slothpixel API.
    Slothpixel slothpixel = new Slothpixel();
    // Save a request as a local variable.
    Player player = slothpixel.getPlayer("Aerondight");

    System.out.println("UUID: " + player.getUuid());
    System.out.println("Karma: " + player.getKarma());
    System.out.println("Discord: " + player.getLinks().getDiscord());

    // Save a specific game's stats.
    TKR tkr = player.getStats().getTkr();

    System.out.println("Coins: " + tkr.getCoins());
    System.out.println("Gold Trophies: " + tkr.getTrophies().getGold());
}
```
More examples can be found in [src/test](https://github.com/mew/Slothpixel-JVM/tree/master/src/test). 
Currently there are examples in [Java](https://github.com/mew/Slothpixel-JVM/tree/master/src/test/java/zone/nora/slothpixel/example/java), 
[Kotlin](https://github.com/mew/Slothpixel-JVM/tree/master/src/test/kotlin/zone/nora/slothpixel/example/kotlin) and 
[Scala](https://github.com/mew/Slothpixel-JVM/tree/master/src/test/scala/zone/nora/slothpixel/example/scala)
(as of right now, the Scala ones are the most complete).

### Installation
You can add the library to your project via [Jitpack](https://jitpack.io/#mew/slothpixel-jvm/) by adding the following to your dependencies:
```groovy
repositories {
    // 
	maven { url 'https://jitpack.io' }
}

dependencies {
    // Required Gson library.
    implementation 'com.google.code.gson:gson:2.8.5'
    // Required Kotlin sdk. You do not need to include this if your project is written in Kotlin.
    implementation 'org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.61'
    // The actual project
    implementation 'com.github.mew:Slothpixel-JVM:0.1.3'
}
```
It should work well with any JVM language (just note that it is targeted towards JDK 8).
