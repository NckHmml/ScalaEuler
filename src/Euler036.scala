/**
 * Created by Nick on 30-4-2015.
 */
object Euler036 {
  val max = 1e6.toInt

  def main(args: Array[String]): Unit = println(getAnswer + 1)

  def getAnswer: Int = {
    var temp = 0
    var cur = 0
    var i = 1
    var sum = 0

    while (true) {
      val bin = i.toBinaryString

      cur = Integer.parseInt(bin + bin.reverse, 2)
      if (cur >= max)  return sum

      if (isPalindrome(cur))
        sum += cur

      temp = Integer.parseInt(bin + "0" + bin.reverse, 2)
      if (temp < max) {
        if (isPalindrome(temp))
          sum += temp

        temp = Integer.parseInt(bin + "1" + bin.reverse, 2)
        if (temp < max) {
          if (isPalindrome(temp))
            sum += temp
        }
      }
      i += 1
    }

    // It never reaches this though
    sum
  }

  def isPalindrome(n: Long): Boolean = {
    var num = n
    var rem = 0L
    var sum = 0L
    while (num > 0) {
      rem = num % 10
      num /= 10
      sum = sum * 10 + rem
    }
    n == sum
  }
}
