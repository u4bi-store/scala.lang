object Case_Classes{
  /* ES6 ver     
     const person = {first: "James", last: "Bond"}
  */
  
  case class Person(first:String, last:String)
  val person = Person("James","Bond")
  

  case class AX(a: Int, x: String)

  val c = AX(1, "test")
  val d = c.copy(a = 42)

  def main(args: Array[String]): Unit = {
    println(person)
    println(c)
    println(d)
  }
}
