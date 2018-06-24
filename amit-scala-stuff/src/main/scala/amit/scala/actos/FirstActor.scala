package amit.scala.actos

import akka.actor.Actor

import scala.collection.mutable.ListBuffer


class FirstActor(val id: String) extends Actor {
  private val times = new ListBuffer[Long]()
  private val actualTimes = new ListBuffer[Long]()

  override def receive: Receive = {
    case Start(startTs) =>
      val time = System.nanoTime() - startTs
      println("Application Started: " + time + ", " + (if (times.nonEmpty) time - times.last else 0))
      actualTimes += (if (times.nonEmpty) time - times.last else 0)
      times += time

    case Stop =>
      println("Average: " + times.sum / times.length + ", Max: " + times.max + " Min: " + times.min)
      println("Average: " + actualTimes.sum / actualTimes.length + ", Max: " + actualTimes.max + " Min: " + actualTimes.min)
      println("Application Stopped: " + id)
  }
}


case class Start(startTs: Long)

case object Stop