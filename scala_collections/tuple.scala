object Tuple{
  
  def sumProduct(s: Seq[Int]): (Int, Int) = {
    var sum = 0
    var product = 1
    for(i <- s){
      sum += i
      product *= i
    }
    (sum, product)
  }

  def main(args: Array[String]): Unit = {    
    val t = ("James", "Bond", 42)
    val kv = "key" -> 42 // same as ("key", 42)
    
//    val sc = sumProduct(Seq(1,2,3))
//    val sum = sc._1
//    val product = sc._2

//    println("sum : "+sum)
//    println("product : "+product)
    
    val (sum, product) = sumProduct(Seq(1,2,3))
    println("sum : "+sum)
    println("product : "+product)
  }
}
