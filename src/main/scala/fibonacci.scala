import scala.annotation.tailrec

object fibonacci extends App {

  def tailrecursive(n: Int): BigInt = {

    @tailrec
    def fib(n: Int, next: BigInt, prev: BigInt): BigInt = {

      if (n == 0) prev
      else fib(n - 1, prev + next, next)
    }

    fib(n, 1, 0)
  }
  println(tailrecursive(6))
}