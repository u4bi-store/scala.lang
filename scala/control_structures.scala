object Control_Structures{
  
  val name_a = ""
  val name_b = "a"
  val res_a = if (name_a == "") 0 else 1
  val res_b = if (name_b == "") 0 else 1
 
  def main(args: Array[String]): Unit = {
    println("res_a : "+res_a)
    println("res_b : "+res_b)
  }
}
