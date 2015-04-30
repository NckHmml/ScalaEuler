/**
 * Created by Nick on 30-4-2015.
 */
object Euler014 {
  def main(args: Array[String]): Unit = {
    println(getLongestCollatz(1e6.toInt))
  }

  def getLongestCollatz(end: Int): Long = {
    val cache: Array[Int] = Array.fill[Int](end - 1)(0)
    var max = 0
    var maxStart = 0

    for (start <- 2 to end) {
      if (cache(start - 2) == 0) {
        var i = 0
        var copy: Long = start

        while (copy > 1) {
          if (copy <= end && cache(copy.toInt - 2) > 0)
          {
            i += cache(copy.toInt - 2)
            copy = 0
          } else {
            if (isEven(copy))
              copy /= 2
            else
              copy = copy * 3 + 1

            i += 1
          }
        }

        if (i > max) {
          maxStart = start
          max = i
        }
        cache(start - 2) = i
      }
    }

    return maxStart
  }

  def isEven(n: Long): Boolean = {
    return (n & 1) == 0
  }
}
