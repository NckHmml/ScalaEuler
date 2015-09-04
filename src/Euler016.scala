/**
 * Created by Nick on 30-4-2015.
 */
object Euler016 {
  def main(args: Array[String]): Unit = {
    val answer = BigInt(2)
      .pow(1000)
      .toString()
      .map(x => x - 0x30)
      .sum
    println(answer)
  }
}
