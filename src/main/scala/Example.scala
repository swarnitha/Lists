object Example extends App {

  val mylist = List(1, 2, 3)
  val mylist2 = List("one", "two", "three");
  println(mylist.map(_ + 1))
  val merge=(mylist zip mylist2).toMap
  println(merge)

  val pair = (mylist.filter(_ % 2 == 0), mylist.filter(_ % 2 != 0))
  println(pair)

}
