
object filterEvenNumbers{
    def fiterEvenNumbers(list: List[Int]):List[Int]={
        val even = list.filter((x:Int)=>x%2==0)
        even
    }

    def main(args: Array[String]):Unit={
        val numbers: List[Int] = List(0,1,2,3,4,5,6,7,8,9,10)
        val evenNumbers: List[Int] = fiterEvenNumbers(numbers)
        println(evenNumbers)
    }
}