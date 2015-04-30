/**
 * Created by Nick on 30-4-2015.
 */
object Euler028 {
  def main(args: Array[String]): Unit = {
    var start = 0
    var answer = 1
    for (i <- 3 to 1001 by 2) {
      start = i * i
      answer += start
      for (x <- 1 until 4) {
        start -= i - 1
        answer += start
      }
    }

    println(answer)
  }
}
