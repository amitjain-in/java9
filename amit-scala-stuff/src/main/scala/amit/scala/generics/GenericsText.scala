package amit.scala.generics

object GenericsText {

  def main(args: Array[String]): Unit = {
    var parentList = new Printer[Parent](new Parent("P1"), new Parent("P2"))

//    var newParent: Printer[Parent] = parentList :+ new Child("C1")
  }
}

class Printer[+A](a: A*) {
  def myPint(): Unit = {
    a.foreach(ai => print(ai + ","))
  }

//  def :+(newA: A): Printer[A] =
}
