object FilterPrime {
  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else !(2 to math.sqrt(n).toInt).exists(x => n % x == 0)
  }

  def filterPrime(list: List[Int]): List[Int] = {
    list.filter(isPrime)
  }

  def main(args: Array[String]): Unit = {
    val numbers: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val primes: List[Int] = filterPrime(numbers)
    println(primes)  
  }
}
