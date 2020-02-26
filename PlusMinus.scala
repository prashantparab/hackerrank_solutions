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

    // Complete the plusMinus function below.
    def plusMinus(arr: Array[Int]) {
        var pstv : Double = 0D
        var ngtv : Double = 0D
        var zero : Double  = 0D
        val arr_lnght : Double =  arr.length
        for(i<- 0 to (arr.length-1)){
            if(arr(i)>0){
                pstv += 1 
            } else if(arr(i)<0){
                ngtv += 1 
            } else{
                zero +=1 
            }
        }
        val pstv_rt : Double = (pstv/arr_lnght)
        val ngtv_rt : Double = (ngtv/arr_lnght)
        val zero_rt : Double = (zero/arr_lnght)
        val bd = new BigDecimal(pstv_rt)
        val new_val = bd.setScale(6,RoundingMode.HALF_UP)
        println(new_val)
        val cd = new BigDecimal(ngtv_rt)
        val new_val_ng = cd.setScale(6,RoundingMode.HALF_UP)
        println(new_val_ng)
        val md = new BigDecimal(zero_rt)
        val new_val_zero = md.setScale(6,RoundingMode.HALF_UP)
        println(new_val_zero)
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val n = stdin.readLine.trim.toInt

        val arr = stdin.readLine.split(" ").map(_.trim.toInt)
        plusMinus(arr)
    }
}
