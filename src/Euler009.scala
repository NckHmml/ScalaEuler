/**
 * Created by Nick on 30-4-2015.
 */
object Euler009 {
  def main(args: Array[String]): Unit = {

    def getAnswer: Int = {
      for (b <- 0 to 1000 by 4) {
        for (a <- 0 to 1000 by 3) {
          val c = 1000 - (a + b)
          if (a * a + b * b == c * c)
            return a * b * c
        }
      }
      0
    }

    println(getAnswer)
  }
}
