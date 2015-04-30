/**
 * Created by Nick on 30-4-2015.
 */
object Euler025 {
  def main(args: Array[String]): Unit = {
    val max = BigInt(10).pow(999)
    var fib: BigInt = 0
    var fib1: BigInt = 1
    var fib2: BigInt = 1
    var i = 2

    while (fib < max) {
      fib = fib1 + fib2
      fib2 = fib1
      fib1 = fib
      i += 1
    }
    println(i)
  }
}
