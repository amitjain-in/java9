package amit.scala

object CoinToss {
  def main(args: Array[String]): Unit = {
    //limit (n -> infinity) probability = 0.5
    headTailsCounter(1000)
    headTailsCounter(10000)
    headTailsCounter(100000)
  }

  private def headTailsCounter(numberOfTosses: Int): Unit = {
    var heads = 0
    var tails = 0

    (1 to numberOfTosses).foreach(i => {
      val newRandomNumber = math.random
      if (newRandomNumber <= 0.5) {
        heads += 1
      } else {
        tails += 1
      }
    })

    println("NumberOfTosses: " + numberOfTosses + ", Heads: " + (1.0 * heads / numberOfTosses) + ", Tails: " + (1.0 * tails / numberOfTosses))
  }
}

class CoinToss {

}
