object Sequence{

  def main(args: Array[String]): Unit = {
    val seq = Seq(1, 2, 3, 4, 5)
   
    println(seq)
    println("Empty : "+seq.isEmpty)
    println("contains : "+seq.contains(6)) /* js array indexOf */
    println("forall : "+seq.forall(x => x > 0) ) /* js array every */
    println("exists : "+seq.exists(x => x % 3 == 0) ) /* js array some */
    println("find : "+seq.find(x => x >4) ) /* js array find */
  }
}
