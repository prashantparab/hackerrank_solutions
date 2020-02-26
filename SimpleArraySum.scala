import java.io.PrintWriter

object Solution {

    /*
     * Complete the simpleArraySum function below.
     */
    def simpleArraySum(ar: Array[Int]): Int = {
        /*
         * Write your code here.
         */
        var sum : Int = 0
        for (i <- ar){
            sum +=i
        }

        return sum


    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val arCount = stdin.readLine.trim.toInt

        val ar = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = simpleArraySum(ar)

        printWriter.println(result)

        printWriter.close()
    }
}
