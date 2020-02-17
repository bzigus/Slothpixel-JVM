package zone.nora.slothpixel.example.scala

import zone.nora.slothpixel.Slothpixel

object GetHealthExampleScala {
  def main(args: Array[String]): Unit = {
    // Make an instance of the Slothpixel API.
    val slothpixel = new Slothpixel
    // Save a request as a local variable
    val redisUsage = slothpixel.getHealth.getRedisUsage

    println("============================")
    println("Redis Usage")
    println(s"Metric: ${redisUsage.getMetric}")
    println(s"Threshold: ${redisUsage.getThreshold}")
    println("============================")
  }
}
