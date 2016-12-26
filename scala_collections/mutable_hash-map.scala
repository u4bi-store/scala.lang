import scala.collection.mutable

object Mutable_HashMap{
  
  def main(args: Array[String]): Unit = {
    val p = mutable.HashMap("first"->"James", "last"->"Bond")
    p("profession") = "Spy"

    println(s"${p("first")} ${p("last")}")
    println(s"${p("profession")}")
  }

}
