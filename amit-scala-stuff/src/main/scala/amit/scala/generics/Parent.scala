package amit.scala.generics


class Parent(val text: String) {

  override def toString = text

}


class Child(text: String) extends Parent(text) {

}

class Stranger(val text: String) {

  override def toString = text

}