import com.sun.org.apache.xpath.internal.operations.And

/**
 * Created by Nick on 29-4-2015.
 */
object Euler002 {
  def main(args: Array[String]): Unit = {
    var i = 0
    var sum = 0
    var curFib = 0

    do
    {
      i += 1
      curFib = fibBinet(i)

      if ((curFib & 1) == 0)
        sum += curFib

    } while (curFib < 4e6)
    println(sum)
  }

  def fibBinet(n: Int): Int = {
    val sqrt5 = math.sqrt(5)
    val phi = (1 + sqrt5) / 2
    return ((math.pow(phi, n + 1) - math.pow(1 - phi, n + 1)) / sqrt5).toInt
  }
}
