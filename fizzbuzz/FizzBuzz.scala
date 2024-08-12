import scala.io.StdIn.readLine;
object FizzBuzz{
    def checkFizzBuzz(n:Int):String= n match{
        case _ if (n%3==0&&n%5==0)=>"Multiple of Both Three and Five"
        case _ if (n%5==0) => "Multiple of Five"
        case _ if (n%3==0) => "Multiple of Three"
        case _ => "Not a Multiple of Three or Five"
    }

    def main(args: Array[String]):Unit={
        print("Enter a number: ")
        var number = readLine().toInt
        println(checkFizzBuzz(number))
    }
}