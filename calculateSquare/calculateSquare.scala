object calculateSquare{
    def calculateSquareNumbers(list: List[Int]):List[Int]={
        val squares = list.map((x:Int)=>x*x)
        squares
    }

    def main(args: Array[String]):Unit={
        val numbers: List[Int] = List(1,2,3,4,5,6)

        val squareNumbers = calculateSquareNumbers(numbers)
        println(squareNumbers)
    }
}