/**
 * Created by Nick on 29-4-2015.
 */
object Euler003 {
  def main(args: Array[String]): Unit = {
    var max = 0
    val a = 600851475143L
    val boundery = math.floor(math.sqrt(a)).toInt

    for(b <- 1 until boundery) {
      if (getGDC(a, b) == b && isPrime(b))
        max = b
    }

    println(max);
  }

  def getGDC(A: Long, B: Long): Long = {
    var a = A
    var b = B

    while(a != 0 && b != 0) {
      if (a > b)
        a %= b
      else
        b %= a
    }

    if (a == 0)
      return b
    else
      return a
  }

  def isPrime(n: Long): Boolean = {
    val boundery = math.floor(math.sqrt(n)).toInt

    if (n == 1) return false
    if (n == 2) return true

    for(i <- 2 until boundery)
      if (n % i == 0) return false

    return true
  }
}
