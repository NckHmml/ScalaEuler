/**
 * Created by Nick on 30-4-2015.
 */
object Euler015 {
  def main(args: Array[String]): Unit = {
    println(latticePath(20, 20))
  }

  def latticePath(a: Int, b: Int): Long = {
    math.round(math.pow(10, (0 until a).map(i => math.log10(a + b - i) - math.log10(i + 1)).sum))
  }
}
