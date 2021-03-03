object Prime extends App {

  def isPrime(n: Int): Boolean = {
    if (n <= 1)
      false
    else if (n == 2)
      true
    else
      !(2 to (n - 1)).exists(x => n % x == 0)
  }

  def list1ToN(n: Int) = {

    List.range(2, n+1) filter isPrime
  }
   println(isPrime(8))
   println(list1ToN(8))
}

