object Default_Parameters{
  
  // default value
  def mult(x: Double, y: Double = 42.0): Double = x * y

  // variable number of parameters
  def sum(args: Double*): Double =
  args.foldLeft(0.0)((a, b) => a + b)

  val s = sum(5, 4, 3, 2, 1) // == 15

  
  def main(args: Array[String]): Unit = {
    println("mult : "+mult(5.2))
    println("sum : "+sum(5,4,1))
    println("s :"+s)
  }

}
