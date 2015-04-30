/**
 * Created by Nick on 30-4-2015.
 */
object Euler020 {
  def main(args: Array[String]): Unit = {
    var value: BigInt = 100
    for (start <- 100 until 1 by -1)
      value *= start

    val answer = value
      .toString()
      .map(x => x - 0x30)
      .sum
    println(answer)
  }
}
