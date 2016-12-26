object Case_Classes{
  /* ES6 ver     
     const person = {first: "James", last: "Bond"}
  */
  
  case class Person(first:String, last:String)
  val person = Person("James","Bond")

  def main(args: Array[String]): Unit = {
    println(person)
  }
}
