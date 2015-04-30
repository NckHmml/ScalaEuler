import scala.collection.immutable.HashMap

/**
 * Created by Nick on 30-4-2015.
 */
object Euler026 {
  val digits = 3

  def main(args: Array[String]): Unit = {
    def getAnswer: Int = {
      for (i <- 999 to 0 by -2) {
        if (isPrime(i)) {
          var start = BigInt(10).pow(i - 1)
          start -= 1
          start /= i
          if (checkString(start.toString()))
            return i
        }
      }
      return 0
    }

    println(getAnswer)
  }

  def checkString(s: String): Boolean = {
    for (len <- s.length() - 1 until 0 by -1) {
      var dict = new HashMap[String, Int]()
      for (i <- 0 to s.length() - len) {
        if (len <= digits) {
          val sub = s.substring(i, i + len)
          if (dict.contains(sub))
            return len <= digits - 1
          else
            dict += sub -> i
        }
      }
    }
    return true
  }

  def isPrime(n: Long): Boolean = {
    val boundery = math.floor(math.sqrt(n)).toInt
    for (i <- 2 to boundery)
      if (n % i == 0) return false
    return true
  }
}
