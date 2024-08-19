object IntegerMatch{
    def integerMatch(number:Int):String=number match{
        case n if (n<=0)=>"Negative/Zero"
        case n if (n%2==0)=>"Even"
        case _ =>"Odd"
    }

    def main(args: Array[String]):Unit={
        print("Enter an Integer: ")
        val input = scala.io.StdIn.readInt()
        println(f"The integer you entered is ${integerMatch(input)}")
    }
}