/**
 * Created by Nick on 29-4-2015.
 */
object Euler001 {
  def main(args: Array[String]): Unit = {
    val answer =  (1 until 1000).filter(x => x % 3 == 0 || x % 5 == 0).sum
    println(answer)
  }
}
