object Control_Structures{
  
  val name_a = ""
  val name_b = "a"
  val res_a = if (name_a == "") 0 else 1
  val res_b = if (name_b == "") 0 else 1

  var x = 0
  val p = Array("u4bi_a", "u4bi_b", "u4bi_c", "u4bi_d")
  
  /* for function*/
  def find(n: Int, s: Int): Unit = {
    for{
      i <- 0 until n
      j <- 0 until s
    }
    println("i j: "+i+" "+j)

  }
  /* switch -> match */
  val animal = "dog"
  val isAnimal = animal match{
    case "cat" | "Lion" | "Tiger" =>
      "it's feline"
    case "dog" | "wolf" =>
      "it's canine"
    case _ =>
      "it's something else"
  }

  def main(args: Array[String]): Unit = {
    println("res_a : "+res_a)
    println("res_b : "+res_b)
   
    for(i <- 0 until 100)
      x+=1
      println("x : "+x)

    for(s<-p){
      println("word : "+s)
    }

    find(1, 2)
    println(isAnimal);

  }
}
