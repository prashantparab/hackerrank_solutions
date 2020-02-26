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

object Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    def gradingStudents(grades: Array[Int]): Array[Int] = {
        // Write your code here
        for(i<- 0 to (grades.length-1)){
            if(grades(i)>=38){
                val rem = grades(i)%5 
                if(rem!=0){
                    val new_val = grades(i)+2
                    val new_val_rem = new_val%5
                    if(new_val_rem==0){
                        grades(i) = new_val
                    } else {
                        val new_val1 = grades(i)+1
                        val new_val_rem_1 = new_val1%5
                        if(new_val_rem_1==0){
                            grades(i) = new_val1
                        } else{
                            grades(i)
                        }
                    }
                } else{
                    grades(i) =  grades(i)
                }
            } else {
                grades(i) = grades(i)
            }    
        }
        return grades 
    }
}
object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val gradesCount = StdIn.readLine.trim.toInt

        val grades = Array.ofDim[Int](gradesCount)

        for (i <- 0 until gradesCount) {
            val gradesItem = StdIn.readLine.trim.toInt
            grades(i) = gradesItem
        }

        val result = Result.gradingStudents(grades)

        printWriter.print(result.deep.mkString("\n"))

        printWriter.close()
    }
}

