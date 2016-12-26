object Traits{

  abstract class Shape(var x: Int, var y: Int){
    def draw(): Unit = {
      println(s"Shape at $x, $y")
    }
  }

  class Circle(x: Int, y: Int, val r: Int)
    extends Shape(x, y){
      override def draw(): Unit = {
        println(s"Circle at $x, $y with radius $r")
      }
  }
  
  trait Clickable{ /* trait */
    def onClick(): Unit = {
      println("Clicked")
    }
  }
  
  class ClickableCircle(x: Int, y: Int, r: Int)
    extends Circle(x, y, r) with Clickable /* with */
  
  def main(args: Array[String]): Unit = {
    val cc = new ClickableCircle(0, 0, 42)
    cc.onClick()
  }

}
