import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

    // Complete the miniMaxSum function below.
    def miniMaxSum(arr: Array[Int]) {
        //sort the array first 
         for(i<-1 until arr.length){
            for (j<- 0 until (arr.length-1)) {
                if(arr(j) > arr(j+1)){
                    val x = arr(j)
                    arr(j) = arr(j+1)
                    arr(j+1) = x
                }
            }
        }

        //println(arr.deep.mkString("\n"))
        //get the sorted array 
        //sum for min
        var min_sum : Long =  0
        for(i <- 0 until (arr.length-1)){
           min_sum +=arr(i)
        }

        var max_sum : Long = 0 
        for(i<-1 until arr.length){
            max_sum += arr(i)
        }
        println(min_sum+" "+max_sum)
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val arr = stdin.readLine.split(" ").map(_.trim.toInt)
        miniMaxSum(arr)
    }
}
