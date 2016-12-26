import scala.collection.mutable

object Mutable_Array{
 
  def main(args: Array[String]): Unit = {
    val a = mutable.Buffer("u4bi_a", "u4bi_b", "u4bi_c")
    a.append("u4bi_d")
    a.prepend("u4bi_e") /* a array length*/
    a(a.length -1) = "u4bi_fix" /* fix */

    val fox = a(1)

    println(a.mkString("  -  "))
    println("fox: "+fox)
  }

}
