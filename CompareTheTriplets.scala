import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.collection.parallel.immutable._
import scala.collection.parallel.mutable._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object Solution {

    // Complete the compareTriplets function below.
    def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
        val aLength = a.length
        //println(aLength)
        val bLength = b.length
        //println(bLength)
        var arr = new Array[Int](2)

        if(aLength == bLength) {
            for(i<- 0 to (aLength-1)){
                if( a(i) > b(i)){
                  arr(0) +=1
                }  else if( b(i) > a(i)){
                  arr(1) += 1 
                }
            }
        }
        return arr
    }

    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

        val b = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
        val result = compareTriplets(a, b)

        printWriter.println(result.mkString(" "))

        printWriter.close()
    }
}
