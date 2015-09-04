/**
 * Created by Nick on 30-4-2015.
 */
object Euler044 {
  def main(args: Array[String]): Unit = println(getAnswer)

  def getAnswer: Int = {
    var p = 0
    var k = 0
    var j = 0
    var i = 0
    while (true) {
      i += 1
      p = penta(i)
      for (x <- i - 1 until i / 2 by -1) {
        k = penta(x)
        if (isPenta(p - k)) {
          j = p - k
          if (isPenta(k - j))
            return k - j
        }
      }
    }
    0
  }

  def penta(n: Int): Int = (n * (3 * n - 1)) / 2

  def isPenta(n: Int): Boolean = {
    val mult = 24 * n + 1
    val root = math.floor(math.sqrt(mult)).toInt
    root * root == mult && root % 6 == 5
  }
}
