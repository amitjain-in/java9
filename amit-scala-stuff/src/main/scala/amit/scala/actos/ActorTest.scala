package amit.scala.actos

import akka.actor.{ActorSystem, Props}
import scala.concurrent.ExecutionContext.Implicits.global

object ActorTest {

  def main(args: Array[String]): Unit = {
    val system = ActorSystem("FirstActor")
    val firstActor = system.actorOf(Props(new FirstActor("A")), "FirstActorA")
    val secondActor = system.actorOf(Props(new FirstActor("B")), "FirstActorB")

    firstActor ! Start(System.nanoTime())
    (1 to 1000 by 200).foreach(_ => {
      firstActor ! new Start(System.nanoTime())
    })
    firstActor ! Stop
    secondActor ! Start
    Thread.sleep(100)
    system.terminate().foreach(_ => println("Actor system was terminated"))
  }
}
