/**
 * Created by Nick on 29-4-2015.
 */
object Euler003 {
  def main(args: Array[String]): Unit = {
    var max = 0
    val a = 600851475143L
    val boundery = math.floor(math.sqrt(a)).toInt

    for (b <- 1 until boundery) {
      if (a % b == 0 && isPrime(b))
        max = b
    }

    println(max)
  }

  def isPrime(n: Long): Boolean = {
    val boundery = math.floor(math.sqrt(n)).toInt

    if (n == 1) return false
    if (n == 2) return true

    for (i <- 2 until boundery)
      if (n % i == 0) return false

    return true
  }
}
