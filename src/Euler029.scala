import scala.collection.mutable

/**
 * Created by Nick on 30-4-2015.
 */
object Euler029 {
  def main(args: Array[String]): Unit = {
    var answer = 0
    var cache = new mutable.HashSet[Double]()
    for (a <- 2 to 100) {
      for (b <- 2 to 100) {
        val value = math.pow(a, b)
        if (!cache.contains(value)) {
          answer += 1
          cache += value
        }
      }
    }

    println(answer)
  }
}
