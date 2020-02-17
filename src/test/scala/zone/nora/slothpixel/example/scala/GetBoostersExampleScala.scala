package zone.nora.slothpixel.example.scala

import zone.nora.slothpixel.Slothpixel

object GetBoostersExampleScala {
  def main(args: Array[String]): Unit = {
    // Make an instance of the Slothpixel API.
    val slothpixel = new Slothpixel
    // Save a request as a local variable
    val boosters = slothpixel.getBoosters

    println("UHC Boosters:")
    // If no boosters are activated it throws an exception.
    // This needs to go in a try/catch to prevent crashing.
    try {
      boosters.getUhc.forEach(booster => {
        println(s"User: ${booster.getUuid}")
        println(s"Active: ${booster.getActive}")
      })
    } catch {
      case _: Exception => println("No UHC Boosters are currently activated or stacked.")
    }

    println("Mega Walls Boosters:")
    try {
      slothpixel.getBoostersByGame("MegaWalls").foreach(booster => {
        println(s"User: ${booster.getUuid}")
        println(s"Multiplier: ${booster.getMultiplier}")
      })
    } catch {
      case _: Exception => println("No Mega Walls Boosters are currently activated or stacked.")
    }
  }
}
