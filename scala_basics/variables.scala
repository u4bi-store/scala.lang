object Variables{

  var x =5
  val y = "u4bi" /* const */
  
  /* primitive types : string boolean int double long char unit null*/
  val a = 5 / 3
  val b = 5.0 / 3
  val c = 5 / 3.0

  val d: Double = 3       // ok
  //val e: Int = 3.5        // compile error
  val f: Int = 3.5.toInt  //ok
  //val g: Int = d          // compile error
  var h: Int = d.toInt    // ok

  def main(args: Array[String]) = println(x+" - "+y+" a-"+a+" b-"+b+" c-"+c+" [d : "+d+" f : "+f+" h :"+h)
}
