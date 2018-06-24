package amit.scala

import java.text.DecimalFormat

import scala.collection.mutable

object ListPerformanceTest {
    val numberFormatter = new DecimalFormat("###,###")

    def main(args: Array[String]): Unit = {

        measurePerformance("Mutable: ", () => {
            val mutableList = mutable.ListBuffer[Int]()
            (1 to 100000).foreach(iS => mutableList += iS)
        })

        measurePerformance("Immutable: ", () => {
            var immutableList = List[Int]()
            (1 to 100000).foreach(iS => immutableList = immutableList :+ iS)
        })
    }

    private def measurePerformance(message: String, f: () => Unit): Unit = {
        f()//Warm up
        val startTs = System.nanoTime()
        f()
        println(message + numberFormatter.format((System.nanoTime() - startTs) / 1000) + " microseconds.")
    }
}

class ListPerformanceTest {

}