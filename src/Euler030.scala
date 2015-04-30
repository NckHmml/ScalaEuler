/**
 * Created by Nick on 30-4-2015.
 */
object Euler030 {
  def main(args: Array[String]): Unit = {
    val pow = 5
    val max = math.pow(9, pow).toInt * (pow + 1)

    var answer = 0
    var number = 0
    var sum = 0
    var temp = 0

    for (i <- 2 until max) {
      number = i
      sum = 0
      temp = 0

      while (number > 0 && sum <= i) {
        temp = number % 10
        number -= temp
        number /= 10
        sum += math.pow(temp, pow).toInt
      }

      if (i == sum)
        answer += sum
    }

    println(answer)
  }
}
