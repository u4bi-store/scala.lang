object Anonymous_Functions{
  
  val sum = (x: Double, y: Double) => x + y

  def main(args: Array[String]): Unit = {
    println("sum: "+sum(5.2 , 5.2))
  }
}
