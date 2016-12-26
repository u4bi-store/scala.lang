import scala.util.Random

object Object{

  object RandomGen{
    private def privateMethod(): Unit = { println("i am private") }
  
    private val rnd = new Random()

    def publicMethod(): Unit = {
      println("the public can see me")
      privateMethod()
    }

    val name = "RandomGen"

    def getRandomNumber : Double = rnd.nextDouble()
  }

  def main(args: Array[String]): Unit = {
    val randomGen = RandomGen
    
    val r = randomGen.getRandomNumber
    val n = randomGen.name
    println("r: "+r)
    println("n: "+n)
    
    randomGen.publicMethod

  }
}
