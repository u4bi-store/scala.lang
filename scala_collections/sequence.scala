object Sequence{

  def main(args: Array[String]): Unit = {
    val seq = Seq(1, 2, 3, 4, 5)
   
    println(seq)
    println("Empty : "+seq.isEmpty)
    println("contains : "+seq.contains(6)) /* js array indexOf */
    println("forall : "+seq.forall(x => x > 0) ) /* js array every */
    println("exists : "+seq.exists(x => x % 3 == 0) ) /* js array some */
    println("find : "+seq.find(x => x >4) ) /* js array find */

//    println("head : "+seq.head)
//    println("tail : "+seq.tail)
//    println("last : "+seq.last)
//    println("init : "+seq.init)
//    println("drop : "+seq.drop(2))
    println("dropRight : "+seq.dropRight(2))
//    println("count : "+seq.count(x => x < 3) )
//    println("groupBy : "+seq.groupBy(x => x % 2) )
//    println("sortBy : "+seq.sortBy(x=> x > 3) )
//    println("partition : "+seq.partition(x=> x > 3) )
//    println("seq:+6"+seq:+6)
//    println("seq++"+seq++)
  }
}
