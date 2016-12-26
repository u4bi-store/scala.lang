object Classes{

  abstract class Shape(var x: Int, var y: Int) {
    def move(dx: Int, dy: Int): Unit = {
      x += dx
      y += dy
    }

    def draw(): Unit = {
      println(s"Shape at $x, $y")
    }

  }

  class Circle(x: Int, y: Int, val r: Int)
    extends Shape(x, y) {
      override def draw(): Unit = {
        println(s"Circle at $x, $y with radius $r")
      }
  }

  def main(args: Array[String]): Unit = {
    val c = new Circle(5, 5, 42)
    // val s = new Shape(5, 3); /* abstract compile error*/
    c.draw() 
    // s.draw()
  }
}
