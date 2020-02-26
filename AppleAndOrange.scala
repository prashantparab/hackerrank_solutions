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

    // Complete the countApplesAndOranges function below.
    def countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array[Int], oranges: Array[Int]) {

        //calculate apple distance 
        var apple_dist = new Array[Int](apples.length)
        for(i<-0 to (apples.length-1)){
            apple_dist(i) = a+apples(i)
        }
        var orange_dist = new Array[Int](oranges.length)
        for(i<-0 to (oranges.length-1)){
            orange_dist(i) = b+oranges(i)
        }
        var apple_count : Int = 0 
        var orange_count : Int = 0
        for(i<-0 to (apple_dist.length-1)){
            if(apple_dist(i) >= s && apple_dist(i)<= t){
               apple_count +=1 
            }
        }
        for(i<-0 to (orange_dist.length-1)){
            if(orange_dist(i) >= s && orange_dist(i)<= t){
               orange_count +=1 
            }
        }
        println(apple_count)
        print(orange_count)
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val st = stdin.readLine.split(" ")

        val s = st(0).trim.toInt

        val t = st(1).trim.toInt

        val ab = stdin.readLine.split(" ")

        val a = ab(0).trim.toInt

        val b = ab(1).trim.toInt

        val mn = stdin.readLine.split(" ")

        val m = mn(0).trim.toInt

        val n = mn(1).trim.toInt

        val apples = stdin.readLine.split(" ").map(_.trim.toInt)

        val oranges = stdin.readLine.split(" ").map(_.trim.toInt)
        countApplesAndOranges(s, t, a, b, apples, oranges)
    }
}
