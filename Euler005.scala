/**
 * Created by Nick on 29-4-2015.
 */
object Euler005 {
  def main(args: Array[String]): Unit = {
    val top = 20
    var isDiv = true
    var i = 0
    do {
      i += 1
      isDiv = true
      (top to 2 by -1)
        .takeWhile(x => isDiv)
        .foreach(x => isDiv &= (i * top) % x == 0)
    } while (!isDiv)
    println(i * 20)
  }
}
