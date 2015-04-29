/**
 * Created by Nick on 29-4-2015.
 */
object Euler006 {
  def main(args: Array[String]): Unit = {
    val max = 100
    def powsum(n: Int): Int = { (n * (n + 1) * (2 * n + 1)) / 6 }
    def sumpow(n: Int): Int = { ((n * (n + 1)) / 2) * ((n * (n + 1)) / 2) }
    println(sumpow(max) - powsum(max))
  }
}
