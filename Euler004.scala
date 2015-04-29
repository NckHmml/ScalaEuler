/**
 * Created by Nick on 29-4-2015.
 */
object Euler004 {
  def main(args: Array[String]): Unit = {
    var max = 0

    for(x <- 1 until 1000)
      for(y <- 1 until 1000)
        if (x * y > max && isPalindrome(x * y))
          max = x * y

    println(max)
  }

  def isPalindrome(n: Int): Boolean = {
    var num = n
    var rem = 0
    var sum = 0
    while (num > 0) {
      rem = num % 10
      num /= 10
      sum = sum * 10 + rem
    }
    return n == sum
  }
}
